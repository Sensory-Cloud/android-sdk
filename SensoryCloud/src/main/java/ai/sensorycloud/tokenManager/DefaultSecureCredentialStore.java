package ai.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.Optional;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/**
 * A default secure credential store that may be used if the current device has a secure enclave
 */
public class DefaultSecureCredentialStore implements SecureCredentialStore {

    private class EncryptionResult {
        byte[] encrypted;
        byte[] iv;

        EncryptionResult(byte[] encrypted, byte[] iv) {
            this.encrypted = encrypted;
            this.iv = iv;
        }
    }

    private final String PREFS_NAME = "SensoryCloud";
    private final String CLIENT_ID_ALIAS = "_clientID";
    private final String CLIENT_SECRET_ALIAS = "_clientSecret";
    private final String GENERIC_DATA_ALIAS = "_data";
    private final String KEY_STORE = "AndroidKeyStore";
    private final String CIPHER_TRANSFORM = "AES/GCM/NoPadding";

    private Context context;
    private String credentialID;

    /**
     * Initializes a new DefaultSecureCredentialStore
     *
     * @param context Application context, used to access the shared prefs
     * @param credentialID Unique credential identifier,
     *                     useful if you want to save multiple sets of credentials on device
     *                     A suitable default will be used if this is null or an empty string
     */
    public DefaultSecureCredentialStore(Context context, String credentialID) {
        this.context = context;
        if (credentialID == null || credentialID.isEmpty()) {
            this.credentialID = "default";
        } else {
            this.credentialID = credentialID;
        }
    }

    /**
     * Saves credentials to the credential store
     * @param clientId client ID to save
     * @param clientSecret client Secret to save
     * @throws Exception if an error occurs while saving the credentials
     */
    public void setCredentials(String clientId, String clientSecret) throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        save(credentialID + CLIENT_ID_ALIAS, clientId.getBytes(StandardCharsets.UTF_8), editor);
        save(credentialID + CLIENT_SECRET_ALIAS, clientSecret.getBytes(StandardCharsets.UTF_8), editor);
        editor.apply();
    }

    /**
     * Fetches the client ID from the credential store
     * @return the saved clientID
     * @throws Exception if no saved credentials were found or if another error occurred
     */
    @Override
    public Optional<String> getClientId() throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        return load(credentialID + CLIENT_ID_ALIAS, prefs)
                .map(bytes -> new String(bytes, StandardCharsets.UTF_8));
    }

    /**
     * Fetches the client Secret from the credential store
     * @return the saved client secret
     * @throws Exception if no saved credentials were found or if another error occurred
     */
    @Override
    public Optional<String> getClientSecret() throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        return load(credentialID + CLIENT_SECRET_ALIAS, prefs)
                .map(bytes -> new String(bytes, StandardCharsets.UTF_8));
    }

    /**
     * Securely saves arbitrary data in secure storage. This is used for saving enrollment tokens on device
     * Saved data is available across different instances of `DefaultSecureCredentialStore` even if a different credentialID is set on initialization
     * @param id string identifier to save the data under
     * @param data data to securely save
     * @throws Exception if an error occurs while saving to secure storage
     */
    @Override
    public void saveData(String id, byte[] data) throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        save(id + GENERIC_DATA_ALIAS, data, editor);
        editor.apply();
    }

    /**
     * Loads arbitrary data from secure storage. This is used for loading enrollment tokens on device
     * Saved data is available across different instances of `DefaultSecureCredentialStore` even if a different credentialID is set on initialization
     * @param id string identifier of the data to load
     * @return the saved data
     * @throws Exception if an error occurs while loading from the secure credential store or if the item is not found
     */
    @Override
    public Optional<byte[]> loadData(String id) throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return load(id + GENERIC_DATA_ALIAS, prefs);
    }

    /**
     * Deletes saved data from secure storage
     * @param id string identifier of the data to delete
     * @throws Exception if an error occurs while deleting the data. No error is thrown if the item is not found
     */
    @Override
    public void deleteData(String id) throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(id + GENERIC_DATA_ALIAS);
        editor.remove(id + GENERIC_DATA_ALIAS + "_iv");
        editor.apply();
        deleteFromKeyStore(id + GENERIC_DATA_ALIAS);
    }

    private void save(String alias, byte[] value, SharedPreferences.Editor editor) throws Exception {
        EncryptionResult result = encrypt(alias, value);
        editor.putString(alias, new String(result.encrypted, StandardCharsets.ISO_8859_1));
        editor.putString(alias + "_iv", new String(result.iv, StandardCharsets.ISO_8859_1));
    }

    private Optional<byte[]> load(String alias, SharedPreferences prefs) throws Exception {
        String encryptedStr = prefs.getString(alias, null);
        String ivStr = prefs.getString(alias + "_iv", null);
        if (encryptedStr == null || ivStr == null) {
            return Optional.empty();
        }

        return decrypt(
                alias,
                encryptedStr.getBytes(StandardCharsets.ISO_8859_1),
                ivStr.getBytes(StandardCharsets.ISO_8859_1)
        );
    }

    private EncryptionResult encrypt(String alias, byte[] value) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, KEY_STORE);
        KeyGenParameterSpec keyGenParameterSpec = new KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .build();

        keyGenerator.init(keyGenParameterSpec);
        SecretKey secretKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] iv = cipher.getIV();
        byte[] encrypted = cipher.doFinal(value);
        return new EncryptionResult(encrypted, iv);
    }

    private Optional<byte[]> decrypt(String alias, byte[] encrypted, byte[] iv) throws Exception {
        System.out.println("decrypt alias");
        System.out.println(alias);
        KeyStore keyStore = KeyStore.getInstance(KEY_STORE);
        keyStore.load(null);

        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry(alias, null);
        if (secretKeyEntry == null) {
            return Optional.empty();
        }
        SecretKey secretKey = secretKeyEntry.getSecretKey();

        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORM);
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, spec);

        return Optional.of(cipher.doFinal(encrypted));
    }

    private void deleteFromKeyStore(String alias) throws Exception {
        System.out.println("delete alias");
        System.out.println(alias);
        KeyStore keyStore = KeyStore.getInstance(KEY_STORE);
        keyStore.load(null);
        keyStore.deleteEntry(alias);
    }
}

package io.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import androidx.annotation.RequiresApi;

import java.nio.charset.StandardCharsets;
import java.security.KeyStore;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/**
 * A default secure credential store that may be used if the current device has a secure enclave
 */
@RequiresApi(api = Build.VERSION_CODES.M)
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
        save(credentialID + CLIENT_ID_ALIAS, clientId, editor);
        save(credentialID + CLIENT_SECRET_ALIAS, clientSecret, editor);
        editor.apply();
    }

    /**
     * Fetches the client ID from the credential store
     * @return the saved clientID
     * @throws Exception if no saved credentials were found or if another error occurred
     */
    @Override
    public String getClientId() throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return load(credentialID + CLIENT_ID_ALIAS, prefs);
    }

    /**
     * Fetches the client Secret from the credential store
     * @return the saved client secret
     * @throws Exception if no saved credentials were found or if another error occurred
     */
    @Override
    public String getClientSecret() throws Exception {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return load(credentialID + CLIENT_SECRET_ALIAS, prefs);
    }

    private void save(String alias, String value, SharedPreferences.Editor editor) throws Exception {
        EncryptionResult result = encrypt(alias, value);
        editor.putString(alias, new String(result.encrypted, StandardCharsets.ISO_8859_1));
        editor.putString(alias + "_iv", new String(result.iv, StandardCharsets.ISO_8859_1));
    }

    private String load(String alias, SharedPreferences prefs) throws Exception {
        String encryptedStr = prefs.getString(alias, "");
        String ivStr = prefs.getString(alias + "_iv", "");
        if (encryptedStr.isEmpty() || ivStr.isEmpty()) {
            throw new Exception("The specified item could not be found in shared prefs: " + alias);
        }

        return decrypt(
                alias,
                encryptedStr.getBytes(StandardCharsets.ISO_8859_1),
                ivStr.getBytes(StandardCharsets.ISO_8859_1));
    }

    private EncryptionResult encrypt(String alias, String value) throws Exception {
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
        byte[] encrypted = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
        return new EncryptionResult(encrypted, iv);
    }

    private String decrypt(String alias, byte[] encrypted, byte[] iv) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(KEY_STORE);
        keyStore.load(null);

        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry(alias, null);
        SecretKey secretKey = secretKeyEntry.getSecretKey();

        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORM);
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, spec);

        byte[] decoded = cipher.doFinal(encrypted);
        return new String(decoded, StandardCharsets.UTF_8);
    }
}

package inc.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * A default secure credential store that may be used if the current device has a secure enclave
 * TODO: - THIS IS CURRENTLY NOT A SECURE IMPLEMENTATION
 */
public class DefaultSecureCredentialStore implements SecureCredentialStore {

    private final String prefsName = "SensoryCloud";
    private final String clientIDKey = "clientID";
    private final String clientSecretKey = "clientSecret";

    private Context context;

    public DefaultSecureCredentialStore(Context context) {
        this.context = context;
    }

    /**
     * Saves credentials to the credential store
     * @param clientId client ID to save
     * @param clientSecret client Secret to save
     */
    public void setCredentials(String clientId, String clientSecret) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(clientIDKey, clientId);
        editor.putString(clientSecretKey, clientSecret);
        editor.apply();
    }

    /**
     * Fetches the client ID from the credential store
     * @return the saved clientID or an empty string if not found
     */
    @Override
    public String getClientId() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        return prefs.getString(clientIDKey, "");
    }

    /**
     * Fetches the client secret from the credential store
     * @return the saved client secret or an empty string if not found
     */
    @Override
    public String getClientSecret() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        return prefs.getString(clientSecretKey, "");
    }
}

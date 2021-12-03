package inc.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

public class DefaultSecureCredentialStore implements SecureCredentialStore {

    private final String prefsName = "SensoryCloud";
    private final String clientIDKey = "clientID";
    private final String clientSecretKey = "clientSecret";

    private Context context;

    public DefaultSecureCredentialStore(Context context) {
        this.context = context;
    }

    public void setCredentials(String clientId, String clientSecret) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(clientIDKey, clientId);
        editor.putString(clientSecretKey, clientSecret);
        editor.apply();
    }

    @Override
    public String getClientId() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        return prefs.getString(clientIDKey, "");
    }

    @Override
    public String getClientSecret() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        return prefs.getString(clientSecretKey, "");
    }
}

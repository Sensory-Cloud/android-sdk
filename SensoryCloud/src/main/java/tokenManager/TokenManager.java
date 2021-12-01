package tokenManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import inc.sensory.sensorycloud.service.OAuthService;
import io.sensory.api.common.TokenResponse;

public class TokenManager {

    private final char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    private final String prefsName = "SensoryCloud";
    private final String accessTokenKey = "accessToken";
    private final String expirationKey = "tokenExpiration";
    private final String clientIDKey = "clientID";
    private final String clientSecretKey = "clientSecret";
    private final long expirationBuffer = 5 * 60 * 1000; // 5 minutes in ms

    final Lock lock = new ReentrantLock();
    final Condition complete = lock.newCondition();

    public class AccessTokenCredentials {
        public String clientID;
        public String secret;

        public AccessTokenCredentials(String clientID, String secret) {
            this.clientID = clientID;
            this.secret = secret;
        }
    }

    public AccessTokenCredentials generateCredentials(Context context) {

        String clientID = UUID.randomUUID().toString();
        String secret = secRandomString(15);

        // TODO: - secure credential storage/configurable credential storage
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(clientIDKey, clientID);
        editor.putString(clientSecretKey, secret);
        editor.apply();

        return new AccessTokenCredentials(clientID, secret);
    }

    public boolean hasSavedCredentials(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        String clientID = prefs.getString(clientIDKey, "");
        String secret = prefs.getString(clientSecretKey, "");

        return !clientID.equals("") && !secret.equals("");
    }

    // TODO: - config
    public String getAccessToken(Context context, String url) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        String accessToken = prefs.getString(accessTokenKey, "");
        long expiration = prefs.getLong(expirationKey, 0);
        long now = System.currentTimeMillis();
        if (accessToken.equals("") || now > expiration - expirationBuffer) {
            return fetchNewAccessToken(context, url);
        }
        return accessToken;
    }

    public void deleteCredentials(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(accessTokenKey);
        editor.remove(expirationKey);
        editor.remove(clientIDKey);
        editor.remove(clientSecretKey);
        editor.apply();
    }

    // TODO: - better error handling
    private String fetchNewAccessToken(Context context, String url) {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        String clientID = prefs.getString(clientIDKey, "");
        String secret = prefs.getString(clientSecretKey, "");
        final String[] newToken = {""};
        final Throwable[] throwable = {null};

        lock.lock();
        OAuthService oAuthService = new OAuthService();
        oAuthService.getToken(url, clientID, secret, new OAuthService.GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString(accessTokenKey, response.getAccessToken());
                editor.putLong(expirationKey, response.getExpiresIn() * 1000L);
                editor.apply();
                newToken[0] = response.getAccessToken();
                complete.signal();
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println(t.getMessage());
                t.printStackTrace();
                throwable[0] = t;
                complete.signal();
            }
        });

        try {
            complete.await();
            if (throwable[0] != null) {
                throwable[0].printStackTrace();
                return "";
            }
            return newToken[0];
        } catch (InterruptedException error) {
            error.printStackTrace();
            return "";
        } finally {
            lock.unlock();
        }
    }

    private String secRandomString(int length) {
        Random random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(chars[random.nextInt(chars.length)]);
        }

        return builder.toString();
    }
}

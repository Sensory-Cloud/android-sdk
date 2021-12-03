package inc.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.service.OAuthService;
import io.sensory.api.common.TokenResponse;

public class TokenManager {
    private final String prefsName = "SensoryCloud";
    private final String accessTokenKey = "accessToken";
    private final String expirationKey = "tokenExpiration";
    private final long expirationBuffer = 5 * 60 * 1000; // 5 minutes in ms

    final Lock lock = new ReentrantLock();
    final Condition complete = lock.newCondition();

    private Context context;
    private OAuthService oAuthService;

    public TokenManager(Context context, OAuthService oAuthService) {
        this.context = context;
        this.oAuthService = oAuthService;
    }

    public class AccessTokenCredentials {
        public String clientID;
        public String secret;

        public AccessTokenCredentials(String clientID, String secret) {
            this.clientID = clientID;
            this.secret = secret;
        }
    }

    public String getAccessToken() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        String accessToken = prefs.getString(accessTokenKey, "");
        long expiration = prefs.getLong(expirationKey, 0);
        long now = System.currentTimeMillis();
        if (accessToken.equals("") || now > expiration - expirationBuffer) {
            return fetchNewAccessToken();
        }
        return accessToken;
    }

    public void deleteCachedToken() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(accessTokenKey);
        editor.remove(expirationKey);
        editor.apply();
    }

    // TODO: - better error handling
    private String fetchNewAccessToken() {
        final String[] newToken = {""};
        final Throwable[] throwable = {null};

        lock.lock();
        oAuthService.getToken(new OAuthService.GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
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
}

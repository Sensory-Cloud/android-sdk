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
import io.grpc.ClientInterceptor;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.sensory.api.common.TokenResponse;

/**
 * A token manager that manages storing and fetching OAuth tokens for Sensory Cloud
 */
public class TokenManager {

    private final String prefsName = "SensoryCloud";
    private final String accessTokenKey = "accessToken";
    private final String expirationKey = "tokenExpiration";
    private final long expirationBuffer = 5 * 60 * 1000; // 5 minutes in ms

    private Context context;
    private OAuthService oAuthService;

    /**
     * Creates a new Token Manager instance
     *
     * @param context Application context, used for caching the current OAuth token
     * @param oAuthService OAuth service for fetching new OAuth tokens from
     */
    public TokenManager(Context context, OAuthService oAuthService) {
        this.context = context;
        this.oAuthService = oAuthService;
    }

    /**
     * Wrapper struct for OAuth client credentials
     * TODO: duplicate of OAuthService.OAuthClient
     */
    public class AccessTokenCredentials {
        /**
         * OAuth client ID
         */
        public String clientID;
        /**
         * OAuth client secret
         */
        public String secret;

        public AccessTokenCredentials(String clientID, String secret) {
            this.clientID = clientID;
            this.secret = secret;
        }
    }

    /**
     * Returns a valid OAuth access token
     * This call will fetch a new token if the current token is expired
     *
     * @return A valid OAuth token
     */
    public String getAccessToken() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        String accessToken = prefs.getString(accessTokenKey, "");
        long expiration = prefs.getLong(expirationKey, 0);
        long now = System.currentTimeMillis();
        if (accessToken.equals("") || now > expiration - expirationBuffer) {
            return fetchNewAccessToken();
        } else {
            return accessToken;
        }
    }

    /**
     * Returns an OAuth authorization header
     * This call will fetch a new token if teh current token is expired
     *
     * @return A valid OAuth authorization header
     */
    public ClientInterceptor getAuthorizationMetadata() {
        String token = getAccessToken();
        Metadata header = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, "Bearer " + token);
        return MetadataUtils.newAttachHeadersInterceptor(header);
    }

    /**
     * Deletes the currently cached OAuth token
     */
    public void deleteCachedToken() {
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(accessTokenKey);
        editor.remove(expirationKey);
        editor.apply();
    }

    private String fetchNewAccessToken() {
        TokenResponse response = oAuthService.getTokenSync();
        SharedPreferences prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(accessTokenKey, response.getAccessToken());
        editor.putLong(expirationKey, response.getExpiresIn() * 1000L);
        editor.apply();
        return response.getAccessToken();
    }
}

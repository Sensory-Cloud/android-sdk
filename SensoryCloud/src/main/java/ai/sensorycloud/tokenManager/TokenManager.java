package ai.sensorycloud.tokenManager;

import ai.sensorycloud.api.common.TokenResponse;
import ai.sensorycloud.service.OAuthService;
import io.grpc.ClientInterceptor;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;

import java.util.concurrent.locks.ReentrantLock;

/**
 * A token manager that manages storing and fetching OAuth tokens for Sensory Cloud
 */
public class TokenManager {

    protected String token = "";
    protected Long expires = 0L;

    private final long expirationBuffer = 5 * 60 * 1000; // 5 minutes in ms

    private OAuthService oAuthService;
    private ReentrantLock tokenMutex = new ReentrantLock();

    /**
     * Creates a new Token Manager instance
     *
     * @param oAuthService OAuth service for fetching new OAuth tokens from
     */
    public TokenManager(OAuthService oAuthService) {
        this.oAuthService = oAuthService;
    }

    /**
     * Returns a valid OAuth access token
     * This call will fetch a new token if the current token is expired
     *
     * @return A valid OAuth token
     * @Throws Exception – if an error occurs while requesting a new token
     */
    public String getAccessToken() throws Exception {
        tokenMutex.lock();
        long now = System.currentTimeMillis();
        if (token.equals("") || now > expires - expirationBuffer) {
            try {
                token = fetchNewAccessToken();
            } catch (Exception ex) {
                tokenMutex.unlock();
                throw  ex;
            }
        }

        tokenMutex.unlock();
        return token;
    }

    /**
     * Returns an OAuth authorization header
     * This call will fetch a new token if the current token is expired
     *
     * @return A valid OAuth authorization header
     * @Throws Exception – if an error occurs while requesting a new token
     */
    public ClientInterceptor getAuthorizationMetadata() throws Exception {
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
        this.token = "";
        this.expires = 0L;
    }

    private String fetchNewAccessToken() throws Exception {
        TokenResponse response = oAuthService.getTokenSync();
        this.token = response.getAccessToken();
        this.expires = System.currentTimeMillis() + (response.getExpiresIn() * 1000L);
        return response.getAccessToken();
    }

    protected void setToken(String token) {
        this.token = token;
    }

    protected void setExpires(Long expires) {
        this.expires = expires;
    }
}

package ai.sensorycloud.tokenManager;

import ai.sensorycloud.api.common.TokenResponse;
import ai.sensorycloud.service.OAuthService;
import io.grpc.ClientInterceptor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TokenManagerTest extends TestCase {

    public OAuthService mockService;
    public TestTokenManager tokenManager;

    @Before
    public void setUp() throws Exception {
        mockService = mock(OAuthService.class);
        TokenResponse.Builder builder = TokenResponse.newBuilder()
                .setAccessToken("NewToken")
                .setExpiresIn(60000);

        when(mockService.getTokenSync()).thenReturn(builder.build());
        tokenManager = new TestTokenManager (mockService);
    }

    @Test
    public void testGetAccessToken() throws Exception {
        tokenManager.setExpires(0L);
        tokenManager.setToken("");
        TokenResponse.Builder builder = TokenResponse.newBuilder();
        builder.setAccessToken("SomeToken");
        builder.setExpiresIn(0);
        when(mockService.getTokenSync()).thenReturn(builder.build());

        assertEquals("A new token should be fetched", "SomeToken", tokenManager.getAccessToken());
    }

    @Test
    public void testGetCachedAccessToken() throws Exception {
        Long now = System.currentTimeMillis();
        tokenManager.setExpires(now + 600000L);
        tokenManager.setToken("CachedToken");

        verifyNoInteractions(mockService);
        assertEquals("A cached token should be used", "CachedToken", tokenManager.getAccessToken());
    }

    @Test
    public void testGetExpiredAccessToken() throws Exception {
        Long now = System.currentTimeMillis();
        tokenManager.setExpires(now);
        tokenManager.setToken("ExpiredToken");
        TokenResponse.Builder builder = TokenResponse.newBuilder();
        builder.setAccessToken("NewToken");
        builder.setExpiresIn(0);
        when(mockService.getTokenSync()).thenReturn(builder.build());

        assertEquals("A new token should be fetched", "NewToken", tokenManager.getAccessToken());
    }

    @Test
    public void testGetAuthorizationMetadata() throws Exception {
        Long now = System.currentTimeMillis();
        tokenManager.setExpires(now + 600000L);
        tokenManager.setToken("CachedToken");

        verifyNoInteractions(mockService);
        ClientInterceptor metadata = tokenManager.getAuthorizationMetadata();

        assertNotNull("Metadata should not be null", metadata);
    }

    @Test
    public void testDeleteCachedToken() {
        tokenManager.deleteCachedToken();
        assertEquals(tokenManager.token, "");
        assert(tokenManager.expires == 0L);
    }
}

class TestTokenManager extends TokenManager {
    public String token = "";
    public Long expires = 0L;

    /**
     * Creates a new Token Manager instance
     *
     * @param oAuthService OAuth service for fetching new OAuth tokens from
     */
    public TestTokenManager(OAuthService oAuthService) {
        super(oAuthService);
    }
}

package io.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

import io.grpc.ClientInterceptor;
import io.sensory.api.common.TokenResponse;
import io.sensory.sensorycloud.service.OAuthService;

@RunWith(AndroidJUnit4.class)
public class TokenManagerTest extends TestCase {

    public OAuthService mockService;
    public SharedPreferences mockPrefs;
    public SharedPreferences.Editor mockEditor;
    public TokenManager tokenManager;

    @Before
    public void setUp() throws Exception {
        mockService = mock(OAuthService.class);
        mockPrefs = mock(SharedPreferences.class);
        mockEditor = mock(SharedPreferences.Editor.class);
        when(mockPrefs.edit()).thenReturn(mockEditor);
        Context mockContext = mock(Context.class);
        when(mockContext.getSharedPreferences(anyString(), anyInt())).thenReturn(mockPrefs);
        tokenManager = new TokenManager(mockContext, mockService);
    }

    @Test
    public void testGetAccessToken() throws Exception {
        when(mockPrefs.getLong(anyString(), anyLong())).thenReturn(0L);
        when(mockPrefs.getString(anyString(), anyString())).thenReturn("");
        TokenResponse.Builder builder = TokenResponse.newBuilder();
        builder.setAccessToken("SomeToken");
        builder.setExpiresIn(0);
        when(mockService.getTokenSync()).thenReturn(builder.build());

        assertEquals("A new token should be fetched", "SomeToken", tokenManager.getAccessToken());
        verify(mockEditor, times(1)).putString(anyString(), anyString());
        verify(mockEditor, times(1)).putLong(anyString(), anyLong());
    }

    @Test
    public void testGetCachedAccessToken() throws Exception {
        Long now = System.currentTimeMillis();
        when(mockPrefs.getLong(anyString(), anyLong())).thenReturn(now + 600000L);
        when(mockPrefs.getString(anyString(), anyString())).thenReturn("CachedToken");

        verifyNoInteractions(mockService);
        assertEquals("A cached token should be used", "CachedToken", tokenManager.getAccessToken());
    }

    @Test
    public void testGetExpiredAccessToken() throws Exception {
        Long now = System.currentTimeMillis();
        when(mockPrefs.getLong(anyString(), anyLong())).thenReturn(now);
        when(mockPrefs.getString(anyString(), anyString())).thenReturn("ExpiredToken");
        TokenResponse.Builder builder = TokenResponse.newBuilder();
        builder.setAccessToken("NewToken");
        builder.setExpiresIn(0);
        when(mockService.getTokenSync()).thenReturn(builder.build());

        assertEquals("A new token should be fetched", "NewToken", tokenManager.getAccessToken());
        verify(mockEditor, times(1)).putString(anyString(), anyString());
        verify(mockEditor, times(1)).putLong(anyString(), anyLong());
    }

    @Test
    public void testGetAuthorizationMetadata() throws Exception {
        Long now = System.currentTimeMillis();
        when(mockPrefs.getLong(anyString(), anyLong())).thenReturn(now + 600000L);
        when(mockPrefs.getString(anyString(), anyString())).thenReturn("CachedToken");

        verifyNoInteractions(mockService);
        ClientInterceptor metadata = tokenManager.getAuthorizationMetadata();

        assertNotNull("Metadata should not be null", metadata);
    }

    @Test
    public void testDeleteCachedToken() {
        tokenManager.deleteCachedToken();

        verify(mockEditor, times(2)).remove(anyString());
    }
}
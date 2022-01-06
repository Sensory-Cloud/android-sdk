package io.sensory.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class DefaultSecureCredentialStoreTest extends TestCase {

    public DefaultSecureCredentialStore credentialStore;
    public SharedPreferences mockPrefs;
    public SharedPreferences.Editor mockEditor;

    @Before
    public void setUp() throws Exception {
        mockPrefs = mock(SharedPreferences.class);
        mockEditor = mock(SharedPreferences.Editor.class);
        when(mockPrefs.edit()).thenReturn(mockEditor);
        Context mockContext = mock(Context.class);
        when(mockContext.getSharedPreferences(anyString(), anyInt())).thenReturn(mockPrefs);
        credentialStore = new DefaultSecureCredentialStore(mockContext, "credential");
    }

    @Test
    public void testGetCredentials() throws Exception {
        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> valueCaptor = ArgumentCaptor.forClass(String.class);

        credentialStore.setCredentials("client", "secret");

        verify(mockEditor, times(4)).putString(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<String> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockPrefs.getString(keys.get(i), "")).thenReturn(values.get(i));
        }

        String finalClient = credentialStore.getClientId();
        String finalSecret = credentialStore.getClientSecret();
        assertEquals("clientID should not be mutated", "client", finalClient);
        assertEquals("client secret should not be mutated", "secret", finalSecret);
    }
}
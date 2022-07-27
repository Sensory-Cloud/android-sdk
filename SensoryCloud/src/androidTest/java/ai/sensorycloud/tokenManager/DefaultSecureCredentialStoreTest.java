package ai.sensorycloud.tokenManager;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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
    public void testSetGetCredentials() throws Exception {
        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> valueCaptor = ArgumentCaptor.forClass(String.class);

        assertFalse("empty optional should be returned on not present", credentialStore.getClientId().isPresent());
        assertFalse("empty optional should be returned on not present", credentialStore.getClientSecret().isPresent());

        credentialStore.setCredentials("client", "secret");

        verify(mockEditor, times(4)).putString(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<String> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockPrefs.getString(keys.get(i), null)).thenReturn(values.get(i));
        }

        String finalClient = credentialStore.getClientId().orElse("missing");
        String finalSecret = credentialStore.getClientSecret().orElse("missing");
        assertEquals("clientID should not be mutated", "client", finalClient);
        assertEquals("client secret should not be mutated", "secret", finalSecret);
    }

    @Test
    public void testSaveGetData() throws Exception {
        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> valueCaptor = ArgumentCaptor.forClass(String.class);

        byte[] initialData = "MockData".getBytes(StandardCharsets.UTF_8);
        credentialStore.saveData("unitTest", initialData);

        verify(mockEditor, times(2)).putString(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<String> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockPrefs.getString(keys.get(i), null)).thenReturn(values.get(i));
        }

        byte[] finalData = credentialStore.loadData("unitTest").orElse(new byte[0]);
        assertTrue("Data should not be mutated", Arrays.equals(initialData, finalData));

        assertFalse("Empty optional should be returned when no saved data", credentialStore.loadData("bogus").isPresent());
    }

    @Test
    public void testDeleteData() throws Exception {
        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> valueCaptor = ArgumentCaptor.forClass(String.class);

        byte[] initialData = "MockData".getBytes(StandardCharsets.UTF_8);
        credentialStore.saveData("deleteUnitTest", initialData);

        verify(mockEditor, times(2)).putString(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<String> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockPrefs.getString(keys.get(i), null)).thenReturn(values.get(i));
        }

        credentialStore.deleteData("deleteUnitTest");
        verify(mockEditor, times(2)).remove(Mockito.anyString());

        assertFalse("Data should be deleted", credentialStore.loadData("deleteUnitTest").isPresent());

         // No error should be thrown on deleting an already deleted item
         credentialStore.deleteData("deleteUnitTest");
    }
}
package ai.sensorycloud.interactors;

import junit.framework.TestCase;

import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import com.google.protobuf.ByteString;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import ai.sensorycloud.api.common.EnrollmentToken;
import ai.sensorycloud.tokenManager.SecureCredentialStore;

public class EnrollmentTokenInteractorTest extends TestCase {

    final EnrollmentToken mockTokenExpires = EnrollmentToken.newBuilder()
            .setToken(ByteString.copyFrom("ExpiringTokenData", StandardCharsets.UTF_8))
            .setExpiration(300)
            .build();

    final EnrollmentToken mockToken = EnrollmentToken.newBuilder()
            .setToken(ByteString.copyFrom("TokenData", StandardCharsets.UTF_8))
            .setExpiration(0)
            .build();

    public EnrollmentTokenInteractor interactor;
    public SecureCredentialStore mockCredentialStore;

    @Before
    public void setUp() throws Exception {
        mockCredentialStore = mock(SecureCredentialStore.class);
        interactor = new EnrollmentTokenInteractor(mockCredentialStore);
    }

    public void testGetSaveExpiringEnrollmentToken() throws Exception {
        Optional<byte[]> result = interactor.getEnrollmentToken("bogus");
        assertFalse("Empty optional should be returned on not found", result.isPresent());

        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<byte[]> valueCaptor = ArgumentCaptor.forClass(byte[].class);

        interactor.saveEnrollmentToken("expiringEnrollment", mockTokenExpires);

        verify(mockCredentialStore, times(2)).saveData(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<byte[]> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockCredentialStore.loadData(keys.get(i))).thenReturn(Optional.of(values.get(i)));
        }

        result = interactor.getEnrollmentToken("expiringEnrollment");
        assertTrue("Token should be returned", result.isPresent());
        assertTrue("Data should not be mutated", Arrays.equals(mockTokenExpires.getToken().toByteArray(), result.get()));

        // Expire the token
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(0, 0L);
        byte[] bytes = buffer.array();
        when(mockCredentialStore.loadData(keys.get(1))).thenReturn(Optional.of(bytes));
        // Unset delete calls from initial save
        Mockito.clearInvocations(mockCredentialStore);

        try {
            interactor.getEnrollmentToken("expiringEnrollment");
            fail("Token should be expired");
        } catch (ExpiredTokenException err) {
            // expected
        }

        // Ensure token deleted on expired
        verify(mockCredentialStore, times(2)).deleteData(Mockito.anyString());
    }

    public void testGetSaveEnrollmentToken() throws Exception {
        Optional<byte[]> result = interactor.getEnrollmentToken("bogus");
        assertFalse("Empty optional should be returned on not found", result.isPresent());

        ArgumentCaptor<String> keyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<byte[]> valueCaptor = ArgumentCaptor.forClass(byte[].class);

        interactor.saveEnrollmentToken("enrollment", mockToken);

        verify(mockCredentialStore, times(1)).saveData(keyCaptor.capture(), valueCaptor.capture());
        List<String> keys = keyCaptor.getAllValues();
        List<byte[]> values = valueCaptor.getAllValues();

        for (int i = 0; i < keys.size(); i++) {
            when(mockCredentialStore.loadData(keys.get(i))).thenReturn(Optional.of(values.get(i)));
        }

        result = interactor.getEnrollmentToken("enrollment");
        assertTrue("Token should be returned", result.isPresent());
        assertTrue("Data should not be mutated", Arrays.equals(mockToken.getToken().toByteArray(), result.get()));
    }

    public void testDeleteEnrollmentToken() throws Exception {
        // Ensure both token and expiration are deleted
        interactor.deleteEnrollmentToken("bogus");
        verify(mockCredentialStore, times(2)).deleteData(Mockito.anyString());
    }
}

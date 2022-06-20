package ai.sensorycloud;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;
import static org.awaitility.Awaitility.*;

import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.io.InputStream;

import ai.sensorycloud.api.v1.management.DeviceResponse;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.tokenManager.SecureCredentialStore;

public class InitializerTest extends TestCase {

    final DeviceResponse mockDeviceResponse = DeviceResponse.newBuilder()
            .setName("MockDeviceName")
            .setDeviceId("MockDeviceID")
            .build();

    final OAuthService.OAuthClient mockCredentials = new OAuthService.OAuthClient(
            "MockClientID",
            "MockClientSecret"
    );

    public OAuthService mockService;
    public SecureCredentialStore mockKeychain;
    public boolean responseReceived = false;

    ArgumentCaptor<String> nameCaptor;
    ArgumentCaptor<String> credentialCaptor;
    ArgumentCaptor<String> clientIDCaptor;
    ArgumentCaptor<String> clientSecretCaptor;
    ArgumentCaptor<OAuthService.EnrollDeviceListener> listenerCaptor;

    @Before
    public void setUp() throws Exception {
        Config.sharedConfig = null;
        responseReceived = false;

        nameCaptor = ArgumentCaptor.forClass(String.class);
        credentialCaptor = ArgumentCaptor.forClass(String.class);
        clientIDCaptor = ArgumentCaptor.forClass(String.class);
        clientSecretCaptor = ArgumentCaptor.forClass(String.class);
        listenerCaptor = ArgumentCaptor.forClass(OAuthService.EnrollDeviceListener.class);

        mockKeychain = mock(SecureCredentialStore.class);
        mockService = mock(OAuthService.class);
        when(mockService.getSecureCredentialStore()).thenReturn(mockKeychain);
        when(mockService.generateCredentials()).thenReturn(mockCredentials);

        doAnswer( invocation -> {
            listenerCaptor.getValue().onSuccess(mockDeviceResponse);
            return null;
        }).when(mockService).register(
                nameCaptor.capture(),
                credentialCaptor.capture(),
                clientIDCaptor.capture(),
                clientSecretCaptor.capture(),
                listenerCaptor.capture()
        );
    }

    public void testInit() {
        SDKInitConfig config = new SDKInitConfig(
                "fqdn",
                true,
                "tenant",
                SDKInitConfig.EnrollmentType.SHARED_SECRET,
                "credential",
                "deviceID",
                "deviceSecret"
        );

        Initializer.initialize(mockService, config, new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                assertResponse(response, config);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Initialization should not fail");
            }
        });

        await().until(() -> responseReceived);
    }

    public void testInitSavedConfig() throws Exception {
        SDKInitConfig config = new SDKInitConfig(
                "fqdn",
                false,
                "tenant",
                SDKInitConfig.EnrollmentType.JWT,
                "Private_key",
                "deviceID",
                "deviceName"
        );

        when(mockKeychain.getClientId()).thenReturn(java.util.Optional.of("clientID"));
        when(mockKeychain.getClientSecret()).thenReturn(java.util.Optional.of("clientSecret"));

        Initializer.initialize(mockService, config, new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                assertNull(response);
                assertEquals(config, Config.getSharedConfig());
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Initialization should not fail");
            }
        });

        await().until(() -> responseReceived);
        verify(mockService, never()).register(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any());
    }

    public void testInitFromFile() {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("noDeviceInfo.ini");
        SDKInitConfig expectedConfig = new SDKInitConfig(
                "sensorycloud.ai:443",
                false,
                "tenant",
                SDKInitConfig.EnrollmentType.SHARED_SECRET,
                "credential",
                "override-deviceID",
                "override-deviceName"
        );

        Initializer.initialize(mockService, stream, expectedConfig.deviceID, expectedConfig.deviceName, new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                assertResponse(response, expectedConfig);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Initialization should not fail");
            }
        });

        await().until(() -> responseReceived);
    }

    public void assertResponse(DeviceResponse response, SDKInitConfig config) {
        // Assert global config is set
        assertEquals(config.tenantID, Config.getSharedConfig().tenantID);
        assertEquals(config.isSecure, Config.getSharedConfig().isSecure);
        assertEquals(config.deviceID, Config.getSharedConfig().deviceID);

        // Assert OAuth service was called properly
        assertEquals(Config.getSharedConfig().deviceName, nameCaptor.getValue());
        assertEquals(mockCredentials.clientId, clientIDCaptor.getValue());
        assertEquals(mockCredentials.clientSecret, clientSecretCaptor.getValue());
        switch (config.enrollmentType) {
            case SHARED_SECRET:
                assertEquals(config.credential, credentialCaptor.getValue());
                break;
            case JWT:
                assertFalse(credentialCaptor.getValue().isEmpty());
                break;
            case NONE:
                assertTrue(credentialCaptor.getValue().isEmpty());
                break;
        }

        // Assert proper response
        assertEquals(mockDeviceResponse, response);
    }

}

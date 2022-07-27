package ai.sensorycloud.service;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Rule;

import ai.sensorycloud.SDKInitConfig;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;
import ai.sensorycloud.api.common.GenericClient;
import ai.sensorycloud.api.common.TokenResponse;
import ai.sensorycloud.api.oauth.OauthServiceGrpc;
import ai.sensorycloud.api.oauth.TokenRequest;
import ai.sensorycloud.api.oauth.WhoAmIRequest;
import ai.sensorycloud.api.oauth.WhoAmIResponse;
import ai.sensorycloud.api.v1.management.DeviceResponse;
import ai.sensorycloud.api.v1.management.DeviceServiceGrpc;
import ai.sensorycloud.api.v1.management.EnrollDeviceRequest;
import ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest;
import ai.sensorycloud.Config;
import ai.sensorycloud.tokenManager.SecureCredentialStore;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.awaitility.Awaitility.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class OAuthServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    final String authToken = "Some-OAuth-Token";
    final String authValue = "Bearer " + authToken;

    final public SDKInitConfig mockConfig = new SDKInitConfig(
            "host",
            false,
            "tenantID",
            SDKInitConfig.EnrollmentType.NONE,
            "doesntmatter",
            "deviceID",
            "deviceName"
    );

    final TokenRequest expectedTokenRequest = TokenRequest.newBuilder()
            .setClientId("MockClientID")
            .setSecret("MockClientSecret")
            .build();

    final TokenResponse expectedTokenResponse = TokenResponse.newBuilder()
            .setAccessToken(authToken)
            .setTokenType("Bearer")
            .setExpiresIn(100)
            .setKeyId("KeyID")
            .build();

    final EnrollDeviceRequest expectedEnrollRequest = EnrollDeviceRequest.newBuilder()
            .setName("MockDeviceName")
            .setDeviceId(mockConfig.deviceID)
            .setTenantId(mockConfig.tenantID)
            .setCredential("Enrollment-Credential")
            .setClient(GenericClient.newBuilder().setClientId("MockClientID").setSecret("MockClientSecret"))
            .build();

    final DeviceResponse expectedEnrollResponse = DeviceResponse.newBuilder()
            .setDeviceId("FinalDeviceID")
            .setName("FinalDeviceName")
            .build();

    final WhoAmIResponse expectedWhoAmIResponse = WhoAmIResponse.newBuilder()
            .setClientId("Some-Client")
            .setTenantId("Some-Tenant")
            .build();

    final RenewDeviceCredentialRequest expectedRenewDeviceRequest = RenewDeviceCredentialRequest.newBuilder()
            .setDeviceId(mockConfig.deviceID)
            .setTenantId(mockConfig.tenantID)
            .setClientId("MockClientID")
            .setCredential("Credential")
            .build();

    private final ServerInterceptor mockServerInterceptor = mock(ServerInterceptor.class, delegatesTo(
            new ServerInterceptor() {
                @Override
                public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                    if( call.getMethodDescriptor().getFullMethodName().endsWith("GetWhoAmI") ) {
                        String oauthToken = headers.get(authKey);
                        assertNotNull("OAuth token should be present", oauthToken);
                        assertEquals("Oauth token should match", authValue, oauthToken);
                    } else {
                        assertNull("No OAuth token should be sent", headers.get(authKey));
                    }
                    return next.startCall(call, headers);
                }
            }
    ));

    private final OauthServiceGrpc.OauthServiceImplBase oauthServiceImpl =
            mock(OauthServiceGrpc.OauthServiceImplBase.class, delegatesTo(
               new OauthServiceGrpc.OauthServiceImplBase() {
                   @Override
                   public void getToken(TokenRequest request, StreamObserver<TokenResponse> responseObserver) {
                       assertEquals("Request should match", expectedTokenRequest, request);
                       responseObserver.onNext(expectedTokenResponse);
                       responseObserver.onCompleted();
                   }

                   @Override
                   public void getWhoAmI(WhoAmIRequest request, StreamObserver<WhoAmIResponse> responseObserver) {
                       assertEquals("Request should match", WhoAmIRequest.getDefaultInstance(), request);
                       responseObserver.onNext(expectedWhoAmIResponse);
                       responseObserver.onCompleted();
                   }
               }
            ));

    private final DeviceServiceGrpc.DeviceServiceImplBase deviceServiceImpl =
            mock(DeviceServiceGrpc.DeviceServiceImplBase.class, delegatesTo(
                new DeviceServiceGrpc.DeviceServiceImplBase() {
                    @Override
                    public void enrollDevice(EnrollDeviceRequest request, StreamObserver<DeviceResponse> responseObserver) {
                        assertEquals("Request should match", expectedEnrollRequest, request);
                        responseObserver.onNext(expectedEnrollResponse);
                        responseObserver.onCompleted();
                    }

                    @Override
                    public void renewDeviceCredential(RenewDeviceCredentialRequest request, StreamObserver<DeviceResponse> responseObserver) {
                        assertEquals("Request should match", expectedRenewDeviceRequest, request);
                        responseObserver.onNext(expectedEnrollResponse);
                        responseObserver.onCompleted();
                    }
                }
            ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public OAuthService oAuthService;
    public SecureCredentialStore mockCredentialStore;
    public boolean responseReceived = false;

    @Before
    public void setUp() throws Exception {
        responseReceived = false;

        MockConfig conf = new MockConfig();
        conf.setConfig(mockConfig);

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(oauthServiceImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(deviceServiceImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        mockCredentialStore = mock(SecureCredentialStore.class);

        oAuthService = new OAuthService(mockCredentialStore, channel);
    }

    public void testGenerateCredentials() {
        Set<String> clients = new HashSet<>();
        Set<String> secrets = new HashSet<>();

        for( int i = 0; i < 500; i++) {
            OAuthService.OAuthClient client = oAuthService.generateCredentials();
            try {
                UUID.fromString(client.clientId);
            } catch (IllegalArgumentException exception) {
                fail("ClientID should be a UUID");
            }
            assertFalse("Client secret should not be empty", client.clientSecret.isEmpty());

            assertFalse("Duplicate clientIDs should not be generated", clients.contains(client.clientId));
            assertFalse("Duplicate client secrets should not be generated", secrets.contains(client.clientSecret));
            clients.add(client.clientId);
            secrets.add(client.clientSecret);
        }
    }

    public void testGetTokenSync() throws Exception {
        when(mockCredentialStore.getClientId()).thenReturn(Optional.of(expectedTokenRequest.getClientId()));
        when(mockCredentialStore.getClientSecret()).thenReturn(Optional.of(expectedTokenRequest.getSecret()));

        TokenResponse response = oAuthService.getTokenSync();

        assertEquals("Response should match", expectedTokenResponse, response);
    }

    public void testGetToken() throws Exception {
        when(mockCredentialStore.getClientId()).thenReturn(Optional.of(expectedTokenRequest.getClientId()));
        when(mockCredentialStore.getClientSecret()).thenReturn(Optional.of(expectedTokenRequest.getSecret()));

        oAuthService.getToken(new OAuthService.GetTokenListener() {
            @Override
            public void onSuccess(TokenResponse response) {
                assertEquals("Response should match", expectedTokenResponse, response);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Call should not fail: " + t.getMessage());
            }
        });

        await().until(() -> responseReceived);
    }

    public void testRegister() throws Exception {
        when(mockCredentialStore.getClientId()).thenReturn(Optional.of(expectedEnrollRequest.getClient().getClientId()));
        when(mockCredentialStore.getClientSecret()).thenReturn(Optional.of(expectedEnrollRequest.getClient().getSecret()));

        oAuthService.register(
                expectedEnrollRequest.getName(),
                expectedEnrollRequest.getCredential(),
                expectedEnrollRequest.getClient().getClientId(),
                expectedEnrollRequest.getClient().getSecret(),
                new OAuthService.EnrollDeviceListener() {
            @Override
            public void onSuccess(DeviceResponse response) {
                assertEquals("Response should match", expectedEnrollResponse, response);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Call should not fail: " + t.getMessage());
            }
        });

        await().until(() -> responseReceived);
    }

    public void testGetWhoAmI() throws Exception {
        when(mockCredentialStore.getClientId()).thenReturn(Optional.of(expectedTokenRequest.getClientId()));
        when(mockCredentialStore.getClientSecret()).thenReturn(Optional.of(expectedTokenRequest.getSecret()));

        oAuthService.getWhoAmI(new OAuthService.GetWhoAmIListener() {
            @Override
            public void onSuccess(WhoAmIResponse response) {
                assertEquals("Response should match", expectedWhoAmIResponse, response);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Call should not fail: " + t.getMessage());
            }
        });

        await().until(() -> responseReceived);
    }

    public void testRenewDeviceCredentials() throws Exception {
        when(mockCredentialStore.getClientId()).thenReturn(Optional.of(expectedRenewDeviceRequest.getClientId()));

        oAuthService.renewDeviceCredential(
                expectedRenewDeviceRequest.getCredential(),
                new OAuthService.EnrollDeviceListener() {
                    @Override
                    public void onSuccess(DeviceResponse response) {
                        assertEquals("Response should match", expectedEnrollResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                }
        );

        await().until(() -> responseReceived);
    }
}

class MockConfig extends Config {
    void setConfig(SDKInitConfig config) {
        Config.sharedConfig = config;
    }
}
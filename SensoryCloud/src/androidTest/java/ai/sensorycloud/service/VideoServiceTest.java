package ai.sensorycloud.service;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.awaitility.Awaitility.*;

import org.junit.Before;
import org.junit.Rule;

import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;
import ai.sensorycloud.api.common.ModelType;
import ai.sensorycloud.api.common.TechnologyType;
import ai.sensorycloud.api.v1.video.AuthenticateConfig;
import ai.sensorycloud.api.v1.video.AuthenticateRequest;
import ai.sensorycloud.api.v1.video.AuthenticateResponse;
import ai.sensorycloud.api.v1.video.CreateEnrollmentConfig;
import ai.sensorycloud.api.v1.video.CreateEnrollmentRequest;
import ai.sensorycloud.api.v1.video.CreateEnrollmentResponse;
import ai.sensorycloud.api.v1.video.GetModelsRequest;
import ai.sensorycloud.api.v1.video.GetModelsResponse;
import ai.sensorycloud.api.v1.video.LivenessRecognitionResponse;
import ai.sensorycloud.api.v1.video.RecognitionThreshold;
import ai.sensorycloud.api.v1.video.ValidateRecognitionConfig;
import ai.sensorycloud.api.v1.video.ValidateRecognitionRequest;
import ai.sensorycloud.api.v1.video.VideoBiometricsGrpc;
import ai.sensorycloud.api.v1.video.VideoModel;
import ai.sensorycloud.api.v1.video.VideoModelsGrpc;
import ai.sensorycloud.api.v1.video.VideoRecognitionGrpc;
import ai.sensorycloud.Config;
import ai.sensorycloud.tokenManager.TokenManager;

public class VideoServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    final String authValue = "Bearer Some-OAuth-Token";

    final public Config mockConfig = new Config(
            new Config.CloudConfig("host"),
            new Config.TenantConfig("tenantID"),
            new Config.DeviceConfig("deviceID", "lanCode")
    );

    final GetModelsRequest expectedModelsRequest = GetModelsRequest.getDefaultInstance();

    final VideoModel mockModel = VideoModel.newBuilder()
            .setName("Mock Model")
            .setModelType(ModelType.FACE_BIOMETRIC)
            .setIsEnrollable(true)
            .setTechnology(TechnologyType.TS)
            .setIsLivenessSupported(false)
            .build();

    final GetModelsResponse expectedModelsResponse = GetModelsResponse.newBuilder()
            .addModels(mockModel)
            .build();

    final CreateEnrollmentRequest expectedEnrollmentRequest = CreateEnrollmentRequest.newBuilder()
            .setConfig(CreateEnrollmentConfig.newBuilder()
                    .setModelName("Some Model")
                    .setUserId("User ID")
                    .setDeviceId(mockConfig.deviceConfig.deviceId)
                    .setDescription("Some Description")
                    .setIsLivenessEnabled(true)
                    .setLivenessThreshold(RecognitionThreshold.HIGHEST)
                    .setNumLivenessFramesRequired(3)
            ).build();

    final CreateEnrollmentResponse expectedEnrollmentResponse = CreateEnrollmentResponse.newBuilder()
            .setEnrollmentId("Enrollment ID")
            .setModelName("A Model")
            .setIsAlive(true)
            .setModelVersion("1.0")
            .setPercentComplete(50)
            .build();

    final AuthenticateRequest expectedAuthenticationRequest = AuthenticateRequest.newBuilder()
            .setConfig(AuthenticateConfig.newBuilder()
                    .setEnrollmentId("Enrollment ID")
                    .setIsLivenessEnabled(false)
                    .setLivenessThreshold(RecognitionThreshold.LOW)
            ).build();

    final AuthenticateResponse expectedAuthenticationResponse = AuthenticateResponse.newBuilder()
            .setIsAlive(false)
            .setScore(50)
            .setSuccess(false)
            .build();

    final ValidateRecognitionRequest expectedRecognitionRequest = ValidateRecognitionRequest.newBuilder()
            .setConfig(ValidateRecognitionConfig.newBuilder()
                    .setModelName("Some Model")
                    .setUserId("User-ID")
                    .setThreshold(RecognitionThreshold.MEDIUM)
            ).build();

    final LivenessRecognitionResponse expectedRecognitionResponse = LivenessRecognitionResponse.newBuilder()
            .setScore(100)
            .setIsAlive(true)
            .build();

    private final ServerInterceptor mockServerInterceptor = mock(ServerInterceptor.class, delegatesTo(
            new ServerInterceptor() {
                @Override
                public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                    String oauthToken = headers.get(authKey);
                    assertNotNull("OAuth token should be present", oauthToken);
                    assertEquals("Oauth token should match", authValue, oauthToken);
                    return next.startCall(call, headers);
                }
            }
    ));

    private final VideoModelsGrpc.VideoModelsImplBase modelsImpl =
            mock(VideoModelsGrpc.VideoModelsImplBase.class, delegatesTo(
                    new VideoModelsGrpc.VideoModelsImplBase() {
                        @Override
                        public void getModels(GetModelsRequest request, StreamObserver<GetModelsResponse> responseObserver) {
                            assertEquals("Request should match", expectedModelsRequest, request);
                            responseObserver.onNext(expectedModelsResponse);
                            responseObserver.onCompleted();
                        }
                    }
            ));

    private final VideoBiometricsGrpc.VideoBiometricsImplBase biometricsImpl =
            mock(VideoBiometricsGrpc.VideoBiometricsImplBase.class, delegatesTo(
                    new VideoBiometricsGrpc.VideoBiometricsImplBase() {
                        @Override
                        public StreamObserver<CreateEnrollmentRequest> createEnrollment(StreamObserver<CreateEnrollmentResponse> responseObserver) {
                            responseObserver.onNext(expectedEnrollmentResponse);
                            return new StreamObserver<CreateEnrollmentRequest>() {
                                @Override
                                public void onNext(CreateEnrollmentRequest value) {
                                    assertEquals("Initial config should be sent", expectedEnrollmentRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }

                        @Override
                        public StreamObserver<AuthenticateRequest> authenticate(StreamObserver<AuthenticateResponse> responseObserver) {
                            responseObserver.onNext(expectedAuthenticationResponse);
                            return new StreamObserver<AuthenticateRequest>() {
                                @Override
                                public void onNext(AuthenticateRequest value) {
                                    assertEquals("Initial config should be sent", expectedAuthenticationRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }
                    }
            ));

    private final VideoRecognitionGrpc.VideoRecognitionImplBase recognitionImpl =
            mock(VideoRecognitionGrpc.VideoRecognitionImplBase.class, delegatesTo(
                    new VideoRecognitionGrpc.VideoRecognitionImplBase() {
                        @Override
                        public StreamObserver<ValidateRecognitionRequest> validateLiveness(StreamObserver<LivenessRecognitionResponse> responseObserver) {
                            responseObserver.onNext(expectedRecognitionResponse);
                            return new StreamObserver<ValidateRecognitionRequest>() {
                                @Override
                                public void onNext(ValidateRecognitionRequest value) {
                                    assertEquals("Initial config should be sent", expectedRecognitionRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }
                    }
            ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public VideoService service;
    public TokenManager mockTokenManager;
    public boolean requestReceived = false;
    public boolean responseReceived = false;

    @Before
    public void setUp() throws Exception {
        requestReceived = false;
        responseReceived = false;

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(modelsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(biometricsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(recognitionImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        mockTokenManager = mock(TokenManager.class);
        Metadata mockHeader = new Metadata();
        mockHeader.put(authKey, authValue);
        ClientInterceptor mockAuth = MetadataUtils.newAttachHeadersInterceptor(mockHeader);
        when(mockTokenManager.getAuthorizationMetadata()).thenReturn(mockAuth);

        service = new VideoService(mockConfig, mockTokenManager, channel);
    }

    public void testGetModels() {
        service.getModels(new VideoService.GetModelsListener() {
            @Override
            public void onSuccess(GetModelsResponse response) {
                assertEquals("Response should match", expectedModelsResponse, response);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
        });

        await().until(() -> responseReceived);
    }

    public void testCreateEnrollment() {
        service.createEnrollment(
                expectedEnrollmentRequest.getConfig().getModelName(),
                expectedEnrollmentRequest.getConfig().getUserId(),
                expectedEnrollmentRequest.getConfig().getDescription(),
                expectedEnrollmentRequest.getConfig().getIsLivenessEnabled(),
                expectedEnrollmentRequest.getConfig().getLivenessThreshold(),
                expectedEnrollmentRequest.getConfig().getNumLivenessFramesRequired(),
                new StreamObserver<CreateEnrollmentResponse>() {
                    @Override
                    public void onNext(CreateEnrollmentResponse value) {
                        assertEquals("Response should match", expectedEnrollmentResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testAuthenticate() {
        service.authenticate(
                AudioService.EnrollmentType.ENROLLMENT_ID,
                expectedAuthenticationRequest.getConfig().getEnrollmentId(),
                expectedAuthenticationRequest.getConfig().getIsLivenessEnabled(),
                expectedAuthenticationRequest.getConfig().getLivenessThreshold(),
                new StreamObserver<AuthenticateResponse>() {
                    @Override
                    public void onNext(AuthenticateResponse value) {
                        assertEquals("Response should match", expectedAuthenticationResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testValidateLiveness() {
        service.validateLiveness(
                expectedRecognitionRequest.getConfig().getModelName(),
                expectedRecognitionRequest.getConfig().getUserId(),
                expectedRecognitionRequest.getConfig().getThreshold(),
                new StreamObserver<LivenessRecognitionResponse>() {
                    @Override
                    public void onNext(LivenessRecognitionResponse value) {
                        assertEquals("Response should match", expectedRecognitionResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }
}
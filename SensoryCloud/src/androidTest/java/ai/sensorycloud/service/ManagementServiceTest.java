package ai.sensorycloud.service;

import junit.framework.TestCase;

import ai.sensorycloud.SDKInitConfig;
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
import ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest;
import ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest;
import ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest;
import ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest;
import ai.sensorycloud.api.v1.management.EnrollmentGroupResponse;
import ai.sensorycloud.api.v1.management.EnrollmentResponse;
import ai.sensorycloud.api.v1.management.EnrollmentServiceGrpc;
import ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse;
import ai.sensorycloud.api.v1.management.GetEnrollmentsRequest;
import ai.sensorycloud.api.v1.management.GetEnrollmentsResponse;
import ai.sensorycloud.tokenManager.TokenManager;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.awaitility.Awaitility.*;

import org.junit.Before;
import org.junit.Rule;

import java.util.Arrays;

public class ManagementServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    final String authValue = "Bearer Some-OAuth-Token";

    final public SDKInitConfig mockConfig = new SDKInitConfig(
            "host",
            false,
            "tenantID",
            SDKInitConfig.EnrollmentType.NONE,
            "doesntmatter",
            "deviceID",
            "deviceName"
    );

    final EnrollmentResponse mockEnrollment1 = EnrollmentResponse.newBuilder()
            .setId("ID")
            .setModelName("Some Model")
            .setModelType(ModelType.FACE_RECOGNITION)
            .setDeviceId("Device")
            .setDeviceName("Device Name")
            .setDescription("An Enrollment")
            .setUserId("User")
            .build();

    final EnrollmentResponse mockEnrollment2 = EnrollmentResponse.newBuilder()
            .setId("Another ID")
            .setModelName("Some Other Model")
            .setModelType(ModelType.SOUND_EVENT_ENROLLABLE)
            .setDeviceId("Device-ID")
            .setDeviceName("Device's Name")
            .setDescription("Another Enrollment")
            .setUserId("User")
            .build();

    final EnrollmentGroupResponse mockEnrollmentGroup1 = EnrollmentGroupResponse.newBuilder()
            .setId("Group-ID")
            .setModelName("Mock Model")
            .setModelType(ModelType.IMAGE_TRANSFORM)
            .setUserId("User")
            .setDescription("Empty Enrollment Group")
            .build();

    final EnrollmentGroupResponse mockEnrollmentGroup2 = EnrollmentGroupResponse.newBuilder()
            .setId("Group-ID-2")
            .setModelName("Another Mock Model")
            .setModelType(ModelType.OBJECT_RECOGNITION)
            .setUserId("User")
            .setDescription("Non-empty Enrollment Group")
            .addAllEnrollments(Arrays.asList(mockEnrollment1, mockEnrollment2))
            .build();

    final GetEnrollmentsRequest expectedEnrollmentRequest = GetEnrollmentsRequest.newBuilder()
            .setUserId("Mock-User-ID")
            .build();

    final GetEnrollmentsResponse expectedEnrollmentResponse = GetEnrollmentsResponse.newBuilder()
            .addAllEnrollments(Arrays.asList(mockEnrollment1))
            .build();

    final GetEnrollmentsRequest expectedEnrollmentGroupsRequest = GetEnrollmentsRequest.newBuilder()
            .setUserId("Enrollment-Group-User-ID")
            .build();

    final GetEnrollmentGroupsResponse expectedEnrollmentGroupsResponse = GetEnrollmentGroupsResponse.newBuilder()
            .addAllEnrollmentGroups(Arrays.asList(mockEnrollmentGroup2))
            .build();

    final CreateEnrollmentGroupRequest expectedCreateEnrollmentGroupRequest = CreateEnrollmentGroupRequest.newBuilder()
            .setId("Create-Group-ID")
            .setName("Group Name")
            .setDescription("Mock Enrollment Group")
            .setModelName("A Model")
            .setUserId("user-id")
            .build();

    final EnrollmentGroupResponse expectedCreateEnrollmentGroupResponse = mockEnrollmentGroup1;

    final AppendEnrollmentGroupRequest expectedAppendEnrollmentGroupRequest = AppendEnrollmentGroupRequest.newBuilder()
            .setGroupId("Some-Group-ID")
            .addAllEnrollmentIds(Arrays.asList("first Enrollment", "second Enrollment"))
            .build();

    final EnrollmentGroupResponse expectedAppendEnrollmentGroupResponse = mockEnrollmentGroup2;

    final DeleteEnrollmentRequest expectedDeleteEnrollmentRequest = DeleteEnrollmentRequest.newBuilder()
            .setId("ID-to-delete")
            .build();

    final EnrollmentResponse expectedDeleteEnrollmentResponse = mockEnrollment2;

    final DeleteEnrollmentGroupRequest expectedDeleteEnrollmentGroupRequest = DeleteEnrollmentGroupRequest.newBuilder()
            .setId("Group-ID-to-delete")
            .build();

    final EnrollmentGroupResponse expectedDeleteEnrollmentGroupResponse = mockEnrollmentGroup1;

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

    private final EnrollmentServiceGrpc.EnrollmentServiceImplBase serviceImpl =
            mock(EnrollmentServiceGrpc.EnrollmentServiceImplBase.class, delegatesTo(
                    new EnrollmentServiceGrpc.EnrollmentServiceImplBase() {
                        @Override
                        public void getEnrollments(GetEnrollmentsRequest request, StreamObserver<GetEnrollmentsResponse> responseObserver) {
                            assertEquals("Request should match", expectedEnrollmentRequest, request);
                            responseObserver.onNext(expectedEnrollmentResponse);
                            responseObserver.onCompleted();
                        }

                        @Override
                        public void getEnrollmentGroups(GetEnrollmentsRequest request, StreamObserver<GetEnrollmentGroupsResponse> responseObserver) {
                            assertEquals("Request should match", expectedEnrollmentGroupsRequest, request);
                            responseObserver.onNext(expectedEnrollmentGroupsResponse);
                            responseObserver.onCompleted();
                        }

                        @Override
                        public void createEnrollmentGroup(CreateEnrollmentGroupRequest request, StreamObserver<EnrollmentGroupResponse> responseObserver) {
                            assertEquals("Request should match", expectedCreateEnrollmentGroupRequest, request);
                            responseObserver.onNext(expectedCreateEnrollmentGroupResponse);
                            responseObserver.onCompleted();
                        }

                        @Override
                        public void appendEnrollmentGroup(AppendEnrollmentGroupRequest request, StreamObserver<EnrollmentGroupResponse> responseObserver) {
                            assertEquals("Request should match", expectedAppendEnrollmentGroupRequest, request);
                            responseObserver.onNext(expectedAppendEnrollmentGroupResponse);
                            responseObserver.onCompleted();
                        }

                        @Override
                        public void deleteEnrollment(DeleteEnrollmentRequest request, StreamObserver<EnrollmentResponse> responseObserver) {
                            assertEquals("Request should match", expectedDeleteEnrollmentRequest, request);
                            responseObserver.onNext(expectedDeleteEnrollmentResponse);
                            responseObserver.onCompleted();
                        }

                        @Override
                        public void deleteEnrollmentGroup(DeleteEnrollmentGroupRequest request, StreamObserver<EnrollmentGroupResponse> responseObserver) {
                            assertEquals("Request should match", expectedDeleteEnrollmentGroupRequest, request);
                            responseObserver.onNext(expectedDeleteEnrollmentGroupResponse);
                            responseObserver.onCompleted();
                        }
                    }
            ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public ManagementService service;
    public TokenManager mockTokenManager;
    public boolean responseReceived = false;

    @Before
    public void setUp() throws Exception {
        responseReceived = false;

        MockConfig conf = new MockConfig();
        conf.setConfig(mockConfig);

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(serviceImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        mockTokenManager = mock(TokenManager.class);
        Metadata mockHeader = new Metadata();
        mockHeader.put(authKey, authValue);
        ClientInterceptor mockAuth = MetadataUtils.newAttachHeadersInterceptor(mockHeader);
        when(mockTokenManager.getAuthorizationMetadata()).thenReturn(mockAuth);

        service = new ManagementService(mockTokenManager, channel);
    }

    public void testGetEnrollments() {
        service.getEnrollments(
                expectedEnrollmentRequest.getUserId(),
                new ManagementService.GetEnrollmentsListener() {
                    @Override
                    public void onSuccess(GetEnrollmentsResponse response) {
                        assertEquals("Response should match", expectedEnrollmentResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

    public void testGetEnrollmentGroups() {
        service.getEnrollmentGroups(
                expectedEnrollmentGroupsRequest.getUserId(),
                new ManagementService.GetEnrollmentGroupsListener() {
                    @Override
                    public void onSuccess(GetEnrollmentGroupsResponse response) {
                        assertEquals("Response should match", expectedEnrollmentGroupsResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

    public void testCreateEnrollmentGroup() {
        service.createEnrollmentGroup(
                expectedCreateEnrollmentGroupRequest.getUserId(),
                expectedCreateEnrollmentGroupRequest.getId(),
                expectedCreateEnrollmentGroupRequest.getName(),
                expectedCreateEnrollmentGroupRequest.getDescription(),
                expectedCreateEnrollmentGroupRequest.getModelName(),
                new ManagementService.EnrollmentGroupListener() {
                    @Override
                    public void onSuccess(EnrollmentGroupResponse response) {
                        assertEquals("Response should match", expectedCreateEnrollmentGroupResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

    public void testAppendEnrollmentGroup() {
        service.appendEnrollmentGroup(
                expectedAppendEnrollmentGroupRequest.getGroupId(),
                expectedAppendEnrollmentGroupRequest.getEnrollmentIdsList(),
                new ManagementService.EnrollmentGroupListener() {
                    @Override
                    public void onSuccess(EnrollmentGroupResponse response) {
                        assertEquals("Response should match", expectedAppendEnrollmentGroupResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

    public void testDeleteEnrollment() {
        service.deleteEnrollment(
                expectedDeleteEnrollmentRequest.getId(),
                new ManagementService.EnrollmentListener() {
                    @Override
                    public void onSuccess(EnrollmentResponse response) {
                        assertEquals("Response should match", expectedDeleteEnrollmentResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }

    public void testDeleteEnrollmentGroup() {
        service.deleteEnrollmentGroup(
                expectedDeleteEnrollmentGroupRequest.getId(),
                new ManagementService.EnrollmentGroupListener() {
                    @Override
                    public void onSuccess(EnrollmentGroupResponse response) {
                        assertEquals("Response should match", expectedDeleteEnrollmentGroupResponse, response);
                        responseReceived = true;
                    }

                    @Override
                    public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
                });

        await().until(() -> responseReceived);
    }
}
package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.sensory.api.v1.management.AppendEnrollmentGroupRequest;
import io.sensory.api.v1.management.CreateEnrollmentGroupRequest;
import io.sensory.api.v1.management.DeleteEnrollmentGroupRequest;
import io.sensory.api.v1.management.DeleteEnrollmentRequest;
import io.sensory.api.v1.management.EnrollmentGroupResponse;
import io.sensory.api.v1.management.EnrollmentResponse;
import io.sensory.api.v1.management.EnrollmentServiceGrpc;
import io.sensory.api.v1.management.GetEnrollmentGroupsResponse;
import io.sensory.api.v1.management.GetEnrollmentsRequest;
import io.sensory.api.v1.management.GetEnrollmentsResponse;

public class ManagementService {

    public interface GetEnrollmentsListener {
        void onSuccess(GetEnrollmentsResponse response);
        void onFailure(Throwable t);
    }

    public interface GetEnrollmentGroupsListener {
        void onSuccess(GetEnrollmentGroupsResponse response);
        void onFailure(Throwable t);
    }

    public interface EnrollmentListener {
        void onSuccess(EnrollmentResponse response);
        void onFailure(Throwable t);
    }

    public interface EnrollmentGroupListener {
        void onSuccess(EnrollmentGroupResponse response);
        void onFailure(Throwable t);
    }

    private Config config;
    private TokenManager tokenManager;

    public ManagementService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    public void getEnrollments(String userId, GetEnrollmentsListener listener) {
        ManagedClient client = getManagedClient();

        GetEnrollmentsRequest request = GetEnrollmentsRequest.newBuilder()
                .setUserId(userId)
                .build();

        StreamObserver<GetEnrollmentsResponse> responseObserver = new StreamObserver<GetEnrollmentsResponse>() {
            @Override
            public void onNext(GetEnrollmentsResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.getEnrollments(request, responseObserver);
    }

    public void getEnrollmentGroups(String userId, GetEnrollmentGroupsListener listener) {
        ManagedClient client = getManagedClient();

        GetEnrollmentsRequest request = GetEnrollmentsRequest.newBuilder()
                .setUserId(userId)
                .build();

        StreamObserver<GetEnrollmentGroupsResponse> responseObserver = new StreamObserver<GetEnrollmentGroupsResponse>() {
            @Override
            public void onNext(GetEnrollmentGroupsResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.getEnrollmentGroups(request, responseObserver);
    }

    public void createEnrollmentGroup(
            String userId,
            String groupId, // TODO - config/default value
            String groupName,
            String description,
            String modelName,
            EnrollmentGroupListener listener) {
        ManagedClient client = getManagedClient();

        CreateEnrollmentGroupRequest request = CreateEnrollmentGroupRequest.newBuilder()
                .setId(groupId)
                .setName(groupName)
                .setDescription(description)
                .setModelName(modelName)
                .setUserId(userId.toLowerCase())
                .build();

        StreamObserver<EnrollmentGroupResponse> responseObserver = new StreamObserver<EnrollmentGroupResponse>() {
            @Override
            public void onNext(EnrollmentGroupResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.createEnrollmentGroup(request, responseObserver);
    }

    public void appendEnrollmentGroup(
            String groupId,
            Iterable<String> enrollments,
            EnrollmentGroupListener listener) {
        ManagedClient client = getManagedClient();

        AppendEnrollmentGroupRequest request = AppendEnrollmentGroupRequest.newBuilder()
                .setGroupId(groupId)
                .addAllEnrollmentIds(enrollments)
                .build();

        StreamObserver<EnrollmentGroupResponse> responseObserver = new StreamObserver<EnrollmentGroupResponse>() {
            @Override
            public void onNext(EnrollmentGroupResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.appendEnrollmentGroup(request, responseObserver);
    }

    public void deleteEnrollment(String enrollmentId, EnrollmentListener listener) {
        ManagedClient client = getManagedClient();

        DeleteEnrollmentRequest request = DeleteEnrollmentRequest.newBuilder()
                .setId(enrollmentId)
                .build();

        StreamObserver<EnrollmentResponse> responseObserver = new StreamObserver<EnrollmentResponse>() {
            @Override
            public void onNext(EnrollmentResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.deleteEnrollment(request, responseObserver);
    }

    public void deleteEnrollmentGroup(String enrollmentGroupId, EnrollmentGroupListener listener) {
        ManagedClient client = getManagedClient();

        DeleteEnrollmentGroupRequest request = DeleteEnrollmentGroupRequest.newBuilder()
                .setId(enrollmentGroupId)
                .build();

        StreamObserver<EnrollmentGroupResponse> responseObserver = new StreamObserver<EnrollmentGroupResponse>() {
            @Override
            public void onNext(EnrollmentGroupResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                client.managedChannel.shutdown();
            }
        };
        client.client.deleteEnrollmentGroup(request, responseObserver);
    }

    private class ManagedClient {
        ManagedChannel managedChannel;
        EnrollmentServiceGrpc.EnrollmentServiceStub client;

        ManagedClient(ManagedChannel managedChannel, EnrollmentServiceGrpc.EnrollmentServiceStub client) {
            this.managedChannel = managedChannel;
            this.client = client;
        }
    }

    private ManagedClient getManagedClient() {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        String token = tokenManager.getAccessToken();
        Metadata header = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, "Bearer " + token);
        ClientInterceptor interceptor = MetadataUtils.newAttachHeadersInterceptor(header);

        EnrollmentServiceGrpc.EnrollmentServiceStub managementClient = EnrollmentServiceGrpc.newStub(managedChannel);
        managementClient = managementClient.withInterceptors(interceptor);

        return new ManagedClient(managedChannel, managementClient);
    }
}

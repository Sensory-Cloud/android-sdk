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

/**
 * A collection of grpc service calls for managing existing enrollments and enrollment groups
 */
public class ManagementService {

    /**
     * Listener class for receiving a list of enrollments from the server
     */
    public interface GetEnrollmentsListener {
        /**
         * Called when the grpc call succeeds
         * @param response A list of enrollments
         */
        void onSuccess(GetEnrollmentsResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    /**
     * Listener class for receiving a list of enrollment groups from the server
     */
    public interface GetEnrollmentGroupsListener {
        /**
         * Called when the grpc call succeeds
         * @param response A list of enrollment groups
         */
        void onSuccess(GetEnrollmentGroupsResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    /**
     * Listener class for receiving a single enrollment from the server
     */
    public interface EnrollmentListener {
        /**
         * Called when the grpc call succeeds
         * @param response A single enrollment
         */
        void onSuccess(EnrollmentResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    /**
     * Listener class for receiving a single enrollment group from the server
     */
    public interface EnrollmentGroupListener {
        /**
         * Called when the grpc call succeeds
         * @param response A single enrollment group
         */
        void onSuccess(EnrollmentGroupResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    private Config config;
    private TokenManager tokenManager;

    /**
     * Creates a new ManagementService instance
     *
     * @param config SDK configuration to use for management calls
     * @param tokenManager Token Manager instance to get OAuth credentials from
     */
    public ManagementService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    /**
     * Fetches a list of enrollments for the given userID
     *
     * @param userId userID to fetch enrollments for
     * @param listener Listener that the results will be passed back to
     */
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

    /**
     * Fetches a list of enrollment groups for the given userID
     *
     * @param userId userID to fetch enrollment groups for
     * @param listener Listener that the results will be passed back to
     */
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

    /**
     * Creates a new group of enrollments that can be used for group authentication
     *
     * @param userId userID of the user that owns the enrollment group
     * @param groupId unique group identifier for the enrollment group
     * @param groupName Friendly display name for the enrollment group
     * @param description User supplied description of the enrollment group
     * @param modelName The name of the model that all enrollments in this group will use
     * @param listener Listener that the results will be passed back to
     */
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

    /**
     * Appends enrollments to an existing enrollment group
     *
     * @param groupId Group ID of the enrollment group to append enrollments to
     * @param enrollments A list of enrollment IDs to append to the enrollment group
     * @param listener Listener that the results will be passed back to
     */
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

    /**
     * Requests the deletion of an enrollment
     * The server will prevent users from deleting their last enrollment
     *
     * @param enrollmentId Enrollment ID of the enrollment to delete
     * @param listener Listener that the results will be passed back to
     */
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

    /**
     * Requests the deletion of an enrollment group
     *
     * @param enrollmentGroupId Enrollment group ID of the group to delete
     * @param listener Listener that the results will be passed back to
     */
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

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        EnrollmentServiceGrpc.EnrollmentServiceStub managementClient = EnrollmentServiceGrpc.newStub(managedChannel);
        managementClient = managementClient.withInterceptors(header);

        return new ManagedClient(managedChannel, managementClient);
    }
}

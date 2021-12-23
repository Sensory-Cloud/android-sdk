package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.v1.video.AuthenticateConfig;
import io.sensory.api.v1.video.AuthenticateRequest;
import io.sensory.api.v1.video.AuthenticateResponse;
import io.sensory.api.v1.video.CreateEnrollmentConfig;
import io.sensory.api.v1.video.CreateEnrollmentRequest;
import io.sensory.api.v1.video.CreateEnrollmentResponse;
import io.sensory.api.v1.video.GetModelsRequest;
import io.sensory.api.v1.video.GetModelsResponse;
import io.sensory.api.v1.video.LivenessRecognitionResponse;
import io.sensory.api.v1.video.RecognitionThreshold;
import io.sensory.api.v1.video.ValidateRecognitionConfig;
import io.sensory.api.v1.video.ValidateRecognitionRequest;
import io.sensory.api.v1.video.VideoBiometricsGrpc;
import io.sensory.api.v1.video.VideoModelsGrpc;
import io.sensory.api.v1.video.VideoRecognitionGrpc;

/**
 * A collection of grpc service calls for using vision models through Sensory Cloud
 */
public class VideoService {

    /**
     * Listener class for the getModels grpc response
     */
    public interface GetModelsListener {
        /**
         * Called once the vision models have been successfully retrieved
         * @param response A list of vision models supported by the cloud host
         */
        void onSuccess(GetModelsResponse response);

        /**
         * Called if a grpc error occurs
         * @param t the error that occurred
         */
        void onFailure(Throwable t);
    }

    private Config config;
    private TokenManager tokenManager;

    /**
     * Creates a new VideoService instance
     *
     * @param config SDK configuration to use for video calls
     * @param tokenManager Token Manager instance to get OAuth credentials from
     */
    public VideoService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    /**
     * Fetches a list of the current vision models supported by the cloud host
     *
     * @param listener Listener that the results will be passed back to
     */
    public void getModels(GetModelsListener listener) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        VideoModelsGrpc.VideoModelsStub videoClient = VideoModelsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            videoClient = videoClient.withInterceptors(header);
        } catch (Exception e) {
            listener.onFailure(e);
            return;
        }

        StreamObserver<GetModelsResponse> responseObserver = new StreamObserver<GetModelsResponse>() {
            @Override
            public void onNext(GetModelsResponse value) {
                listener.onSuccess(value);
            }

            @Override
            public void onError(Throwable t) {
                listener.onFailure(t);
            }

            @Override
            public void onCompleted() {
                managedChannel.shutdown();
            }
        };
        videoClient.getModels(GetModelsRequest.getDefaultInstance(), responseObserver);
    }

    /**
     * Opens a bidirectional stream to the server for the purpose of creating a video enrollment
     * This call will automatically send the initial `VideoConfig` message to the server
     *
     * @param modelName Name of the model to create an enrollment for
     * @param userID Unique user identifier
     * @param description User supplied description of the enrollment
     * @param isLivenessEnabled Determines if a liveness check should be conducted as well as an enrollment
     * @param livenessThreshold Liveness threshold for the potential liveness check
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<CreateEnrollmentRequest> createEnrollment(
            String modelName,
            String userID,
            String description,
            boolean isLivenessEnabled,
            RecognitionThreshold livenessThreshold,
            StreamObserver<CreateEnrollmentResponse> responseObserver) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        VideoBiometricsGrpc.VideoBiometricsStub videoClient = VideoBiometricsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            videoClient = videoClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<CreateEnrollmentRequest> requestObserver = videoClient.createEnrollment(responseObserver);

        CreateEnrollmentConfig enrollmentConfig = CreateEnrollmentConfig.newBuilder()
                .setModelName(modelName)
                .setUserId(userID)
                .setDeviceId(config.deviceConfig.deviceId)
                .setDescription(description)
                .setIsLivenessEnabled(isLivenessEnabled)
                .setLivenessThreshold(livenessThreshold)
                .build();
        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder().setConfig(enrollmentConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }

    /**
     * Opens a bidirectional stream for teh purpose of video authentication
     * This call will automatically send the initial `VideoConfig` message to the server
     *
     * @param enrollmentID Enrollment to authenticate against
     * @param isLivenessEnabled Determines if a liveness check should be conducted as well as an enrollment
     * @param livenessThreshold Liveness threshold for the potential liveness check
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<AuthenticateRequest> authenticate(
            String enrollmentID,
            boolean isLivenessEnabled,
            RecognitionThreshold livenessThreshold,
            StreamObserver<AuthenticateResponse> responseObserver) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        VideoBiometricsGrpc.VideoBiometricsStub videoClient = VideoBiometricsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            videoClient = videoClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<AuthenticateRequest> requestObserver = videoClient.authenticate(responseObserver);

        AuthenticateConfig authConfig = AuthenticateConfig.newBuilder()
                .setEnrollmentId(enrollmentID)
                .setIsLivenessEnabled(isLivenessEnabled)
                .setLivenessThreshold(livenessThreshold)
                .build();
        AuthenticateRequest request = AuthenticateRequest.newBuilder().setConfig(authConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }

    /**
     * Opens a bidirectional stream to the server for the purpose of validating the liveness of an image stream
     * This call will automatically send the initial `VideoConfig` message to the server
     *
     * @param modelName Name of the model to use
     * @param userId Unique user identifier
     * @param livenessThreshold Threshold of how confident the model has to be to give a positive liveness result
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<ValidateRecognitionRequest> validateLiveness(
            String modelName,
            String userId,
            RecognitionThreshold livenessThreshold,
            StreamObserver<LivenessRecognitionResponse> responseObserver) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        VideoRecognitionGrpc.VideoRecognitionStub videoClient = VideoRecognitionGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            videoClient = videoClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<ValidateRecognitionRequest> requestObserver = videoClient.validateLiveness(responseObserver);

        ValidateRecognitionConfig livenessConfig = ValidateRecognitionConfig.newBuilder()
                .setModelName(modelName)
                .setUserId(userId)
                .setThreshold(livenessThreshold)
                .build();
        ValidateRecognitionRequest request = ValidateRecognitionRequest.newBuilder().setConfig(livenessConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }
}

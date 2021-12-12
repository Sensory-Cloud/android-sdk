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

public class VideoService {

    public interface GetModelsListener {
        void onSuccess(GetModelsResponse response);
        void onFailure(Throwable t);
    }

    private Config config;
    private TokenManager tokenManager;

    public VideoService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    public void getModels(GetModelsListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        VideoModelsGrpc.VideoModelsStub videoClient = VideoModelsGrpc.newStub(managedChannel);
        videoClient = videoClient.withInterceptors(header);

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

    public StreamObserver<CreateEnrollmentRequest> createEnrollment(
            String modelName,
            String userID,
            String description,
            boolean isLivenessEnabled,
            RecognitionThreshold livenessThreshold,
            StreamObserver<CreateEnrollmentResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        VideoBiometricsGrpc.VideoBiometricsStub videoClient = VideoBiometricsGrpc.newStub(managedChannel);
        videoClient = videoClient.withInterceptors(header);

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

    public StreamObserver<AuthenticateRequest> authenticate(
            String enrollmentID,
            boolean isLivenessEnabled,
            RecognitionThreshold livenessThreshold,
            StreamObserver<AuthenticateResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        VideoBiometricsGrpc.VideoBiometricsStub videoClient = VideoBiometricsGrpc.newStub(managedChannel);
        videoClient = videoClient.withInterceptors(header);

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

    public StreamObserver<ValidateRecognitionRequest> validateLiveness(
            String modelName,
            String userId,
            RecognitionThreshold livenessThreshold,
            StreamObserver<LivenessRecognitionResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        VideoRecognitionGrpc.VideoRecognitionStub videoClient = VideoRecognitionGrpc.newStub(managedChannel);
        videoClient = videoClient.withInterceptors(header);

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

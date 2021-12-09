package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.v1.audio.AudioConfig;
import io.sensory.api.v1.audio.AudioEventsGrpc;
import io.sensory.api.v1.audio.AudioModelsGrpc;
import io.sensory.api.v1.audio.GetModelsRequest;
import io.sensory.api.v1.audio.GetModelsResponse;
import io.sensory.api.v1.audio.ThresholdSensitivity;
import io.sensory.api.v1.audio.ValidateEventConfig;
import io.sensory.api.v1.audio.ValidateEventRequest;
import io.sensory.api.v1.audio.ValidateEventResponse;

public class AudioService {

    public interface GetModelsListener {
        void onSuccess(GetModelsResponse response);
        void onFailure(Throwable t);
    }

    private Config config;
    private TokenManager tokenManager;

    public AudioService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    public void getModels(GetModelsListener listener) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioModelsGrpc.AudioModelsStub audioClient = AudioModelsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

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
        audioClient.getModels(GetModelsRequest.getDefaultInstance(), responseObserver);
    }

    public StreamObserver<ValidateEventRequest> validateTrigger(
            String modelName,
            String userID,
            ThresholdSensitivity sensitivity,
            StreamObserver<ValidateEventResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioEventsGrpc.AudioEventsStub audioClient = AudioEventsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

        StreamObserver<ValidateEventRequest> requestObserver = audioClient.validateEvent(responseObserver);

        AudioConfig audioConfig = AudioConfig.newBuilder()
                .setEncoding(AudioConfig.AudioEncoding.LINEAR16)
                .setSampleRateHertz(16000)
                .setAudioChannelCount(1)
                .setLanguageCode(config.deviceConfig.defaultLanguageCode)
                .build();
        ValidateEventConfig validateEventConfig = ValidateEventConfig.newBuilder()
                .setAudio(audioConfig)
                .setModelName(modelName)
                .setUserId(userID)
                .setSensitivity(sensitivity)
                .build();
        ValidateEventRequest request = ValidateEventRequest.newBuilder()
                .setConfig(validateEventConfig)
                .build();
        requestObserver.onNext(request);

        return requestObserver;
    }
}

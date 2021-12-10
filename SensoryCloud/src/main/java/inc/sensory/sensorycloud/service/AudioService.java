package inc.sensory.sensorycloud.service;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.sensory.api.v1.audio.AudioBiometricsGrpc;
import io.sensory.api.v1.audio.AudioConfig;
import io.sensory.api.v1.audio.AudioEventsGrpc;
import io.sensory.api.v1.audio.AudioModelsGrpc;
import io.sensory.api.v1.audio.AudioTranscriptionsGrpc;
import io.sensory.api.v1.audio.AuthenticateConfig;
import io.sensory.api.v1.audio.AuthenticateRequest;
import io.sensory.api.v1.audio.AuthenticateResponse;
import io.sensory.api.v1.audio.CreateEnrollmentConfig;
import io.sensory.api.v1.audio.CreateEnrollmentRequest;
import io.sensory.api.v1.audio.CreateEnrollmentResponse;
import io.sensory.api.v1.audio.GetModelsRequest;
import io.sensory.api.v1.audio.GetModelsResponse;
import io.sensory.api.v1.audio.ThresholdSensitivity;
import io.sensory.api.v1.audio.TranscribeConfig;
import io.sensory.api.v1.audio.TranscribeRequest;
import io.sensory.api.v1.audio.TranscribeResponse;
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

    public StreamObserver<CreateEnrollmentRequest> createEnrollment(
            String modelName,
            String userID,
            String languageCode,
            String description,
            boolean isLivenessEnabled,
            int numUtterances,
            float enrollmentDuration,
            StreamObserver<CreateEnrollmentResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioBiometricsGrpc.AudioBiometricsStub audioClient = AudioBiometricsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

        StreamObserver<CreateEnrollmentRequest> requestObserver = audioClient.createEnrollment(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        CreateEnrollmentConfig.Builder enrollmentConfigBuilder = CreateEnrollmentConfig.newBuilder()
                .setAudio(audioConfig)
                .setModelName(modelName)
                .setUserId(userID)
                .setDeviceId(config.deviceConfig.deviceId)
                .setDescription(description)
                .setIsLivenessEnabled(isLivenessEnabled);
        if (numUtterances != 0) {
            enrollmentConfigBuilder.setEnrollmentNumUtterances(numUtterances);
        } else {
            enrollmentConfigBuilder.setEnrollmentDuration(enrollmentDuration);
        }
        CreateEnrollmentConfig enrollmentConfig = enrollmentConfigBuilder.build();
        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder().setConfig(enrollmentConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }

    public StreamObserver<AuthenticateRequest> authenticate(
            String enrollmentID,
            String languageCode,
            boolean isLivenessEnabled,
            StreamObserver<AuthenticateResponse> responseObserver) {
        return streamAuthentication(enrollmentID, "", languageCode, isLivenessEnabled, responseObserver);
    }

    public StreamObserver<AuthenticateRequest> authenticateGroup(
            String groupID,
            String languageCode,
            boolean isLivenessEnabled,
            StreamObserver<AuthenticateResponse> responseObserver) {
        return streamAuthentication("", groupID, languageCode, isLivenessEnabled, responseObserver);
    }

    public StreamObserver<ValidateEventRequest> validateTrigger(
            String modelName,
            String userID,
            String languageCode,
            ThresholdSensitivity sensitivity,
            StreamObserver<ValidateEventResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioEventsGrpc.AudioEventsStub audioClient = AudioEventsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

        StreamObserver<ValidateEventRequest> requestObserver = audioClient.validateEvent(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
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

    public StreamObserver<TranscribeRequest> transcribeAudio(
            String modelName,
            String userID,
            String languageCode,
            StreamObserver<TranscribeResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioTranscriptionsGrpc.AudioTranscriptionsStub audioClient = AudioTranscriptionsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

        StreamObserver<TranscribeRequest> requestObserver = audioClient.transcribe(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        TranscribeConfig transcribeConfig = TranscribeConfig.newBuilder()
                .setAudio(audioConfig)
                .setModelName(modelName)
                .setUserId(userID)
                .build();
        TranscribeRequest request = TranscribeRequest.newBuilder().setConfig(transcribeConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }

    private AudioConfig getDefaultAudioConfig(String languageCode) {
        String language = languageCode == "" ? config.deviceConfig.defaultLanguageCode : languageCode;

        return AudioConfig.newBuilder()
                .setEncoding(AudioConfig.AudioEncoding.LINEAR16)
                .setSampleRateHertz(16000)
                .setAudioChannelCount(1)
                .setLanguageCode(language)
                .build();
    }

    private StreamObserver<AuthenticateRequest> streamAuthentication(
            String enrollmentID,
            String groupID,
            String languageCode,
            boolean isLivenessEnabled,
            StreamObserver<AuthenticateResponse> responseObserver) {
        // ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).usePlaintext().build();

        ClientInterceptor header = tokenManager.getAuthorizationMetadata();
        AudioBiometricsGrpc.AudioBiometricsStub audioClient = AudioBiometricsGrpc.newStub(managedChannel);
        audioClient = audioClient.withInterceptors(header);

        StreamObserver<AuthenticateRequest> requestObserver = audioClient.authenticate(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        AuthenticateConfig.Builder authConfigBuilder = AuthenticateConfig.newBuilder()
                .setAudio(audioConfig)
                .setIsLivenessEnabled(isLivenessEnabled);
        if (enrollmentID.isEmpty()) {
            authConfigBuilder.setEnrollmentGroupId(groupID);
        } else {
            authConfigBuilder.setEnrollmentId(enrollmentID);
        }
        AuthenticateConfig authConfig = authConfigBuilder.build();
        AuthenticateRequest request = AuthenticateRequest.newBuilder().setConfig(authConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }
}

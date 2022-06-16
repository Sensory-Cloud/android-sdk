package ai.sensorycloud.service;

import ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest;
import ai.sensorycloud.api.v1.audio.CreateEnrollmentEventConfig;
import ai.sensorycloud.api.v1.audio.ValidateEnrolledEventConfig;
import ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest;
import ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse;
import ai.sensorycloud.Config;
import ai.sensorycloud.tokenManager.TokenManager;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ai.sensorycloud.api.v1.audio.AudioBiometricsGrpc;
import ai.sensorycloud.api.v1.audio.AudioConfig;
import ai.sensorycloud.api.v1.audio.AudioEventsGrpc;
import ai.sensorycloud.api.v1.audio.AudioModelsGrpc;
import ai.sensorycloud.api.v1.audio.AudioTranscriptionsGrpc;
import ai.sensorycloud.api.v1.audio.AuthenticateConfig;
import ai.sensorycloud.api.v1.audio.AuthenticateRequest;
import ai.sensorycloud.api.v1.audio.AuthenticateResponse;
import ai.sensorycloud.api.v1.audio.CreateEnrollmentConfig;
import ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest;
import ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse;
import ai.sensorycloud.api.v1.audio.GetModelsRequest;
import ai.sensorycloud.api.v1.audio.GetModelsResponse;
import ai.sensorycloud.api.v1.audio.ThresholdSensitivity;
import ai.sensorycloud.api.v1.audio.TranscribeConfig;
import ai.sensorycloud.api.v1.audio.TranscribeRequest;
import ai.sensorycloud.api.v1.audio.TranscribeResponse;
import ai.sensorycloud.api.v1.audio.ValidateEventConfig;
import ai.sensorycloud.api.v1.audio.ValidateEventRequest;
import ai.sensorycloud.api.v1.audio.ValidateEventResponse;

/**
 * A collection of grpc service calls for using audio models through Sensory Cloud
 */
public class AudioService {

    /**
     * Enum for determining if an enrollment ID is a enrollment ID or an enrollment group ID
     */
    public enum EnrollmentType {
        ENROLLMENT_ID,
        ENROLLMENT_GROUP_ID
    }

    /**
     * Listener class for the getModels grpc response
     */
    public interface GetModelsListener {
        /**
         * Called once the audio models have been successfully retrieved
         * @param response A list of audio models supported by the cloud host
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
    private ManagedChannel unitTestingManagedChannel;

    /**
     * Creates a new AudioService instance
     *
     * @param config SDK configuration to use for audio calls
     * @param tokenManager Token Manager instance to get OAuth credentials from
     */
    public AudioService(Config config, TokenManager tokenManager) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    /**
     * Creates a new AudioService instance
     *
     * @param config SDK configuration to use for audio calls
     * @param tokenManager Token Manager instance to get OAuth credentials from
     * @param managedChannel A grpc managed channel to use for grpc calls, this is primarily used to assist with unit testing
     */
    public AudioService(Config config, TokenManager tokenManager, ManagedChannel managedChannel) {
        this.config = config;
        this.tokenManager = tokenManager;
        this.unitTestingManagedChannel = managedChannel;
    }

    /**
     * Fetches a list of the current audio models supported by the cloud host
     *
     * @param listener Listener that the results will be passed back to
     */
    public void getModels(GetModelsListener listener) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioModelsGrpc.AudioModelsStub audioClient = AudioModelsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
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
        audioClient.getModels(GetModelsRequest.getDefaultInstance(), responseObserver);
    }

    /**
     * Opens a bidirectional stream to the server for the purpose of creating an audio enrollment
     * This will will automatically send the initial `AudioConfig` message to the server
     *
     * @param modelName Name of the model to enroll against
     * @param userID Unique user identifier
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param description User supplied description of the enrollment
     * @param isLivenessEnabled Verifies liveness during the enrollment process
     * @param numUtterances Sets how many utterances should be required for text-dependent enrollments
     *                      defaults to 4 if not specified.
     *                      This parameter should be 0 for text-independent enrollments
     * @param enrollmentDuration Sets the duration in seconds for text-independent enrollments.
     *                           defaults to 12.5 without liveness enabled, and 8 with liveness enabled.
     *                           this parameter should be 0 for text-dependent enrollments
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<CreateEnrollmentRequest> createEnrollment(
            String modelName,
            String userID,
            String languageCode,
            String description,
            boolean isLivenessEnabled,
            int numUtterances,
            float enrollmentDuration,
            StreamObserver<CreateEnrollmentResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioBiometricsGrpc.AudioBiometricsStub audioClient = AudioBiometricsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

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

    /**
     * Opens a bidirectional stream for the purpose of authentication against audio enrollments
     * This call will automatically send the initial `AudioConfig` message to the server
     *
     * @param enrollmentType Determines if enrollmentID is associated to a single enrollment or an enrollment group
     * @param enrollmentID Either the enrollment ID or the enrollment group ID to authenticate against
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param isLivenessEnabled Specifies if the authentication should also include a liveness check
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<AuthenticateRequest> authenticate(
            EnrollmentType enrollmentType,
            String enrollmentID,
            String languageCode,
            boolean isLivenessEnabled,
            StreamObserver<AuthenticateResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioBiometricsGrpc.AudioBiometricsStub audioClient = AudioBiometricsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<AuthenticateRequest> requestObserver = audioClient.authenticate(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        AuthenticateConfig.Builder authConfigBuilder = AuthenticateConfig.newBuilder()
                .setAudio(audioConfig)
                .setIsLivenessEnabled(isLivenessEnabled);
        switch (enrollmentType) {
            case ENROLLMENT_ID:
                authConfigBuilder.setEnrollmentId(enrollmentID);
                break;
            case ENROLLMENT_GROUP_ID:
                authConfigBuilder.setEnrollmentGroupId(enrollmentID);
                break;
        }
        AuthenticateConfig authConfig = authConfigBuilder.build();
        AuthenticateRequest request = AuthenticateRequest.newBuilder().setConfig(authConfig).build();
        requestObserver.onNext(request);

        return requestObserver;
    }

    /**
     * Opens a bidirectional stream for the purpose of audio event validation
     * This call will automatically send the initial `AudioConfig` message to the server
     *
     * @param modelName Name of model to validate
     * @param userID Unique user identifier
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param sensitivity How sensitive the model should be to false accepts
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<ValidateEventRequest> validateTrigger(
            String modelName,
            String userID,
            String languageCode,
            ThresholdSensitivity sensitivity,
            StreamObserver<ValidateEventResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioEventsGrpc.AudioEventsStub audioClient = AudioEventsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

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

    /**
     * Opens a bidirectional stream for the purpose of creating an enrolled audio event
     * This call will automatically send the initial `AudioConfig` message to the server
     *
     * @param modelName Name of the model to enroll against
     * @param userID Unique user identifier
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param description User supplied description of the enrollment
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<CreateEnrolledEventRequest> createEnrolledEvent(
            String modelName,
            String userID,
            String languageCode,
            String description,
            StreamObserver<CreateEnrollmentResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioEventsGrpc.AudioEventsStub audioClient = AudioEventsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<CreateEnrolledEventRequest> requestObserver = audioClient.createEnrolledEvent(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        CreateEnrollmentEventConfig enrollmentConfig = CreateEnrollmentEventConfig.newBuilder()
                .setAudio(audioConfig)
                .setModelName(modelName)
                .setUserId(userID)
                .setDescription(description)
                .build();
        CreateEnrolledEventRequest enrollmentRequest = CreateEnrolledEventRequest.newBuilder()
                .setConfig(enrollmentConfig)
                .build();
        requestObserver.onNext(enrollmentRequest);

        return requestObserver;
    }

    /**
     * Opens a bidirectional stream for the purpose of authentication against an enrolled audio event
     * This call will automatically send the initial `AudioConfig` message to the server
     *
     * @param enrollmentType Determines if enrollmentID is associated to a single enrollment or an enrollment group
     * @param enrollmentID Either the enrollment ID or the enrollment group ID to authenticate against
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param sensitivity How sensitive the model should be to false accepts
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<ValidateEnrolledEventRequest> validateEnrolledEvent(
            EnrollmentType enrollmentType,
            String enrollmentID,
            String languageCode,
            ThresholdSensitivity sensitivity,
            StreamObserver<ValidateEnrolledEventResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioEventsGrpc.AudioEventsStub audioClient = AudioEventsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

        StreamObserver<ValidateEnrolledEventRequest> requestObserver = audioClient.validateEnrolledEvent(responseObserver);

        AudioConfig audioConfig = getDefaultAudioConfig(languageCode);
        ValidateEnrolledEventConfig.Builder authConfigBuilder = ValidateEnrolledEventConfig.newBuilder()
                .setAudio(audioConfig)
                .setSensitivity(sensitivity);
        switch (enrollmentType) {
            case ENROLLMENT_ID:
                authConfigBuilder.setEnrollmentId(enrollmentID);
                break;
            case ENROLLMENT_GROUP_ID:
                authConfigBuilder.setEnrollmentGroupId(enrollmentID);
                break;
        }
        ValidateEnrolledEventRequest request = ValidateEnrolledEventRequest.newBuilder().setConfig(authConfigBuilder).build();
        requestObserver.onNext(request);

        return requestObserver;
    }


    /**
     * Opens a bidirectional stream to the server that provides a transcription of the provided audio data
     * This call will automatically send the initial `AudioConfig` message to the server
     * The final message sent on the returned observer *must* include a post-processing action of FINAL
     *
     * @param modelName Name of model to validate
     * @param userID Unique user identifier
     * @param languageCode Preferred language code for the user, pass in an empty string to use the value from Config
     * @param responseObserver Observer that will be populated with the stream responses
     * @return Observer that can be used to send requests to the server, may be null if an OAuth error occurs
     */
    public StreamObserver<TranscribeRequest> transcribeAudio(
            String modelName,
            String userID,
            String languageCode,
            StreamObserver<TranscribeResponse> responseObserver) {
        ManagedChannel managedChannel = getManagedChannel();
        AudioTranscriptionsGrpc.AudioTranscriptionsStub audioClient = AudioTranscriptionsGrpc.newStub(managedChannel);

        try {
            ClientInterceptor header = tokenManager.getAuthorizationMetadata();
            audioClient = audioClient.withInterceptors(header);
        } catch (Exception e) {
            responseObserver.onError(e);
            return null;
        }

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

    private ManagedChannel getManagedChannel() {
        ManagedChannel managedChannel = unitTestingManagedChannel;
        if (managedChannel == null) {
            managedChannel = ManagedChannelBuilder.forTarget(config.cloudConfig.host).useTransportSecurity().build();
        }
        return managedChannel;
    }
}

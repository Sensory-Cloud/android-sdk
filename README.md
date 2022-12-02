[![](https://jitpack.io/v/Sensory-Cloud/android-sdk.svg)](https://jitpack.io/#Sensory-Cloud/android-sdk)

# Sensory Cloud Android SDK

This repository contains the source code for the Sensory Cloud Android SDK.

## General Information

Before getting started, you must spin up a Sensory Cloud inference server or have Sensory spin one up for you. You must also have the following pieces of information:

- Your inference server URL
- Your Sensory Tenant ID (UUID)

## Integration

The Android SDK targets Android SDK version 31 (Android 12) with minimum support for Android SDK version 26 (Android 8)

The Android SDK is available via [JitPack.io](https://jitpack.io/#Sensory-Cloud/android-sdk). Jitpack can be easily integrated by first adding their repository to the root `build.gradle` file:

```Java
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

For Android projects that are setup for "settings repositories" over "project repositories", add the Jitpack repository to the `settings.gradle` file instead:

```Java
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Now that the repository has been added, just add the dependency to `build.gradle`

```Java
dependencies {
    implementation 'com.github.Sensory-Cloud:android-sdk:<VERSION>'
}
```

where `<VERSION>` is the specific SDK version to use, ex: `com.github.Sensory-Cloud:android-sdk:v0.7.1`

GRPC dependencies also need to be manually added to the `build.gradle` file

```Java
dependencies {
    implementation 'com.github.Sensory-Cloud:android-sdk:<VERSION>'
     
    def grpc_version = "1.44.1"
    implementation "io.grpc:grpc-okhttp:$grpc_version"
    implementation "io.grpc:grpc-protobuf-lite:$grpc_version"
    implementation "io.grpc:grpc-stub:$grpc_version"
    compileOnly 'org.apache.tomcat:annotations-api:6.0.53' // necessary for Java 9+
    androidTestImplementation "io.grpc:grpc-testing:$grpc_version"
}
```

# Examples

## Secure Credential Store

`SecureCredentialStore` is an interface for saving and retrieving OAuth credentials (clientID and clientSecret). This SDK also provides a default implementation `DefaultSecureCredentialStore` that uses the on device secure enclave. If you want to support Android devices without a secure enclave, you will have to provide your own implementation of `SecureCredentialStore`.

A basic example for using `SecureCredentialStore`:

```Java
String clientID = "21a060d7-b134-4a5a-a1ff-e28b9b4ad755";
String clientSecret = generateRandomToken();

// Use the credential ID to store multiple sets of client credentials using the same credential store.
// While the class itself is not static, all instances of DefaultCredentialStore will have access to your saved credentials.
DefaultSecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext(), "credentialID");
try {
    credentialStore.setCredentials(clientID, clientSecret);
} catch (Exception e) {
    // Handle error with saving credentials (ensure your device has a secure enclave)
}

try {
    String retrievedClientID = credentialStore.getClientId();
    String retrievedClientSecret = credentialStore.getClientSecret();
} catch (Exception e) {
    // Handle error with retrieving credentials
}
```

## SDK Initialization

The SDK must be explicitly initialized every time the app is launched. This initialization sets up internal configurations and will also enroll the device into the Sensory Cloud server if the device has not been previously enrolled. SDK initialization is completed by calling `Initializer.initialize(...)`. There are two versions of this function. One that takes in an explicit configuration object, and one that takes in a file input stream to a config file. The following configurations are set during initialization:
 - fullyQualifiedDomainName: This is the fqdn of the Sensory Cloud server to communicate with
 - tenantID: The unique identifier (UUID) for your Sensory Cloud tenant
 - enrollmentType: The amount of security required for device enrollment. This should be one of `none`, `sharedSecret` or `jwt`. If the device has already been enrolled during a previous app session, this field is ignored
 - credential: The credential required for device enrollment, the value depends on the enrollment type:
    - `none` enrollmentType: credential should be an empty string
    - `sharedSecret` enrollmentType: credential should be the shared secret (password)
    - `jwt` enrollmentType: credential should be a hex string of the enrollment private key

    If the device has already been enrolled during a previous app session, this field is ignored
 - deviceID: A unique device identifier (UUID)
 - deviceName: The friendly name of the device
 
 The Android SDK accepts config files in the `ini` format. Example config files can be found under `SensoryCloud/src/androidTest/resources/`. The below example shows how to initialize the SDK from a config file
 
 ```Java
 // Initialize a credential store and OAuth service
DefaultSecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext(), "default");
OAuthService oAuthService = new OAuthService(credentialStore);
 
 InputStream fileStream = this.getClass().getClassLoader().getResourceAsStream("SensoryCloudConfig.ini");
 Initializer.initialize(
    oauthService,
    null, // JWT signer class, only used when enrollmentType is `jwt`
    fileStream,
    "", // Optional override for deviceID, useful when sharing config files across multiple devices
    "", // Optional override for deviceName, useful when sharing config files across multiple devices
    new OAuthService.EnrollDeviceListener() {
        @Override
        public void onSuccess(DeviceResponse response) {
            // SDK has been successfully initialized and the device has been enrolled
            // `response` may be null if the device has previously been enrolled
        }
        
        @Override
        public void onFailure(Throwable t) {
            // Handle error during SDK initialization
        }
    }
 );
 ```

## Creating a Token Manager

The `TokenManager` class handles refreshing OAuth tokens as they expire. This will be passed into other services that require authorization to access

```Java
SecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext(), "default");
OAuthService oAuthService = new OAuthService(credentialStore);
TokenManager tokenManager = new TokenManager(getContext(), oAuthService);

String OAuthToken = tokenManager.getAccessToken();
```

## Checking Server Health

It's important to check the health of you Sensory Inference server. You can do so via the following:

```Java
// First ensure the SDK has been initialized

HealthService healthService = new HealthService();
healthService.getHealth(new HealthService.GetHealthListener() {
    @Override
    public void onSuccess(ServerHealthResponse response) {
        // Process health response
    }

    @Override
    public void onFailure(Throwable t) {
        // Server error occurred
    }
});
```

## Audio Methods

### Creating an Audio Service

`AudioService` provides methods to stream audio to Sensory Cloud. It is recommended to only have 1 instance of `AudioService`.

```Java
AudioService audioService = new AudioService(tokenManager);
```

### Creating an Audio Stream Interactor

`AudioStreamInteractor` is a Sensory implementation for accessing the device's microphone. This uses an instance of `AudioRecord` behind the scenes. `AudioStreamInteractor` requires that your app requests audio record permissions before initializing an instance (Manifest.permission.RECORD_AUDIO). It is important to call `close()` on your `AudioStreamInteractor` instance when you are finished using it to free up resources.

```Java
if( ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
    // request audio permissions
    return;
}

try {
    AudioStreamInteractor interactor = AudioStreamInteractor.newAudioStreamInteractor(getContext());
} catch (Exception e) {
    // Handle error (may be due to not having audio record permissions)
}
```

### Obtaining Audio Models

Certain audio models are available to your application depending on the models that are configured in your instance to Sensory Cloud. In order to determine which audio models are accessible to you, you can execute the following:

```Java
AudioService audioService = getAudioService();

audioService.getModels(new AudioService.GetModelsListener() {
    @Override
    public void onSuccess(GetModelsResponse response) {
        response.getModelsList();
    }

    @Override
    public void onFailure(Throwable t) {
        // Handle server error
    }
});
```

Audio models contain the following properties:

 - Name - the unique name tied to this model. Used when calling any other audio function.
 - IsEnrollable - indicates if the model can be enrolled into. Models that are enrollable can be used in the CreateEnrollment function.
 - ModelType - indicates the class of model and its general function.
 - FixedPhrase - for speech-based models only. Indicates if a specific phrase must be said.
 - SampleRate - indicates the audio sample rate required by this model. Generally, the number will be 16000.
 - IsLivenessSupported - indicates if this model supports liveness for enrollment and authentication. Liveness provides an added layer of security by requiring a users to speak random digits.

### Enrolling with Audio

In order to enroll with audio, you must first ensure you have an enrollable model enabled for your Sensory Cloud instance. This can be obtained via the `getModels` request. Enrolling with audio uses a bi-directional streaming pattern to allow immediate feedback to the user during enrollment. It is important to save the `enrollmentID` in order to perform authentication against it in the future.

```Java
// Get basic enrollment information
String modelName = "wakeword-16kHz-open_sesame.ubm";
String userID = "72f286b8-173f-436a-8869-6f7887789ee9";
String enrollmentDescription = "My Enrollment";
boolean isLivenessEnabled = false;

// boolean to control audio streaming
AtomicBoolean isRecording = new AtomicBoolean(false);

// Open the grpc stream
StreamObserver<CreateEnrollmentRequest> requestObserver = audioService.createEnrollment(
        modelName,
        userID,
        "",
        enrollmentDescription,
        isLivenessEnabled,
        0, 0,
        new StreamObserver<CreateEnrollmentResponse>() {
            @Override
            public void onNext(CreateEnrollmentResponse value) {
                // The response contains information about the enrollment status.
                // * audioEnergy
                // * percentComplete
                // For enrollments with liveness, there are two additional fields that are populated.
                // * modelPrompt - indicates what the user should say in order to proceed with the enrollment.
                // * sectionPercentComplete - indicates the percentage of the current ModelPrompt that has been spoken.
                // EnrollmentId will be populated once the enrollment is complete
                if( value.getEnrollmentId() != "" ) {
                    // Enrollment is complete
                    isRecording.set(false);
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle Server error
            }

            @Override
            public void onCompleted() {
                // Handle the grpc stream closing
                isRecording.set(false);
            }
        }
);

// Start Audio Recording
Thread mThread = new Thread(new Runnable() {
    @Override
    public void run() {
        audioStreamInteractor.startRecording();
        isRecording.set(true);
        while(isRecording.get()) {
            try {
                byte[] buffer = audioStreamInteractor.audioQueue.take();
                ByteString audio = ByteString.copyFrom(buffer);
                // (Make sure you use the proper type for the grpc stream you're using)
                CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                        .setAudioContent(audio)
                        .build();
                requestObserver.onNext(request);
            } catch (Exception e) {
                // Handle errors (usually `InterruptedException` on the audioQueue.take call)
            }
        }
        audioStreamInteractor.stopRecording();
        // Close the grpc stream once you finish recording;
        requestObserver.onCompleted();
    }
});
mThread.start();
```

### Authenticating with Audio

Authenticating with audio is similar to enrollment, except now you pass in an enrollmentID instead of the model name.

```Java
// Get basic enrollment information
String enrollmentID = "436ee716-346e-4066-8c28-7b5ef192831f";
boolean isLivenessEnabled = false;

// Open the grpc stream
StreamObserver<AuthenticateRequest> requestObserver = audioService.authenticate(
        AudioService.EnrollmentType.ENROLLMENT_ID,
        enrollmentID,
        "",
        isLivenessEnabled,
        new StreamObserver<AuthenticateResponse>() {
            @Override
            public void onNext(AuthenticateResponse value) {
                // the response contains information about the authentication audio such as:
                // * audioEnergy
                // For authentications with liveness, there are two additional fields that are populated.
                // * modelPrompt - indicates what the user should say in order to proceed with the authentication.
                // * sectionPercentComplete - indicates the percentage of the current ModelPrompt that has been spoken.
                if ( value.getSuccess() ) {
                    // Successful authentication!
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handle grpc stream close
            }
        }
);

// Start Audio Recording
// See audio enrollment example for details
```

### Audio Events

Audio events are used to recognize specific words, phrases, or sounds.

```Java
String userId = "72f286b8-173f-436a-8869-6f7887789ee9";
String modelName = "wakeword-16kHz-open_sesame.ubm";

// Open the grpc stream
StreamObserver<ValidateEventRequest> requestObserver = audioService.validateTrigger(
        modelName,
        userId,
        "",
        // Determines how sensitive the model should be to false accepts
        ThresholdSensitivity.MEDIUM,
        new StreamObserver<ValidateEventResponse>() {
            @Override
            public void onNext(ValidateEventResponse value) {
                // the response will contain the following if the event was recognized
                // * resultId - indicating the name of the event that was recognized
                // * score - Sensory's confidence in the result
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handle grpc stream close
            }
        }
);

// Start Audio Recording
// See audio enrollment example for details

// The SDK implementer can decide when they want to close the audio stream by calling
requestObserver.onCompleted();
```

### Transcription (Sliding Window Transcript)

Transcription is used to convert audio into text.

```Java
String userId = "72f286b8-173f-436a-8869-6f7887789ee9";
String modelName = "wakeword-16kHz-open_sesame.ubm";

// Open the grpc stream
StreamObserver<TranscribeRequest> requestObserver = audioService.transcribeAudio(
        modelName,
        userId,
        "",
        new StreamObserver<TranscribeResponse>() {
            @Override
            public void onNext(TranscribeResponse value) {
                // Response contains information about the audio such as:
                // * audioEnergy

                // Transcript contains the current running transcript of the last 7 seconds of processed audio
                // If you want a full transcript, see the below example
                String transcript = value.getTranscript();
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handle grpc stream close
            }
        }
);

// Start Audio Recording
// See audio enrollment example for details

// The SDK implementer can decide when they want to close the audio stream by calling
requestObserver.onCompleted();
```

### Transcription (Full Transcript)

Transcription is used to convert audio into text.

```Java
String userId = "72f286b8-173f-436a-8869-6f7887789ee9";
String modelName = "wakeword-16kHz-open_sesame.ubm";
TranscriptAggregator aggregator = new TranscriptAggregator();

// Open the grpc stream
StreamObserver<TranscribeRequest> requestObserver = audioService.transcribeAudio(
        modelName,
        userId,
        "",
        new StreamObserver<TranscribeResponse>() {
            @Override
            public void onNext(TranscribeResponse value) {
                // Response contains information about the audio such as:
                // * audioEnergy

                // The transcript aggregator will collect all of the server responses and save a full transcript
                aggregator.processResponse(value.getWordList());
                String transcript = aggregator.getTranscript();
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handle grpc stream close
            }
        }
);

// Start Audio Recording
// See audio enrollment example for details

// The SDK implementer can decide when they want to close the audio stream by calling
requestObserver.onCompleted();
```

## Video Methods

### Creating a Video Service

`VideoService` provides methods to stream images to Sensory Cloud. It is recommended to only have 1 instance of `VideoService`.

```Java
VideoService videoService = new VideoService(tokenManager);
```

### Creating a Video Stream Interactor

`VideoStreamInteractor` is a Sensory implementation for accessing the phone's camera. This uses CameraX behind the scenes. `VideoStreamInteractor` requires that your app requests camera permissions before initializing an instance (Manifest.permission.CAMERA).

```Java
if( ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
    // request camera permissions
    return;
}

try {
    VideoStreamInteractor interactor = VideoStreamInteractor.newVideoStreamInteractor(
            getContext(),
            binding.viewFinder.getSurfaceProvider(), // Surface provider to display video preview on
            null,
            new VideoStreamInteractor.VideoStreamListener() {
                // Listener for receiving video data through
                // See Video Enrollment example for details
            });
} catch (Exception e) {
    // Handle error (may be due to not having camera permissions)
}
```

### Obtaining Video Models

Certain video models are available to your application depending on the models that are configured for your instance of Sensory Cloud. In order to determine which video models are accessible to you, you can execute the following:

```Java
VideoService videoService = getVideoService();

videoService.getModels(new VideoService.GetModelsListener() {
    @Override
    public void onSuccess(GetModelsResponse response) {
        response.getModelsList();
    }

    @Override
    public void onFailure(Throwable t) {
        // Handle server error
    }
});
```

Video models contain the following properties:

 - Name - the unique name tied to this model. Used when calling any other video function.
 - IsEnrollable - indicates if the model can be enrolled into. Models that are enrollable can be used in the CreateEnrollment function.
 - ModelType - indicates the class of model and its general function.
 - FixedObject - for recognition-based models only. Indicates if this model is built to recognize a specific object.
 - IsLivenessSupported - indicates if this model supports liveness for enrollment and authentication. Liveness provides an added layer of security.

### Enrolling with Video

In order to enroll with video, you must first ensure you have an enrollable model enabled for your Sensory Cloud instance. This can be obtained via the `getModels` request. Enrolling with video uses a call and response streaming pattern to allow immediate feedback to the user during enrollment. It is important to save the enrollmentID in order to perform authentication against it in the future.

```Java
// Get basic enrollment information
String modelName = "face_biometric_hektor";
String userID = "72f286b8-173f-436a-8869-6f7887789ee9";
String enrollmentDescription = "My Enrollment";
boolean isLivenessEnabled = true;
RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;
int liveFramesRequired = 1;

StreamObserver<CreateEnrollmentRequest> requestObserver = null;

// Initialize the video stream interactor
VideoStreamInteractor videoStreamInteractor = VideoStreamInteractor.newVideoStreamInteractor(
        getContext(),
        binding.viewFinder.getSurfaceProvider(),
        null,
        new VideoStreamInteractor.VideoStreamListener() {
            @Override
            public void onSuccess(byte[] image) {
                if (requestObserver != null) {
                    // (Make sure you use the proper type for the grpc stream you're using)
                    CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                            .setImageContent(ByteString.copyFrom(image))
                            .build();
                    requestObserver.onNext(request);
                }
            }

            @Override
            public void onFailure(Exception e) {
                // Handle video capture error
            }
        }
);

// Open the grpc stream
requestObserver = videoService.createEnrollment(
        modelName,
        userID,
        enrollmentDescription,
        isLivenessEnabled,
        threshold,
        liveFramesRequired,
        new StreamObserver<CreateEnrollmentResponse>() {
            @Override
            public void onNext(CreateEnrollmentResponse value) {
                // The response contains information about the enrollment status.
                // * percentComplete

                // enrollmentID will be populated once the enrollment is complete
                String enrollmentID = value.getEnrollmentId();

                // If the enrollment is not complete, send the next video frame
                if (enrollmentID.isEmpty()) {
                    videoStreamInteractor.takeImageCapture();
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handler grpc stream being closed
                videoStreamInteractor.stopRecording();
            }
        }

);

// Start the video preview and request an initial image
videoStreamInteractor.startRecording(getActivity());
videoStreamInteractor.takeImageCapture();
```

### Authenticating with Video

Authenticating with video is similar to enrollment, except now you pass in an enrollmentID instead of the model name.

```Java
// Get basic authentication information
String enrollmentID = "fcc8a800-252e-442c-af30-41846f248238";
boolean isLivenessEnabled = true;
RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;

StreamObserver<AuthenticateRequest> requestObserver = null;

// Initialize the video stream interactor
// See video enrollment example for details

// Open the grpc stream
requestObserver = videoService.authenticate(
        AudioService.EnrollmentType.ENROLLMENT_ID,
        enrollmentID,
        isLivenessEnabled,
        threshold,
        new StreamObserver<AuthenticateResponse>() {
            @Override
            public void onNext(AuthenticateResponse value) {
                if (value.getSuccess()) {
                    // Authentication was successful
                } else {
                    // Send the next video frame
                    videoStreamInteractor.takeImageCapture();
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handler grpc stream being closed
                videoStreamInteractor.stopRecording();
            }
        }
);

// Start the video preview and request an initial image
videoStreamInteractor.startRecording(getActivity());
videoStreamInteractor.takeImageCapture();
```

### Video Liveness

Video Liveness allows one to send images to Sensory Cloud in order to determine if the subject is a live individual rather than a spoof, such as a paper mask or picture.

```Java
// Get basic liveness information
String userId = "bea536c2-45d7-47b3-94e2-4962e1bb8a2f";
String modelName = "face_recognition_mathilde";
RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;

StreamObserver<ValidateRecognitionRequest> requestObserver = null;

// Initialize the video stream interactor
// See video enrollment example for details

// Open the grpc stream
requestObserver = videoService.validateLiveness(
        modelName,
        userId,
        threshold,
        new StreamObserver<LivenessRecognitionResponse>() {
            @Override
            public void onNext(LivenessRecognitionResponse value) {
                if (value.getIsAlive()) {
                    // Previous frame was determined to be alive
                }

                // Send the next video frame
                videoStreamInteractor.takeImageCapture();
            }

            @Override
            public void onError(Throwable t) {
                // Handle server error
            }

            @Override
            public void onCompleted() {
                // Handler grpc stream being closed
                videoStreamInteractor.stopRecording();
            }
        }
);

// Start the video preview and request an initial image
videoStreamInteractor.startRecording(getActivity());
videoStreamInteractor.takeImageCapture();
```

## Creating a Management Service

The `ManagementService` is used to manage typical CRUD operations with Sensory Cloud, such as deleting enrollments or creating enrollment groups. For more information on the specific functions of the `ManagementService`, please refer to the ManagementService file located in the services folder.

```Java
ManagementService managementService = new ManagementService(tokenManager);
```

package ai.sensorycloud.demo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.google.protobuf.ByteString;

import java.util.concurrent.atomic.AtomicBoolean;

import ai.sensorycloud.config.Config;
import ai.sensorycloud.interactors.VideoStreamInteractor;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.service.VideoService;
import ai.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import ai.sensorycloud.tokenManager.SecureCredentialStore;
import ai.sensorycloud.tokenManager.TokenManager;
import ai.sensorycloud.demo.databinding.VideoFragmentBinding;
import io.grpc.stub.StreamObserver;
import ai.sensorycloud.api.v1.video.GetModelsResponse;
import ai.sensorycloud.api.v1.video.LivenessRecognitionResponse;
import ai.sensorycloud.api.v1.video.RecognitionThreshold;
import ai.sensorycloud.api.v1.video.ValidateRecognitionRequest;

public class VideoFragment extends Fragment {

    private final String clientAppPrefs = "SensoryClient";
    private final String deviceIDKey = "deviceID";

    private static final String LOG_TAG = "VideoView";

    private VideoFragmentBinding binding;
    private ArrayAdapter<String> spinnerAdapter;
    private AtomicBoolean isRecording = new AtomicBoolean(false);
    private StreamObserver<ValidateRecognitionRequest> requestObserver;

    private Config sensoryConfig;
    private VideoService videoService;
    private VideoStreamInteractor videoStreamInteractor;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // TODO: - better config management
        SharedPreferences prefs = getContext().getSharedPreferences(clientAppPrefs, Context.MODE_PRIVATE);
        String deviceID = prefs.getString(deviceIDKey, "");
        sensoryConfig = new Config(
                new Config.CloudConfig("10.0.2.2:50050"),
                new Config.TenantConfig("b6e1b848-75da-46cb-aad8-981cc3ccebcd"),
                new Config.DeviceConfig(deviceID, "en_US"));

        SecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext(), "");
        OAuthService oAuthService = new OAuthService(sensoryConfig, credentialStore);
        TokenManager tokenManager = new TokenManager(getContext(), oAuthService);
        videoService = new VideoService(sensoryConfig, tokenManager);

        binding = VideoFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try {
            videoStreamInteractor = VideoStreamInteractor.newVideoStreamInteractor(
                    getContext(),
                    binding.viewFinder.getSurfaceProvider(),
                    null,
                    new VideoStreamInteractor.VideoStreamListener() {
                        @Override
                        public void onSuccess(byte[] image) {
                            if (requestObserver == null) {
                                Handler mainHandler = new Handler(getContext().getMainLooper());
                                mainHandler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        Log.i(LOG_TAG, "Received photo without open grpc stream");
                                        videoStreamInteractor.stopRecording();
                                    }
                                });
                                return;
                            }
                            ValidateRecognitionRequest request = ValidateRecognitionRequest.newBuilder()
                                    .setImageContent(ByteString.copyFrom(image))
                                    .build();
                            requestObserver.onNext(request);
                        }

                        @Override
                        public void onFailure(Exception e) {
                            Log.e(LOG_TAG, e.getMessage());
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to initialize video stream interactor");
            e.printStackTrace();
        }

        spinnerAdapter = new ArrayAdapter<String>(getContext(), R.layout.support_simple_spinner_dropdown_item);
        binding.videoModelSpinner.setAdapter(spinnerAdapter);

        fetchModels();

        binding.captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userID = binding.videoUserIDField.getText().toString();
                String model = binding.videoModelSpinner.getSelectedItem().toString();
                if( userID.isEmpty() || model.isEmpty() ) {
                    Log.i(LOG_TAG, "Model name and userID must be entered");
                    return;
                }
                toggleVideoStream(userID, model);
            }
        });

        binding.openAudioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(VideoFragment.this).navigate(R.id.action_open_audio);
            }
        });
    }

    public void fetchModels() {
        videoService.getModels(new VideoService.GetModelsListener() {
            @Override
            public void onSuccess(GetModelsResponse response) {
                spinnerAdapter.clear();
                for (int i=0; i<response.getModelsCount(); i++) {
                    spinnerAdapter.add(response.getModels(i).getName());
                }
                spinnerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }
        });
    }

    public void toggleVideoStream(String userID, String modelName) {
        Log.i(LOG_TAG, "Toggling video stream");

        if (isRecording.get()) {
            Log.i(LOG_TAG, "Stopping video stream");
            isRecording.set(false);
            videoStreamInteractor.stopRecording();
            requestObserver.onCompleted();
            requestObserver = null;
            return;
        }

        Log.i(LOG_TAG, "Starting video stream");
        requestObserver = videoService.validateLiveness(
                modelName,
                userID,
                RecognitionThreshold.LOW,
                new StreamObserver<LivenessRecognitionResponse>() {
            @Override
            public void onNext(LivenessRecognitionResponse value) {
                Log.i(LOG_TAG, "Video stream response. Recognized: " + value.getIsAlive() + " Score: " + value.getScore());
                videoStreamInteractor.takeImageCapture();
            }

            @Override
            public void onError(Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                Log.i(LOG_TAG, "Video Stream completed");
            }
        });

        videoStreamInteractor.startRecording(getActivity());
        videoStreamInteractor.takeImageCapture();
        isRecording.set(true);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

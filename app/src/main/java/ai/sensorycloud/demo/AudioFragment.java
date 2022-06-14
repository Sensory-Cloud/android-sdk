package ai.sensorycloud.demo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.protobuf.ByteString;

import java.util.concurrent.atomic.AtomicBoolean;

import ai.sensorycloud.config.Config;
import ai.sensorycloud.interactors.AudioStreamInteractor;
import ai.sensorycloud.service.AudioService;
import ai.sensorycloud.service.OAuthService;
import ai.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import ai.sensorycloud.tokenManager.SecureCredentialStore;
import ai.sensorycloud.tokenManager.TokenManager;
import ai.sensorycloud.demo.databinding.AudioFragmentBinding;
import io.grpc.stub.StreamObserver;
import ai.sensorycloud.api.v1.audio.GetModelsResponse;
import ai.sensorycloud.api.v1.audio.ThresholdSensitivity;
import ai.sensorycloud.api.v1.audio.ValidateEventRequest;
import ai.sensorycloud.api.v1.audio.ValidateEventResponse;

public class AudioFragment extends Fragment {

    private final String clientAppPrefs = "SensoryClient";
    private final String deviceIDKey = "deviceID";

    private static final String LOG_TAG = "AudioView";

    private AudioFragmentBinding binding;
    private ArrayAdapter<String> spinnerAdapter;
    private AtomicBoolean isRecording = new AtomicBoolean(false);
    private StreamObserver<ValidateEventRequest> requestObserver;

    private Config sensoryConfig;
    private AudioService audioService;
    private AudioStreamInteractor audioStreamInteractor;

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
        TokenManager tokenManager = new TokenManager(oAuthService);
        audioService = new AudioService(sensoryConfig, tokenManager);

        binding = AudioFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try {
            audioStreamInteractor = AudioStreamInteractor.newAudioStreamInteractor(getContext());
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to initialize audio stream interactor");
            e.printStackTrace();
        }

        spinnerAdapter = new ArrayAdapter<String>(getContext(), R.layout.support_simple_spinner_dropdown_item);
        binding.audioModelSpinner.setAdapter(spinnerAdapter);

        fetchModels();

        binding.recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userID = binding.audioUserIDField.getText().toString();
                String model = binding.audioModelSpinner.getSelectedItem().toString();
                if( userID.isEmpty() || model.isEmpty() ) {
                    Log.i(LOG_TAG, "Model name and userID must be entered");
                    return;
                }
                toggleAudioStream(userID, model);
            }
        });

        binding.openVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(AudioFragment.this).navigate(R.id.action_open_video);
            }
        });
    }

    public void fetchModels() {
        audioService.getModels(new AudioService.GetModelsListener() {
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

    public void toggleAudioStream(String userID, String modelName) {
        if (isRecording.get()) {
            isRecording.set(false);
            return;
        }

        requestObserver = audioService.validateTrigger(
                modelName,
                userID,
                "",
                ThresholdSensitivity.LOW,
                new StreamObserver<ValidateEventResponse>() {
            @Override
            public void onNext(ValidateEventResponse value) {
                Log.i(LOG_TAG, "Audio Stream Response. Success: " + value.getSuccess() + " Audio Energy: " + value.getAudioEnergy());
                if( value.getSuccess() ) {
                    Log.i(LOG_TAG, "EVENT RECOGNIZED");
                }
            }

            @Override
            public void onError(Throwable t) {
                Log.e(LOG_TAG, t.getMessage());
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                Log.i(LOG_TAG, "Audio Stream completed");
            }
        });

        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                audioStreamInteractor.startRecording();
                isRecording.set(true);
                while(isRecording.get()) {
                    try {
                        byte[] buffer = audioStreamInteractor.audioQueue.take();
                        ByteString audio = ByteString.copyFrom(buffer);
                        ValidateEventRequest validateEventRequest = ValidateEventRequest.newBuilder()
                                .setAudioContent(audio)
                                .build();
                        requestObserver.onNext(validateEventRequest);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                audioStreamInteractor.stopRecording();
                requestObserver.onCompleted();
            }
        });
        mThread.start();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        audioStreamInteractor.close();
    }
}
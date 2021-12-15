package inc.sensory.sensoryclouddemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.NavHostFragment;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ByteString;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import inc.sensory.sensorycloud.config.Config;
import inc.sensory.sensorycloud.interactors.AudioStreamInteractor;
import inc.sensory.sensorycloud.service.AudioService;
import inc.sensory.sensorycloud.service.OAuthService;
import inc.sensory.sensorycloud.service.VideoService;
import inc.sensory.sensorycloud.tokenManager.DefaultSecureCredentialStore;
import inc.sensory.sensorycloud.tokenManager.SecureCredentialStore;
import inc.sensory.sensorycloud.tokenManager.TokenManager;
import inc.sensory.sensoryclouddemo.databinding.AudioFragmentBinding;
import inc.sensory.sensoryclouddemo.databinding.VideoFragmentBinding;
import io.grpc.stub.StreamObserver;
import io.sensory.api.v1.video.GetModelsResponse;
import io.sensory.api.v1.video.LivenessRecognitionResponse;
import io.sensory.api.v1.video.RecognitionThreshold;
import io.sensory.api.v1.video.ValidateRecognitionRequest;

public class VideoFragment extends Fragment {

    private final String clientAppPrefs = "SensoryClient";
    private final String deviceIDKey = "deviceID";

    private static final String LOG_TAG = "VideoView";

    private VideoFragmentBinding binding;
    private ArrayAdapter<String> spinnerAdapter;
    private AtomicBoolean isRecording = new AtomicBoolean(false);
    private StreamObserver<ValidateRecognitionRequest> requestObserver;
    private ImageUploader imageUploader = new ImageUploader(new ImageUploaderListener() {
        @Override
        public void onSuccess(byte[] image) {
            ValidateRecognitionRequest request = ValidateRecognitionRequest.newBuilder()
                    .setImageContent(ByteString.copyFrom(image))
                    .build();
            requestObserver.onNext(request);
        }
    });
    private ProcessCameraProvider cameraProvider;

    private Config sensoryConfig;
    private VideoService videoService;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // TODO: - better config management
        SharedPreferences prefs = getContext().getSharedPreferences(clientAppPrefs, Context.MODE_PRIVATE);
        String deviceID = prefs.getString(deviceIDKey, "");
        sensoryConfig = new Config(
                new Config.CloudConfig("10.0.2.2:50051"),
                new Config.TenantConfig("b6e1b848-75da-46cb-aad8-981cc3ccebcd"),
                new Config.DeviceConfig(deviceID, "en_US"));

        SecureCredentialStore credentialStore = new DefaultSecureCredentialStore(getContext());
        OAuthService oAuthService = new OAuthService(sensoryConfig, credentialStore);
        TokenManager tokenManager = new TokenManager(getContext(), oAuthService);
        videoService = new VideoService(sensoryConfig, tokenManager);

        binding = VideoFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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
            stopCamera();
            requestObserver.onCompleted();
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
                imageUploader.takePicture.set(true);
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

        startCamera();
        isRecording.set(true);
        imageUploader.takePicture.set(true);
    }

    private void startCamera() {
        Log.i(LOG_TAG, "Starting camera");
        ListenableFuture<ProcessCameraProvider> cameraProviderFuture = ProcessCameraProvider.getInstance(getContext());

        cameraProviderFuture.addListener(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i(LOG_TAG, "initializing camera");
                    ProcessCameraProvider provider = cameraProviderFuture.get();

                    Preview preview = new Preview.Builder().build();
                    preview.setSurfaceProvider(binding.viewFinder.getSurfaceProvider());

                    CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;

                    ImageAnalysis imageAnalyzer = new ImageAnalysis.Builder().build();
                    imageAnalyzer.setAnalyzer(Executors.newSingleThreadExecutor(), imageUploader);

                    provider.unbindAll();
                    provider.bindToLifecycle(getActivity(), cameraSelector, preview, imageAnalyzer);
                    cameraProvider = provider;
                } catch (Exception e) {
                    Log.e(LOG_TAG, e.getMessage());
                    e.printStackTrace();
                }
            }
        }, ContextCompat.getMainExecutor(getContext()));
    }

    private void stopCamera() {
        Log.i(LOG_TAG, "Stopping camera");
        cameraProvider.unbindAll();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

interface ImageUploaderListener {
    void onSuccess(byte[] image);
}

// TODO: take in a listener
class ImageUploader implements ImageAnalysis.Analyzer {

    public AtomicBoolean takePicture = new AtomicBoolean(false);
    private ImageUploaderListener listener;

    ImageUploader(ImageUploaderListener listener) {
        this.listener = listener;
    }

    @Override
    public void analyze(@NonNull ImageProxy image) {
        Log.i("VideoView", "received image to analyze");
        if (takePicture.get()) {
            Log.i("VideoView", "Sending processed picture");
            listener.onSuccess(toBytes(image));
        }
        image.close();
    }

    private byte[] toBytes(ImageProxy image) {
        ImageProxy.PlaneProxy[] planes = image.getPlanes();
        ByteBuffer yBuffer = planes[0].getBuffer();
        ByteBuffer uBuffer = planes[1].getBuffer();
        ByteBuffer vBuffer = planes[2].getBuffer();

        int ySize = yBuffer.remaining();
        int uSize = uBuffer.remaining();
        int vSize = vBuffer.remaining();

        byte[] nv21 = new byte[ySize + uSize + vSize];
        //U and V are swapped
        yBuffer.get(nv21, 0, ySize);
        vBuffer.get(nv21, ySize, vSize);
        uBuffer.get(nv21, ySize + vSize, uSize);

        YuvImage yuvImage = new YuvImage(nv21, ImageFormat.NV21, image.getWidth(), image.getHeight(), null);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 75, out);

        return out.toByteArray();
    }
}
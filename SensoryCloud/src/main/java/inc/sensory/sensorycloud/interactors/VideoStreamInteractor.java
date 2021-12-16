package inc.sensory.sensorycloud.interactors;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Size;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;

import com.google.common.util.concurrent.ListenableFuture;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class VideoStreamInteractor {

    public interface VideoStreamListener {
        void onSuccess(byte[] image);
        void onFailure(Exception e);
    }

    final static int PHOTO_WIDTH = 480;
    final static int PHOTO_HEIGHT = 720;
    final static int JPEG_QUALITY = 75;

    public VideoStreamListener listener;
    private Preview preview;
    private CameraSelector cameraSelector;
    private ImageAnalysis imageAnalysis;
    private ProcessCameraProvider cameraProvider;
    private AtomicBoolean takeCapture = new AtomicBoolean(false);

    public static VideoStreamInteractor newVideoStreamInteractor(
            Context context,
            Preview.SurfaceProvider surfaceProvider,
            CameraSelector cameraSelector,
            VideoStreamListener listener) throws Exception {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            throw new Exception("Camera permissions denied");
        }

        VideoStreamInteractor interactor = new VideoStreamInteractor(context, surfaceProvider, cameraSelector);
        interactor.listener = listener;
        return interactor;
    }

    private VideoStreamInteractor(Context context, Preview.SurfaceProvider surfaceProvider, CameraSelector cameraSelector) {
        Size targetResolution = new Size(PHOTO_WIDTH, PHOTO_HEIGHT);

        preview = new Preview.Builder()
                .setTargetResolution(targetResolution)
                .build();
        preview.setSurfaceProvider(surfaceProvider);

        imageAnalysis = new ImageAnalysis.Builder()
                .setTargetResolution(targetResolution)
                .build();
        imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor(), new ImageAnalysis.Analyzer() {
            @Override
            public void analyze(@NonNull ImageProxy image) {
                if (takeCapture.get()) {
                    takeCapture.set(false);
                    analyzeImage(image);
                }
                image.close();
            }
        });

        this.cameraSelector = cameraSelector == null ? CameraSelector.DEFAULT_FRONT_CAMERA : cameraSelector;

        ListenableFuture<ProcessCameraProvider> cameraProviderFuture = ProcessCameraProvider.getInstance(context);
        cameraProviderFuture.addListener(new Runnable() {
            @Override
            public void run() {
                try {
                    ProcessCameraProvider provider = cameraProviderFuture.get();
                    provider.unbindAll();
                    cameraProvider = provider;
                } catch (Exception e) {
                    listener.onFailure(e);
                }
            }
        }, ContextCompat.getMainExecutor(context));
    }

    public void startRecording(LifecycleOwner lifecycleOwner) {
        cameraProvider.unbindAll();
        cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, preview, imageAnalysis);
    }

    public void stopRecording() {
        cameraProvider.unbindAll();
    }

    public void takeImageCapture() {
        takeCapture.set(true);
    }

    private void analyzeImage(ImageProxy image) {
        try {
            // Convert image to a bitmap
            byte[] bytes = image2byteArray(image);
            YuvImage yuvImage = new YuvImage(bytes, ImageFormat.NV21, image.getWidth(), image.getHeight(), null);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), JPEG_QUALITY, out);
            byte[] byteArray = out.toByteArray();
            Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

            // Rotate and resize bitmap
            if (image.getImageInfo().getRotationDegrees() != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(image.getImageInfo().getRotationDegrees());
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, PHOTO_WIDTH, PHOTO_HEIGHT, true);

            // export as a JPEG
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            resizedBitmap.compress(Bitmap.CompressFormat.JPEG, JPEG_QUALITY, stream);
            byte[] finalBytes = stream.toByteArray();

            resizedBitmap.recycle();
            bitmap.recycle();
            listener.onSuccess(finalBytes);
        } catch (Exception e) {
            listener.onFailure(e);
        }
    }

    private byte[] image2byteArray(ImageProxy image) {
        if (image.getFormat() != ImageFormat.YUV_420_888) {
            throw new IllegalArgumentException("Invalid image format");
        }

        int width = image.getWidth();
        int height = image.getHeight();

        ImageProxy.PlaneProxy yPlane = image.getPlanes()[0];
        ImageProxy.PlaneProxy uPlane = image.getPlanes()[1];
        ImageProxy.PlaneProxy vPlane = image.getPlanes()[2];

        ByteBuffer yBuffer = yPlane.getBuffer();
        ByteBuffer uBuffer = uPlane.getBuffer();
        ByteBuffer vBuffer = vPlane.getBuffer();

        // Full size Y channel and quarter size U+V channels.
        int numPixels = (int) (width * height * 1.5f);
        byte[] nv21 = new byte[numPixels];
        int index = 0;

        // Copy Y channel.
        int yRowStride = yPlane.getRowStride();
        int yPixelStride = yPlane.getPixelStride();
        for(int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                nv21[index++] = yBuffer.get(y * yRowStride + x * yPixelStride);
            }
        }

        // Copy VU data; NV21 format is expected to have YYYYVU packaging.
        // The U/V planes are guaranteed to have the same row stride and pixel stride.
        int uvRowStride = uPlane.getRowStride();
        int uvPixelStride = uPlane.getPixelStride();
        int uvWidth = width / 2;
        int uvHeight = height / 2;

        for(int y = 0; y < uvHeight; ++y) {
            for (int x = 0; x < uvWidth; ++x) {
                int bufferIndex = (y * uvRowStride) + (x * uvPixelStride);
                // V channel.
                nv21[index++] = vBuffer.get(bufferIndex);
                // U channel.
                nv21[index++] = uBuffer.get(bufferIndex);
            }
        }
        return nv21;
    }
}

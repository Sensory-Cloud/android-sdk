package inc.sensory.sensorycloud.interactors;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;

import androidx.core.app.ActivityCompat;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A class for getting a stream of audio data from the device's microphone
 */
public class AudioStreamInteractor {

    final static int AUDIO_SAMPLE_RATE = 16000;
    final static int AUDIO_CHANNEL_CONFIG = AudioFormat.CHANNEL_IN_MONO;
    final static int AUDIO_FORMAT = AudioFormat.ENCODING_PCM_16BIT;
    final static int AUDIO_SOURCE = MediaRecorder.AudioSource.MIC;

    /**
     * Checks device permissions and returns a new AudioStreamInteractor if allowed
     *
     * @param context Application context, used to check device permissions
     * @return A new AudioStreamInteractor instance
     * @throws Exception if audio permissions are not allowed by the system
     */
    public static AudioStreamInteractor newAudioStreamInteractor(Context context) throws Exception {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            throw new Exception("Audio recording permissions denied");
        }

        int minBufferSize = AudioRecord.getMinBufferSize(AUDIO_SAMPLE_RATE, AUDIO_CHANNEL_CONFIG, AUDIO_FORMAT);
        AudioRecord recorder = new AudioRecord(AUDIO_SOURCE, AUDIO_SAMPLE_RATE, AUDIO_CHANNEL_CONFIG, AUDIO_FORMAT, minBufferSize * 10);
        return new AudioStreamInteractor(recorder);
    }

    private AudioRecord recorder;
    AtomicBoolean stopped;

    /**
     * Blocking queue where audio data is populated.
     * This data is properly formatted to be directly sent to an AudioService grpc stream
     */
    public BlockingQueue<byte[]> audioQueue;

    private AudioStreamInteractor(AudioRecord recorder) {
        this.recorder = recorder;
        this.audioQueue = new LinkedBlockingQueue<>();
        stopped = new AtomicBoolean(false);
    }

    /**
     * Starts a new audio recording and populates audio data onto the `audioQueue`
     * This is a no-op if an audio recording is already in progress
     */
    public void startRecording() {
        if (!stopped.get()) { return; }
        stopped.set(false);
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                recorder.startRecording();
                byte[] buffer = new byte[1024];
                while(!stopped.get()) {
                    recorder.read(buffer, 0, buffer.length);
                    try {
                        audioQueue.put(buffer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                recorder.stop();
            }
        });
        mThread.start();
    }

    /**
     * Stops the current audio recording
     * This is a no-op if no audio recording was in progress
     */
    public void stopRecording() {
        stopped.set(true);
    }

    /**
     * Cleans up and releases Microphone related resources.
     * This should be called once you are finished using this instance
     */
    public void close() {
        recorder.release();
        recorder = null;
    }
}

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

public class AudioStreamInteractor {

    final static int AUDIO_SAMPLE_RATE = 16000;
    final static int AUDIO_CHANNEL_CONFIG = AudioFormat.CHANNEL_IN_MONO;
    final static int AUDIO_FORMAT = AudioFormat.ENCODING_PCM_16BIT;
    final static int AUDIO_SOURCE = MediaRecorder.AudioSource.MIC;

    public static AudioStreamInteractor newAudioStreamInteractor(Context context) throws Exception {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            throw new Exception("Audio recording permissions denied");
        }

        int minBufferSize = AudioRecord.getMinBufferSize(AUDIO_SAMPLE_RATE, AUDIO_CHANNEL_CONFIG, AUDIO_FORMAT);
        AudioRecord recorder = new AudioRecord(AUDIO_SOURCE, AUDIO_SAMPLE_RATE, AUDIO_CHANNEL_CONFIG, AUDIO_FORMAT, minBufferSize * 10);
        return new AudioStreamInteractor(recorder);
    }

    private AudioRecord recorder;
    public BlockingQueue<byte[]> queue;
    AtomicBoolean stopped;

    private AudioStreamInteractor(AudioRecord recorder) {
        this.recorder = recorder;
        this.queue = new LinkedBlockingQueue<>();
        stopped = new AtomicBoolean(false);
    }

    public void startRecording() {
        stopped.set(false);
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                recorder.startRecording();
                byte[] buffer = new byte[1024];
                while(!stopped.get()) {
                    recorder.read(buffer, 0, buffer.length);
                    try {
                        queue.put(buffer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                recorder.stop();
            }
        });
        mThread.start();
    }

    public void stopRecording() {
        stopped.set(true);
    }

    public void close() {
        recorder.release();
        recorder = null;
    }
}

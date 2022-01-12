package io.sensory.sensorycloud.interactors;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioRecord;

import junit.framework.TestCase;

import org.junit.Before;

import static org.mockito.Mockito.*;

public class AudioStreamInteractorTest extends TestCase {

    public AudioStreamInteractor interactor;
    public AudioRecord mockRecorder;

    @Before
    public void setUp() throws Exception {
        mockRecorder = mock(AudioRecord.class);
        interactor = new AudioStreamInteractor(mockRecorder);
    }

    public void testNewAudioStreamInteractor() throws Exception {
        Context mockContext = mock(Context.class);

        when(mockContext.checkPermission(anyString(), anyInt(), anyInt())).thenReturn(PackageManager.PERMISSION_GRANTED);
        AudioStreamInteractor newInteractor = AudioStreamInteractor.newAudioStreamInteractor(mockContext);
        assertNotNull("Interactor should not be null", newInteractor);

        when(mockContext.checkPermission(anyString(), anyInt(), anyInt())).thenReturn(PackageManager.PERMISSION_DENIED);
        try {
            AudioStreamInteractor.newAudioStreamInteractor(mockContext);
            fail("Construction should fail when permissions are denied");
        } catch (Exception e) {
            // Expected error
        }
    }

    public void testRecording() throws Exception {
        interactor.startRecording();
        Thread.sleep(10); // We need a small pause for the audio recording to start

        verify(mockRecorder, times(1)).startRecording();
        verify(mockRecorder, atLeast(2)).read(any(byte[].class), anyInt(), anyInt());

        interactor.stopRecording();
        Thread.sleep(10); // We need a small pause for the audio recording to stop

        verify(mockRecorder, times(1)).stop();
    }

    public void testClose() {
        interactor.close();
        verify(mockRecorder, times(1)).release();
    }
}
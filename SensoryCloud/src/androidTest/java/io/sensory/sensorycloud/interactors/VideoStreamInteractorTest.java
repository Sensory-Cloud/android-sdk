package io.sensory.sensorycloud.interactors;

import android.content.Context;
import android.content.pm.PackageManager;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

public class VideoStreamInteractorTest extends TestCase {

    public void testNewVideoStreamInteractor() {
        Context mockContext = mock(Context.class);
        when(mockContext.checkPermission(anyString(), anyInt(), anyInt())).thenReturn(PackageManager.PERMISSION_DENIED);

        try {
            VideoStreamInteractor.newVideoStreamInteractor(
                    mockContext,
                    null,
                    null,
                    mock(VideoStreamInteractor.VideoStreamListener.class));
            fail("Construction should fail when permissions are denied");
        } catch (Exception e) {
            // Expected error
        }
    }
}
package org.linphone.mediastream.video.capture;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import org.linphone.mediastream.Log;

public class AndroidVideoApi8JniWrapper {
   public static int detectCamerasCount() {
      return AndroidVideoApi5JniWrapper.detectCamerasCount();
   }

   public static int detectCameras(int[] indexes, int[] frontFacing, int[] orientation) {
      return AndroidVideoApi5JniWrapper.detectCameras(indexes, frontFacing, orientation);
   }

   public static int[] selectNearestResolutionAvailable(int cameraId, int requestedW, int requestedH) {
      return AndroidVideoApi5JniWrapper.selectNearestResolutionAvailable(cameraId, requestedW, requestedH);
   }

   public static Object startRecording(int cameraId, int width, int height, int fps, int rotation, final long nativePtr) {
      Log.d("startRecording(" + cameraId + ", " + width + ", " + height + ", " + fps + ", " + rotation + ", " + nativePtr + ")");
      Camera camera = Camera.open();
      AndroidVideoApi5JniWrapper.applyCameraParameters(camera, width, height, fps);
      int bufferSize = width * height * ImageFormat.getBitsPerPixel(camera.getParameters().getPreviewFormat()) / 8;
      camera.addCallbackBuffer(new byte[bufferSize]);
      camera.addCallbackBuffer(new byte[bufferSize]);
      camera.setPreviewCallbackWithBuffer(new PreviewCallback() {
         public void onPreviewFrame(byte[] data, Camera camera) {
            if (AndroidVideoApi5JniWrapper.isRecording) {
               AndroidVideoApi5JniWrapper.putImage(nativePtr, data);
               camera.addCallbackBuffer(data);
            }

         }
      });
      camera.startPreview();
      AndroidVideoApi5JniWrapper.isRecording = true;
      Log.d("Returning camera object: " + camera);
      return camera;
   }

   public static void stopRecording(Object cam) {
      AndroidVideoApi5JniWrapper.isRecording = false;
      Log.d("stopRecording(" + cam + ")");
      Camera camera = (Camera)cam;
      if (camera != null) {
         camera.setPreviewCallbackWithBuffer((PreviewCallback)null);
         camera.stopPreview();
         camera.release();
      } else {
         Log.i("Cannot stop recording ('camera' is null)");
      }

   }

   public static void setPreviewDisplaySurface(Object cam, Object surf) {
      AndroidVideoApi5JniWrapper.setPreviewDisplaySurface(cam, surf);
   }
}

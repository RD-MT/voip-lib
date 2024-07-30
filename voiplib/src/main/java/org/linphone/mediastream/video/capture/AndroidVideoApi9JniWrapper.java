package org.linphone.mediastream.video.capture;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import java.util.Iterator;
import java.util.List;
import org.linphone.mediastream.Log;

@TargetApi(9)
public class AndroidVideoApi9JniWrapper {
   private static boolean compensateCameraTextureViewRotation = false;

   public static int detectCamerasCount() {
      return AndroidVideoApi5JniWrapper.detectCamerasCount();
   }

   public static int detectCameras(int[] indexes, int[] frontFacing, int[] orientation) {
      return AndroidVideoApi5JniWrapper.detectCameras(indexes, frontFacing, orientation);
   }

   public static int[] selectNearestResolutionAvailable(int cameraId, int requestedW, int requestedH) {
      Log.d("selectNearestResolutionAvailable: " + cameraId + ", " + requestedW + "x" + requestedH);
      return AndroidVideoApi5JniWrapper.selectNearestResolutionAvailableForCamera(cameraId, requestedW, requestedH);
   }

   public static Object startRecording(int cameraId, int width, int height, int fps, int rotation, final long nativePtr) {
      Log.i("startRecording(" + cameraId + ", " + width + ", " + height + ", " + fps + ", " + rotation + ", " + nativePtr + ")");

      try {
         Camera camera = Camera.open(cameraId);
         Parameters params = camera.getParameters();
         Iterator var9 = params.getSupportedFocusModes().iterator();

         while(var9.hasNext()) {
            String focusMode = (String)var9.next();
            if (focusMode.equalsIgnoreCase("continuous-video")) {
               Log.i("FOCUS_MODE_CONTINUOUS_VIDEO is supported, let's use it");
               params.setFocusMode("continuous-video");
               break;
            }
         }

         if (params.isVideoStabilizationSupported()) {
            Log.i("Video stabilization is supported, let's use it");
            params.setVideoStabilization(true);
         }

         params.setPreviewSize(width, height);
         int[] chosenFps = findClosestEnclosingFpsRange(fps * 1000, params.getSupportedPreviewFpsRange());
         if (chosenFps[0] != chosenFps[1]) {
            params.setPreviewFpsRange(chosenFps[0], chosenFps[1]);
         }

         camera.setParameters(params);
         int bufferSize = width * height * ImageFormat.getBitsPerPixel(params.getPreviewFormat()) / 8;
         camera.addCallbackBuffer(new byte[bufferSize]);
         camera.addCallbackBuffer(new byte[bufferSize]);
         camera.setPreviewCallbackWithBuffer(new PreviewCallback() {
            public void onPreviewFrame(byte[] data, Camera camera) {
               if (data == null) {
                  Parameters params = camera.getParameters();
                  Size size = params.getPreviewSize();
                  int bufferSize = size.width * size.height * ImageFormat.getBitsPerPixel(params.getPreviewFormat()) / 8;
                  bufferSize += bufferSize / 20;
                  camera.addCallbackBuffer(new byte[bufferSize]);
               } else if (AndroidVideoApi5JniWrapper.isRecording) {
                  AndroidVideoApi5JniWrapper.putImage(nativePtr, data);
                  camera.addCallbackBuffer(data);
               }

            }
         });
         setCameraDisplayOrientation(rotation, cameraId, camera);
         AndroidVideoApi5JniWrapper.isRecording = true;
         Log.d("Returning camera object: " + camera);
         return camera;
      } catch (Exception var11) {
         var11.printStackTrace();
         return null;
      }
   }

   public static void stopRecording(Object cam) {
      AndroidVideoApi5JniWrapper.isRecording = false;
      AndroidVideoApi8JniWrapper.stopRecording(cam);
   }

   public static void setPreviewDisplaySurface(Object cam, Object surf) {
      AndroidVideoApi5JniWrapper.setPreviewDisplaySurface(cam, surf);
      compensateCameraTextureViewRotation = false;
      if (surf instanceof CaptureTextureView) {
         compensateCameraTextureViewRotation = true;
      }

      ((Camera)cam).startPreview();
      Log.i("Camera [" + (Camera)cam + "] preview started");
   }

   private static void setCameraDisplayOrientation(int rotationDegrees, int cameraId, Camera camera) {
      CameraInfo info = new CameraInfo();
      Camera.getCameraInfo(cameraId, info);
      int result;
      if (info.facing == 1) {
         result = (info.orientation + rotationDegrees) % 360;
         result = (360 - result) % 360;
      } else {
         result = (info.orientation - rotationDegrees + 360) % 360;
      }

      if (compensateCameraTextureViewRotation) {
         result = (result + rotationDegrees) % 360;
      }

      Log.w("Camera preview orientation: " + result);

      try {
         camera.setDisplayOrientation(result);
      } catch (Exception var6) {
         Log.i("Failed to execute: camera[" + camera + "].setDisplayOrientation(" + result + ")");
         var6.printStackTrace();
      }

   }

   private static int[] findClosestEnclosingFpsRange(int expectedFps, List<int[]> fpsRanges) {
      Log.d("Searching for closest fps range from " + expectedFps);
      if (fpsRanges != null && fpsRanges.size() != 0) {
         int[] closestRange = (int[])fpsRanges.get(0);
         int measure = Math.abs(closestRange[0] - expectedFps) + Math.abs(closestRange[1] - expectedFps);
         Iterator var4 = fpsRanges.iterator();

         while(var4.hasNext()) {
            int[] curRange = (int[])var4.next();
            if (curRange[0] <= expectedFps && curRange[1] >= expectedFps) {
               int curMeasure = Math.abs(curRange[0] - expectedFps) + Math.abs(curRange[1] - expectedFps);
               if (curMeasure < measure && curRange[0] != curRange[1]) {
                  closestRange = curRange;
                  measure = curMeasure;
                  Log.d("A better range has been found: w=" + curRange[0] + ",h=" + curRange[1]);
               }
            }
         }

         Log.d("The closest fps range is w=" + closestRange[0] + ",h=" + closestRange[1]);
         return closestRange;
      } else {
         return new int[]{0, 0};
      }
   }
}

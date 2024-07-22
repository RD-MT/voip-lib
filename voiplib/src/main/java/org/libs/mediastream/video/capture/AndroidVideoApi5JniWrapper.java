package org.libs.mediastream.video.capture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.SurfaceHolder.Callback;
import java.util.Iterator;
import java.util.List;
import org.libs.mediastream.Log;
import org.libs.mediastream.Version;
import org.libs.mediastream.video.AndroidVideoWindowImpl;
import org.libs.mediastream.video.capture.hwconf.AndroidCameraConfiguration;

public class AndroidVideoApi5JniWrapper {
   public static boolean isRecording = false;

   public static native void putImage(long var0, byte[] var2);

   public static int detectCamerasCount() {
      AndroidCameraConfiguration.AndroidCamera[] cameras = AndroidCameraConfiguration.retrieveCameras();
      return cameras.length;
   }

   public static int detectCameras(int[] indexes, int[] frontFacing, int[] orientation) {
      Log.d("detectCameras\n");
      AndroidCameraConfiguration.AndroidCamera[] cameras = AndroidCameraConfiguration.retrieveCameras();
      int nextIndex = 0;
      AndroidCameraConfiguration.AndroidCamera[] var5 = cameras;
      int var6 = cameras.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         AndroidCameraConfiguration.AndroidCamera androidCamera = var5[var7];
         if (nextIndex >= indexes.length || nextIndex >= frontFacing.length || nextIndex >= orientation.length) {
            Log.w("Returning only the " + nextIndex + " first cameras (increase buffer size to retrieve all)");
            break;
         }

         indexes[nextIndex] = androidCamera.id;
         frontFacing[nextIndex] = androidCamera.frontFacing ? 1 : 0;
         orientation[nextIndex] = androidCamera.orientation;
         ++nextIndex;
      }

      return nextIndex;
   }

   public static int[] selectNearestResolutionAvailable(int cameraId, int requestedW, int requestedH) {
      Log.d("mediastreamer", "selectNearestResolutionAvailable: " + cameraId + ", " + requestedW + "x" + requestedH);
      return selectNearestResolutionAvailableForCamera(cameraId, requestedW, requestedH);
   }

   public static void activateAutoFocus(Object cam) {
      Log.d("mediastreamer", "Turning on autofocus on camera " + cam);
      Camera camera = (Camera)cam;
      if (camera != null && (camera.getParameters().getFocusMode() == "auto" || camera.getParameters().getFocusMode() == "macro")) {
         camera.autoFocus((AutoFocusCallback)null);
      }

   }

   public static Object startRecording(int cameraId, int width, int height, int fps, int rotation, final long nativePtr) {
      Log.d("mediastreamer", "startRecording(" + cameraId + ", " + width + ", " + height + ", " + fps + ", " + rotation + ", " + nativePtr + ")");
      Camera camera = Camera.open();
      applyCameraParameters(camera, width, height, fps);
      camera.setPreviewCallback(new PreviewCallback() {
         public void onPreviewFrame(byte[] data, Camera camera) {
            if (AndroidVideoApi5JniWrapper.isRecording) {
               AndroidVideoApi5JniWrapper.putImage(nativePtr, data);
            }

         }
      });
      camera.startPreview();
      isRecording = true;
      Log.d("mediastreamer", "Returning camera object: " + camera);
      return camera;
   }

   public static void stopRecording(Object cam) {
      isRecording = false;
      Log.d("mediastreamer", "stopRecording(" + cam + ")");
      Camera camera = (Camera)cam;
      if (camera != null) {
         camera.setPreviewCallback((PreviewCallback)null);
         camera.stopPreview();
         camera.release();
      } else {
         Log.i("mediastreamer", "Cannot stop recording ('camera' is null)");
      }

   }

   public static void setPreviewDisplaySurface(Object cam, Object surf) {
      Log.d("mediastreamer", "setPreviewDisplaySurface(" + cam + ", " + surf + ")");
      Camera camera = (Camera)cam;

      try {
         if (surf instanceof SurfaceView) {
            SurfaceView surface = (SurfaceView)surf;
            camera.setPreviewDisplay(surface.getHolder());
         } else if (surf instanceof TextureView && ((TextureView)surf).isAvailable()) {
            camera.setPreviewTexture(((TextureView)surf).getSurfaceTexture());
         } else if (surf instanceof SurfaceTexture) {
            camera.setPreviewTexture((SurfaceTexture)surf);
         } else if (surf instanceof Surface) {
            camera.setPreviewDisplay(new AndroidVideoApi5JniWrapper.SimpleSurfaceHolder((Surface)surf));
         } else {
            AndroidVideoWindowImpl avw = (AndroidVideoWindowImpl)surf;
            camera.setPreviewDisplay(avw.getPreviewSurfaceView().getHolder());
         }
      } catch (Exception var4) {
         Log.e(var4);
         var4.printStackTrace();
      }

   }

   protected static int[] selectNearestResolutionAvailableForCamera(int id, int requestedW, int requestedH) {
      if (requestedH > requestedW) {
         int t = requestedH;
         requestedH = requestedW;
         requestedW = t;
      }

      AndroidCameraConfiguration.AndroidCamera[] cameras = AndroidCameraConfiguration.retrieveCameras();
      List<AndroidCameraConfiguration.AndroidCamera.Size> supportedSizes = null;
      AndroidCameraConfiguration.AndroidCamera[] r = cameras;
      int rW = cameras.length;

      int rH;
      for(rH = 0; rH < rW; ++rH) {
         AndroidCameraConfiguration.AndroidCamera c = r[rH];
         if (c.id == id) {
            supportedSizes = c.resolutions;
         }
      }

      if (supportedSizes == null) {
         Log.e("mediastreamer", "Failed to retrieve supported resolutions.");
         return null;
      } else {
         Log.i("mediastreamer", supportedSizes.size() + " supported resolutions :");
         Iterator var18 = supportedSizes.iterator();

         while(var18.hasNext()) {
            AndroidCameraConfiguration.AndroidCamera.Size s = (AndroidCameraConfiguration.AndroidCamera.Size)var18.next();
            Log.i("mediastreamer", "\t" + s.width + "x" + s.height);
         }

         r = null;
         rW = Math.max(requestedW, requestedH);
         rH = Math.min(requestedW, requestedH);

         try {
            AndroidCameraConfiguration.AndroidCamera.Size result = null;
            int req = rW * rH;
            int minDist = Integer.MAX_VALUE;
            int useDownscale = 0;
            Iterator var12 = supportedSizes.iterator();

            AndroidCameraConfiguration.AndroidCamera.Size s;
            int dist;
            while(var12.hasNext()) {
               s = (AndroidCameraConfiguration.AndroidCamera.Size)var12.next();
               dist = -1 * (req - s.width * s.height);
               if ((s.width >= rW && s.height >= rH || s.width >= rH && s.height >= rW) && dist < minDist) {
                  minDist = dist;
                  result = s;
                  useDownscale = 0;
               }

               int downScaleDist = -1 * (req - s.width * s.height / 4);
               if ((s.width / 2 >= rW && s.height / 2 >= rH || s.width / 2 >= rH && s.height / 2 >= rW) && downScaleDist < minDist) {
                  if (Version.hasFastCpuWithAsmOptim()) {
                     minDist = downScaleDist;
                     result = s;
                     useDownscale = 1;
                  } else {
                     result = s;
                     useDownscale = 0;
                  }
               }

               if (s.width == rW && s.height == rH) {
                  result = s;
                  useDownscale = 0;
                  break;
               }
            }

            if (result == null) {
               minDist = Integer.MAX_VALUE;
               var12 = supportedSizes.iterator();

               while(var12.hasNext()) {
                  s = (AndroidCameraConfiguration.AndroidCamera.Size)var12.next();
                  dist = -1 * (req - s.width * s.height);
                  if (s.width * s.height > req && dist < minDist) {
                     minDist = dist;
                     result = s;
                  }
               }
            }

            if (result == null) {
               result = (AndroidCameraConfiguration.AndroidCamera.Size)supportedSizes.get(0);
            }

            int[] rs = new int[]{result.width, result.height, useDownscale};
            Log.i("mediastreamer", "resolution selection done (" + rs[0] + ", " + rs[1] + ", " + rs[2] + ")");
            return rs;
         } catch (Exception var16) {
            Log.e(var16, "mediastreamer", " resolution selection failed");
            return null;
         }
      }
   }

   protected static void applyCameraParameters(Camera camera, int width, int height, int requestedFps) {
      Parameters params = camera.getParameters();
      params.setPreviewSize(width, height);
      List<Integer> supported = params.getSupportedPreviewFrameRates();
      if (supported != null) {
         int nearest = Integer.MAX_VALUE;
         Iterator var7 = supported.iterator();

         while(var7.hasNext()) {
            Integer fr = (Integer)var7.next();
            int diff = Math.abs(fr - requestedFps);
            if (diff < nearest) {
               nearest = diff;
               params.setPreviewFrameRate(fr);
            }
         }

         Log.d("mediastreamer", "Preview framerate set:" + params.getPreviewFrameRate());
      }

      camera.setParameters(params);
   }

   private static class SimpleSurfaceHolder implements SurfaceHolder {
      private Surface mSurface;

      public SimpleSurfaceHolder(Surface surface) {
         this.mSurface = surface;
      }

      public void addCallback(Callback callback) {
      }

      public Rect getSurfaceFrame() {
         return null;
      }

      public boolean isCreating() {
         return false;
      }

      public Canvas lockCanvas() {
         return null;
      }

      public Canvas lockCanvas(Rect dirty) {
         return null;
      }

      public void removeCallback(Callback callback) {
      }

      public void setFixedSize(int width, int height) {
      }

      public void setFormat(int format) {
      }

      public void setKeepScreenOn(boolean screenOn) {
      }

      public void setSizeFromLayout() {
      }

      public void setType(int type) {
      }

      public void unlockCanvasAndPost(Canvas canvas) {
      }

      public Surface getSurface() {
         return this.mSurface;
      }
   }
}

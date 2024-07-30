package org.linphone.mediastream.video.capture.hwconf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;

public class AndroidCameraConfiguration {
   private static AndroidCameraConfiguration.AndroidCamera[] camerasCache;

   public static AndroidCameraConfiguration.AndroidCamera[] retrieveCameras() {
      initCamerasCache();
      return camerasCache;
   }

   public static boolean hasSeveralCameras() {
      initCamerasCache();
      return camerasCache.length > 1;
   }

   public static boolean hasFrontCamera() {
      initCamerasCache();
      AndroidCameraConfiguration.AndroidCamera[] var0 = camerasCache;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         AndroidCameraConfiguration.AndroidCamera cam = var0[var2];
         if (cam.frontFacing) {
            return true;
         }
      }

      return false;
   }

   private static void initCamerasCache() {
      if (camerasCache == null || camerasCache.length == 0) {
         try {
            if (Version.sdk() < 9) {
               camerasCache = probeCamerasSDK5();
            } else {
               camerasCache = probeCamerasSDK9();
            }
         } catch (Exception var1) {
            Log.i("Error: cannot retrieve cameras information (busy ?)", var1);
            var1.printStackTrace();
            camerasCache = new AndroidCameraConfiguration.AndroidCamera[0];
         }

      }
   }

   static AndroidCameraConfiguration.AndroidCamera[] probeCamerasSDK5() {
      return AndroidCameraConfigurationReader5.probeCameras();
   }

   static AndroidCameraConfiguration.AndroidCamera[] probeCamerasSDK9() {
      return AndroidCameraConfigurationReader9.probeCameras();
   }

   static AndroidCameraConfiguration.AndroidCamera[] probeCamerasSDK21() {
      return AndroidCameraConfigurationReader21.probeCameras();
   }

   public static class AndroidCamera {
      public int id;
      public boolean frontFacing;
      public int orientation;
      public List<AndroidCameraConfiguration.AndroidCamera.Size> resolutions;

      public AndroidCamera(int i, boolean f, List<AndroidCameraConfiguration.AndroidCamera.Size> r, int o) {
         this.id = i;
         this.frontFacing = f;
         this.orientation = o;
         this.resolutions = r;
      }

      public AndroidCamera(int i, boolean f, int o, List<android.hardware.Camera.Size> origin) {
         this.resolutions = new ArrayList(origin.size());
         Iterator var5 = origin.iterator();

         while(var5.hasNext()) {
            android.hardware.Camera.Size s = (android.hardware.Camera.Size)var5.next();
            this.resolutions.add(new AndroidCameraConfiguration.AndroidCamera.Size(s.width, s.height));
         }

         this.id = i;
         this.frontFacing = f;
         this.orientation = o;
      }

      public static class Size {
         public final int width;
         public final int height;

         public Size(int w, int h) {
            this.width = w;
            this.height = h;
         }
      }
   }
}

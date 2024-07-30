package org.linphone.mediastream.video.capture.hwconf;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.MediastreamerAndroidContext;

public class AndroidCameraConfigurationReader21 {
   @TargetApi(21)
   public static AndroidCameraConfiguration.AndroidCamera[] probeCameras() {
      Context context = MediastreamerAndroidContext.getContext();
      if (context != null) {
         CameraManager manager = (CameraManager)context.getSystemService(Context.CAMERA_SERVICE);
         int numOfAvailableCameras = 0;

         try {
            String[] cameraList = manager.getCameraIdList();
            List<AndroidCameraConfiguration.AndroidCamera> cam = new ArrayList(cameraList.length);
            int maxCamera = cameraList.length > 2 ? 2 : cameraList.length;

            for(int i = 0; i < maxCamera; ++i) {
               String cameraId = cameraList[i];
               CameraCharacteristics characteristics = manager.getCameraCharacteristics(cameraId);
               int camFacing = (Integer)characteristics.get(CameraCharacteristics.LENS_FACING);
               boolean frontFacing = false;
               if (camFacing == 0) {
                  frontFacing = true;
               }

               int camOrientation = (Integer)characteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
               StreamConfigurationMap configs = (StreamConfigurationMap)characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
               Size[] supportedSizes = configs.getOutputSizes(SurfaceTexture.class);
               List<AndroidCameraConfiguration.AndroidCamera.Size> supportedPreviewSizes = new ArrayList(supportedSizes.length);

               for(int j = 0; j < supportedSizes.length; ++j) {
                  Size size = supportedSizes[j];
                  supportedPreviewSizes.add(new AndroidCameraConfiguration.AndroidCamera.Size(size.getWidth(), size.getHeight()));
               }

               cam.add(new AndroidCameraConfiguration.AndroidCamera(i, frontFacing, supportedPreviewSizes, camOrientation));
               ++numOfAvailableCameras;
            }

            AndroidCameraConfiguration.AndroidCamera[] result = new AndroidCameraConfiguration.AndroidCamera[numOfAvailableCameras];
            result = (AndroidCameraConfiguration.AndroidCamera[])cam.toArray(result);
            return result;
         } catch (CameraAccessException var17) {
            Log.i(var17);
         }
      }

      return new AndroidCameraConfiguration.AndroidCamera[0];
   }
}

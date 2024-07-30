package org.linphone.mediastream.video.capture.hwconf;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import java.util.ArrayList;
import java.util.List;

class AndroidCameraConfigurationReader9 {
   public static AndroidCameraConfiguration.AndroidCamera[] probeCameras() {
      List<AndroidCameraConfiguration.AndroidCamera> cam = new ArrayList(Camera.getNumberOfCameras());

      for(int i = 0; i < Camera.getNumberOfCameras(); ++i) {
         CameraInfo info = new CameraInfo();
         Camera.getCameraInfo(i, info);
         Camera c = Camera.open(i);
         cam.add(new AndroidCameraConfiguration.AndroidCamera(i, info.facing == 1, info.orientation, c.getParameters().getSupportedPreviewSizes()));
         c.release();
      }

      AndroidCameraConfiguration.AndroidCamera[] result = new AndroidCameraConfiguration.AndroidCamera[cam.size()];
      result = (AndroidCameraConfiguration.AndroidCamera[])cam.toArray(result);
      return result;
   }
}

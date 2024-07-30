package org.linphone.core.tools.compatibility;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.pm.ServiceInfo;
import android.os.Build;

import org.linphone.core.tools.Log;

public class DeviceUtils34 {
   @SuppressLint("WrongConstant")
   public static void startCallForegroundService(Service service, int notifId, Notification notif) {
      try {
         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            service.startForeground(notifId, notif, 196);
         }
      } catch (Exception var4) {
         Log.i("[Device Utils 34] Can't start service as foreground!", var4);
      }

   }

   public static void startDataSyncForegroundService(Service service, int notifId, Notification notif) {
      try {
         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            service.startForeground(notifId, notif, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
         }
      } catch (Exception var4) {
         Log.i("[Device Utils 34] Can't start service as foreground!", var4);
      }

   }
}

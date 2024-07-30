package org.linphone.core.tools.compatibility;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.os.PowerManager;
import android.os.Vibrator;
import java.util.Map;
import org.linphone.core.tools.Log;

public class DeviceUtils23 {
   public static boolean isAppBatteryOptimizationEnabled(Context context) {
      PowerManager powerManager = (PowerManager)context.getSystemService("power");
      boolean ignoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
      Log.i("[Platform Helper] Is app in device battery optimization whitelist: " + ignoringBatteryOptimizations);
      return !ignoringBatteryOptimizations;
   }

   public static void vibrate(Vibrator vibrator) {
      long[] pattern = new long[]{0L, 1000L, 1000L};
      vibrator.vibrate(pattern, 1);
   }

   public static void playRingtone(Ringtone ringtone, AudioAttributes audioAttrs) {
      ringtone.setAudioAttributes(audioAttrs);
      ringtone.play();
      Log.i("[Audio Helper] Ringtone ringing started");
   }

   public static String getStringOrDefaultFromMap(Map<String, String> map, String key, String defaultValue) {
      if (map.containsKey(key)) {
         String result = (String)map.get(key);
         if (result != null) {
            return result;
         }
      }

      return defaultValue;
   }

   public static void startForegroundService(Service service, int notifId, Notification notif) {
      service.startForeground(notifId, notif);
   }

   public static void startForegroundService(Context context, Intent intent) {
      context.startService(intent);
   }
}

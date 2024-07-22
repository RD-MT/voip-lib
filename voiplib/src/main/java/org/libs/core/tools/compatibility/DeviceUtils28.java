package org.libs.core.tools.compatibility;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import org.libs.core.tools.Log;

public class DeviceUtils28 {
   public static boolean isAppUserRestricted(Context context) {
      ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
      return activityManager.isBackgroundRestricted();
   }

   public static int getAppStandbyBucket(Context context) {
      UsageStatsManager usageStatsManager = (UsageStatsManager)context.getSystemService("usagestats");
      return usageStatsManager.getAppStandbyBucket();
   }

   public static String getAppStandbyBucketNameFromValue(int bucket) {
      switch(bucket) {
      case 10:
         return "STANDBY_BUCKET_ACTIVE";
      case 20:
         return "STANDBY_BUCKET_WORKING_SET";
      case 30:
         return "STANDBY_BUCKET_FREQUENT";
      case 40:
         return "STANDBY_BUCKET_RARE";
      default:
         return null;
      }
   }

   public static void playRingtone(Ringtone ringtone, AudioAttributes audioAttrs) {
      ringtone.setAudioAttributes(audioAttrs);
      ringtone.setLooping(true);
      ringtone.play();
      Log.i("[Audio Helper] Ringtone ringing started (looping)");
   }
}

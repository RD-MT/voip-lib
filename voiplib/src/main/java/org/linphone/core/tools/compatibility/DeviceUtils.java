package org.linphone.core.tools.compatibility;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.app.NotificationManager.Policy;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.os.Build;
import android.os.Vibrator;
import android.provider.ContactsContract.Data;

import androidx.annotation.RequiresApi;

import java.util.Map;
import org.linphone.core.Address;
import org.linphone.core.tools.Log;
import org.linphone.mediastream.Version;

public class DeviceUtils {
   public static boolean isAppUserRestricted(Context context) {
      return Version.sdkAboveOrEqual(28) ? DeviceUtils28.isAppUserRestricted(context) : false;
   }

   public static int getAppStandbyBucket(Context context) {
      return Version.sdkAboveOrEqual(28) ? DeviceUtils28.getAppStandbyBucket(context) : 0;
   }

   public static String getAppStandbyBucketNameFromValue(int bucket) {
      return Version.sdkAboveOrEqual(28) ? DeviceUtils28.getAppStandbyBucketNameFromValue(bucket) : null;
   }

   public static boolean isAppBatteryOptimizationEnabled(Context context) {
      return Version.sdkAboveOrEqual(23) ? DeviceUtils23.isAppBatteryOptimizationEnabled(context) : false;
   }

   public static boolean isSurfaceTextureReleased(SurfaceTexture surfaceTexture) {
      return Version.sdkAboveOrEqual(26) ? DeviceUtils26.isSurfaceTextureReleased(surfaceTexture) : false;
   }

   @RequiresApi(api = Build.VERSION_CODES.R)
   public static void logPreviousCrashesIfAny(Context context) {
      if (Version.sdkAboveOrEqual(31)) {
         DeviceUtils31.logPreviousCrashesIfAny(context);
      } else if (Version.sdkAboveOrEqual(30)) {
         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            DeviceUtils30.logPreviousCrashesIfAny(context);
         }
      }

   }

   public static void vibrate(Vibrator vibrator) {
      if (Version.sdkAboveOrEqual(26)) {
         DeviceUtils26.vibrate(vibrator);
      } else {
         DeviceUtils23.vibrate(vibrator);
      }

   }

   public static int getPerformanceClass() {
      return Version.sdkAboveOrEqual(31) ? DeviceUtils31.getPerformanceClass() : -1;
   }

   public static boolean isBluetoothConnectPermissionGranted(Context context) {
      return Version.sdkAboveOrEqual(31) ? DeviceUtils31.isBluetoothConnectPermissionGranted(context) : true;
   }

   public static void playRingtone(Ringtone ringtone, AudioAttributes audioAttrs) {
      if (Version.sdkAboveOrEqual(28)) {
         DeviceUtils28.playRingtone(ringtone, audioAttrs);
      } else {
         DeviceUtils23.playRingtone(ringtone, audioAttrs);
      }

   }

   public static boolean checkIfDoNotDisturbAllowsExceptionForFavoriteContacts(Context context) {
      try {
         NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
         Policy policy = notificationManager.getNotificationPolicy();
         return policy.priorityCallSenders == 2;
      } catch (SecurityException var3) {
         Log.i("[Device Utils] Can't check notification policy: " + var3);
         return false;
      }
   }

   public static boolean checkIfIsFavoriteContact(Context context, Address caller) {
      if (caller == null) {
         return false;
      } else if (context.checkSelfPermission("android.permission.READ_CONTACTS") != PackageManager.PERMISSION_GRANTED) {
         Log.i("[Device Utils] Can't check for favorite contact, permission hasn't been granted yet");
         return false;
      } else {
         String number = caller.getUsername();
         String address = caller.asStringUriOnly();

         try {
            Cursor cursor = context.getContentResolver().query(Data.CONTENT_URI, new String[]{"starred"}, "data4 LIKE ? OR data1 LIKE ?", new String[]{number, address}, (String)null);

            while(cursor != null && cursor.moveToNext()) {
               int favorite = cursor.getInt(cursor.getColumnIndexOrThrow("starred"));
               if (favorite == 1) {
                  Log.i("[Device Utils] Found phone number or SIP address in favorite contact");
                  cursor.close();
                  return true;
               }
            }

            if (cursor != null) {
               cursor.close();
            }
         } catch (IllegalArgumentException var6) {
            Log.i("[Device Utils] Failed to check if username / SIP address is part of a favorite contact: ", var6);
         }

         return false;
      }
   }

   public static String getStringOrDefaultFromMap(Map<String, String> map, String key, String defaultValue) {
      return Version.sdkAboveOrEqual(24) ? DeviceUtils24.getStringOrDefaultFromMap(map, key, defaultValue) : DeviceUtils23.getStringOrDefaultFromMap(map, key, defaultValue);
   }

   public static void startForegroundService(Context context, Intent intent) {
      if (Version.sdkAboveOrEqual(26)) {
         DeviceUtils26.startForegroundService(context, intent);
      } else {
         DeviceUtils23.startForegroundService(context, intent);
      }

   }

   public static void startCallForegroundService(Service service, int notifId, Notification notif) {
      if (Version.sdkAboveOrEqual(34)) {
         DeviceUtils34.startCallForegroundService(service, notifId, notif);
      } else if (Version.sdkAboveOrEqual(31)) {
         DeviceUtils31.startForegroundService(service, notifId, notif);
      } else {
         DeviceUtils23.startForegroundService(service, notifId, notif);
      }

   }

   public static void startDataSyncForegroundService(Service service, int notifId, Notification notif) {
      if (Version.sdkAboveOrEqual(34)) {
         DeviceUtils34.startDataSyncForegroundService(service, notifId, notif);
      } else if (Version.sdkAboveOrEqual(31)) {
         DeviceUtils31.startForegroundService(service, notifId, notif);
      } else {
         DeviceUtils23.startForegroundService(service, notifId, notif);
      }

   }
}

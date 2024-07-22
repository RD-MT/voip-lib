package org.libs.core.tools.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.NotificationCompat.Builder;
import java.util.Timer;
import java.util.TimerTask;
import org.libs.core.Factory;
import org.libs.core.tools.Log;
import org.libs.core.tools.compatibility.DeviceUtils;
import org.libs.mediastream.Version;

public class PushService extends Service {
   protected static final int SERVICE_NOTIF_ID = 2;
   protected static final String SERVICE_NOTIFICATION_CHANNEL_ID = "org_linphone_core_push_service_notification_channel";
   protected static final String SERVICE_NOTIFICATION_CHANNEL_NAME = "Linphone Core Push Service";
   protected static final String SERVICE_NOTIFICATION_CHANNEL_DESC = "Push notification received, waiting for call/chat message to be received by SIP channel";
   protected static final String SERVICE_NOTIFICATION_TITLE = "Linphone Core Push Service";
   protected static final String SERVICE_NOTIFICATION_CONTENT = "Push notification received, waiting for call/chat message to be received by SIP channel";
   protected Notification mServiceNotification = null;
   private Timer mTimer;

   public void onCreate() {
      super.onCreate();
      Factory.instance();
      if (Version.sdkAboveOrEqual(26)) {
         this.createServiceNotificationChannel();
      }

      this.mTimer = new Timer("Push service self-destroy scheduler");
      Log.i("[Push Service] Created");
   }

   public int onStartCommand(Intent intent, int flags, int startId) {
      super.onStartCommand(intent, flags, startId);
      Log.i("[Push Service] Started");
      this.startForeground();
      if (CoreManager.isReady()) {
         CoreManager.instance().healNetwork();
      }

      TimerTask lTask = new TimerTask() {
         public void run() {
            Log.i("[Push Service] Timer expired, stopping service");
            PushService.this.stopForeground();
            PushService.this.stopSelf();
         }
      };
      this.mTimer.schedule(lTask, 20000L);
      return 2;
   }

   public void onTaskRemoved(Intent rootIntent) {
      Log.i("[Push Service] Task removed");
      super.onTaskRemoved(rootIntent);
   }

   public synchronized void onDestroy() {
      Log.i("[Push Service] Stopping");
      this.mTimer.cancel();
      this.mTimer.purge();
      super.onDestroy();
   }

   public IBinder onBind(Intent intent) {
      return null;
   }

   @RequiresApi(
      api = 26
   )
   public void createServiceNotificationChannel() {
      Log.i("[Push Service] Android >= 8.0 detected, creating notification channel if not done yet");
      NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
      NotificationChannel channel = new NotificationChannel("org_linphone_core_push_service_notification_channel", "Linphone Core Push Service", 2);
      channel.setDescription("Push notification received, waiting for call/chat message to be received by SIP channel");
      channel.enableVibration(false);
      channel.enableLights(false);
      channel.setShowBadge(false);
      notificationManager.createNotificationChannel(channel);
   }

   public void createServiceNotification() {
      Log.i("[Push Service] Creating notification for foreground service");
      this.mServiceNotification = (new Builder(this, "org_linphone_core_push_service_notification_channel")).setContentTitle("Linphone Core Push Service").setContentText("Push notification received, waiting for call/chat message to be received by SIP channel").setSmallIcon(this.getApplicationInfo().icon).setAutoCancel(false).setCategory("service").setVisibility(-1).setWhen(System.currentTimeMillis()).setShowWhen(true).setOngoing(true).build();
   }

   public void showForegroundServiceNotification() {
      if (this.mServiceNotification == null) {
         this.createServiceNotification();
      }

      Log.i("[Push Service] Notification has been created, start service as foreground for real");
      DeviceUtils.startDataSyncForegroundService(this, 2, this.mServiceNotification);
   }

   void startForeground() {
      Log.i("[Push Service] Starting service as foreground");
      this.showForegroundServiceNotification();
   }

   void stopForeground() {
      Log.i("[Push Service] Stopping service as foreground");
      this.stopForeground(1);
   }
}

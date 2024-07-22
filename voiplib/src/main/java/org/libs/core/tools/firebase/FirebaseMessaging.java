package org.libs.core.tools.firebase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.libs.core.Core;
import org.libs.core.tools.compatibility.DeviceUtils;
import org.libs.core.tools.service.AndroidDispatcher;
import org.libs.core.tools.service.CoreManager;

public class FirebaseMessaging extends FirebaseMessagingService {
   public void onNewToken(String token) {
      Log.i("FirebaseIdService", "[Push Notification] Refreshed token: " + token);
      if (CoreManager.isReady()) {
         CoreManager.instance().setPushToken(token);
      }

   }

   public void onMessageReceived(final RemoteMessage remoteMessage) {
      Log.i("FirebaseMessaging", "[Push Notification] Received");
      Runnable pushRunnable = new Runnable() {
         public void run() {
            FirebaseMessaging.this.onPushReceived(remoteMessage);
         }
      };
      AndroidDispatcher.dispatchOnUIThread(pushRunnable);
   }

   private void onPushReceived(RemoteMessage remoteMessage) {
      if (!CoreManager.isReady()) {
         this.storePushRemoteMessage(remoteMessage);
         this.notifyAppPushReceivedWithoutCoreAvailable();
      } else {
         org.libs.core.tools.Log.i("[Push Notification] Received: " + this.remoteMessageToString(remoteMessage));
         if (CoreManager.instance() != null) {
            Core core = CoreManager.instance().getCore();
            if (core != null) {
               Map<String, String> data = remoteMessage.getData();
               String callId = DeviceUtils.getStringOrDefaultFromMap(data, "call-id", "");
               String payload = (new JSONObject(data)).toString();
               org.libs.core.tools.Log.i("[Push Notification] Notifying Core we have received a push for Call-ID [" + callId + "]");
               CoreManager.instance().processPushNotification(callId, payload, false);
            } else {
               org.libs.core.tools.Log.w("[Push Notification] No Core found, notifying application directly");
               this.storePushRemoteMessage(remoteMessage);
               this.notifyAppPushReceivedWithoutCoreAvailable();
            }
         }
      }

   }

   private void storePushRemoteMessage(RemoteMessage remoteMessage) {
      Context context = this.getApplicationContext();
      SharedPreferences sharedPref = context.getSharedPreferences("push_notification_storage", 0);
      Editor editor = sharedPref.edit();
      Map<String, String> data = remoteMessage.getData();
      String callId = DeviceUtils.getStringOrDefaultFromMap(data, "call-id", "");
      editor.putString("call-id", callId);
      String payload = (new JSONObject(data)).toString();
      editor.putString("payload", payload);
      editor.apply();
      Log.i("FirebaseMessaging", "[Push Notification] Push information stored for Call-ID [" + callId + "]");
   }

   private void notifyAppPushReceivedWithoutCoreAvailable() {
      Intent intent = new Intent();
      intent.setAction("org.libs.core.action.PUSH_RECEIVED");
      PackageManager pm = this.getPackageManager();
      List<ResolveInfo> matches = pm.queryBroadcastReceivers(intent, 0);
      Iterator var4 = matches.iterator();

      while(var4.hasNext()) {
         ResolveInfo resolveInfo = (ResolveInfo)var4.next();
         String packageName = resolveInfo.activityInfo.applicationInfo.packageName;
         if (packageName.equals(this.getPackageName())) {
            Intent explicit = new Intent(intent);
            ComponentName cn = new ComponentName(packageName, resolveInfo.activityInfo.name);
            explicit.setComponent(cn);
            this.sendBroadcast(explicit);
            break;
         }
      }

   }

   private String remoteMessageToString(RemoteMessage remoteMessage) {
      StringBuilder builder = new StringBuilder();
      builder.append("From [");
      builder.append(remoteMessage.getFrom());
      builder.append("], Message Id [");
      builder.append(remoteMessage.getMessageId());
      builder.append("], TTL [");
      builder.append(remoteMessage.getTtl());
      builder.append("], Original Priority [");
      builder.append(remoteMessage.getOriginalPriority());
      builder.append("], Received Priority [");
      builder.append(remoteMessage.getPriority());
      builder.append("], Sent Time [");
      builder.append(remoteMessage.getSentTime());
      builder.append("], Data [");
      builder.append((new JSONObject(remoteMessage.getData())).toString());
      builder.append("]");
      return builder.toString();
   }
}

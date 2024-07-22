package org.libs.core.tools.firebase;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.libs.core.tools.Log;
import org.libs.core.tools.PushNotificationUtils;
import org.libs.core.tools.service.CoreManager;

@Keep
public class FirebasePushHelper {
   //  implements PushNotificationUtils.PushHelperInterface
   /*public void init(Context context) {
      try {
         FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(@NonNull Task<String> task) {
               if (!task.isSuccessful()) {
                  Log.e("[Push Notification] Firebase getToken failed: " + task.getException());
               } else {
                  String token = (String)task.getResult();
                  Log.i("[Push Notification] Token fetched from Firebase: " + token);
                  if (CoreManager.isReady()) {
                     CoreManager.instance().setPushToken(token);
                  }

               }
            }
         });
      } catch (Exception var3) {
         Log.e("[Push Notification] Firebase not available.");
      }

   }

   public boolean isAvailable(Context context) {
      GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
      int resultCode = googleApiAvailability.isGooglePlayServicesAvailable(context);
      return resultCode == 0;
   }*/
}

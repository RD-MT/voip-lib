package org.linphone.core.tools.firebase;

import androidx.annotation.Keep;

@Keep
public class FirebasePushHelper {
   //  implements PushNotificationUtils.PushHelperInterface
   /*public void init(Context context) {
      try {
         FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(@NonNull Task<String> task) {
               if (!task.isSuccessful()) {
                  Log.i("[Push Notification] Firebase getToken failed: " + task.getException());
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
         Log.i("[Push Notification] Firebase not available.");
      }

   }

   public boolean isAvailable(Context context) {
      GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
      int resultCode = googleApiAvailability.isGooglePlayServicesAvailable(context);
      return resultCode == 0;
   }*/
}

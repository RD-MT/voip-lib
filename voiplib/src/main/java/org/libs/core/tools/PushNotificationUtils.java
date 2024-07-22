package org.libs.core.tools;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.lang.reflect.Constructor;

public class PushNotificationUtils {
   private static PushNotificationUtils.PushHelperInterface mHelper;

   public static void init(Context context) {
      mHelper = null;
      if (!isFirebaseCloudMessaging23Available()) {
         Log.w("[Push Utils] Firebase Cloud Messaging 23+ isn't available. Ensure you have a dependency on com.google.firebase:firebase-messaging (23.0.6 or newer) in your app's build.gradle file or that you use a BoM at least 'com.google.firebase:firebase-bom:30.2.0'.");
      } else if (!isGoogleApiAvailable()) {
         Log.w("[Push Utils] Google services aren't available. Ensure you have correctly applied the com.google.gms.google-services plugin in your app's build.gradle file (cf https://firebase.google.com/docs/android/setup#add-config-file).");
      } else {
         int resId = context.getResources().getIdentifier("gcm_defaultSenderId", "string", context.getPackageName());
         if (resId == 0) {
            Log.e("[Push Utils] Couldn't find gcm_defaultSenderId string resource.");
         } else {
            FirebaseApp.initializeApp(context);

            try {
               String className = "org.libs.core.tools.firebase.FirebasePushHelper";
               Class pushHelper = Class.forName(className);
               Class[] types = new Class[0];
               Constructor constructor = pushHelper.getConstructor(types);
               Object[] parameters = new Object[0];
               mHelper = (PushNotificationUtils.PushHelperInterface)constructor.newInstance(parameters);
               mHelper.init(context);
            } catch (NoSuchMethodException var7) {
               Log.w("[Push Utils] Couldn't get push helper constructor");
            } catch (ClassNotFoundException var8) {
               Log.w("[Push Utils] Couldn't find class: " + var8);
            } catch (Exception var9) {
               Log.w("[Push Utils] Couldn't get push helper instance: " + var9);
            }

         }
      }
   }

   public static boolean isAvailable(Context context) {
      return mHelper == null ? false : mHelper.isAvailable(context);
   }

   private static boolean isFirebaseCloudMessaging23Available() {
      boolean available = false;

      try {
         Class firebaseApp = Class.forName("com.google.firebase.FirebaseApp");
         Class firebaseInstallationsId = Class.forName("com.google.firebase.messaging.FirebaseMessaging");
         available = true;
      } catch (ClassNotFoundException var3) {
         Log.w("[Push Utils] Couldn't find class: ", var3);
      } catch (Exception var4) {
         Log.w("[Push Utils] Exception: " + var4);
      }

      return available;
   }

   private static boolean isGoogleApiAvailable() {
      boolean available = false;

      try {
         Class googleAPiAvailability = Class.forName("com.google.android.gms.common.GoogleApiAvailability");
         Class googleTask = Class.forName("com.google.android.gms.tasks.Task");
         Class googleConnectionResult = Class.forName("com.google.android.gms.common.ConnectionResult");
         Class googleCompleteListener = Class.forName("com.google.android.gms.tasks.OnCompleteListener");
         available = true;
      } catch (ClassNotFoundException var5) {
         Log.w("[Push Utils] Couldn't find class: ", var5);
      } catch (Exception var6) {
         Log.w("[Push Utils] Exception: " + var6);
      }

      return available;
   }

   public interface PushHelperInterface {
      void init(Context var1);

      boolean isAvailable(Context var1);
   }
}

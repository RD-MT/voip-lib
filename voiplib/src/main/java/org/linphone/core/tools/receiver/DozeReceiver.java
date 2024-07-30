package org.linphone.core.tools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Build.VERSION;
import org.linphone.core.tools.Log;

public class DozeReceiver extends BroadcastReceiver {
   public void onReceive(Context context, Intent intent) {
      PowerManager pm = (PowerManager)context.getSystemService("power");
      if (VERSION.SDK_INT >= 23) {
         boolean dozeM = pm.isDeviceIdleMode();
         Log.i("[Platform Helper] [Doze Receiver] Doze mode enabled: " + dozeM);
      }

   }
}

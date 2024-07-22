package org.libs.core.tools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.libs.core.tools.Log;

public class InteractivityReceiver extends BroadcastReceiver {
   public void onReceive(Context context, Intent intent) {
      String action = intent.getAction();
      if (action.equalsIgnoreCase("android.intent.action.SCREEN_ON")) {
         Log.i("[Platform Helper] [Interactivity Receiver] Device screen is ON");
      } else if (action.equalsIgnoreCase("android.intent.action.SCREEN_OFF")) {
         Log.i("[Platform Helper] [Interactivity Receiver] Device screen is OFF");
      }

   }
}

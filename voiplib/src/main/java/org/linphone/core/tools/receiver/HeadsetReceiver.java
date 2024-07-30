package org.linphone.core.tools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.linphone.core.tools.Log;
import org.linphone.core.tools.service.CoreManager;

public class HeadsetReceiver extends BroadcastReceiver {
   public HeadsetReceiver() {
      Log.i("[Headset] Headset receiver created");
   }

   public void onReceive(Context context, Intent intent) {
      String action = intent.getAction();
      Log.i("[Headset] Headset broadcast received");
      if (action.equals("android.intent.action.HEADSET_PLUG")) {
         int state = intent.getIntExtra("state", 0);
         String name = intent.getStringExtra("name");
         int hasMicrophone = intent.getIntExtra("microphone", 0);
         if (state == 0) {
            Log.i("[Headset] Headset disconnected: " + name);
         } else if (state == 1) {
            Log.i("[Headset] Headset connected: " + name);
            if (hasMicrophone == 1) {
               Log.i("[Headset] Headset has a microphone");
            }
         } else {
            Log.w("[Headset] Unknown headset plugged state: " + state);
         }

         if (CoreManager.isReady()) {
            CoreManager.instance().onHeadsetStateChanged();
         }
      }

   }
}

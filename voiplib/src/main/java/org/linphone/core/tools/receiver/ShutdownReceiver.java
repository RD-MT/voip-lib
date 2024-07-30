package org.linphone.core.tools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.linphone.core.tools.service.CoreManager;

public class ShutdownReceiver extends BroadcastReceiver {
   public void onReceive(Context context, Intent intent) {
      if (CoreManager.isReady()) {
         CoreManager.instance().stop();
      }

   }
}

package org.linphone.core.tools.receiver;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.linphone.core.tools.Log;
import org.linphone.core.tools.service.CoreManager;

public class BluetoothReceiver extends BroadcastReceiver {
   public BluetoothReceiver() {
      Log.i("[Bluetooth] Bluetooth receiver created");
   }

   @SuppressLint("MissingPermission")
   public void onReceive(Context context, Intent intent) {
      String action = intent.getAction();
      Log.i("[Bluetooth] Bluetooth broadcast received");
      int state;
      if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
         state = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
         switch(state) {
         case Integer.MIN_VALUE:
            Log.i("[Bluetooth] Adapter is in error state !");
            break;
         case 10:
            Log.w("[Bluetooth] Adapter has been turned off");
            if (CoreManager.isReady()) {
               CoreManager.instance().onBluetoothHeadsetStateChanged();
            }
            break;
         case 11:
            Log.i("[Bluetooth] Adapter is being turned on");
            break;
         case 12:
            Log.i("[Bluetooth] Adapter has been turned on");
            if (CoreManager.isReady()) {
               CoreManager.instance().onBluetoothAdapterTurnedOn();
            }
            break;
         case 13:
            Log.w("[Bluetooth] Adapter is being turned off");
            break;
         default:
            Log.w("[Bluetooth] Unknown adapter state: ", state);
         }
      } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
         state = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
         BluetoothDevice device = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.NAME");
         if (state == 2) {
            if (device != null) {
               Log.i("[Bluetooth] Bluetooth headset connected: [", "", "]");
            } else {
               Log.i("[Bluetooth] Bluetooth headset connected: [unknown device]");
            }

            if (CoreManager.isReady()) {
               CoreManager.instance().onBluetoothHeadsetStateChanged();
            }
         } else if (state == 0) {
            if (device != null) {
               Log.i("[Bluetooth] Bluetooth headset disconnected: [", device.getName(), "]");
            } else {
               Log.i("[Bluetooth] Bluetooth headset disconnected: [unknown device]");
            }

            if (CoreManager.isReady()) {
               CoreManager.instance().onBluetoothHeadsetStateChanged();
            }
         } else if (state == 1) {
            Log.i("[Bluetooth] Bluetooth headset connecting");
         } else {
            Log.w("[Bluetooth] Bluetooth headset unknown state changed: " + state);
         }
      } else {
         Log.w("[Bluetooth] Bluetooth unknown action: " + action);
      }

   }
}

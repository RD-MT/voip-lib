package org.linphone.core.tools.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import org.linphone.core.tools.Log;
import org.linphone.core.tools.receiver.BluetoothReceiver;

public class BluetoothHelper {
   private AudioManager mAudioManager;
   private BluetoothAdapter mBluetoothAdapter;
   private BluetoothReceiver mBluetoothReceiver;

   public BluetoothHelper(Context context) {
      this.mAudioManager = (AudioManager)context.getSystemService("audio");
      BluetoothManager bluetoothManager = (BluetoothManager)context.getSystemService("bluetooth");
      this.mBluetoothAdapter = bluetoothManager.getAdapter();
      if (this.mBluetoothAdapter != null) {
         Log.i("[Bluetooth] Adapter found");
         if (this.mAudioManager.isBluetoothScoAvailableOffCall()) {
            Log.i("[Bluetooth] SCO available off call, continue");
         } else {
            Log.w("[Bluetooth] SCO not available off call !");
         }

         this.mBluetoothReceiver = new BluetoothReceiver();
         IntentFilter filter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
         filter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
         context.registerReceiver(this.mBluetoothReceiver, filter);
         Log.i("[Bluetooth] Bluetooth broadcast receiver registered");
      }

      Log.i("[Bluetooth] Bluetooth helper created");
   }

   public void destroy(Context context) {
      if (this.mBluetoothReceiver != null) {
         context.unregisterReceiver(this.mBluetoothReceiver);
         this.mBluetoothReceiver = null;
         Log.i("[Bluetooth] Bluetooth broadcast receiver unregistered");
      }

      this.mBluetoothAdapter = null;
      this.mAudioManager = null;
      Log.i("[Bluetooth] Bluetooth helper destroyed");
   }
}

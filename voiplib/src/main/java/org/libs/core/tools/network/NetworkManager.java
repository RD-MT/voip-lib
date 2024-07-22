package org.libs.core.tools.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import java.util.ArrayList;
import org.libs.core.tools.AndroidPlatformHelper;
import org.libs.core.tools.Log;

public class NetworkManager extends BroadcastReceiver implements NetworkManagerInterface {
   private AndroidPlatformHelper mHelper;
   private IntentFilter mNetworkIntentFilter;
   private ConnectivityManager mConnectivityManager;
   private boolean mWifiOnly;

   public NetworkManager(AndroidPlatformHelper helper, ConnectivityManager cm, boolean wifiOnly) {
      this.mConnectivityManager = cm;
      this.mWifiOnly = wifiOnly;
      this.mHelper = helper;
   }

   public void onReceive(Context context, Intent intent) {
      Log.i("[Platform Helper] [Network Manager] Broadcast receiver called");
      if (this.mHelper != null) {
         this.mHelper.updateNetworkReachability();
      }

   }

   public void setWifiOnly(boolean isWifiOnlyEnabled) {
      this.mWifiOnly = isWifiOnlyEnabled;
   }

   public void registerNetworkCallbacks(Context context) {
      this.mNetworkIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      context.registerReceiver(this, this.mNetworkIntentFilter);
   }

   public void unregisterNetworkCallbacks(Context context) {
      context.unregisterReceiver(this);
   }

   public NetworkInfo getActiveNetworkInfo() {
      return this.mConnectivityManager.getActiveNetworkInfo();
   }

   public Network getActiveNetwork() {
      return null;
   }

   public boolean isCurrentlyConnected(Context context) {
      NetworkInfo[] networkInfos = this.mConnectivityManager.getAllNetworkInfo();
      boolean connected = false;
      NetworkInfo[] var4 = networkInfos;
      int var5 = networkInfos.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         NetworkInfo networkInfo = var4[var6];
         Log.i("[Platform Helper] [Network Manager] Found network type: " + networkInfo.getTypeName() + ", isConnectedOrConnecting() = " + networkInfo.isConnectedOrConnecting());
         if (networkInfo.isConnectedOrConnecting()) {
            Log.i("[Platform Helper] [Network Manager] Network state is " + networkInfo.getState() + " / " + networkInfo.getDetailedState());
            if (networkInfo.getType() == 1 && networkInfo.getType() == 9 || !this.mWifiOnly) {
               return true;
            }

            Log.i("[Platform Helper] [Network Manager] Wifi only mode enabled, skipping");
         }
      }

      return connected;
   }

   public boolean hasHttpProxy(Context context) {
      return false;
   }

   public String getProxyHost(Context context) {
      return null;
   }

   public int getProxyPort(Context context) {
      return 0;
   }

   public void updateDnsServers() {
      ArrayList<String> dnsServers = new ArrayList();
      this.mHelper.updateDnsServers(dnsServers);
   }
}

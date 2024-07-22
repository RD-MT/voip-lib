package org.libs.core.tools.network;

import android.content.Context;
import android.net.Network;
import android.net.NetworkInfo;

public interface NetworkManagerInterface {
   void registerNetworkCallbacks(Context var1);

   void unregisterNetworkCallbacks(Context var1);

   boolean isCurrentlyConnected(Context var1);

   NetworkInfo getActiveNetworkInfo();

   Network getActiveNetwork();

   boolean hasHttpProxy(Context var1);

   String getProxyHost(Context var1);

   int getProxyPort(Context var1);

   void setWifiOnly(boolean var1);

   void updateDnsServers();
}

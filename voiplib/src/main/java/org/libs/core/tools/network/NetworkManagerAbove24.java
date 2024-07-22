package org.libs.core.tools.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.ProxyInfo;
import android.net.RouteInfo;
import android.net.ConnectivityManager.NetworkCallback;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.libs.core.tools.AndroidPlatformHelper;
import org.libs.core.tools.Log;

public class NetworkManagerAbove24 implements NetworkManagerInterface {
   private AndroidPlatformHelper mHelper;
   private ConnectivityManager mConnectivityManager;
   private NetworkCallback mNetworkCallback;
   private Network mNetworkAvailable;
   private Network mLastNetworkAvailable;
   private boolean mWifiOnly;

   public NetworkManagerAbove24(AndroidPlatformHelper helper, ConnectivityManager cm, boolean wifiOnly) {
      this.mHelper = helper;
      this.mConnectivityManager = cm;
      this.mWifiOnly = wifiOnly;
      this.mNetworkAvailable = null;
      this.mLastNetworkAvailable = null;
      this.mNetworkCallback = new NetworkCallback() {
         public void onAvailable(final Network network) {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  NetworkInfo info = NetworkManagerAbove24.this.mConnectivityManager.getNetworkInfo(network);
                  if (info == null) {
                     Log.e("[Platform Helper] [Network Manager 24] A network should be available but getNetworkInfo failed.");
                  } else {
                     Log.i("[Platform Helper] [Network Manager 24] A network is available: " + info.getTypeName() + ", wifi only is " + (NetworkManagerAbove24.this.mWifiOnly ? "enabled" : "disabled"));
                     if (NetworkManagerAbove24.this.mWifiOnly && info.getType() != 1 && info.getType() != 9) {
                        Log.i("[Platform Helper] [Network Manager 24] Network isn't wifi and wifi only mode is enabled");
                        if (NetworkManagerAbove24.this.mWifiOnly) {
                           NetworkManagerAbove24.this.mLastNetworkAvailable = network;
                        }
                     } else {
                        NetworkManagerAbove24.this.mNetworkAvailable = network;
                        NetworkManagerAbove24.this.mHelper.updateNetworkReachability();
                     }

                  }
               }
            });
         }

         public void onLost(final Network network) {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 24] A network has been lost");
                  if (NetworkManagerAbove24.this.mNetworkAvailable != null && NetworkManagerAbove24.this.mNetworkAvailable.equals(network)) {
                     NetworkManagerAbove24.this.mNetworkAvailable = null;
                  }

                  if (NetworkManagerAbove24.this.mLastNetworkAvailable != null && NetworkManagerAbove24.this.mLastNetworkAvailable.equals(network)) {
                     NetworkManagerAbove24.this.mLastNetworkAvailable = null;
                  }

                  NetworkManagerAbove24.this.mHelper.updateNetworkReachability();
               }
            });
         }

         public void onCapabilitiesChanged(Network network, final NetworkCapabilities networkCapabilities) {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  if (networkCapabilities == null) {
                     Log.e("[Platform Helper] [Network Manager 24] onCapabilitiesChanged called with null networkCapabilities, skipping...");
                  } else {
                     if (networkCapabilities.hasTransport(1)) {
                        Log.d("[Platform Helper] [Network Manager 24] onCapabilitiesChanged " + networkCapabilities.toString());
                     } else {
                        Log.i("[Platform Helper] [Network Manager 24] onCapabilitiesChanged " + networkCapabilities.toString());
                        NetworkManagerAbove24.this.mHelper.updateNetworkReachability();
                     }

                  }
               }
            });
         }

         public void onLinkPropertiesChanged(Network network, final LinkProperties linkProperties) {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  if (linkProperties == null) {
                     Log.e("[Platform Helper] [Network Manager 24] onLinkPropertiesChanged called with null linkProperties, skipping...");
                  } else {
                     Log.i("[Platform Helper] [Network Manager 24] onLinkPropertiesChanged " + linkProperties.toString());
                     NetworkManagerAbove24.this.updateDnsServers();
                  }
               }
            });
         }

         public void onLosing(Network network, int maxMsToLive) {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 24] onLosing");
               }
            });
         }

         public void onUnavailable() {
            NetworkManagerAbove24.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 24] onUnavailable");
               }
            });
         }
      };
   }

   public void setWifiOnly(boolean isWifiOnlyEnabled) {
      this.mWifiOnly = isWifiOnlyEnabled;
      if (this.mWifiOnly && this.mNetworkAvailable != null) {
         NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(this.mNetworkAvailable);
         if (networkInfo != null && networkInfo.getType() != 1 && networkInfo.getType() != 9) {
            Log.i("[Platform Helper] [Network Manager 24] Wifi only mode enabled and current network isn't wifi or ethernet");
            this.mLastNetworkAvailable = this.mNetworkAvailable;
            this.mNetworkAvailable = null;
         }
      } else if (!this.mWifiOnly && this.mNetworkAvailable == null) {
         Log.i("[Platform Helper] [Network Manager 24] Wifi only mode disabled, restoring previous network");
         this.mNetworkAvailable = this.mLastNetworkAvailable;
         this.mLastNetworkAvailable = null;
      }

   }

   public void registerNetworkCallbacks(Context context) {
      int permissionGranted = context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName());
      Log.i("[Platform Helper] [Network Manager 24] ACCESS_NETWORK_STATE permission is " + (permissionGranted == 0 ? "granted" : "denied"));
      if (permissionGranted == 0) {
         this.mConnectivityManager.registerDefaultNetworkCallback(this.mNetworkCallback);
      }

   }

   public void unregisterNetworkCallbacks(Context context) {
      this.mConnectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
   }

   public NetworkInfo getActiveNetworkInfo() {
      if (this.mNetworkAvailable != null) {
         return this.mConnectivityManager.getNetworkInfo(this.mNetworkAvailable);
      } else {
         Network network = this.mConnectivityManager.getActiveNetwork();
         if (network != null) {
            return this.mConnectivityManager.getNetworkInfo(network);
         } else {
            Log.i("[Platform Helper] [Network Manager 24] getActiveNetwork() returned null, using getActiveNetworkInfo() instead");
            return this.mConnectivityManager.getActiveNetworkInfo();
         }
      }
   }

   public Network getActiveNetwork() {
      return this.mNetworkAvailable != null ? this.mNetworkAvailable : this.mConnectivityManager.getActiveNetwork();
   }

   public boolean isCurrentlyConnected(Context context) {
      int restrictBackgroundStatus = this.mConnectivityManager.getRestrictBackgroundStatus();
      if (restrictBackgroundStatus == 3) {
         Log.w("[Platform Helper] [Network Manager 24] Device is restricting metered network activity while application is running on background");
         if (this.mConnectivityManager.isActiveNetworkMetered() && this.mHelper.isInBackground()) {
            Log.w("[Platform Helper] [Network Manager 24] Device is in background, returning false");
            return false;
         }
      }

      return this.mNetworkAvailable != null;
   }

   public boolean hasHttpProxy(Context context) {
      ProxyInfo proxy = this.mConnectivityManager.getDefaultProxy();
      if (proxy != null && proxy.getHost() != null) {
         Log.i("[Platform Helper] [Network Manager 24] The active network is using a http proxy: " + proxy.toString());
         return true;
      } else {
         return false;
      }
   }

   public String getProxyHost(Context context) {
      ProxyInfo proxy = this.mConnectivityManager.getDefaultProxy();
      return proxy.getHost();
   }

   public int getProxyPort(Context context) {
      ProxyInfo proxy = this.mConnectivityManager.getDefaultProxy();
      return proxy.getPort();
   }

   private boolean hasLinkPropertiesDefaultRoute(LinkProperties linkProperties) {
      if (linkProperties != null) {
         Iterator var2 = linkProperties.getRoutes().iterator();

         while(var2.hasNext()) {
            RouteInfo route = (RouteInfo)var2.next();
            if (route.isDefaultRoute()) {
               return true;
            }
         }
      }

      return false;
   }

   public void updateDnsServers() {
      ArrayList<String> dnsServers = new ArrayList();
      ArrayList<String> activeNetworkDnsServers = new ArrayList();
      if (this.mConnectivityManager != null) {
         Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
         if (activeNetwork == null) {
            if (this.mNetworkAvailable == null) {
               Log.e("[Platform Helper] [Network Manager 24] Active network is null and no available network has been stored!");
            } else {
               Log.w("[Platform Helper] [Network Manager 24] Active network is null, using stored available network");
               activeNetwork = this.mNetworkAvailable;
            }
         }

         Network[] var4 = this.mConnectivityManager.getAllNetworks();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            Network network = var4[var6];
            NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(network);
            if (networkInfo != null) {
               LinkProperties linkProperties = this.mConnectivityManager.getLinkProperties(network);
               if (linkProperties != null) {
                  List<InetAddress> dnsServersList = linkProperties.getDnsServers();
                  boolean prioritary = this.hasLinkPropertiesDefaultRoute(linkProperties);
                  Iterator var12 = dnsServersList.iterator();

                  while(var12.hasNext()) {
                     InetAddress dnsServer = (InetAddress)var12.next();
                     String dnsHost = dnsServer.getHostAddress();
                     if (!dnsServers.contains(dnsHost) && !activeNetworkDnsServers.contains(dnsHost)) {
                        String networkType = networkInfo.getTypeName();
                        if (network.equals(activeNetwork)) {
                           Log.i("[Platform Helper] [Network Manager 24] Found DNS host " + dnsHost + " from active network " + networkType);
                           activeNetworkDnsServers.add(dnsHost);
                        } else if (prioritary) {
                           Log.i("[Platform Helper] [Network Manager 24] Found DNS host " + dnsHost + " from network " + networkType + " with default route");
                           dnsServers.add(0, dnsHost);
                        } else {
                           Log.i("[Platform Helper] [Network Manager 24] Found DNS host " + dnsHost + " from network " + networkType);
                           dnsServers.add(dnsHost);
                        }
                     }
                  }
               }
            }
         }
      }

      activeNetworkDnsServers.addAll(dnsServers);
      this.mHelper.updateDnsServers(activeNetworkDnsServers);
   }
}

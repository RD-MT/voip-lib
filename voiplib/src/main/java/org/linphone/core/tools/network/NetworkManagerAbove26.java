package org.linphone.core.tools.network;

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
import org.linphone.core.tools.AndroidPlatformHelper;
import org.linphone.core.tools.Log;

public class NetworkManagerAbove26 implements NetworkManagerInterface {
   private AndroidPlatformHelper mHelper;
   private ConnectivityManager mConnectivityManager;
   private NetworkCallback mNetworkCallback;
   private Network mNetworkAvailable;
   private Network mLastNetworkAvailable;
   private boolean mWifiOnly;

   public NetworkManagerAbove26(AndroidPlatformHelper helper, ConnectivityManager cm, boolean wifiOnly) {
      this.mHelper = helper;
      this.mConnectivityManager = cm;
      this.mWifiOnly = wifiOnly;
      this.mNetworkAvailable = null;
      this.mLastNetworkAvailable = null;
      this.mNetworkCallback = new NetworkCallback() {
         public void onAvailable(Network network) {
            NetworkInfo info = NetworkManagerAbove26.this.mConnectivityManager.getNetworkInfo(network);
            if (info == null) {
               Log.i("[Platform Helper] [Network Manager 26] A network should be available but getNetworkInfo failed.");
            } else {
               Log.i("[Platform Helper] [Network Manager 26] A network is available: " + info.getTypeName() + ", wifi only is " + (NetworkManagerAbove26.this.mWifiOnly ? "enabled" : "disabled"));
               if (NetworkManagerAbove26.this.mWifiOnly && info.getType() != 1 && info.getType() != 9) {
                  Log.i("[Platform Helper] [Network Manager 26] Network isn't wifi and wifi only mode is enabled");
                  if (NetworkManagerAbove26.this.mWifiOnly) {
                     NetworkManagerAbove26.this.mLastNetworkAvailable = network;
                  }
               } else {
                  NetworkManagerAbove26.this.mNetworkAvailable = network;
                  NetworkManagerAbove26.this.mHelper.updateNetworkReachability();
               }

            }
         }

         public void onLost(Network network) {
            Log.i("[Platform Helper] [Network Manager 26] A network has been lost");
            if (NetworkManagerAbove26.this.mNetworkAvailable != null && NetworkManagerAbove26.this.mNetworkAvailable.equals(network)) {
               NetworkManagerAbove26.this.mNetworkAvailable = null;
            }

            if (NetworkManagerAbove26.this.mLastNetworkAvailable != null && NetworkManagerAbove26.this.mLastNetworkAvailable.equals(network)) {
               NetworkManagerAbove26.this.mLastNetworkAvailable = null;
            }

            NetworkManagerAbove26.this.mHelper.updateNetworkReachability();
         }

         public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
               Log.i("[Platform Helper] [Network Manager 26] onCapabilitiesChanged called with null networkCapabilities, skipping...");
            } else {
               if (networkCapabilities.hasTransport(1)) {
                  Log.d("[Platform Helper] [Network Manager 26] onCapabilitiesChanged " + networkCapabilities.toString());
               } else {
                  Log.i("[Platform Helper] [Network Manager 26] onCapabilitiesChanged " + networkCapabilities.toString());
                  NetworkManagerAbove26.this.mHelper.updateNetworkReachability();
               }

            }
         }

         public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (linkProperties == null) {
               Log.i("[Platform Helper] [Network Manager 26] onLinkPropertiesChanged called with null linkProperties, skipping...");
            } else {
               Log.i("[Platform Helper] [Network Manager 26] onLinkPropertiesChanged " + linkProperties.toString());
               NetworkManagerAbove26.this.updateDnsServers();
            }
         }

         public void onLosing(Network network, int maxMsToLive) {
            Log.i("[Platform Helper] [Network Manager 26] onLosing");
         }

         public void onUnavailable() {
            Log.i("[Platform Helper] [Network Manager 26] onUnavailable");
         }
      };
   }

   public void setWifiOnly(boolean isWifiOnlyEnabled) {
      this.mWifiOnly = isWifiOnlyEnabled;
      if (this.mWifiOnly && this.mNetworkAvailable != null) {
         NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(this.mNetworkAvailable);
         if (networkInfo != null && networkInfo.getType() != 1 && networkInfo.getType() != 9) {
            Log.i("[Platform Helper] [Network Manager 26] Wifi only mode enabled and current network isn't wifi or ethernet");
            this.mLastNetworkAvailable = this.mNetworkAvailable;
            this.mNetworkAvailable = null;
         }
      } else if (!this.mWifiOnly && this.mNetworkAvailable == null) {
         Log.i("[Platform Helper] [Network Manager 26] Wifi only mode disabled, restoring previous network");
         this.mNetworkAvailable = this.mLastNetworkAvailable;
         this.mLastNetworkAvailable = null;
      }

   }

   public void registerNetworkCallbacks(Context context) {
      int permissionGranted = context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName());
      Log.i("[Platform Helper] [Network Manager 26] ACCESS_NETWORK_STATE permission is " + (permissionGranted == 0 ? "granted" : "denied"));
      if (permissionGranted == 0) {
         this.mConnectivityManager.registerDefaultNetworkCallback(this.mNetworkCallback, this.mHelper.getHandler());
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
            Log.i("[Platform Helper] [Network Manager 26] getActiveNetwork() returned null, using getActiveNetworkInfo() instead");
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
         Log.w("[Platform Helper] [Network Manager 26] Device is restricting metered network activity while application is running on background, data saver is probably ON");
         if (this.mConnectivityManager.isActiveNetworkMetered() && this.mHelper.isInBackground()) {
            Log.w("[Platform Helper] [Network Manager 26] Considering network is not reachable due to background restrictions!");
            return false;
         }

         Log.i("[Platform Helper] [Network Manager 26] Active network not metered, considering network is reachable");
      }

      return this.mNetworkAvailable != null;
   }

   public boolean hasHttpProxy(Context context) {
      ProxyInfo proxy = this.mConnectivityManager.getDefaultProxy();
      if (proxy != null && proxy.getHost() != null) {
         Log.i("[Platform Helper] [Network Manager 26] The active network is using an http proxy: " + proxy.toString());
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
      ArrayList<String> mobileDnsServers = new ArrayList();
      ArrayList<String> activeNetworkDnsServers = new ArrayList();
      if (this.mConnectivityManager != null) {
         Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
         if (activeNetwork == null) {
            if (this.mNetworkAvailable == null) {
               Log.i("[Platform Helper] [Network Manager 26] Active network is null and no available network has been stored!");
            } else {
               Log.w("[Platform Helper] [Network Manager 26] Active network is null, using stored available network");
               activeNetwork = this.mNetworkAvailable;
            }
         }

         Network[] var5 = this.mConnectivityManager.getAllNetworks();
         int var6 = var5.length;

         label60:
         for(int var7 = 0; var7 < var6; ++var7) {
            Network network = var5[var7];
            NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(network);
            if (networkInfo != null) {
               LinkProperties linkProperties = this.mConnectivityManager.getLinkProperties(network);
               if (linkProperties != null) {
                  List<InetAddress> dnsServersList = linkProperties.getDnsServers();
                  boolean prioritary = this.hasLinkPropertiesDefaultRoute(linkProperties);
                  Iterator var13 = dnsServersList.iterator();

                  while(true) {
                     while(true) {
                        String dnsHost;
                        do {
                           do {
                              if (!var13.hasNext()) {
                                 continue label60;
                              }

                              InetAddress dnsServer = (InetAddress)var13.next();
                              dnsHost = dnsServer.getHostAddress();
                           } while(dnsServers.contains(dnsHost));
                        } while(activeNetworkDnsServers.contains(dnsHost));

                        String networkType = networkInfo.getTypeName();
                        if (activeNetwork != null && network.equals(activeNetwork)) {
                           Log.i("[Platform Helper] [Network Manager 26] Found DNS host " + dnsHost + " from active network " + networkType);
                           activeNetworkDnsServers.add(dnsHost);
                        } else if (networkInfo.getType() == 0) {
                           Log.i("[Platform Helper] [Network Manager 26] Found DNS host " + dnsHost + " from mobile network");
                           mobileDnsServers.add(dnsHost);
                        } else if (prioritary) {
                           Log.i("[Platform Helper] [Network Manager 26] Found DNS host " + dnsHost + " from network " + networkType + " with default route");
                           dnsServers.add(0, dnsHost);
                        } else {
                           Log.i("[Platform Helper] [Network Manager 26] Found DNS host " + dnsHost + " from network " + networkType);
                           dnsServers.add(dnsHost);
                        }
                     }
                  }
               }
            }
         }
      }

      activeNetworkDnsServers.addAll(dnsServers);
      activeNetworkDnsServers.addAll(mobileDnsServers);
      this.mHelper.updateDnsServers(activeNetworkDnsServers);
   }
}

package org.libs.core.tools.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest.Builder;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.libs.core.tools.AndroidPlatformHelper;
import org.libs.core.tools.Log;

public class NetworkManagerAbove23 implements NetworkManagerInterface {
   private AndroidPlatformHelper mHelper;
   private ConnectivityManager mConnectivityManager;
   private NetworkCallback mNetworkCallback;
   private Network mNetworkAvailable;
   private Network mLastNetworkAvailable;
   private boolean mWifiOnly;

   public NetworkManagerAbove23(AndroidPlatformHelper helper, ConnectivityManager cm, boolean wifiOnly) {
      this.mHelper = helper;
      this.mConnectivityManager = cm;
      this.mWifiOnly = wifiOnly;
      this.mNetworkAvailable = null;
      this.mLastNetworkAvailable = null;
      this.mNetworkCallback = new NetworkCallback() {
         public void onAvailable(final Network network) {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  NetworkInfo info = NetworkManagerAbove23.this.mConnectivityManager.getNetworkInfo(network);
                  if (info == null) {
                     Log.e("[Platform Helper] [Network Manager 23] A network should be available but getNetworkInfo failed.");
                  } else {
                     Log.i("[Platform Helper] [Network Manager 23] A network is available: " + info.getTypeName() + ", wifi only is " + (NetworkManagerAbove23.this.mWifiOnly ? "enabled" : "disabled"));
                     if (NetworkManagerAbove23.this.mWifiOnly && info.getType() != 1 && info.getType() != 9) {
                        Log.i("[Platform Helper] [Network Manager 23] Network isn't wifi and wifi only mode is enabled");
                        if (NetworkManagerAbove23.this.mWifiOnly) {
                           NetworkManagerAbove23.this.mLastNetworkAvailable = network;
                        }
                     } else {
                        NetworkManagerAbove23.this.mNetworkAvailable = network;
                        NetworkManagerAbove23.this.mHelper.updateNetworkReachability();
                     }

                  }
               }
            });
         }

         public void onLost(final Network network) {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 23] A network has been lost");
                  if (NetworkManagerAbove23.this.mNetworkAvailable != null && NetworkManagerAbove23.this.mNetworkAvailable.equals(network)) {
                     NetworkManagerAbove23.this.mNetworkAvailable = null;
                  }

                  if (NetworkManagerAbove23.this.mLastNetworkAvailable != null && NetworkManagerAbove23.this.mLastNetworkAvailable.equals(network)) {
                     NetworkManagerAbove23.this.mLastNetworkAvailable = null;
                  }

                  NetworkManagerAbove23.this.mHelper.updateNetworkReachability();
               }
            });
         }

         public void onCapabilitiesChanged(Network network, final NetworkCapabilities networkCapabilities) {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  if (networkCapabilities == null) {
                     Log.e("[Platform Helper] [Network Manager 23] onCapabilitiesChanged called with null networkCapabilities, skipping...");
                  } else {
                     if (networkCapabilities.hasTransport(1)) {
                        Log.d("[Platform Helper] [Network Manager 23] onCapabilitiesChanged " + networkCapabilities.toString());
                     } else {
                        Log.i("[Platform Helper] [Network Manager 23] onCapabilitiesChanged " + networkCapabilities.toString());
                        NetworkManagerAbove23.this.mHelper.updateNetworkReachability();
                     }

                  }
               }
            });
         }

         public void onLinkPropertiesChanged(Network network, final LinkProperties linkProperties) {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  if (linkProperties == null) {
                     Log.e("[Platform Helper] [Network Manager 23] onLinkPropertiesChanged called with null linkProperties, skipping...");
                  } else {
                     Log.i("[Platform Helper] [Network Manager 23] onLinkPropertiesChanged " + linkProperties.toString());
                     NetworkManagerAbove23.this.updateDnsServers();
                  }
               }
            });
         }

         public void onLosing(Network network, int maxMsToLive) {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 23] onLosing");
               }
            });
         }

         public void onUnavailable() {
            NetworkManagerAbove23.this.mHelper.getHandler().post(new Runnable() {
               public void run() {
                  Log.i("[Platform Helper] [Network Manager 23] onUnavailable");
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
            Log.i("[Platform Helper] [Network Manager 23] Wifi only mode enabled and current network isn't wifi or ethernet");
            this.mLastNetworkAvailable = this.mNetworkAvailable;
            this.mNetworkAvailable = null;
         }
      } else if (!this.mWifiOnly && this.mNetworkAvailable == null) {
         Log.i("[Platform Helper] [Network Manager 23] Wifi only mode disabled, restoring previous network");
         this.mNetworkAvailable = this.mLastNetworkAvailable;
         this.mLastNetworkAvailable = null;
      }

   }

   public void registerNetworkCallbacks(Context context) {
      this.mConnectivityManager.registerNetworkCallback((new Builder()).build(), this.mNetworkCallback);
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
            Log.i("[Platform Helper] [Network Manager 23] getActiveNetwork() returned null, using getActiveNetworkInfo() instead");
            return this.mConnectivityManager.getActiveNetworkInfo();
         }
      }
   }

   public Network getActiveNetwork() {
      return this.mNetworkAvailable != null ? this.mNetworkAvailable : this.mConnectivityManager.getActiveNetwork();
   }

   public boolean isCurrentlyConnected(Context context) {
      return this.mNetworkAvailable != null;
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
               Log.e("[Platform Helper] [Network Manager 23] Active network is null and no available network has been stored!");
            } else {
               Log.w("[Platform Helper] [Network Manager 23] Active network is null, using stored available network");
               activeNetwork = this.mNetworkAvailable;
            }
         }

         Network[] var4 = this.mConnectivityManager.getAllNetworks();
         int var5 = var4.length;

         label57:
         for(int var6 = 0; var6 < var5; ++var6) {
            Network network = var4[var6];
            NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(network);
            if (networkInfo != null) {
               LinkProperties linkProperties = this.mConnectivityManager.getLinkProperties(network);
               if (linkProperties != null) {
                  List<InetAddress> dnsServersList = linkProperties.getDnsServers();
                  boolean prioritary = this.hasLinkPropertiesDefaultRoute(linkProperties);
                  Iterator var12 = dnsServersList.iterator();

                  while(true) {
                     while(true) {
                        String dnsHost;
                        do {
                           do {
                              if (!var12.hasNext()) {
                                 continue label57;
                              }

                              InetAddress dnsServer = (InetAddress)var12.next();
                              dnsHost = dnsServer.getHostAddress();
                           } while(dnsServers.contains(dnsHost));
                        } while(activeNetworkDnsServers.contains(dnsHost));

                        String networkType = networkInfo.getTypeName();
                        if (activeNetwork != null && network.equals(activeNetwork)) {
                           Log.i("[Platform Helper] [Network Manager 23] Found DNS host " + dnsHost + " from active network " + networkType);
                           activeNetworkDnsServers.add(dnsHost);
                        } else if (prioritary) {
                           Log.i("[Platform Helper] [Network Manager 23] Found DNS host " + dnsHost + " from network " + networkType + " with default route");
                           dnsServers.add(0, dnsHost);
                        } else {
                           Log.i("[Platform Helper] [Network Manager 23] Found DNS host " + dnsHost + " from network " + networkType);
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

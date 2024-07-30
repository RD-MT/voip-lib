package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface NatPolicy {
   @NonNull
   Core getCore();

   boolean isIceEnabled();

   void setIceEnabled(boolean var1);

   @Nullable
   String getNatV4Address();

   void setNatV4Address(@Nullable String var1);

   @Nullable
   String getNatV6Address();

   void setNatV6Address(@Nullable String var1);

   boolean isStunEnabled();

   void setStunEnabled(boolean var1);

   @Nullable
   String getStunServer();

   void setStunServer(@Nullable String var1);

   @Nullable
   String getStunServerUsername();

   void setStunServerUsername(@Nullable String var1);

   boolean isTcpTurnTransportEnabled();

   void setTcpTurnTransportEnabled(boolean var1);

   boolean isTlsTurnTransportEnabled();

   void setTlsTurnTransportEnabled(boolean var1);

   boolean isTurnEnabled();

   void setTurnEnabled(boolean var1);

   boolean isUdpTurnTransportEnabled();

   void setUdpTurnTransportEnabled(boolean var1);

   boolean isUpnpEnabled();

   void setUpnpEnabled(boolean var1);

   void clear();

   @NonNull
   NatPolicy clone();

   void resolveStunServer();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

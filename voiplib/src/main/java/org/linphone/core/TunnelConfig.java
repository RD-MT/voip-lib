package org.linphone.core;

import androidx.annotation.Nullable;

public interface TunnelConfig {
   int getDelay();

   void setDelay(int var1);

   @Nullable
   String getHost();

   void setHost(@Nullable String var1);

   @Nullable
   String getHost2();

   void setHost2(@Nullable String var1);

   int getPort();

   void setPort(int var1);

   int getPort2();

   void setPort2(int var1);

   int getRemoteUdpMirrorPort();

   void setRemoteUdpMirrorPort(int var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Tunnel {
   boolean getActivated();

   @Nullable
   String getDomain();

   void setDomain(@Nullable String var1);

   boolean isDualModeEnabled();

   void setDualModeEnabled(boolean var1);

   Tunnel.Mode getMode();

   void setMode(Tunnel.Mode var1);

   @NonNull
   TunnelConfig[] getServers();

   boolean isSipEnabled();

   void setSipEnabled(boolean var1);

   @Nullable
   String getUsername();

   void setUsername(@Nullable String var1);

   void addServer(@NonNull TunnelConfig var1);

   void cleanServers();

   boolean connected();

   void reconnect();

   void removeServer(@NonNull TunnelConfig var1);

   void setHttpProxy(@NonNull String var1, int var2, @Nullable String var3, @Nullable String var4);

   void setHttpProxyAuthInfo(@Nullable String var1, @Nullable String var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum Mode {
      Disable(0),
      Enable(1),
      Auto(2);

      protected final int mValue;

      private Mode(int value) {
         this.mValue = value;
      }

      public static Tunnel.Mode fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Disable;
         case 1:
            return Enable;
         case 2:
            return Auto;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Mode");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

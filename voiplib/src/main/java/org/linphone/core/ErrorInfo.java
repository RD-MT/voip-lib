package org.linphone.core;

import androidx.annotation.Nullable;

public interface ErrorInfo {
   @Nullable
   String getPhrase();

   void setPhrase(@Nullable String var1);

   @Nullable
   String getProtocol();

   void setProtocol(@Nullable String var1);

   int getProtocolCode();

   void setProtocolCode(int var1);

   Reason getReason();

   void setReason(Reason var1);

   int getRetryAfter();

   void setRetryAfter(int var1);

   @Nullable
   ErrorInfo getSubErrorInfo();

   void setSubErrorInfo(@Nullable ErrorInfo var1);

   @Nullable
   String getWarnings();

   void setWarnings(@Nullable String var1);

   void set(@Nullable String var1, Reason var2, int var3, @Nullable String var4, @Nullable String var5);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

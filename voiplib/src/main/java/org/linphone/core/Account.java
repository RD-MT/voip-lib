package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Account {
   boolean isAvpfEnabled();

   @Nullable
   Address getContactAddress();

   void setContactAddress(@Nullable Address var1);

   @NonNull
   Core getCore();

   @Nullable
   Account getDependency();

   void setDependency(@Nullable Account var1);

   Reason getError();

   @NonNull
   ErrorInfo getErrorInfo();

   @NonNull
   AccountParams getParams();

   int setParams(@NonNull AccountParams var1);

   RegistrationState getState();

   /** @deprecated */
   @Deprecated
   TransportType getTransport();

   int getUnreadChatMessageCount();

   void addCustomParam(@NonNull String var1, @NonNull String var2);

   @NonNull
   Account clone();

   @Nullable
   AuthInfo findAuthInfo();

   @Nullable
   String getCustomHeader(@NonNull String var1);

   @NonNull
   String getCustomParam(@NonNull String var1);

   boolean isPhoneNumber(@NonNull String var1);

   @Nullable
   String normalizePhoneNumber(@NonNull String var1);

   @Nullable
   Address normalizeSipUri(@NonNull String var1);

   void pauseRegister();

   void refreshRegister();

   void setCustomHeader(@NonNull String var1, @Nullable String var2);

   @NonNull
   Account newWithConfig(@Nullable Core var1, @NonNull AccountParams var2, @Nullable ProxyConfig var3);

   void addListener(AccountListener var1);

   void removeListener(AccountListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

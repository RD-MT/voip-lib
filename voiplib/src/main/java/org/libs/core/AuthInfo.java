package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AuthInfo {
   @Nullable
   String getAlgorithm();

   void setAlgorithm(@Nullable String var1);

   @NonNull
   String[] getAvailableAlgorithms();

   void setAvailableAlgorithms(@Nullable String[] var1);

   @Nullable
   String getDomain();

   void setDomain(@Nullable String var1);

   @Nullable
   String getHa1();

   void setHa1(@Nullable String var1);

   @Nullable
   String getPassword();

   void setPassword(@Nullable String var1);

   @Nullable
   String getRealm();

   void setRealm(@Nullable String var1);

   @Nullable
   String getTlsCert();

   void setTlsCert(@Nullable String var1);

   @Nullable
   String getTlsCertPath();

   void setTlsCertPath(@Nullable String var1);

   @Nullable
   String getTlsKey();

   void setTlsKey(@Nullable String var1);

   @Nullable
   String getTlsKeyPath();

   void setTlsKeyPath(@Nullable String var1);

   @Nullable
   String getUserid();

   void setUserid(@Nullable String var1);

   @Nullable
   String getUsername();

   void setUsername(@Nullable String var1);

   void addAvailableAlgorithm(@Nullable String var1);

   void clearAvailableAlgorithms();

   @NonNull
   AuthInfo clone();

   boolean isEqualButAlgorithms(@Nullable AuthInfo var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

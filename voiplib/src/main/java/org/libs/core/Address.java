package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Address {
   @Nullable
   String getDisplayName();

   int setDisplayName(@Nullable String var1);

   @Nullable
   String getDomain();

   int setDomain(@Nullable String var1);

   boolean isSip();

   @Nullable
   boolean isValid();

   @Nullable
   String getMethodParam();

   void setMethodParam(@Nullable String var1);

   @Nullable
   String getPassword();

   void setPassword(@Nullable String var1);

   int getPort();

   int setPort(int var1);

   @Nullable
   String getScheme();

   boolean getSecure();

   void setSecure(boolean var1);

   TransportType getTransport();

   int setTransport(TransportType var1);

   void setUriParams(String var1);

   @Nullable
   String getUsername();

   int setUsername(@Nullable String var1);

   @NonNull
   String asString();

   @NonNull
   String asStringUriOnly();

   void clean();

   @NonNull
   Address clone();

   boolean equal(@NonNull Address var1);

   @Nullable
   String getHeader(@NonNull String var1);

   @Nullable
   String getParam(@NonNull String var1);

   @Nullable
   String getUriParam(@NonNull String var1);

   boolean hasParam(@NonNull String var1);

   boolean hasUriParam(@NonNull String var1);

   void removeUriParam(@NonNull String var1);

   void setHeader(@NonNull String var1, @Nullable String var2);

   void setParam(@NonNull String var1, @Nullable String var2);

   void setUriParam(@NonNull String var1, @Nullable String var2);

   boolean weakEqual(@NonNull Address var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

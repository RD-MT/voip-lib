package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface InfoMessage {
   @Nullable
   Content getContent();

   void setContent(@Nullable Content var1);

   void addHeader(@NonNull String var1, @Nullable String var2);

   @Nullable
   String getHeader(@NonNull String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

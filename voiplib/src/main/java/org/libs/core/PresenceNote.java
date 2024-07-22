package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PresenceNote {
   @NonNull
   String getContent();

   int setContent(@NonNull String var1);

   @Nullable
   String getLang();

   int setLang(@Nullable String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

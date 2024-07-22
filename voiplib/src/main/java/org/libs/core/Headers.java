package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Headers {
   void add(@NonNull String var1, @Nullable String var2);

   @Nullable
   String getValue(String var1);

   void remove(@NonNull String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface VideoDefinition {
   int getHeight();

   void setHeight(int var1);

   boolean isUndefined();

   @Nullable
   String getName();

   void setName(@Nullable String var1);

   int getWidth();

   void setWidth(int var1);

   @NonNull
   VideoDefinition clone();

   boolean equals(@NonNull VideoDefinition var1);

   void setDefinition(int var1, int var2);

   boolean strictEquals(@NonNull VideoDefinition var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

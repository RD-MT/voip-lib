package org.libs.core;

import androidx.annotation.NonNull;

public interface Buffer {
   @NonNull
   byte[] getContent();

   boolean isEmpty();

   int getSize();

   void setSize(int var1);

   @NonNull
   String getStringContent();

   void setStringContent(@NonNull String var1);

   void setContent(@NonNull byte[] var1, int var2);

   @NonNull
   Buffer newFromData(@NonNull byte[] var1, int var2);

   @NonNull
   Buffer newFromString(@NonNull String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface FriendPhoneNumber {
   @Nullable
   String getLabel();

   void setLabel(@Nullable String var1);

   @NonNull
   String getPhoneNumber();

   void setPhoneNumber(@NonNull String var1);

   @NonNull
   FriendPhoneNumber clone();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

package org.linphone.core;

import androidx.annotation.Nullable;

public interface SearchResult {
   @Nullable
   Address getAddress();

   int getCapabilities();

   @Nullable
   Friend getFriend();

   @Nullable
   String getPhoneNumber();

   int getSourceFlags();

   int getWeight();

   boolean hasCapability(FriendCapability var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

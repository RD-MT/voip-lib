package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface FriendList {
   @NonNull
   Core getCore();

   @Nullable
   String getDisplayName();

   void setDisplayName(@Nullable String var1);

   @NonNull
   Friend[] getFriends();

   boolean isSubscriptionBodyless();

   @Nullable
   Address getRlsAddress();

   void setRlsAddress(@Nullable Address var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getRlsUri();

   /** @deprecated */
   @Deprecated
   void setRlsUri(@Nullable String var1);

   void setSubscriptionBodyless(boolean var1);

   boolean isSubscriptionsEnabled();

   void setSubscriptionsEnabled(boolean var1);

   FriendListType getType();

   void setType(FriendListType var1);

   @Nullable
   String getUri();

   void setUri(@Nullable String var1);

   FriendList.Status addFriend(@NonNull Friend var1);

   FriendList.Status addLocalFriend(@NonNull Friend var1);

   void exportFriendsAsVcard4File(@NonNull String var1);

   @Nullable
   Friend findFriendByAddress(@NonNull Address var1);

   @Nullable
   Friend findFriendByPhoneNumber(@NonNull String var1);

   @Nullable
   Friend findFriendByRefKey(@NonNull String var1);

   @Nullable
   Friend findFriendByUri(@NonNull String var1);

   @NonNull
   Friend[] findFriendsByAddress(@NonNull Address var1);

   @NonNull
   Friend[] findFriendsByUri(@NonNull String var1);

   int importFriendsFromVcard4Buffer(@NonNull String var1);

   int importFriendsFromVcard4File(@NonNull String var1);

   void notifyPresence(@NonNull PresenceModel var1);

   FriendList.Status removeFriend(@NonNull Friend var1);

   void synchronizeFriendsFromServer();

   void updateDirtyFriends();

   void updateRevision(int var1);

   void updateSubscriptions();

   void addListener(FriendListListener var1);

   void removeListener(FriendListListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum Status {
      OK(0),
      NonExistentFriend(1),
      InvalidFriend(2);

      protected final int mValue;

      private Status(int value) {
         this.mValue = value;
      }

      public static FriendList.Status fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return OK;
         case 1:
            return NonExistentFriend;
         case 2:
            return InvalidFriend;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Status");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum SyncStatus {
      Started(0),
      Successful(1),
      Failure(2);

      protected final int mValue;

      private SyncStatus(int value) {
         this.mValue = value;
      }

      public static FriendList.SyncStatus fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Started;
         case 1:
            return Successful;
         case 2:
            return Failure;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for SyncStatus");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

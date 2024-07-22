package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FriendListListenerStub implements FriendListListener {
   public void onSyncStatusChanged(@NonNull FriendList friendList, FriendList.SyncStatus status, @Nullable String message) {
   }

   public void onContactUpdated(@NonNull FriendList friendList, @NonNull Friend newFriend, @NonNull Friend oldFriend) {
   }

   public void onContactDeleted(@NonNull FriendList friendList, @NonNull Friend linphoneFriend) {
   }

   public void onContactCreated(@NonNull FriendList friendList, @NonNull Friend linphoneFriend) {
   }

   public void onPresenceReceived(@NonNull FriendList friendList, @NonNull Friend[] friends) {
   }
}

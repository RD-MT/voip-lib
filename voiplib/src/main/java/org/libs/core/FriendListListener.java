package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface FriendListListener {
   void onSyncStatusChanged(@NonNull FriendList var1, FriendList.SyncStatus var2, @Nullable String var3);

   void onContactUpdated(@NonNull FriendList var1, @NonNull Friend var2, @NonNull Friend var3);

   void onContactDeleted(@NonNull FriendList var1, @NonNull Friend var2);

   void onContactCreated(@NonNull FriendList var1, @NonNull Friend var2);

   void onPresenceReceived(@NonNull FriendList var1, @NonNull Friend[] var2);
}

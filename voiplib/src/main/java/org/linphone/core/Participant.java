package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Participant {
   @NonNull
   Address getAddress();

   long getCreationTime();

   @NonNull
   ParticipantDevice[] getDevices();

   boolean isAdmin();

   boolean isFocus();

   ChatRoomSecurityLevel getSecurityLevel();

   @Nullable
   ParticipantDevice findDevice(@NonNull Address var1);

   @Nullable
   ParticipantDevice findDevice(@NonNull Call var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

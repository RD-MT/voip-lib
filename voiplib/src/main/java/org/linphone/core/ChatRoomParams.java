package org.linphone.core;

import androidx.annotation.Nullable;

public interface ChatRoomParams {
   ChatRoomBackend getBackend();

   void setBackend(ChatRoomBackend var1);

   ChatRoomEncryptionBackend getEncryptionBackend();

   void setEncryptionBackend(ChatRoomEncryptionBackend var1);

   boolean isEncryptionEnabled();

   void setEncryptionEnabled(boolean var1);

   long getEphemeralLifetime();

   void setEphemeralLifetime(long var1);

   ChatRoomEphemeralMode getEphemeralMode();

   void setEphemeralMode(ChatRoomEphemeralMode var1);

   boolean isGroupEnabled();

   void setGroupEnabled(boolean var1);

   boolean isValid();

   boolean isRttEnabled();

   void setRttEnabled(boolean var1);

   @Nullable
   String getSubject();

   void setSubject(@Nullable String var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

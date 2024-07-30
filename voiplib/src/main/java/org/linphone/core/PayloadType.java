package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PayloadType {
   int getChannels();

   int getClockRate();

   @NonNull
   String getDescription();

   @Nullable
   String getEncoderDescription();

   boolean isUsable();

   boolean isVbr();

   @NonNull
   String getMimeType();

   int getNormalBitrate();

   void setNormalBitrate(int var1);

   int getNumber();

   void setNumber(int var1);

   @Nullable
   String getRecvFmtp();

   void setRecvFmtp(@Nullable String var1);

   @Nullable
   String getSendFmtp();

   void setSendFmtp(@Nullable String var1);

   int getType();

   @NonNull
   PayloadType clone();

   int enable(boolean var1);

   boolean enabled();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

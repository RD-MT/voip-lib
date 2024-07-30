package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CallLog {
   @Nullable
   String getCallId();

   @Nullable
   ConferenceInfo getConferenceInfo();

   Call.Dir getDir();

   int getDuration();

   @Nullable
   ErrorInfo getErrorInfo();

   @NonNull
   Address getFromAddress();

   @NonNull
   Address getLocalAddress();

   float getQuality();

   @Nullable
   String getRefKey();

   void setRefKey(@Nullable String var1);

   @NonNull
   Address getRemoteAddress();

   void setRemoteAddress(@NonNull Address var1);

   long getStartDate();

   Call.Status getStatus();

   @NonNull
   Address getToAddress();

   boolean isVideoEnabled();

   @NonNull
   String toStr();

   boolean wasConference();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

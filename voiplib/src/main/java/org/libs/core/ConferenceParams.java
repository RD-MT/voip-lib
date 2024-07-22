package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ConferenceParams {
   @Nullable
   Account getAccount();

   boolean isAudioEnabled();

   void setAudioEnabled(boolean var1);

   boolean isChatEnabled();

   void setChatEnabled(boolean var1);

   @Nullable
   Address getConferenceFactoryAddress();

   void setConferenceFactoryAddress(@Nullable Address var1);

   @Nullable
   String getDescription();

   void setDescription(@Nullable String var1);

   long getEndTime();

   void setEndTime(long var1);

   boolean isLocalParticipantEnabled();

   void setLocalParticipantEnabled(boolean var1);

   boolean isOneParticipantConferenceEnabled();

   void setOneParticipantConferenceEnabled(boolean var1);

   ConferenceParticipantListType getParticipantListType();

   void setParticipantListType(ConferenceParticipantListType var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ProxyConfig getProxyCfg();

   long getStartTime();

   void setStartTime(long var1);

   @Nullable
   String getSubject();

   void setSubject(@Nullable String var1);

   boolean isVideoEnabled();

   void setVideoEnabled(boolean var1);

   @NonNull
   ConferenceParams clone();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

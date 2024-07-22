package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ParticipantDevice {
   @NonNull
   Address getAddress();

   ParticipantDeviceDisconnectionMethod getDisconnectionMethod();

   @Nullable
   String getDisconnectionReason();

   boolean isInConference();

   boolean getIsMuted();

   boolean getIsSpeaking();

   ParticipantDeviceJoiningMethod getJoiningMethod();

   @Nullable
   String getName();

   @Nullable
   Object getNativeVideoWindowId();

   void setNativeVideoWindowId(@Nullable Object var1);

   ChatRoomSecurityLevel getSecurityLevel();

   ParticipantDeviceState getState();

   long getTimeOfDisconnection();

   long getTimeOfJoining();

   @Nullable
   Object createNativeVideoWindowId();

   int getSsrc(StreamType var1);

   boolean getStreamAvailability(StreamType var1);

   MediaDirection getStreamCapability(StreamType var1);

   void addListener(ParticipantDeviceListener var1);

   void removeListener(ParticipantDeviceListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

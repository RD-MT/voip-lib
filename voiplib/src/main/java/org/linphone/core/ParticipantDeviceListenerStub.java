package org.linphone.core;

import androidx.annotation.NonNull;

public class ParticipantDeviceListenerStub implements ParticipantDeviceListener {
   public void onStreamAvailabilityChanged(@NonNull ParticipantDevice participantDevice, boolean available, StreamType streamType) {
   }

   public void onStreamCapabilityChanged(@NonNull ParticipantDevice participantDevice, MediaDirection direction, StreamType streamType) {
   }

   public void onIsSpeakingChanged(@NonNull ParticipantDevice participantDevice, boolean isSpeaking) {
   }

   public void onVideoDisplayErrorOccurred(@NonNull ParticipantDevice participantDevice, int errorCode) {
   }

   public void onIsMuted(@NonNull ParticipantDevice participantDevice, boolean isMuted) {
   }

   public void onStateChanged(@NonNull ParticipantDevice participantDevice, ParticipantDeviceState state) {
   }
}

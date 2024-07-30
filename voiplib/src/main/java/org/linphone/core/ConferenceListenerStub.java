package org.linphone.core;

import androidx.annotation.NonNull;

public class ConferenceListenerStub implements ConferenceListener {
   public void onParticipantAdminStatusChanged(@NonNull Conference conference, @NonNull Participant participant) {
   }

   public void onParticipantDeviceAdded(@NonNull Conference conference, @NonNull ParticipantDevice participantDevice) {
   }

   public void onParticipantDeviceIsSpeakingChanged(@NonNull Conference conference, @NonNull ParticipantDevice participantDevice, boolean isSpeaking) {
   }

   public void onActiveSpeakerParticipantDevice(@NonNull Conference conference, @NonNull ParticipantDevice participantDevice) {
   }

   public void onSubjectChanged(@NonNull Conference conference, @NonNull String subject) {
   }

   public void onAvailableMediaChanged(@NonNull Conference conference) {
   }

   public void onParticipantAdded(@NonNull Conference conference, @NonNull Participant participant) {
   }

   public void onAudioDeviceChanged(@NonNull Conference conference, @NonNull AudioDevice audioDevice) {
   }

   public void onParticipantRemoved(@NonNull Conference conference, @NonNull Participant participant) {
   }

   public void onParticipantDeviceRemoved(@NonNull Conference conference, @NonNull ParticipantDevice participantDevice) {
   }

   public void onParticipantDeviceStateChanged(@NonNull Conference conference, @NonNull ParticipantDevice device, ParticipantDeviceState state) {
   }

   public void onParticipantDeviceMediaAvailabilityChanged(@NonNull Conference conference, @NonNull ParticipantDevice device) {
   }

   public void onParticipantDeviceIsMuted(@NonNull Conference conference, @NonNull ParticipantDevice participantDevice, boolean isMuted) {
   }

   public void onStateChanged(@NonNull Conference conference, Conference.State newState) {
   }

   public void onParticipantDeviceMediaCapabilityChanged(@NonNull Conference conference, @NonNull ParticipantDevice device) {
   }
}

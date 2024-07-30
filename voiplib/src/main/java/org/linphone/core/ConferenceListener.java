package org.linphone.core;

import androidx.annotation.NonNull;

public interface ConferenceListener {
   void onParticipantAdminStatusChanged(@NonNull Conference var1, @NonNull Participant var2);

   void onParticipantDeviceAdded(@NonNull Conference var1, @NonNull ParticipantDevice var2);

   void onParticipantDeviceIsSpeakingChanged(@NonNull Conference var1, @NonNull ParticipantDevice var2, boolean var3);

   void onActiveSpeakerParticipantDevice(@NonNull Conference var1, @NonNull ParticipantDevice var2);

   void onSubjectChanged(@NonNull Conference var1, @NonNull String var2);

   void onAvailableMediaChanged(@NonNull Conference var1);

   void onParticipantAdded(@NonNull Conference var1, @NonNull Participant var2);

   void onAudioDeviceChanged(@NonNull Conference var1, @NonNull AudioDevice var2);

   void onParticipantRemoved(@NonNull Conference var1, @NonNull Participant var2);

   void onParticipantDeviceRemoved(@NonNull Conference var1, @NonNull ParticipantDevice var2);

   void onParticipantDeviceStateChanged(@NonNull Conference var1, @NonNull ParticipantDevice var2, ParticipantDeviceState var3);

   void onParticipantDeviceMediaAvailabilityChanged(@NonNull Conference var1, @NonNull ParticipantDevice var2);

   void onParticipantDeviceIsMuted(@NonNull Conference var1, @NonNull ParticipantDevice var2, boolean var3);

   void onStateChanged(@NonNull Conference var1, Conference.State var2);

   void onParticipantDeviceMediaCapabilityChanged(@NonNull Conference var1, @NonNull ParticipantDevice var2);
}

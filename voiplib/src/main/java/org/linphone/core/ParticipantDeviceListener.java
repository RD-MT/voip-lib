package org.linphone.core;

import androidx.annotation.NonNull;

public interface ParticipantDeviceListener {
   void onStreamAvailabilityChanged(@NonNull ParticipantDevice var1, boolean var2, StreamType var3);

   void onStreamCapabilityChanged(@NonNull ParticipantDevice var1, MediaDirection var2, StreamType var3);

   void onIsSpeakingChanged(@NonNull ParticipantDevice var1, boolean var2);

   void onVideoDisplayErrorOccurred(@NonNull ParticipantDevice var1, int var2);

   void onIsMuted(@NonNull ParticipantDevice var1, boolean var2);

   void onStateChanged(@NonNull ParticipantDevice var1, ParticipantDeviceState var2);
}

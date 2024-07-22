package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ConferenceSchedulerListenerStub implements ConferenceSchedulerListener {
   public void onInvitationsSent(@NonNull ConferenceScheduler conferenceScheduler, @Nullable Address[] failedInvitations) {
   }

   public void onStateChanged(@NonNull ConferenceScheduler conferenceScheduler, ConferenceScheduler.State state) {
   }
}

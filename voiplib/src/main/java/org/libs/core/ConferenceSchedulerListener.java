package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ConferenceSchedulerListener {
   void onInvitationsSent(@NonNull ConferenceScheduler var1, @Nullable Address[] var2);

   void onStateChanged(@NonNull ConferenceScheduler var1, ConferenceScheduler.State var2);
}

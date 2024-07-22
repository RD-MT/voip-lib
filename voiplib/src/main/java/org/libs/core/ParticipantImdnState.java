package org.libs.core;

import androidx.annotation.NonNull;

public interface ParticipantImdnState {
   @NonNull
   Participant getParticipant();

   ChatMessage.State getState();

   long getStateChangeTime();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

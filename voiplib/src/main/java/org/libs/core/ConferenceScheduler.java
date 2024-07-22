package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ConferenceScheduler {
   @Nullable
   Account getAccount();

   void setAccount(@Nullable Account var1);

   @NonNull
   Core getCore();

   @Nullable
   ConferenceInfo getInfo();

   void setInfo(@Nullable ConferenceInfo var1);

   void cancelConference(@Nullable ConferenceInfo var1);

   void sendInvitations(@NonNull ChatRoomParams var1);

   void addListener(ConferenceSchedulerListener var1);

   void removeListener(ConferenceSchedulerListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      Idle(0),
      Error(1),
      AllocationPending(2),
      Ready(3),
      Updating(4);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static ConferenceScheduler.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Idle;
         case 1:
            return Error;
         case 2:
            return AllocationPending;
         case 3:
            return Ready;
         case 4:
            return Updating;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

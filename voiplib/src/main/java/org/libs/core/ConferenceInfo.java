package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ConferenceInfo {
   long getDateTime();

   void setDateTime(long var1);

   @Nullable
   String getDescription();

   void setDescription(@Nullable String var1);

   int getDuration();

   void setDuration(int var1);

   @Nullable
   String getIcalendarString();

   @Nullable
   Address getOrganizer();

   void setOrganizer(@Nullable Address var1);

   @NonNull
   Address[] getParticipants();

   void setParticipants(@Nullable Address[] var1);

   @Nullable
   ConferenceInfo.State getState();

   @Nullable
   String getSubject();

   void setSubject(@Nullable String var1);

   @Nullable
   Address getUri();

   void addParticipant(@NonNull Address var1);

   @NonNull
   ConferenceInfo clone();

   void removeParticipant(@NonNull Address var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      New(0),
      Updated(1),
      Cancelled(2);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static ConferenceInfo.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return New;
         case 1:
            return Updated;
         case 2:
            return Cancelled;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface PresenceActivity {
   @Nullable
   String getDescription();

   int setDescription(@Nullable String var1);

   PresenceActivity.Type getType();

   int setType(PresenceActivity.Type var1);

   @NonNull
   String toString();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   public static enum Type {
      Appointment(0),
      Away(1),
      Breakfast(2),
      Busy(3),
      Dinner(4),
      Holiday(5),
      InTransit(6),
      LookingForWork(7),
      Lunch(8),
      Meal(9),
      Meeting(10),
      OnThePhone(11),
      Other(12),
      Performance(13),
      PermanentAbsence(14),
      Playing(15),
      Presentation(16),
      Shopping(17),
      Sleeping(18),
      Spectator(19),
      Steering(20),
      Travel(21),
      TV(22),
      Unknown(23),
      Vacation(24),
      Working(25),
      Worship(26);

      protected final int mValue;

      private Type(int value) {
         this.mValue = value;
      }

      public static PresenceActivity.Type fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Appointment;
         case 1:
            return Away;
         case 2:
            return Breakfast;
         case 3:
            return Busy;
         case 4:
            return Dinner;
         case 5:
            return Holiday;
         case 6:
            return InTransit;
         case 7:
            return LookingForWork;
         case 8:
            return Lunch;
         case 9:
            return Meal;
         case 10:
            return Meeting;
         case 11:
            return OnThePhone;
         case 12:
            return Other;
         case 13:
            return Performance;
         case 14:
            return PermanentAbsence;
         case 15:
            return Playing;
         case 16:
            return Presentation;
         case 17:
            return Shopping;
         case 18:
            return Sleeping;
         case 19:
            return Spectator;
         case 20:
            return Steering;
         case 21:
            return Travel;
         case 22:
            return TV;
         case 23:
            return Unknown;
         case 24:
            return Vacation;
         case 25:
            return Working;
         case 26:
            return Worship;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Type");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

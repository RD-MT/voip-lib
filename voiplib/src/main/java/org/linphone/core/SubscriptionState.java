package org.linphone.core;

public enum SubscriptionState {
   None(0),
   OutgoingProgress(1),
   IncomingReceived(2),
   Pending(3),
   Active(4),
   Terminated(5),
   Error(6),
   Expiring(7);

   protected final int mValue;

   private SubscriptionState(int value) {
      this.mValue = value;
   }

   public static SubscriptionState fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return None;
      case 1:
         return OutgoingProgress;
      case 2:
         return IncomingReceived;
      case 3:
         return Pending;
      case 4:
         return Active;
      case 5:
         return Terminated;
      case 6:
         return Error;
      case 7:
         return Expiring;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SubscriptionState");
      }
   }

   protected static SubscriptionState[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SubscriptionState[] enumArray = new SubscriptionState[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SubscriptionState[] values) throws RuntimeException {
      int arraySize = values.length;
      int[] intArray = new int[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         intArray[i] = values[i].toInt();
      }

      return intArray;
   }

   public int toInt() {
      return this.mValue;
   }
}

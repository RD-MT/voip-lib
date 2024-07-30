package org.linphone.core;

public enum SubscriptionDir {
   Incoming(0),
   Outgoing(1),
   InvalidDir(2);

   protected final int mValue;

   private SubscriptionDir(int value) {
      this.mValue = value;
   }

   public static SubscriptionDir fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Incoming;
      case 1:
         return Outgoing;
      case 2:
         return InvalidDir;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SubscriptionDir");
      }
   }

   protected static SubscriptionDir[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SubscriptionDir[] enumArray = new SubscriptionDir[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SubscriptionDir[] values) throws RuntimeException {
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

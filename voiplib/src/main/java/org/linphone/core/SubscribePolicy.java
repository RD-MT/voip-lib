package org.linphone.core;

public enum SubscribePolicy {
   SPWait(0),
   SPDeny(1),
   SPAccept(2);

   protected final int mValue;

   private SubscribePolicy(int value) {
      this.mValue = value;
   }

   public static SubscribePolicy fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return SPWait;
      case 1:
         return SPDeny;
      case 2:
         return SPAccept;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for SubscribePolicy");
      }
   }

   protected static SubscribePolicy[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      SubscribePolicy[] enumArray = new SubscribePolicy[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(SubscribePolicy[] values) throws RuntimeException {
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

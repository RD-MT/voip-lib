package org.linphone.core;

public enum MediaResourceMode {
   ExclusiveMediaResources(0),
   SharedMediaResources(1);

   protected final int mValue;

   private MediaResourceMode(int value) {
      this.mValue = value;
   }

   public static MediaResourceMode fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return ExclusiveMediaResources;
      case 1:
         return SharedMediaResources;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for MediaResourceMode");
      }
   }

   protected static MediaResourceMode[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      MediaResourceMode[] enumArray = new MediaResourceMode[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(MediaResourceMode[] values) throws RuntimeException {
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

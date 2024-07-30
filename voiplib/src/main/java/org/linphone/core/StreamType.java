package org.linphone.core;

public enum StreamType {
   Audio(0),
   Video(1),
   Text(2),
   Unknown(3);

   protected final int mValue;

   private StreamType(int value) {
      this.mValue = value;
   }

   public static StreamType fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Audio;
      case 1:
         return Video;
      case 2:
         return Text;
      case 3:
         return Unknown;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for StreamType");
      }
   }

   protected static StreamType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      StreamType[] enumArray = new StreamType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(StreamType[] values) throws RuntimeException {
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

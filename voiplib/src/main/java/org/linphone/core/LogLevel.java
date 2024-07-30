package org.linphone.core;

public enum LogLevel {
   Debug(1),
   Trace(2),
   Message(4),
   Warning(8),
   Error(16),
   Fatal(32);

   protected final int mValue;

   private LogLevel(int value) {
      this.mValue = value;
   }

   public static LogLevel fromInt(int value) throws RuntimeException {
      switch(value) {
      case 1:
         return Debug;
      case 2:
         return Trace;
      case 4:
         return Message;
      case 8:
         return Warning;
      case 16:
         return Error;
      case 32:
         return Fatal;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for LogLevel");
      }
   }

   protected static LogLevel[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      LogLevel[] enumArray = new LogLevel[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(LogLevel[] values) throws RuntimeException {
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

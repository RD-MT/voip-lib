package org.linphone.core;

public enum ConferenceParticipantListType {
   Closed(0),
   Open(1);

   protected final int mValue;

   private ConferenceParticipantListType(int value) {
      this.mValue = value;
   }

   public static ConferenceParticipantListType fromInt(int value) throws RuntimeException {
      switch(value) {
      case 0:
         return Closed;
      case 1:
         return Open;
      default:
         throw new RuntimeException("Unhandled enum value " + value + " for ConferenceParticipantListType");
      }
   }

   protected static ConferenceParticipantListType[] fromIntArray(int[] values) throws RuntimeException {
      int arraySize = values.length;
      ConferenceParticipantListType[] enumArray = new ConferenceParticipantListType[arraySize];

      for(int i = 0; i < arraySize; ++i) {
         enumArray[i] = fromInt(values[i]);
      }

      return enumArray;
   }

   protected static int[] toIntArray(ConferenceParticipantListType[] values) throws RuntimeException {
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

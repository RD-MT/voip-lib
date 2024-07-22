package org.libs.core;

import androidx.annotation.NonNull;

public interface AudioDevice {
   AudioDevice.Capabilities getCapabilities();

   @NonNull
   String getDeviceName();

   @NonNull
   String getDriverName();

   @NonNull
   String getId();

   AudioDevice.Type getType();

   boolean hasCapability(AudioDevice.Capabilities var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum Type {
      Unknown(0),
      Microphone(1),
      Earpiece(2),
      Speaker(3),
      Bluetooth(4),
      BluetoothA2DP(5),
      Telephony(6),
      AuxLine(7),
      GenericUsb(8),
      Headset(9),
      Headphones(10),
      HearingAid(11);

      protected final int mValue;

      private Type(int value) {
         this.mValue = value;
      }

      public static AudioDevice.Type fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Unknown;
         case 1:
            return Microphone;
         case 2:
            return Earpiece;
         case 3:
            return Speaker;
         case 4:
            return Bluetooth;
         case 5:
            return BluetoothA2DP;
         case 6:
            return Telephony;
         case 7:
            return AuxLine;
         case 8:
            return GenericUsb;
         case 9:
            return Headset;
         case 10:
            return Headphones;
         case 11:
            return HearingAid;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Type");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum Capabilities {
      CapabilityRecord(1),
      CapabilityPlay(2),
      CapabilityAll(3);

      protected final int mValue;

      private Capabilities(int value) {
         this.mValue = value;
      }

      public static AudioDevice.Capabilities fromInt(int value) throws RuntimeException {
         switch(value) {
         case 1:
            return CapabilityRecord;
         case 2:
            return CapabilityPlay;
         case 3:
            return CapabilityAll;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Capabilities");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

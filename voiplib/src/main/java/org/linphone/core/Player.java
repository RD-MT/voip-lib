package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Player {
   @NonNull
   Core getCore();

   int getCurrentPosition();

   int getDuration();

   boolean getIsVideoAvailable();

   Player.State getState();

   float getVolumeGain();

   void setVolumeGain(float var1);

   void setWindowId(@Nullable Object var1);

   void close();

   @Nullable
   Object createWindowId();

   int open(@NonNull String var1);

   int pause();

   int seek(int var1);

   int start();

   void addListener(PlayerListener var1);

   void removeListener(PlayerListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      Closed(0),
      Paused(1),
      Playing(2);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static Player.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Closed;
         case 1:
            return Paused;
         case 2:
            return Playing;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

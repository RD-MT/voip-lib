package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Conference {
   @Nullable
   ParticipantDevice getActiveSpeakerParticipantDevice();

   @Nullable
   Call getCall();

   @NonNull
   Address getConferenceAddress();

   void setConferenceAddress(@NonNull Address var1);

   @NonNull
   Core getCore();

   @NonNull
   ConferenceParams getCurrentParams();

   @Nullable
   int getDuration();

   /** @deprecated */
   @Deprecated
   @NonNull
   String getId();

   /** @deprecated */
   @Deprecated
   void setId(@NonNull String var1);

   @Nullable
   AudioDevice getInputAudioDevice();

   void setInputAudioDevice(@Nullable AudioDevice var1);

   boolean isIn();

   boolean isRecording();

   @NonNull
   Participant getMe();

   @Nullable
   AudioDevice getOutputAudioDevice();

   void setOutputAudioDevice(@Nullable AudioDevice var1);

   int getParticipantCount();

   @NonNull
   ParticipantDevice[] getParticipantDeviceList();

   @NonNull
   Participant[] getParticipantList();

   /** @deprecated */
   @Deprecated
   @NonNull
   Address[] getParticipants();

   @Nullable
   long getStartTime();

   Conference.State getState();

   @Nullable
   String getSubject();

   void setSubject(@Nullable String var1);

   @Nullable
   String getUsername();

   void setUsername(@Nullable String var1);

   int addParticipant(@NonNull Address var1);

   int addParticipant(@NonNull Call var1);

   int addParticipants(@NonNull Address[] var1);

   int addParticipants(@NonNull Call[] var1);

   int enter();

   @Nullable
   Participant findParticipant(@NonNull Address var1);

   int getParticipantDeviceVolume(@NonNull ParticipantDevice var1);

   int inviteParticipants(@NonNull Address[] var1, @Nullable CallParams var2);

   boolean isMe(@NonNull Address var1);

   int leave();

   int removeParticipant(@NonNull Participant var1);

   /** @deprecated */
   @Deprecated
   int removeParticipant(@NonNull Call var1);

   /** @deprecated */
   @Deprecated
   int removeParticipant(@NonNull Address var1);

   void setLocalParticipantStreamCapability(MediaDirection var1, StreamType var2);

   void setParticipantAdminStatus(@NonNull Participant var1, boolean var2);

   int startRecording(@NonNull String var1);

   int stopRecording();

   int terminate();

   int updateParams(@NonNull ConferenceParams var1);

   void addListener(ConferenceListener var1);

   void removeListener(ConferenceListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      None(0),
      Instantiated(1),
      CreationPending(2),
      Created(3),
      CreationFailed(4),
      TerminationPending(5),
      Terminated(6),
      TerminationFailed(7),
      Deleted(8);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static Conference.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return None;
         case 1:
            return Instantiated;
         case 2:
            return CreationPending;
         case 3:
            return Created;
         case 4:
            return CreationFailed;
         case 5:
            return TerminationPending;
         case 6:
            return Terminated;
         case 7:
            return TerminationFailed;
         case 8:
            return Deleted;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

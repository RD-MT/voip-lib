package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Call {
   @Nullable
   CallStats getAudioStats();

   @Nullable
   String getAuthenticationToken();

   boolean getAuthenticationTokenVerified();

   void setAuthenticationTokenVerified(boolean var1);

   float getAverageQuality();

   @NonNull
   CallLog getCallLog();

   boolean isCameraEnabled();

   void setCameraEnabled(boolean var1);

   @Nullable
   ChatRoom getChatRoom();

   @Nullable
   Conference getConference();

   @NonNull
   Core getCore();

   @NonNull
   CallParams getCurrentParams();

   float getCurrentQuality();

   Call.Dir getDir();

   @Nullable
   Address getDiversionAddress();

   int getDuration();

   boolean isEchoCancellationEnabled();

   void setEchoCancellationEnabled(boolean var1);

   boolean isEchoLimiterEnabled();

   void setEchoLimiterEnabled(boolean var1);

   @NonNull
   ErrorInfo getErrorInfo();

   @Nullable
   AudioDevice getInputAudioDevice();

   void setInputAudioDevice(@Nullable AudioDevice var1);

   /** @deprecated */
   @Deprecated
   boolean isRecording();

   boolean getMicrophoneMuted();

   void setMicrophoneMuted(boolean var1);

   float getMicrophoneVolumeGain();

   void setMicrophoneVolumeGain(float var1);

   @Nullable
   Object getNativeVideoWindowId();

   void setNativeVideoWindowId(@Nullable Object var1);

   @Nullable
   AudioDevice getOutputAudioDevice();

   void setOutputAudioDevice(@Nullable AudioDevice var1);

   @NonNull
   CallParams getParams();

   void setParams(@NonNull CallParams var1);

   float getPlayVolume();

   @NonNull
   Player getPlayer();

   Reason getReason();

   float getRecordVolume();

   @Nullable
   String getReferTo();

   @NonNull
   Address getRemoteAddress();

   /** @deprecated */
   @Deprecated
   @Nullable
   String getRemoteAddressAsString();

   @Nullable
   String getRemoteContact();

   @Nullable
   CallParams getRemoteParams();

   @Nullable
   String getRemoteUserAgent();

   @Nullable
   Call getReplacedCall();

   @NonNull
   Address getRequestAddress();

   boolean getSpeakerMuted();

   void setSpeakerMuted(boolean var1);

   float getSpeakerVolumeGain();

   void setSpeakerVolumeGain(float var1);

   Call.State getState();

   int getStreamCount();

   @Nullable
   CallStats getTextStats();

   @NonNull
   Address getToAddress();

   Call.State getTransferState();

   @Nullable
   Call getTransferTargetCall();

   @Nullable
   Call getTransfererCall();

   @Nullable
   VideoSourceDescriptor getVideoSource();

   void setVideoSource(@Nullable VideoSourceDescriptor var1);

   @Nullable
   CallStats getVideoStats();

   int accept();

   int acceptEarlyMedia();

   int acceptEarlyMediaWithParams(@Nullable CallParams var1);

   int acceptUpdate(@Nullable CallParams var1);

   int acceptWithParams(@Nullable CallParams var1);

   boolean askedToAutoanswer();

   void cancelDtmfs();

   void confirmGoClear();

   @Nullable
   Object createNativeVideoWindowId();

   int decline(Reason var1);

   int declineWithErrorInfo(@Nullable ErrorInfo var1);

   int deferUpdate();

   @Nullable
   CallStats getStats(StreamType var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   String getToHeader(@NonNull String var1);

   boolean hasTransferPending();

   boolean mediaInProgress();

   void notifyRinging();

   void oglRender();

   int pause();

   /** @deprecated */
   @Deprecated
   int redirect(@NonNull String var1);

   int redirectTo(@NonNull Address var1);

   void requestNotifyNextVideoFrameDecoded();

   int resume();

   int sendDtmf(char var1);

   int sendDtmfs(@NonNull String var1);

   int sendInfoMessage(@NonNull InfoMessage var1);

   void sendVfuRequest();

   void startRecording();

   void stopRecording();

   int takePreviewSnapshot(@NonNull String var1);

   int takeVideoSnapshot(@NonNull String var1);

   int terminate();

   int terminateWithErrorInfo(@Nullable ErrorInfo var1);

   /** @deprecated */
   @Deprecated
   int transfer(@NonNull String var1);

   int transferTo(@NonNull Address var1);

   int transferToAnother(@NonNull Call var1);

   int update(@Nullable CallParams var1);

   void zoom(float var1, float var2, float var3);

   void addListener(CallListener var1);

   void removeListener(CallListener var1);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();

   public static enum State {
      Idle(0),
      IncomingReceived(1),
      PushIncomingReceived(2),
      OutgoingInit(3),
      OutgoingProgress(4),
      OutgoingRinging(5),
      OutgoingEarlyMedia(6),
      Connected(7),
      StreamsRunning(8),
      Pausing(9),
      Paused(10),
      Resuming(11),
      Referred(12),
      Error(13),
      End(14),
      PausedByRemote(15),
      UpdatedByRemote(16),
      IncomingEarlyMedia(17),
      Updating(18),
      Released(19),
      EarlyUpdatedByRemote(20),
      EarlyUpdating(21);

      protected final int mValue;

      private State(int value) {
         this.mValue = value;
      }

      public static Call.State fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Idle;
         case 1:
            return IncomingReceived;
         case 2:
            return PushIncomingReceived;
         case 3:
            return OutgoingInit;
         case 4:
            return OutgoingProgress;
         case 5:
            return OutgoingRinging;
         case 6:
            return OutgoingEarlyMedia;
         case 7:
            return Connected;
         case 8:
            return StreamsRunning;
         case 9:
            return Pausing;
         case 10:
            return Paused;
         case 11:
            return Resuming;
         case 12:
            return Referred;
         case 13:
            return Error;
         case 14:
            return End;
         case 15:
            return PausedByRemote;
         case 16:
            return UpdatedByRemote;
         case 17:
            return IncomingEarlyMedia;
         case 18:
            return Updating;
         case 19:
            return Released;
         case 20:
            return EarlyUpdatedByRemote;
         case 21:
            return EarlyUpdating;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for State");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum Dir {
      Outgoing(0),
      Incoming(1);

      protected final int mValue;

      private Dir(int value) {
         this.mValue = value;
      }

      public static Call.Dir fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Outgoing;
         case 1:
            return Incoming;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Dir");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }

   public static enum Status {
      Success(0),
      Aborted(1),
      Missed(2),
      Declined(3),
      EarlyAborted(4),
      AcceptedElsewhere(5),
      DeclinedElsewhere(6);

      protected final int mValue;

      private Status(int value) {
         this.mValue = value;
      }

      public static Call.Status fromInt(int value) throws RuntimeException {
         switch(value) {
         case 0:
            return Success;
         case 1:
            return Aborted;
         case 2:
            return Missed;
         case 3:
            return Declined;
         case 4:
            return EarlyAborted;
         case 5:
            return AcceptedElsewhere;
         case 6:
            return DeclinedElsewhere;
         default:
            throw new RuntimeException("Unhandled enum value " + value + " for Status");
         }
      }

      public int toInt() {
         return this.mValue;
      }
   }
}

package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CallParams {
   @Nullable
   Account getAccount();

   void setAccount(@Nullable Account var1);

   void setAudioBandwidthLimit(int var1);

   MediaDirection getAudioDirection();

   void setAudioDirection(MediaDirection var1);

   boolean isAudioEnabled();

   void setAudioEnabled(boolean var1);

   boolean isAudioMulticastEnabled();

   void setAudioMulticastEnabled(boolean var1);

   boolean isAvpfEnabled();

   void setAvpfEnabled(boolean var1);

   /** @deprecated */
   @Deprecated
   boolean isCapabilityNegotiationReinviteEnabled();

   void setCapabilityNegotiationReinviteEnabled(boolean var1);

   boolean isCapabilityNegotiationsEnabled();

   void setCapabilityNegotiationsEnabled(boolean var1);

   ConferenceLayout getConferenceVideoLayout();

   void setConferenceVideoLayout(ConferenceLayout var1);

   @NonNull
   Content[] getCustomContents();

   boolean isEarlyMediaSendingEnabled();

   void setEarlyMediaSendingEnabled(boolean var1);

   @Nullable
   String getFromHeader();

   void setFromHeader(@Nullable String var1);

   @Nullable
   AudioDevice getInputAudioDevice();

   void setInputAudioDevice(@Nullable AudioDevice var1);

   boolean isRecording();

   boolean getLocalConferenceMode();

   boolean isLowBandwidthEnabled();

   void setLowBandwidthEnabled(boolean var1);

   MediaEncryption getMediaEncryption();

   void setMediaEncryption(MediaEncryption var1);

   boolean isMicEnabled();

   void setMicEnabled(boolean var1);

   @Nullable
   AudioDevice getOutputAudioDevice();

   void setOutputAudioDevice(@Nullable AudioDevice var1);

   int getPrivacy();

   void setPrivacy(int var1);

   /** @deprecated */
   @Deprecated
   @Nullable
   ProxyConfig getProxyConfig();

   /** @deprecated */
   @Deprecated
   void setProxyConfig(@Nullable ProxyConfig var1);

   boolean isRealtimeTextEnabled();

   int setRealtimeTextEnabled(boolean var1);

   int getRealtimeTextKeepaliveInterval();

   void setRealtimeTextKeepaliveInterval(int var1);

   float getReceivedFramerate();

   @Nullable
   VideoDefinition getReceivedVideoDefinition();

   @Nullable
   String getRecordFile();

   void setRecordFile(@Nullable String var1);

   boolean isRtpBundleEnabled();

   /** @deprecated */
   @Deprecated
   void setRtpBundleEnabled(boolean var1);

   @NonNull
   String getRtpProfile();

   float getSentFramerate();

   @Nullable
   VideoDefinition getSentVideoDefinition();

   @Nullable
   String getSessionName();

   void setSessionName(@Nullable String var1);

   @NonNull
   SrtpSuite[] getSrtpSuites();

   void setSrtpSuites(@NonNull SrtpSuite[] var1);

   void setTcapLineMergingEnabled(boolean var1);

   boolean isToneIndicationsEnabled();

   void setToneIndicationsEnabled(boolean var1);

   @Nullable
   PayloadType getUsedAudioPayloadType();

   @Nullable
   PayloadType getUsedTextPayloadType();

   @Nullable
   PayloadType getUsedVideoPayloadType();

   MediaDirection getVideoDirection();

   void setVideoDirection(MediaDirection var1);

   boolean isVideoEnabled();

   void setVideoEnabled(boolean var1);

   boolean isVideoMulticastEnabled();

   void setVideoMulticastEnabled(boolean var1);

   void addCustomContent(@NonNull Content var1);

   void addCustomHeader(@NonNull String var1, @Nullable String var2);

   void addCustomSdpAttribute(@NonNull String var1, @Nullable String var2);

   void addCustomSdpMediaAttribute(StreamType var1, @NonNull String var2, @Nullable String var3);

   void clearCustomSdpAttributes();

   void clearCustomSdpMediaAttributes(StreamType var1);

   @NonNull
   CallParams copy();

   @Nullable
   String getCustomHeader(@NonNull String var1);

   @Nullable
   String getCustomSdpAttribute(@NonNull String var1);

   @Nullable
   String getCustomSdpMediaAttribute(StreamType var1, @NonNull String var2);

   boolean hasCustomSdpAttribute(@NonNull String var1);

   boolean hasCustomSdpMediaAttribute(StreamType var1, @NonNull String var2);

   boolean isMediaEncryptionSupported(MediaEncryption var1);

   boolean tcapLinesMerged();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

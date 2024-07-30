package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class CallParamsImpl implements CallParams {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected CallParamsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Account getAccount(long var1);

   @Nullable
   public synchronized Account getAccount() {
      return this.getAccount(this.nativePtr);
   }

   private native void setAccount(long var1, Account var3);

   public synchronized void setAccount(@Nullable Account account) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAccount() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAccount(this.nativePtr, account);
   }

   private native void setAudioBandwidthLimit(long var1, int var3);

   public synchronized void setAudioBandwidthLimit(int bandwidth) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioBandwidthLimit() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAudioBandwidthLimit(this.nativePtr, bandwidth);
   }

   private native int getAudioDirection(long var1);

   public synchronized MediaDirection getAudioDirection() {
      return MediaDirection.fromInt(this.getAudioDirection(this.nativePtr));
   }

   private native void setAudioDirection(long var1, int var3);

   public synchronized void setAudioDirection(MediaDirection direction) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioDirection() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAudioDirection(this.nativePtr, direction.toInt());
   }

   private native boolean isAudioEnabled(long var1);

   public synchronized boolean isAudioEnabled() {
      return this.isAudioEnabled(this.nativePtr);
   }

   private native void setAudioEnabled(long var1, boolean var3);

   public synchronized void setAudioEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAudioEnabled(this.nativePtr, enabled);
   }

   private native boolean isAudioMulticastEnabled(long var1);

   public synchronized boolean isAudioMulticastEnabled() {
      return this.isAudioMulticastEnabled(this.nativePtr);
   }

   private native void setAudioMulticastEnabled(long var1, boolean var3);

   public synchronized void setAudioMulticastEnabled(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioMulticastEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAudioMulticastEnabled(this.nativePtr, yesno);
   }

   private native boolean isAvpfEnabled(long var1);

   public synchronized boolean isAvpfEnabled() {
      return this.isAvpfEnabled(this.nativePtr);
   }

   private native void setAvpfEnabled(long var1, boolean var3);

   public synchronized void setAvpfEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvpfEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setAvpfEnabled(this.nativePtr, enable);
   }

   private native boolean isCapabilityNegotiationReinviteEnabled(long var1);

   public synchronized boolean isCapabilityNegotiationReinviteEnabled() {
      return this.isCapabilityNegotiationReinviteEnabled(this.nativePtr);
   }

   private native void setCapabilityNegotiationReinviteEnabled(long var1, boolean var3);

   public synchronized void setCapabilityNegotiationReinviteEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCapabilityNegotiationReinviteEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setCapabilityNegotiationReinviteEnabled(this.nativePtr, enable);
   }

   private native boolean isCapabilityNegotiationsEnabled(long var1);

   public synchronized boolean isCapabilityNegotiationsEnabled() {
      return this.isCapabilityNegotiationsEnabled(this.nativePtr);
   }

   private native void setCapabilityNegotiationsEnabled(long var1, boolean var3);

   public synchronized void setCapabilityNegotiationsEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCapabilityNegotiationsEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setCapabilityNegotiationsEnabled(this.nativePtr, enabled);
   }

   private native int getConferenceVideoLayout(long var1);

   public synchronized ConferenceLayout getConferenceVideoLayout() {
      return ConferenceLayout.fromInt(this.getConferenceVideoLayout(this.nativePtr));
   }

   private native void setConferenceVideoLayout(long var1, int var3);

   public synchronized void setConferenceVideoLayout(ConferenceLayout layout) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceVideoLayout() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setConferenceVideoLayout(this.nativePtr, layout.toInt());
   }

   private native Content[] getCustomContents(long var1);

   @NonNull
   public synchronized Content[] getCustomContents() {
      return this.getCustomContents(this.nativePtr);
   }

   private native boolean isEarlyMediaSendingEnabled(long var1);

   public synchronized boolean isEarlyMediaSendingEnabled() {
      return this.isEarlyMediaSendingEnabled(this.nativePtr);
   }

   private native void setEarlyMediaSendingEnabled(long var1, boolean var3);

   public synchronized void setEarlyMediaSendingEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEarlyMediaSendingEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setEarlyMediaSendingEnabled(this.nativePtr, enabled);
   }

   private native String getFromHeader(long var1);

   @Nullable
   public synchronized String getFromHeader() {
      return this.getFromHeader(this.nativePtr);
   }

   private native void setFromHeader(long var1, String var3);

   public synchronized void setFromHeader(@Nullable String fromValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFromHeader() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setFromHeader(this.nativePtr, fromValue);
   }

   private native AudioDevice getInputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getInputAudioDevice() {
      return this.getInputAudioDevice(this.nativePtr);
   }

   private native void setInputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setInputAudioDevice(@Nullable AudioDevice audioDevice) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInputAudioDevice() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setInputAudioDevice(this.nativePtr, audioDevice);
   }

   private native boolean isRecording(long var1);

   public synchronized boolean isRecording() {
      return this.isRecording(this.nativePtr);
   }

   private native boolean getLocalConferenceMode(long var1);

   public synchronized boolean getLocalConferenceMode() {
      return this.getLocalConferenceMode(this.nativePtr);
   }

   private native boolean isLowBandwidthEnabled(long var1);

   public synchronized boolean isLowBandwidthEnabled() {
      return this.isLowBandwidthEnabled(this.nativePtr);
   }

   private native void setLowBandwidthEnabled(long var1, boolean var3);

   public synchronized void setLowBandwidthEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLowBandwidthEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setLowBandwidthEnabled(this.nativePtr, enabled);
   }

   private native int getMediaEncryption(long var1);

   public synchronized MediaEncryption getMediaEncryption() {
      return MediaEncryption.fromInt(this.getMediaEncryption(this.nativePtr));
   }

   private native void setMediaEncryption(long var1, int var3);

   public synchronized void setMediaEncryption(MediaEncryption encryption) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMediaEncryption() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setMediaEncryption(this.nativePtr, encryption.toInt());
   }

   private native boolean isMicEnabled(long var1);

   public synchronized boolean isMicEnabled() {
      return this.isMicEnabled(this.nativePtr);
   }

   private native void setMicEnabled(long var1, boolean var3);

   public synchronized void setMicEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMicEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setMicEnabled(this.nativePtr, enable);
   }

   private native AudioDevice getOutputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getOutputAudioDevice() {
      return this.getOutputAudioDevice(this.nativePtr);
   }

   private native void setOutputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setOutputAudioDevice(@Nullable AudioDevice audioDevice) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOutputAudioDevice() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setOutputAudioDevice(this.nativePtr, audioDevice);
   }

   private native int getPrivacy(long var1);

   public synchronized int getPrivacy() {
      return this.getPrivacy(this.nativePtr);
   }

   private native void setPrivacy(long var1, int var3);

   public synchronized void setPrivacy(int privacy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPrivacy() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setPrivacy(this.nativePtr, privacy);
   }

   private native ProxyConfig getProxyConfig(long var1);

   @Nullable
   public synchronized ProxyConfig getProxyConfig() {
      return this.getProxyConfig(this.nativePtr);
   }

   private native void setProxyConfig(long var1, ProxyConfig var3);

   public synchronized void setProxyConfig(@Nullable ProxyConfig proxyConfig) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProxyConfig() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setProxyConfig(this.nativePtr, proxyConfig);
   }

   private native boolean isRealtimeTextEnabled(long var1);

   public synchronized boolean isRealtimeTextEnabled() {
      return this.isRealtimeTextEnabled(this.nativePtr);
   }

   private native int setRealtimeTextEnabled(long var1, boolean var3);

   public synchronized int setRealtimeTextEnabled(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRealtimeTextEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.setRealtimeTextEnabled(this.nativePtr, yesno);
   }

   private native int getRealtimeTextKeepaliveInterval(long var1);

   public synchronized int getRealtimeTextKeepaliveInterval() {
      return this.getRealtimeTextKeepaliveInterval(this.nativePtr);
   }

   private native void setRealtimeTextKeepaliveInterval(long var1, int var3);

   public synchronized void setRealtimeTextKeepaliveInterval(int interval) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRealtimeTextKeepaliveInterval() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setRealtimeTextKeepaliveInterval(this.nativePtr, interval);
   }

   private native float getReceivedFramerate(long var1);

   public synchronized float getReceivedFramerate() {
      return this.getReceivedFramerate(this.nativePtr);
   }

   private native VideoDefinition getReceivedVideoDefinition(long var1);

   @Nullable
   public synchronized VideoDefinition getReceivedVideoDefinition() {
      return this.getReceivedVideoDefinition(this.nativePtr);
   }

   private native String getRecordFile(long var1);

   @Nullable
   public synchronized String getRecordFile() {
      return this.getRecordFile(this.nativePtr);
   }

   private native void setRecordFile(long var1, String var3);

   public synchronized void setRecordFile(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecordFile() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setRecordFile(this.nativePtr, path);
   }

   private native boolean isRtpBundleEnabled(long var1);

   public synchronized boolean isRtpBundleEnabled() {
      return this.isRtpBundleEnabled(this.nativePtr);
   }

   private native void setRtpBundleEnabled(long var1, boolean var3);

   public synchronized void setRtpBundleEnabled(boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRtpBundleEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setRtpBundleEnabled(this.nativePtr, value);
   }

   private native String getRtpProfile(long var1);

   @NonNull
   public synchronized String getRtpProfile() {
      return this.getRtpProfile(this.nativePtr);
   }

   private native float getSentFramerate(long var1);

   public synchronized float getSentFramerate() {
      return this.getSentFramerate(this.nativePtr);
   }

   private native VideoDefinition getSentVideoDefinition(long var1);

   @Nullable
   public synchronized VideoDefinition getSentVideoDefinition() {
      return this.getSentVideoDefinition(this.nativePtr);
   }

   private native String getSessionName(long var1);

   @Nullable
   public synchronized String getSessionName() {
      return this.getSessionName(this.nativePtr);
   }

   private native void setSessionName(long var1, String var3);

   public synchronized void setSessionName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSessionName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setSessionName(this.nativePtr, name);
   }

   private native int[] getSrtpSuites(long var1);

   @NonNull
   public synchronized SrtpSuite[] getSrtpSuites() {
      return SrtpSuite.fromIntArray(this.getSrtpSuites(this.nativePtr));
   }

   private native void setSrtpSuites(long var1, int[] var3);

   public synchronized void setSrtpSuites(@NonNull SrtpSuite[] srtpSuites) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSrtpSuites() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setSrtpSuites(this.nativePtr, SrtpSuite.toIntArray(srtpSuites));
   }

   private native void setTcapLineMergingEnabled(long var1, boolean var3);

   public synchronized void setTcapLineMergingEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTcapLineMergingEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setTcapLineMergingEnabled(this.nativePtr, enabled);
   }

   private native boolean isToneIndicationsEnabled(long var1);

   public synchronized boolean isToneIndicationsEnabled() {
      return this.isToneIndicationsEnabled(this.nativePtr);
   }

   private native void setToneIndicationsEnabled(long var1, boolean var3);

   public synchronized void setToneIndicationsEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setToneIndicationsEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setToneIndicationsEnabled(this.nativePtr, enable);
   }

   private native PayloadType getUsedAudioPayloadType(long var1);

   @Nullable
   public synchronized PayloadType getUsedAudioPayloadType() {
      return this.getUsedAudioPayloadType(this.nativePtr);
   }

   private native PayloadType getUsedTextPayloadType(long var1);

   @Nullable
   public synchronized PayloadType getUsedTextPayloadType() {
      return this.getUsedTextPayloadType(this.nativePtr);
   }

   private native PayloadType getUsedVideoPayloadType(long var1);

   @Nullable
   public synchronized PayloadType getUsedVideoPayloadType() {
      return this.getUsedVideoPayloadType(this.nativePtr);
   }

   private native int getVideoDirection(long var1);

   public synchronized MediaDirection getVideoDirection() {
      return MediaDirection.fromInt(this.getVideoDirection(this.nativePtr));
   }

   private native void setVideoDirection(long var1, int var3);

   public synchronized void setVideoDirection(MediaDirection direction) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoDirection() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setVideoDirection(this.nativePtr, direction.toInt());
   }

   private native boolean isVideoEnabled(long var1);

   public synchronized boolean isVideoEnabled() {
      return this.isVideoEnabled(this.nativePtr);
   }

   private native void setVideoEnabled(long var1, boolean var3);

   public synchronized void setVideoEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setVideoEnabled(this.nativePtr, enabled);
   }

   private native boolean isVideoMulticastEnabled(long var1);

   public synchronized boolean isVideoMulticastEnabled() {
      return this.isVideoMulticastEnabled(this.nativePtr);
   }

   private native void setVideoMulticastEnabled(long var1, boolean var3);

   public synchronized void setVideoMulticastEnabled(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoMulticastEnabled() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setVideoMulticastEnabled(this.nativePtr, yesno);
   }

   private native void addCustomContent(long var1, Content var3);

   public synchronized void addCustomContent(@NonNull Content content) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomContent() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addCustomContent(this.nativePtr, content);
   }

   private native void addCustomHeader(long var1, String var3, String var4);

   public synchronized void addCustomHeader(@NonNull String headerName, @Nullable String headerValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomHeader() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.addCustomHeader(this.nativePtr, headerName, headerValue);
   }

   private native void addCustomSdpAttribute(long var1, String var3, String var4);

   public synchronized void addCustomSdpAttribute(@NonNull String attributeName, @Nullable String attributeValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomSdpAttribute() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.addCustomSdpAttribute(this.nativePtr, attributeName, attributeValue);
   }

   private native void addCustomSdpMediaAttribute(long var1, int var3, String var4, String var5);

   public synchronized void addCustomSdpMediaAttribute(StreamType type, @NonNull String attributeName, @Nullable String attributeValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomSdpMediaAttribute() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.addCustomSdpMediaAttribute(this.nativePtr, type.toInt(), attributeName, attributeValue);
   }

   private native void clearCustomSdpAttributes(long var1);

   public synchronized void clearCustomSdpAttributes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearCustomSdpAttributes() on it, clone it first.");
         } catch (CoreException var6) {
            Log.i(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.i(st);
            }
         }
      }

      this.clearCustomSdpAttributes(this.nativePtr);
   }

   private native void clearCustomSdpMediaAttributes(long var1, int var3);

   public synchronized void clearCustomSdpMediaAttributes(StreamType type) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearCustomSdpMediaAttributes() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.clearCustomSdpMediaAttributes(this.nativePtr, type.toInt());
   }

   private native CallParams copy(long var1);

   @NonNull
   public synchronized CallParams copy() {
      return this.copy(this.nativePtr);
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String headerName) {
      return this.getCustomHeader(this.nativePtr, headerName);
   }

   private native String getCustomSdpAttribute(long var1, String var3);

   @Nullable
   public synchronized String getCustomSdpAttribute(@NonNull String attributeName) {
      return this.getCustomSdpAttribute(this.nativePtr, attributeName);
   }

   private native String getCustomSdpMediaAttribute(long var1, int var3, String var4);

   @Nullable
   public synchronized String getCustomSdpMediaAttribute(StreamType type, @NonNull String attributeName) {
      return this.getCustomSdpMediaAttribute(this.nativePtr, type.toInt(), attributeName);
   }

   private native boolean hasCustomSdpAttribute(long var1, String var3);

   public synchronized boolean hasCustomSdpAttribute(@NonNull String attributeName) {
      return this.hasCustomSdpAttribute(this.nativePtr, attributeName);
   }

   private native boolean hasCustomSdpMediaAttribute(long var1, int var3, String var4);

   public synchronized boolean hasCustomSdpMediaAttribute(StreamType type, @NonNull String attributeName) {
      return this.hasCustomSdpMediaAttribute(this.nativePtr, type.toInt(), attributeName);
   }

   private native boolean isMediaEncryptionSupported(long var1, int var3);

   public synchronized boolean isMediaEncryptionSupported(MediaEncryption encryption) {
      return this.isMediaEncryptionSupported(this.nativePtr, encryption.toInt());
   }

   private native boolean tcapLinesMerged(long var1);

   public synchronized boolean tcapLinesMerged() {
      return this.tcapLinesMerged(this.nativePtr);
   }

   private native boolean unref(long var1, boolean var3);

   protected void finalize() throws Throwable {
      if (this.nativePtr != 0L) {
         boolean destroyed = this.unref(this.nativePtr, this._isConst);
         if (destroyed) {
            this.nativePtr = 0L;
         }
      }

      super.finalize();
   }

   public void setUserData(Object data) {
      this.userData = data;
   }

   public Object getUserData() {
      return this.userData;
   }

   public String toString() {
      return "Java object [" + super.toString() + "], native pointer [" + String.format("0x%08x", this.nativePtr) + "]";
   }
}

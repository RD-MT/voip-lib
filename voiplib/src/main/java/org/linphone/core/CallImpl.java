package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class CallImpl implements Call {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected CallImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this.core = this.getCore();
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native CallStats getAudioStats(long var1);

   @Nullable
   public synchronized CallStats getAudioStats() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getAudioStats() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getAudioStats(this.nativePtr);
      }
   }

   private native String getAuthenticationToken(long var1);

   @Nullable
   public synchronized String getAuthenticationToken() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getAuthenticationToken() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getAuthenticationToken(this.nativePtr);
      }
   }

   private native boolean getAuthenticationTokenVerified(long var1);

   public synchronized boolean getAuthenticationTokenVerified() {
      synchronized(this.core) {
         return this.getAuthenticationTokenVerified(this.nativePtr);
      }
   }

   private native void setAuthenticationTokenVerified(long var1, boolean var3);

   public synchronized void setAuthenticationTokenVerified(boolean verified) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setAuthenticationTokenVerified() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setAuthenticationTokenVerified(this.nativePtr, verified);
      }
   }

   private native float getAverageQuality(long var1);

   public synchronized float getAverageQuality() {
      synchronized(this.core) {
         return this.getAverageQuality(this.nativePtr);
      }
   }

   private native CallLog getCallLog(long var1);

   @NonNull
   public synchronized CallLog getCallLog() {
      synchronized(this.core) {
         return this.getCallLog(this.nativePtr);
      }
   }

   private native boolean isCameraEnabled(long var1);

   public synchronized boolean isCameraEnabled() {
      synchronized(this.core) {
         return this.isCameraEnabled(this.nativePtr);
      }
   }

   private native void setCameraEnabled(long var1, boolean var3);

   public synchronized void setCameraEnabled(boolean enabled) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setCameraEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setCameraEnabled(this.nativePtr, enabled);
      }
   }

   private native ChatRoom getChatRoom(long var1);

   @Nullable
   public synchronized ChatRoom getChatRoom() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getChatRoom() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getChatRoom(this.nativePtr);
      }
   }

   private native Conference getConference(long var1);

   @Nullable
   public synchronized Conference getConference() {
      synchronized(this.core) {
         return this.getConference(this.nativePtr);
      }
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native CallParams getCurrentParams(long var1);

   @NonNull
   public synchronized CallParams getCurrentParams() {
      synchronized(this.core) {
         return this.getCurrentParams(this.nativePtr);
      }
   }

   private native float getCurrentQuality(long var1);

   public synchronized float getCurrentQuality() {
      synchronized(this.core) {
         return this.getCurrentQuality(this.nativePtr);
      }
   }

   private native int getDir(long var1);

   public synchronized Call.Dir getDir() {
      synchronized(this.core) {
         return Call.Dir.fromInt(this.getDir(this.nativePtr));
      }
   }

   private native Address getDiversionAddress(long var1);

   @Nullable
   public synchronized Address getDiversionAddress() {
      synchronized(this.core) {
         return this.getDiversionAddress(this.nativePtr);
      }
   }

   private native int getDuration(long var1);

   public synchronized int getDuration() {
      synchronized(this.core) {
         return this.getDuration(this.nativePtr);
      }
   }

   private native boolean isEchoCancellationEnabled(long var1);

   public synchronized boolean isEchoCancellationEnabled() {
      synchronized(this.core) {
         return this.isEchoCancellationEnabled(this.nativePtr);
      }
   }

   private native void setEchoCancellationEnabled(long var1, boolean var3);

   public synchronized void setEchoCancellationEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setEchoCancellationEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setEchoCancellationEnabled(this.nativePtr, enable);
      }
   }

   private native boolean isEchoLimiterEnabled(long var1);

   public synchronized boolean isEchoLimiterEnabled() {
      synchronized(this.core) {
         return this.isEchoLimiterEnabled(this.nativePtr);
      }
   }

   private native void setEchoLimiterEnabled(long var1, boolean var3);

   public synchronized void setEchoLimiterEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setEchoLimiterEnabled() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setEchoLimiterEnabled(this.nativePtr, enable);
      }
   }

   private native ErrorInfo getErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo getErrorInfo() {
      synchronized(this.core) {
         return this.getErrorInfo(this.nativePtr);
      }
   }

   private native AudioDevice getInputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getInputAudioDevice() {
      synchronized(this.core) {
         return this.getInputAudioDevice(this.nativePtr);
      }
   }

   private native void setInputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setInputAudioDevice(@Nullable AudioDevice audioDevice) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setInputAudioDevice() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setInputAudioDevice(this.nativePtr, audioDevice);
      }
   }

   private native boolean isRecording(long var1);

   public synchronized boolean isRecording() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isRecording() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.isRecording(this.nativePtr);
      }
   }

   private native boolean getMicrophoneMuted(long var1);

   public synchronized boolean getMicrophoneMuted() {
      synchronized(this.core) {
         return this.getMicrophoneMuted(this.nativePtr);
      }
   }

   private native void setMicrophoneMuted(long var1, boolean var3);

   public synchronized void setMicrophoneMuted(boolean muted) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setMicrophoneMuted() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setMicrophoneMuted(this.nativePtr, muted);
      }
   }

   private native float getMicrophoneVolumeGain(long var1);

   public synchronized float getMicrophoneVolumeGain() {
      synchronized(this.core) {
         return this.getMicrophoneVolumeGain(this.nativePtr);
      }
   }

   private native void setMicrophoneVolumeGain(long var1, float var3);

   public synchronized void setMicrophoneVolumeGain(float volume) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setMicrophoneVolumeGain() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setMicrophoneVolumeGain(this.nativePtr, volume);
      }
   }

   private native Object getNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object getNativeVideoWindowId() {
      synchronized(this.core) {
         return this.getNativeVideoWindowId(this.nativePtr);
      }
   }

   private native void setNativeVideoWindowId(long var1, Object var3);

   public synchronized void setNativeVideoWindowId(@Nullable Object windowId) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setNativeVideoWindowId() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setNativeVideoWindowId(this.nativePtr, windowId);
      }
   }

   private native AudioDevice getOutputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getOutputAudioDevice() {
      synchronized(this.core) {
         return this.getOutputAudioDevice(this.nativePtr);
      }
   }

   private native void setOutputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setOutputAudioDevice(@Nullable AudioDevice audioDevice) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setOutputAudioDevice() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setOutputAudioDevice(this.nativePtr, audioDevice);
      }
   }

   private native CallParams getParams(long var1);

   @NonNull
   public synchronized CallParams getParams() {
      synchronized(this.core) {
         return this.getParams(this.nativePtr);
      }
   }

   private native void setParams(long var1, CallParams var3);

   public synchronized void setParams(@NonNull CallParams params) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setParams() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setParams(this.nativePtr, params);
      }
   }

   private native float getPlayVolume(long var1);

   public synchronized float getPlayVolume() {
      synchronized(this.core) {
         return this.getPlayVolume(this.nativePtr);
      }
   }

   private native Player getPlayer(long var1);

   @NonNull
   public synchronized Player getPlayer() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getPlayer() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getPlayer(this.nativePtr);
      }
   }

   private native int getReason(long var1);

   public synchronized Reason getReason() {
      synchronized(this.core) {
         return Reason.fromInt(this.getReason(this.nativePtr));
      }
   }

   private native float getRecordVolume(long var1);

   public synchronized float getRecordVolume() {
      synchronized(this.core) {
         return this.getRecordVolume(this.nativePtr);
      }
   }

   private native String getReferTo(long var1);

   @Nullable
   public synchronized String getReferTo() {
      synchronized(this.core) {
         return this.getReferTo(this.nativePtr);
      }
   }

   private native Address getRemoteAddress(long var1);

   @NonNull
   public synchronized Address getRemoteAddress() {
      synchronized(this.core) {
         return this.getRemoteAddress(this.nativePtr);
      }
   }

   private native String getRemoteAddressAsString(long var1);

   @Nullable
   public synchronized String getRemoteAddressAsString() {
      synchronized(this.core) {
         return this.getRemoteAddressAsString(this.nativePtr);
      }
   }

   private native String getRemoteContact(long var1);

   @Nullable
   public synchronized String getRemoteContact() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getRemoteContact() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getRemoteContact(this.nativePtr);
      }
   }

   private native CallParams getRemoteParams(long var1);

   @Nullable
   public synchronized CallParams getRemoteParams() {
      synchronized(this.core) {
         return this.getRemoteParams(this.nativePtr);
      }
   }

   private native String getRemoteUserAgent(long var1);

   @Nullable
   public synchronized String getRemoteUserAgent() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getRemoteUserAgent() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getRemoteUserAgent(this.nativePtr);
      }
   }

   private native Call getReplacedCall(long var1);

   @Nullable
   public synchronized Call getReplacedCall() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getReplacedCall() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getReplacedCall(this.nativePtr);
      }
   }

   private native Address getRequestAddress(long var1);

   @NonNull
   public synchronized Address getRequestAddress() {
      synchronized(this.core) {
         return this.getRequestAddress(this.nativePtr);
      }
   }

   private native boolean getSpeakerMuted(long var1);

   public synchronized boolean getSpeakerMuted() {
      synchronized(this.core) {
         return this.getSpeakerMuted(this.nativePtr);
      }
   }

   private native void setSpeakerMuted(long var1, boolean var3);

   public synchronized void setSpeakerMuted(boolean muted) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSpeakerMuted() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setSpeakerMuted(this.nativePtr, muted);
      }
   }

   private native float getSpeakerVolumeGain(long var1);

   public synchronized float getSpeakerVolumeGain() {
      synchronized(this.core) {
         return this.getSpeakerVolumeGain(this.nativePtr);
      }
   }

   private native void setSpeakerVolumeGain(long var1, float var3);

   public synchronized void setSpeakerVolumeGain(float volume) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSpeakerVolumeGain() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setSpeakerVolumeGain(this.nativePtr, volume);
      }
   }

   private native int getState(long var1);

   public synchronized Call.State getState() {
      synchronized(this.core) {
         return Call.State.fromInt(this.getState(this.nativePtr));
      }
   }

   private native int getStreamCount(long var1);

   public synchronized int getStreamCount() {
      synchronized(this.core) {
         return this.getStreamCount(this.nativePtr);
      }
   }

   private native CallStats getTextStats(long var1);

   @Nullable
   public synchronized CallStats getTextStats() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getTextStats() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getTextStats(this.nativePtr);
      }
   }

   private native Address getToAddress(long var1);

   @NonNull
   public synchronized Address getToAddress() {
      synchronized(this.core) {
         return this.getToAddress(this.nativePtr);
      }
   }

   private native int getTransferState(long var1);

   public synchronized Call.State getTransferState() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getTransferState() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return Call.State.fromInt(this.getTransferState(this.nativePtr));
      }
   }

   private native Call getTransferTargetCall(long var1);

   @Nullable
   public synchronized Call getTransferTargetCall() {
      synchronized(this.core) {
         return this.getTransferTargetCall(this.nativePtr);
      }
   }

   private native Call getTransfererCall(long var1);

   @Nullable
   public synchronized Call getTransfererCall() {
      synchronized(this.core) {
         return this.getTransfererCall(this.nativePtr);
      }
   }

   private native VideoSourceDescriptor getVideoSource(long var1);

   @Nullable
   public synchronized VideoSourceDescriptor getVideoSource() {
      synchronized(this.core) {
         return this.getVideoSource(this.nativePtr);
      }
   }

   private native void setVideoSource(long var1, VideoSourceDescriptor var3);

   public synchronized void setVideoSource(@Nullable VideoSourceDescriptor descriptor) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setVideoSource() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setVideoSource(this.nativePtr, descriptor);
      }
   }

   private native CallStats getVideoStats(long var1);

   @Nullable
   public synchronized CallStats getVideoStats() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getVideoStats() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getVideoStats(this.nativePtr);
      }
   }

   private native int accept(long var1);

   public synchronized int accept() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call accept() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.accept(this.nativePtr);
      }
   }

   private native int acceptEarlyMedia(long var1);

   public synchronized int acceptEarlyMedia() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call acceptEarlyMedia() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.acceptEarlyMedia(this.nativePtr);
      }
   }

   private native int acceptEarlyMediaWithParams(long var1, CallParams var3);

   public synchronized int acceptEarlyMediaWithParams(@Nullable CallParams params) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call acceptEarlyMediaWithParams() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.acceptEarlyMediaWithParams(this.nativePtr, params);
      }
   }

   private native int acceptUpdate(long var1, CallParams var3);

   public synchronized int acceptUpdate(@Nullable CallParams params) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call acceptUpdate() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.acceptUpdate(this.nativePtr, params);
      }
   }

   private native int acceptWithParams(long var1, CallParams var3);

   public synchronized int acceptWithParams(@Nullable CallParams params) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call acceptWithParams() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.acceptWithParams(this.nativePtr, params);
      }
   }

   private native boolean askedToAutoanswer(long var1);

   public synchronized boolean askedToAutoanswer() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call askedToAutoanswer() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.askedToAutoanswer(this.nativePtr);
      }
   }

   private native void cancelDtmfs(long var1);

   public synchronized void cancelDtmfs() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call cancelDtmfs() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.cancelDtmfs(this.nativePtr);
      }
   }

   private native void confirmGoClear(long var1);

   public synchronized void confirmGoClear() {
      synchronized(this.core) {
         this.confirmGoClear(this.nativePtr);
      }
   }

   private native Object createNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object createNativeVideoWindowId() {
      synchronized(this.core) {
         return this.createNativeVideoWindowId(this.nativePtr);
      }
   }

   private native int decline(long var1, int var3);

   public synchronized int decline(Reason reason) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call decline() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.decline(this.nativePtr, reason.toInt());
      }
   }

   private native int declineWithErrorInfo(long var1, ErrorInfo var3);

   public synchronized int declineWithErrorInfo(@Nullable ErrorInfo ei) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call declineWithErrorInfo() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.declineWithErrorInfo(this.nativePtr, ei);
      }
   }

   private native int deferUpdate(long var1);

   public synchronized int deferUpdate() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call deferUpdate() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.deferUpdate(this.nativePtr);
      }
   }

   private native CallStats getStats(long var1, int var3);

   @Nullable
   public synchronized CallStats getStats(StreamType type) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getStats() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.getStats(this.nativePtr, type.toInt());
      }
   }

   private native String getToHeader(long var1, String var3);

   @Nullable
   public synchronized String getToHeader(@NonNull String headerName) {
      synchronized(this.core) {
         return this.getToHeader(this.nativePtr, headerName);
      }
   }

   private native boolean hasTransferPending(long var1);

   public synchronized boolean hasTransferPending() {
      synchronized(this.core) {
         return this.hasTransferPending(this.nativePtr);
      }
   }

   private native boolean mediaInProgress(long var1);

   public synchronized boolean mediaInProgress() {
      synchronized(this.core) {
         return this.mediaInProgress(this.nativePtr);
      }
   }

   private native void notifyRinging(long var1);

   public synchronized void notifyRinging() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call notifyRinging() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.notifyRinging(this.nativePtr);
      }
   }

   private native void oglRender(long var1);

   public synchronized void oglRender() {
      synchronized(this.core) {
         this.oglRender(this.nativePtr);
      }
   }

   private native int pause(long var1);

   public synchronized int pause() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call pause() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.pause(this.nativePtr);
      }
   }

   private native int redirect(long var1, String var3);

   public synchronized int redirect(@NonNull String redirectUri) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call redirect() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.redirect(this.nativePtr, redirectUri);
      }
   }

   private native int redirectTo(long var1, Address var3);

   public synchronized int redirectTo(@NonNull Address redirectAddress) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call redirectTo() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.redirectTo(this.nativePtr, redirectAddress);
      }
   }

   private native void requestNotifyNextVideoFrameDecoded(long var1);

   public synchronized void requestNotifyNextVideoFrameDecoded() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call requestNotifyNextVideoFrameDecoded() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.requestNotifyNextVideoFrameDecoded(this.nativePtr);
      }
   }

   private native int resume(long var1);

   public synchronized int resume() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call resume() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.resume(this.nativePtr);
      }
   }

   private native int sendDtmf(long var1, char var3);

   public synchronized int sendDtmf(char dtmf) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendDtmf() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.sendDtmf(this.nativePtr, dtmf);
      }
   }

   private native int sendDtmfs(long var1, String var3);

   public synchronized int sendDtmfs(@NonNull String dtmfs) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendDtmfs() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.sendDtmfs(this.nativePtr, dtmfs);
      }
   }

   private native int sendInfoMessage(long var1, InfoMessage var3);

   public synchronized int sendInfoMessage(@NonNull InfoMessage info) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendInfoMessage() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.sendInfoMessage(this.nativePtr, info);
      }
   }

   private native void sendVfuRequest(long var1);

   public synchronized void sendVfuRequest() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call sendVfuRequest() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.sendVfuRequest(this.nativePtr);
      }
   }

   private native void startRecording(long var1);

   public synchronized void startRecording() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call startRecording() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.startRecording(this.nativePtr);
      }
   }

   private native void stopRecording(long var1);

   public synchronized void stopRecording() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call stopRecording() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.stopRecording(this.nativePtr);
      }
   }

   private native int takePreviewSnapshot(long var1, String var3);

   public synchronized int takePreviewSnapshot(@NonNull String filePath) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call takePreviewSnapshot() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.takePreviewSnapshot(this.nativePtr, filePath);
      }
   }

   private native int takeVideoSnapshot(long var1, String var3);

   public synchronized int takeVideoSnapshot(@NonNull String filePath) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call takeVideoSnapshot() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.takeVideoSnapshot(this.nativePtr, filePath);
      }
   }

   private native int terminate(long var1);

   public synchronized int terminate() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call terminate() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.terminate(this.nativePtr);
      }
   }

   private native int terminateWithErrorInfo(long var1, ErrorInfo var3);

   public synchronized int terminateWithErrorInfo(@Nullable ErrorInfo ei) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call terminateWithErrorInfo() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.terminateWithErrorInfo(this.nativePtr, ei);
      }
   }

   private native int transfer(long var1, String var3);

   public synchronized int transfer(@NonNull String referTo) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call transfer() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.transfer(this.nativePtr, referTo);
      }
   }

   private native int transferTo(long var1, Address var3);

   public synchronized int transferTo(@NonNull Address referTo) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call transferTo() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.transferTo(this.nativePtr, referTo);
      }
   }

   private native int transferToAnother(long var1, Call var3);

   public synchronized int transferToAnother(@NonNull Call dest) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call transferToAnother() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.transferToAnother(this.nativePtr, dest);
      }
   }

   private native int update(long var1, CallParams var3);

   public synchronized int update(@Nullable CallParams params) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call update() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.update(this.nativePtr, params);
      }
   }

   private native void zoom(long var1, float var3, float var4, float var5);

   public synchronized void zoom(float zoomFactor, float cx, float cy) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call zoom() on it, clone it first.");
            } catch (CoreException var11) {
               Log.i(var11);
               StackTraceElement[] var6 = var11.getStackTrace();
               int var7 = var6.length;

               for(int var8 = 0; var8 < var7; ++var8) {
                  StackTraceElement st = var6[var8];
                  Log.i(st);
               }
            }
         }

         this.zoom(this.nativePtr, zoomFactor, cx, cy);
      }
   }

   private native void addListener(long var1, CallListener var3);

   public synchronized void addListener(CallListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, CallListener var3);

   public synchronized void removeListener(CallListener listener) {
      this.removeListener(this.nativePtr, listener);
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

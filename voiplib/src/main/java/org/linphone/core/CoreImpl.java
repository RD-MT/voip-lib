package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class CoreImpl implements Core {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected CoreImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getAccountCreatorBackend(long var1);

   public synchronized AccountCreatorBackend getAccountCreatorBackend() {
      return AccountCreatorBackend.fromInt(this.getAccountCreatorBackend(this.nativePtr));
   }

   private native void setAccountCreatorBackend(long var1, int var3);

   public synchronized void setAccountCreatorBackend(AccountCreatorBackend backend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAccountCreatorBackend() on it, clone it first.");
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

      this.setAccountCreatorBackend(this.nativePtr, backend.toInt());
   }

   private native String getAccountCreatorUrl(long var1);

   @Nullable
   public synchronized String getAccountCreatorUrl() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getAccountCreatorUrl() on it, clone it first.");
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

      return this.getAccountCreatorUrl(this.nativePtr);
   }

   private native void setAccountCreatorUrl(long var1, String var3);

   public synchronized void setAccountCreatorUrl(@Nullable String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAccountCreatorUrl() on it, clone it first.");
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

      this.setAccountCreatorUrl(this.nativePtr, url);
   }

   private native Account[] getAccountList(long var1);

   @NonNull
   public synchronized Account[] getAccountList() {
      return this.getAccountList(this.nativePtr);
   }

   private native String getAdaptiveRateAlgorithm(long var1);

   @NonNull
   public synchronized String getAdaptiveRateAlgorithm() {
      return this.getAdaptiveRateAlgorithm(this.nativePtr);
   }

   private native void setAdaptiveRateAlgorithm(long var1, String var3);

   public synchronized void setAdaptiveRateAlgorithm(@NonNull String algorithm) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAdaptiveRateAlgorithm() on it, clone it first.");
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

      this.setAdaptiveRateAlgorithm(this.nativePtr, algorithm);
   }

   private native boolean isAdaptiveRateControlEnabled(long var1);

   public synchronized boolean isAdaptiveRateControlEnabled() {
      return this.isAdaptiveRateControlEnabled(this.nativePtr);
   }

   private native void setAdaptiveRateControlEnabled(long var1, boolean var3);

   public synchronized void setAdaptiveRateControlEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAdaptiveRateControlEnabled() on it, clone it first.");
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

      this.setAdaptiveRateControlEnabled(this.nativePtr, enabled);
   }

   private native boolean isAudioAdaptiveJittcompEnabled(long var1);

   public synchronized boolean isAudioAdaptiveJittcompEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAudioAdaptiveJittcompEnabled() on it, clone it first.");
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

      return this.isAudioAdaptiveJittcompEnabled(this.nativePtr);
   }

   private native void setAudioAdaptiveJittcompEnabled(long var1, boolean var3);

   public synchronized void setAudioAdaptiveJittcompEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioAdaptiveJittcompEnabled() on it, clone it first.");
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

      this.setAudioAdaptiveJittcompEnabled(this.nativePtr, enable);
   }

   private native AudioDevice[] getAudioDevices(long var1);

   @NonNull
   public synchronized AudioDevice[] getAudioDevices() {
      return this.getAudioDevices(this.nativePtr);
   }

   private native int getAudioDscp(long var1);

   public synchronized int getAudioDscp() {
      return this.getAudioDscp(this.nativePtr);
   }

   private native void setAudioDscp(long var1, int var3);

   public synchronized void setAudioDscp(int dscp) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioDscp() on it, clone it first.");
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

      this.setAudioDscp(this.nativePtr, dscp);
   }

   private native int getAudioJittcomp(long var1);

   public synchronized int getAudioJittcomp() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getAudioJittcomp() on it, clone it first.");
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

      return this.getAudioJittcomp(this.nativePtr);
   }

   private native void setAudioJittcomp(long var1, int var3);

   public synchronized void setAudioJittcomp(int milliseconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioJittcomp() on it, clone it first.");
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

      this.setAudioJittcomp(this.nativePtr, milliseconds);
   }

   private native String getAudioMulticastAddr(long var1);

   @Nullable
   public synchronized String getAudioMulticastAddr() {
      return this.getAudioMulticastAddr(this.nativePtr);
   }

   private native int setAudioMulticastAddr(long var1, String var3);

   public synchronized int setAudioMulticastAddr(@Nullable String ip) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioMulticastAddr() on it, clone it first.");
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

      return this.setAudioMulticastAddr(this.nativePtr, ip);
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

   private native int getAudioMulticastTtl(long var1);

   public synchronized int getAudioMulticastTtl() {
      return this.getAudioMulticastTtl(this.nativePtr);
   }

   private native int setAudioMulticastTtl(long var1, int var3);

   public synchronized int setAudioMulticastTtl(int ttl) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioMulticastTtl() on it, clone it first.");
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

      return this.setAudioMulticastTtl(this.nativePtr, ttl);
   }

   private native PayloadType[] getAudioPayloadTypes(long var1);

   @NonNull
   public synchronized PayloadType[] getAudioPayloadTypes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getAudioPayloadTypes() on it, clone it first.");
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

      return this.getAudioPayloadTypes(this.nativePtr);
   }

   private native void setAudioPayloadTypes(long var1, PayloadType[] var3);

   public synchronized void setAudioPayloadTypes(@Nullable PayloadType[] payloadTypes) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioPayloadTypes() on it, clone it first.");
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

      this.setAudioPayloadTypes(this.nativePtr, payloadTypes);
   }

   private native int getAudioPort(long var1);

   public synchronized int getAudioPort() {
      return this.getAudioPort(this.nativePtr);
   }

   private native void setAudioPort(long var1, int var3);

   public synchronized void setAudioPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioPort() on it, clone it first.");
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

      this.setAudioPort(this.nativePtr, port);
   }

   private native Range getAudioPortsRange(long var1);

   @NonNull
   public synchronized Range getAudioPortsRange() {
      return this.getAudioPortsRange(this.nativePtr);
   }

   private native AuthInfo[] getAuthInfoList(long var1);

   @NonNull
   public synchronized AuthInfo[] getAuthInfoList() {
      return this.getAuthInfoList(this.nativePtr);
   }

   private native boolean isAutoDownloadIcalendarsEnabled(long var1);

   public synchronized boolean isAutoDownloadIcalendarsEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAutoDownloadIcalendarsEnabled() on it, clone it first.");
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

      return this.isAutoDownloadIcalendarsEnabled(this.nativePtr);
   }

   private native void setAutoDownloadIcalendarsEnabled(long var1, boolean var3);

   public synchronized void setAutoDownloadIcalendarsEnabled(boolean autoDownloadIcalendars) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoDownloadIcalendarsEnabled() on it, clone it first.");
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

      this.setAutoDownloadIcalendarsEnabled(this.nativePtr, autoDownloadIcalendars);
   }

   private native boolean isAutoDownloadVoiceRecordingsEnabled(long var1);

   public synchronized boolean isAutoDownloadVoiceRecordingsEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAutoDownloadVoiceRecordingsEnabled() on it, clone it first.");
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

      return this.isAutoDownloadVoiceRecordingsEnabled(this.nativePtr);
   }

   private native void setAutoDownloadVoiceRecordingsEnabled(long var1, boolean var3);

   public synchronized void setAutoDownloadVoiceRecordingsEnabled(boolean autoDownloadVoiceRecordings) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoDownloadVoiceRecordingsEnabled() on it, clone it first.");
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

      this.setAutoDownloadVoiceRecordingsEnabled(this.nativePtr, autoDownloadVoiceRecordings);
   }

   private native int getAutoIterateBackgroundSchedule(long var1);

   public synchronized int getAutoIterateBackgroundSchedule() {
      return this.getAutoIterateBackgroundSchedule(this.nativePtr);
   }

   private native void setAutoIterateBackgroundSchedule(long var1, int var3);

   public synchronized void setAutoIterateBackgroundSchedule(int schedule) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoIterateBackgroundSchedule() on it, clone it first.");
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

      this.setAutoIterateBackgroundSchedule(this.nativePtr, schedule);
   }

   private native boolean isAutoIterateEnabled(long var1);

   public synchronized boolean isAutoIterateEnabled() {
      return this.isAutoIterateEnabled(this.nativePtr);
   }

   private native void setAutoIterateEnabled(long var1, boolean var3);

   public synchronized void setAutoIterateEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoIterateEnabled() on it, clone it first.");
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

      this.setAutoIterateEnabled(this.nativePtr, enable);
   }

   private native int getAutoIterateForegroundSchedule(long var1);

   public synchronized int getAutoIterateForegroundSchedule() {
      return this.getAutoIterateForegroundSchedule(this.nativePtr);
   }

   private native void setAutoIterateForegroundSchedule(long var1, int var3);

   public synchronized void setAutoIterateForegroundSchedule(int schedule) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoIterateForegroundSchedule() on it, clone it first.");
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

      this.setAutoIterateForegroundSchedule(this.nativePtr, schedule);
   }

   private native boolean isAutoSendRingingEnabled(long var1);

   public synchronized boolean isAutoSendRingingEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAutoSendRingingEnabled() on it, clone it first.");
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

      return this.isAutoSendRingingEnabled(this.nativePtr);
   }

   private native void setAutoSendRingingEnabled(long var1, boolean var3);

   public synchronized void setAutoSendRingingEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutoSendRingingEnabled() on it, clone it first.");
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

      this.setAutoSendRingingEnabled(this.nativePtr, enable);
   }

   private native boolean isAutomaticHttpProxyDetectionEnabled(long var1);

   public synchronized boolean isAutomaticHttpProxyDetectionEnabled() {
      return this.isAutomaticHttpProxyDetectionEnabled(this.nativePtr);
   }

   private native void setAutomaticHttpProxyDetectionEnabled(long var1, boolean var3);

   public synchronized void setAutomaticHttpProxyDetectionEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAutomaticHttpProxyDetectionEnabled() on it, clone it first.");
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

      this.setAutomaticHttpProxyDetectionEnabled(this.nativePtr, enable);
   }

   private native int getAvpfMode(long var1);

   public synchronized AVPFMode getAvpfMode() {
      return AVPFMode.fromInt(this.getAvpfMode(this.nativePtr));
   }

   private native void setAvpfMode(long var1, int var3);

   public synchronized void setAvpfMode(AVPFMode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvpfMode() on it, clone it first.");
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

      this.setAvpfMode(this.nativePtr, mode.toInt());
   }

   private native int getAvpfRrInterval(long var1);

   public synchronized int getAvpfRrInterval() {
      return this.getAvpfRrInterval(this.nativePtr);
   }

   private native void setAvpfRrInterval(long var1, int var3);

   public synchronized void setAvpfRrInterval(int interval) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAvpfRrInterval() on it, clone it first.");
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

      this.setAvpfRrInterval(this.nativePtr, interval);
   }

   private native CallLog[] getCallLogs(long var1);

   @NonNull
   public synchronized CallLog[] getCallLogs() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCallLogs() on it, clone it first.");
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

      return this.getCallLogs(this.nativePtr);
   }

   private native String getCallLogsDatabasePath(long var1);

   @Nullable
   public synchronized String getCallLogsDatabasePath() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCallLogsDatabasePath() on it, clone it first.");
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

      return this.getCallLogsDatabasePath(this.nativePtr);
   }

   private native void setCallLogsDatabasePath(long var1, String var3);

   public synchronized void setCallLogsDatabasePath(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCallLogsDatabasePath() on it, clone it first.");
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

      this.setCallLogsDatabasePath(this.nativePtr, path);
   }

   private native boolean isCallToneIndicationsEnabled(long var1);

   public synchronized boolean isCallToneIndicationsEnabled() {
      return this.isCallToneIndicationsEnabled(this.nativePtr);
   }

   private native void setCallToneIndicationsEnabled(long var1, boolean var3);

   public synchronized void setCallToneIndicationsEnabled(boolean yesno) {
      this.setCallToneIndicationsEnabled(this.nativePtr, yesno);
   }

   private native boolean isCallkitEnabled(long var1);

   public synchronized boolean isCallkitEnabled() {
      return this.isCallkitEnabled(this.nativePtr);
   }

   private native void setCallkitEnabled(long var1, boolean var3);

   public synchronized void setCallkitEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCallkitEnabled() on it, clone it first.");
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

      this.setCallkitEnabled(this.nativePtr, enabled);
   }

   private native Call[] getCalls(long var1);

   @NonNull
   public synchronized Call[] getCalls() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCalls() on it, clone it first.");
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

      return this.getCalls(this.nativePtr);
   }

   private native int getCallsNb(long var1);

   public synchronized int getCallsNb() {
      return this.getCallsNb(this.nativePtr);
   }

   private native int getCameraSensorRotation(long var1);

   public synchronized int getCameraSensorRotation() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCameraSensorRotation() on it, clone it first.");
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

      return this.getCameraSensorRotation(this.nativePtr);
   }

   private native boolean isCapabilityNegociationEnabled(long var1);

   public synchronized boolean isCapabilityNegociationEnabled() {
      return this.isCapabilityNegociationEnabled(this.nativePtr);
   }

   private native void setCapabilityNegociationEnabled(long var1, boolean var3);

   public synchronized void setCapabilityNegociationEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCapabilityNegociationEnabled() on it, clone it first.");
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

      this.setCapabilityNegociationEnabled(this.nativePtr, enable);
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

   private native String getCaptureDevice(long var1);

   @Nullable
   public synchronized String getCaptureDevice() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCaptureDevice() on it, clone it first.");
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

      return this.getCaptureDevice(this.nativePtr);
   }

   private native int setCaptureDevice(long var1, String var3);

   public synchronized int setCaptureDevice(@Nullable String devid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCaptureDevice() on it, clone it first.");
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

      return this.setCaptureDevice(this.nativePtr, devid);
   }

   private native boolean isChatEnabled(long var1);

   public synchronized boolean isChatEnabled() {
      return this.isChatEnabled(this.nativePtr);
   }

   private native boolean getChatMessagesAggregationEnabled(long var1);

   public synchronized boolean getChatMessagesAggregationEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getChatMessagesAggregationEnabled() on it, clone it first.");
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

      return this.getChatMessagesAggregationEnabled(this.nativePtr);
   }

   private native void setChatMessagesAggregationEnabled(long var1, boolean var3);

   public synchronized void setChatMessagesAggregationEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setChatMessagesAggregationEnabled() on it, clone it first.");
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

      this.setChatMessagesAggregationEnabled(this.nativePtr, enabled);
   }

   private native ChatRoom[] getChatRooms(long var1);

   @NonNull
   public synchronized ChatRoom[] getChatRooms() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getChatRooms() on it, clone it first.");
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

      return this.getChatRooms(this.nativePtr);
   }

   private native Conference getConference(long var1);

   @Nullable
   public synchronized Conference getConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConference() on it, clone it first.");
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

      return this.getConference(this.nativePtr);
   }

   private native boolean isConferenceIcsInMessageBodyEnabled(long var1);

   public synchronized boolean isConferenceIcsInMessageBodyEnabled() {
      return this.isConferenceIcsInMessageBodyEnabled(this.nativePtr);
   }

   private native void setConferenceIcsInMessageBodyEnabled(long var1, boolean var3);

   public synchronized void setConferenceIcsInMessageBodyEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceIcsInMessageBodyEnabled() on it, clone it first.");
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

      this.setConferenceIcsInMessageBodyEnabled(this.nativePtr, enable);
   }

   private native ConferenceInfo[] getConferenceInformationList(long var1);

   @NonNull
   public synchronized ConferenceInfo[] getConferenceInformationList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConferenceInformationList() on it, clone it first.");
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

      return this.getConferenceInformationList(this.nativePtr);
   }

   private native float getConferenceLocalInputVolume(long var1);

   public synchronized float getConferenceLocalInputVolume() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConferenceLocalInputVolume() on it, clone it first.");
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

      return this.getConferenceLocalInputVolume(this.nativePtr);
   }

   private native int getConferenceParticipantListType(long var1);

   public synchronized ConferenceParticipantListType getConferenceParticipantListType() {
      return ConferenceParticipantListType.fromInt(this.getConferenceParticipantListType(this.nativePtr));
   }

   private native void setConferenceParticipantListType(long var1, int var3);

   public synchronized void setConferenceParticipantListType(ConferenceParticipantListType type) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceParticipantListType() on it, clone it first.");
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

      this.setConferenceParticipantListType(this.nativePtr, type.toInt());
   }

   private native boolean isConferenceServerEnabled(long var1);

   public synchronized boolean isConferenceServerEnabled() {
      return this.isConferenceServerEnabled(this.nativePtr);
   }

   private native void setConferenceServerEnabled(long var1, boolean var3);

   public synchronized void setConferenceServerEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceServerEnabled() on it, clone it first.");
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

      this.setConferenceServerEnabled(this.nativePtr, enable);
   }

   private native int getConferenceSize(long var1);

   public synchronized int getConferenceSize() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConferenceSize() on it, clone it first.");
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

      return this.getConferenceSize(this.nativePtr);
   }

   private native Config getConfig(long var1);

   @NonNull
   public synchronized Config getConfig() {
      return this.getConfig(this.nativePtr);
   }

   private native int getConsolidatedPresence(long var1);

   public synchronized ConsolidatedPresence getConsolidatedPresence() {
      return ConsolidatedPresence.fromInt(this.getConsolidatedPresence(this.nativePtr));
   }

   private native void setConsolidatedPresence(long var1, int var3);

   public synchronized void setConsolidatedPresence(ConsolidatedPresence presence) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConsolidatedPresence() on it, clone it first.");
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

      this.setConsolidatedPresence(this.nativePtr, presence.toInt());
   }

   private native Call getCurrentCall(long var1);

   @Nullable
   public synchronized Call getCurrentCall() {
      return this.getCurrentCall(this.nativePtr);
   }

   private native Address getCurrentCallRemoteAddress(long var1);

   @Nullable
   public synchronized Address getCurrentCallRemoteAddress() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCurrentCallRemoteAddress() on it, clone it first.");
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

      return this.getCurrentCallRemoteAddress(this.nativePtr);
   }

   private native VideoDefinition getCurrentPreviewVideoDefinition(long var1);

   @NonNull
   public synchronized VideoDefinition getCurrentPreviewVideoDefinition() {
      return this.getCurrentPreviewVideoDefinition(this.nativePtr);
   }

   private native Account getDefaultAccount(long var1);

   @Nullable
   public synchronized Account getDefaultAccount() {
      return this.getDefaultAccount(this.nativePtr);
   }

   private native void setDefaultAccount(long var1, Account var3);

   public synchronized void setDefaultAccount(@Nullable Account account) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultAccount() on it, clone it first.");
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

      this.setDefaultAccount(this.nativePtr, account);
   }

   private native int getDefaultConferenceLayout(long var1);

   public synchronized ConferenceLayout getDefaultConferenceLayout() {
      return ConferenceLayout.fromInt(this.getDefaultConferenceLayout(this.nativePtr));
   }

   private native void setDefaultConferenceLayout(long var1, int var3);

   public synchronized void setDefaultConferenceLayout(ConferenceLayout value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultConferenceLayout() on it, clone it first.");
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

      this.setDefaultConferenceLayout(this.nativePtr, value.toInt());
   }

   private native long getDefaultEphemeralLifetime(long var1);

   public synchronized long getDefaultEphemeralLifetime() {
      return this.getDefaultEphemeralLifetime(this.nativePtr);
   }

   private native void setDefaultEphemeralLifetime(long var1, long var3);

   public synchronized void setDefaultEphemeralLifetime(long value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultEphemeralLifetime() on it, clone it first.");
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

      this.setDefaultEphemeralLifetime(this.nativePtr, value);
   }

   private native FriendList getDefaultFriendList(long var1);

   @Nullable
   public synchronized FriendList getDefaultFriendList() {
      return this.getDefaultFriendList(this.nativePtr);
   }

   private native AudioDevice getDefaultInputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getDefaultInputAudioDevice() {
      return this.getDefaultInputAudioDevice(this.nativePtr);
   }

   private native void setDefaultInputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setDefaultInputAudioDevice(@Nullable AudioDevice audioDevice) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultInputAudioDevice() on it, clone it first.");
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

      this.setDefaultInputAudioDevice(this.nativePtr, audioDevice);
   }

   private native AudioDevice getDefaultOutputAudioDevice(long var1);

   @Nullable
   public synchronized AudioDevice getDefaultOutputAudioDevice() {
      return this.getDefaultOutputAudioDevice(this.nativePtr);
   }

   private native void setDefaultOutputAudioDevice(long var1, AudioDevice var3);

   public synchronized void setDefaultOutputAudioDevice(@Nullable AudioDevice audioDevice) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultOutputAudioDevice() on it, clone it first.");
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

      this.setDefaultOutputAudioDevice(this.nativePtr, audioDevice);
   }

   private native ProxyConfig getDefaultProxyConfig(long var1);

   @Nullable
   public synchronized ProxyConfig getDefaultProxyConfig() {
      return this.getDefaultProxyConfig(this.nativePtr);
   }

   private native void setDefaultProxyConfig(long var1, ProxyConfig var3);

   public synchronized void setDefaultProxyConfig(@Nullable ProxyConfig config) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDefaultProxyConfig() on it, clone it first.");
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

      this.setDefaultProxyConfig(this.nativePtr, config);
   }

   private native String getDefaultVideoDisplayFilter(long var1);

   @NonNull
   public synchronized String getDefaultVideoDisplayFilter() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDefaultVideoDisplayFilter() on it, clone it first.");
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

      return this.getDefaultVideoDisplayFilter(this.nativePtr);
   }

   private native int getDelayedTimeout(long var1);

   public synchronized int getDelayedTimeout() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDelayedTimeout() on it, clone it first.");
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

      return this.getDelayedTimeout(this.nativePtr);
   }

   private native void setDelayedTimeout(long var1, int var3);

   public synchronized void setDelayedTimeout(int seconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDelayedTimeout() on it, clone it first.");
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

      this.setDelayedTimeout(this.nativePtr, seconds);
   }

   private native int getDeviceRotation(long var1);

   public synchronized int getDeviceRotation() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDeviceRotation() on it, clone it first.");
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

      return this.getDeviceRotation(this.nativePtr);
   }

   private native void setDeviceRotation(long var1, int var3);

   public synchronized void setDeviceRotation(int rotation) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDeviceRotation() on it, clone it first.");
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

      this.setDeviceRotation(this.nativePtr, rotation);
   }

   private native DigestAuthenticationPolicy getDigestAuthenticationPolicy(long var1);

   @NonNull
   public synchronized DigestAuthenticationPolicy getDigestAuthenticationPolicy() {
      return this.getDigestAuthenticationPolicy(this.nativePtr);
   }

   private native void setDigestAuthenticationPolicy(long var1, DigestAuthenticationPolicy var3);

   public synchronized void setDigestAuthenticationPolicy(@NonNull DigestAuthenticationPolicy policy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDigestAuthenticationPolicy() on it, clone it first.");
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

      this.setDigestAuthenticationPolicy(this.nativePtr, policy);
   }

   private native boolean getDisableRecordOnMute(long var1);

   public synchronized boolean getDisableRecordOnMute() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDisableRecordOnMute() on it, clone it first.");
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

      return this.getDisableRecordOnMute(this.nativePtr);
   }

   private native void setDisableRecordOnMute(long var1, boolean var3);

   public synchronized void setDisableRecordOnMute(boolean disable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDisableRecordOnMute() on it, clone it first.");
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

      this.setDisableRecordOnMute(this.nativePtr, disable);
   }

   private native boolean isDnsSearchEnabled(long var1);

   public synchronized boolean isDnsSearchEnabled() {
      return this.isDnsSearchEnabled(this.nativePtr);
   }

   private native void setDnsSearchEnabled(long var1, boolean var3);

   public synchronized void setDnsSearchEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDnsSearchEnabled() on it, clone it first.");
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

      this.setDnsSearchEnabled(this.nativePtr, enable);
   }

   private native void setDnsServers(long var1, String[] var3);

   public synchronized void setDnsServers(@Nullable String[] servers) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDnsServers() on it, clone it first.");
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

      this.setDnsServers(this.nativePtr, servers);
   }

   private native void setDnsServersApp(long var1, String[] var3);

   public synchronized void setDnsServersApp(@Nullable String[] servers) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDnsServersApp() on it, clone it first.");
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

      this.setDnsServersApp(this.nativePtr, servers);
   }

   private native boolean getDnsSetByApp(long var1);

   public synchronized boolean getDnsSetByApp() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDnsSetByApp() on it, clone it first.");
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

      return this.getDnsSetByApp(this.nativePtr);
   }

   private native boolean isDnsSrvEnabled(long var1);

   public synchronized boolean isDnsSrvEnabled() {
      return this.isDnsSrvEnabled(this.nativePtr);
   }

   private native void setDnsSrvEnabled(long var1, boolean var3);

   public synchronized void setDnsSrvEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDnsSrvEnabled() on it, clone it first.");
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

      this.setDnsSrvEnabled(this.nativePtr, enable);
   }

   private native int getDownloadBandwidth(long var1);

   public synchronized int getDownloadBandwidth() {
      return this.getDownloadBandwidth(this.nativePtr);
   }

   private native void setDownloadBandwidth(long var1, int var3);

   public synchronized void setDownloadBandwidth(int bandwidth) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDownloadBandwidth() on it, clone it first.");
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

      this.setDownloadBandwidth(this.nativePtr, bandwidth);
   }

   private native int getDownloadPtime(long var1);

   public synchronized int getDownloadPtime() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDownloadPtime() on it, clone it first.");
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

      return this.getDownloadPtime(this.nativePtr);
   }

   private native void setDownloadPtime(long var1, int var3);

   public synchronized void setDownloadPtime(int ptime) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDownloadPtime() on it, clone it first.");
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

      this.setDownloadPtime(this.nativePtr, ptime);
   }

   private native int getEchoCancellationCalibration(long var1);

   public synchronized int getEchoCancellationCalibration() {
      return this.getEchoCancellationCalibration(this.nativePtr);
   }

   private native boolean isEchoCancellationEnabled(long var1);

   public synchronized boolean isEchoCancellationEnabled() {
      return this.isEchoCancellationEnabled(this.nativePtr);
   }

   private native void setEchoCancellationEnabled(long var1, boolean var3);

   public synchronized void setEchoCancellationEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEchoCancellationEnabled() on it, clone it first.");
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

      this.setEchoCancellationEnabled(this.nativePtr, enable);
   }

   private native String getEchoCancellerFilterName(long var1);

   @Nullable
   public synchronized String getEchoCancellerFilterName() {
      return this.getEchoCancellerFilterName(this.nativePtr);
   }

   private native void setEchoCancellerFilterName(long var1, String var3);

   public synchronized void setEchoCancellerFilterName(@Nullable String filtername) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEchoCancellerFilterName() on it, clone it first.");
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

      this.setEchoCancellerFilterName(this.nativePtr, filtername);
   }

   private native boolean isEchoLimiterEnabled(long var1);

   public synchronized boolean isEchoLimiterEnabled() {
      return this.isEchoLimiterEnabled(this.nativePtr);
   }

   private native void setEchoLimiterEnabled(long var1, boolean var3);

   public synchronized void setEchoLimiterEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEchoLimiterEnabled() on it, clone it first.");
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

      this.setEchoLimiterEnabled(this.nativePtr, enable);
   }

   private native void setEnableSipUpdate(long var1, int var3);

   public synchronized void setEnableSipUpdate(int value) {
      this.setEnableSipUpdate(this.nativePtr, value);
   }

   private native void setExpectedBandwidth(long var1, int var3);

   public synchronized void setExpectedBandwidth(int bandwidth) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setExpectedBandwidth() on it, clone it first.");
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

      this.setExpectedBandwidth(this.nativePtr, bandwidth);
   }

   private native AudioDevice[] getExtendedAudioDevices(long var1);

   @NonNull
   public synchronized AudioDevice[] getExtendedAudioDevices() {
      return this.getExtendedAudioDevices(this.nativePtr);
   }

   private native String getFileTransferServer(long var1);

   @Nullable
   public synchronized String getFileTransferServer() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getFileTransferServer() on it, clone it first.");
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

      return this.getFileTransferServer(this.nativePtr);
   }

   private native void setFileTransferServer(long var1, String var3);

   public synchronized void setFileTransferServer(@Nullable String serverUrl) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFileTransferServer() on it, clone it first.");
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

      this.setFileTransferServer(this.nativePtr, serverUrl);
   }

   private native boolean isForcedIceRelayEnabled(long var1);

   public synchronized boolean isForcedIceRelayEnabled() {
      return this.isForcedIceRelayEnabled(this.nativePtr);
   }

   private native void setForcedIceRelayEnabled(long var1, boolean var3);

   public synchronized void setForcedIceRelayEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setForcedIceRelayEnabled() on it, clone it first.");
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

      this.setForcedIceRelayEnabled(this.nativePtr, enable);
   }

   private native boolean isFriendListSubscriptionEnabled(long var1);

   public synchronized boolean isFriendListSubscriptionEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isFriendListSubscriptionEnabled() on it, clone it first.");
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

      return this.isFriendListSubscriptionEnabled(this.nativePtr);
   }

   private native void setFriendListSubscriptionEnabled(long var1, boolean var3);

   public synchronized void setFriendListSubscriptionEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFriendListSubscriptionEnabled() on it, clone it first.");
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

      this.setFriendListSubscriptionEnabled(this.nativePtr, enable);
   }

   private native String getFriendsDatabasePath(long var1);

   @Nullable
   public synchronized String getFriendsDatabasePath() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getFriendsDatabasePath() on it, clone it first.");
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

      return this.getFriendsDatabasePath(this.nativePtr);
   }

   private native void setFriendsDatabasePath(long var1, String var3);

   public synchronized void setFriendsDatabasePath(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFriendsDatabasePath() on it, clone it first.");
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

      this.setFriendsDatabasePath(this.nativePtr, path);
   }

   private native FriendList[] getFriendsLists(long var1);

   @NonNull
   public synchronized FriendList[] getFriendsLists() {
      return this.getFriendsLists(this.nativePtr);
   }

   private native ConferenceInfo[] getFutureConferenceInformationList(long var1);

   @NonNull
   public synchronized ConferenceInfo[] getFutureConferenceInformationList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getFutureConferenceInformationList() on it, clone it first.");
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

      return this.getFutureConferenceInformationList(this.nativePtr);
   }

   private native boolean isGenericComfortNoiseEnabled(long var1);

   public synchronized boolean isGenericComfortNoiseEnabled() {
      return this.isGenericComfortNoiseEnabled(this.nativePtr);
   }

   private native void setGenericComfortNoiseEnabled(long var1, boolean var3);

   public synchronized void setGenericComfortNoiseEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setGenericComfortNoiseEnabled() on it, clone it first.");
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

      this.setGenericComfortNoiseEnabled(this.nativePtr, enabled);
   }

   private native int getGlobalState(long var1);

   @NonNull
   public synchronized GlobalState getGlobalState() {
      return GlobalState.fromInt(this.getGlobalState(this.nativePtr));
   }

   private native boolean getGuessHostname(long var1);

   public synchronized boolean getGuessHostname() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getGuessHostname() on it, clone it first.");
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

      return this.getGuessHostname(this.nativePtr);
   }

   private native void setGuessHostname(long var1, boolean var3);

   public synchronized void setGuessHostname(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setGuessHostname() on it, clone it first.");
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

      this.setGuessHostname(this.nativePtr, enable);
   }

   private native String getHttpProxyHost(long var1);

   @Nullable
   public synchronized String getHttpProxyHost() {
      return this.getHttpProxyHost(this.nativePtr);
   }

   private native void setHttpProxyHost(long var1, String var3);

   public synchronized void setHttpProxyHost(@Nullable String host) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHttpProxyHost() on it, clone it first.");
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

      this.setHttpProxyHost(this.nativePtr, host);
   }

   private native int getHttpProxyPort(long var1);

   public synchronized int getHttpProxyPort() {
      return this.getHttpProxyPort(this.nativePtr);
   }

   private native void setHttpProxyPort(long var1, int var3);

   public synchronized void setHttpProxyPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHttpProxyPort() on it, clone it first.");
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

      this.setHttpProxyPort(this.nativePtr, port);
   }

   private native String getIdentity(long var1);

   @NonNull
   public synchronized String getIdentity() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getIdentity() on it, clone it first.");
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

      return this.getIdentity(this.nativePtr);
   }

   private native ImNotifPolicy getImNotifPolicy(long var1);

   @Nullable
   public synchronized ImNotifPolicy getImNotifPolicy() {
      return this.getImNotifPolicy(this.nativePtr);
   }

   private native int getInCallTimeout(long var1);

   public synchronized int getInCallTimeout() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getInCallTimeout() on it, clone it first.");
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

      return this.getInCallTimeout(this.nativePtr);
   }

   private native void setInCallTimeout(long var1, int var3);

   public synchronized void setInCallTimeout(int seconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInCallTimeout() on it, clone it first.");
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

      this.setInCallTimeout(this.nativePtr, seconds);
   }

   private native int getIncTimeout(long var1);

   public synchronized int getIncTimeout() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getIncTimeout() on it, clone it first.");
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

      return this.getIncTimeout(this.nativePtr);
   }

   private native void setIncTimeout(long var1, int var3);

   public synchronized void setIncTimeout(int seconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIncTimeout() on it, clone it first.");
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

      this.setIncTimeout(this.nativePtr, seconds);
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

   private native boolean isIpv6Enabled(long var1);

   public synchronized boolean isIpv6Enabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isIpv6Enabled() on it, clone it first.");
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

      return this.isIpv6Enabled(this.nativePtr);
   }

   private native void setIpv6Enabled6(long var1, boolean var3);

   public synchronized void setIpv6Enabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIpv6Enabled() on it, clone it first.");
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

      this.setIpv6Enabled6(this.nativePtr, enable);
   }

   private native boolean isEchoCancellerCalibrationRequired(long var1);

   public synchronized boolean isEchoCancellerCalibrationRequired() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isEchoCancellerCalibrationRequired() on it, clone it first.");
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

      return this.isEchoCancellerCalibrationRequired(this.nativePtr);
   }

   private native boolean isInBackground(long var1);

   public synchronized boolean isInBackground() {
      return this.isInBackground(this.nativePtr);
   }

   private native boolean isInConference(long var1);

   public synchronized boolean isInConference() {
      return this.isInConference(this.nativePtr);
   }

   private native boolean isIncomingInvitePending(long var1);

   public synchronized boolean isIncomingInvitePending() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isIncomingInvitePending() on it, clone it first.");
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

      return this.isIncomingInvitePending(this.nativePtr);
   }

   private native boolean isMediaEncryptionMandatory(long var1);

   public synchronized boolean isMediaEncryptionMandatory() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isMediaEncryptionMandatory() on it, clone it first.");
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

      return this.isMediaEncryptionMandatory(this.nativePtr);
   }

   private native boolean isNetworkReachable(long var1);

   public synchronized boolean isNetworkReachable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isNetworkReachable() on it, clone it first.");
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

      return this.isNetworkReachable(this.nativePtr);
   }

   private native boolean isPushNotificationAvailable(long var1);

   public synchronized boolean isPushNotificationAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isPushNotificationAvailable() on it, clone it first.");
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

      return this.isPushNotificationAvailable(this.nativePtr);
   }

   private native boolean isSenderNameHiddenInForwardMessage(long var1);

   public synchronized boolean isSenderNameHiddenInForwardMessage() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isSenderNameHiddenInForwardMessage() on it, clone it first.");
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

      return this.isSenderNameHiddenInForwardMessage(this.nativePtr);
   }

   private native boolean isVerifyServerCertificates(long var1);

   public synchronized boolean isVerifyServerCertificates() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVerifyServerCertificates() on it, clone it first.");
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

      return this.isVerifyServerCertificates(this.nativePtr);
   }

   private native boolean isVerifyServerCn(long var1);

   public synchronized boolean isVerifyServerCn() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVerifyServerCn() on it, clone it first.");
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

      return this.isVerifyServerCn(this.nativePtr);
   }

   private native boolean isKeepAliveEnabled(long var1);

   public synchronized boolean isKeepAliveEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isKeepAliveEnabled() on it, clone it first.");
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

      return this.isKeepAliveEnabled(this.nativePtr);
   }

   private native void setKeepAliveEnabled(long var1, boolean var3);

   public synchronized void setKeepAliveEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setKeepAliveEnabled() on it, clone it first.");
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

      this.setKeepAliveEnabled(this.nativePtr, enable);
   }

   private native CallLog getLastOutgoingCallLog(long var1);

   @Nullable
   public synchronized CallLog getLastOutgoingCallLog() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLastOutgoingCallLog() on it, clone it first.");
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

      return this.getLastOutgoingCallLog(this.nativePtr);
   }

   private native Ldap[] getLdapList(long var1);

   @NonNull
   public synchronized Ldap[] getLdapList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLdapList() on it, clone it first.");
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

      return this.getLdapList(this.nativePtr);
   }

   private native boolean isLimeX3DhEnabled(long var1);

   public synchronized boolean isLimeX3DhEnabled() {
      return this.isLimeX3DhEnabled(this.nativePtr);
   }

   private native void setLimeX3DhEnabled(long var1, boolean var3);

   public synchronized void setLimeX3DhEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLimeX3DhEnabled() on it, clone it first.");
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

      this.setLimeX3DhEnabled(this.nativePtr, enable);
   }

   private native String getLimeX3DhServerUrl(long var1);

   @Nullable
   public synchronized String getLimeX3DhServerUrl() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLimeX3DhServerUrl() on it, clone it first.");
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

      return this.getLimeX3DhServerUrl(this.nativePtr);
   }

   private native void setLimeX3DhServerUrl(long var1, String var3);

   public synchronized void setLimeX3DhServerUrl(@Nullable String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLimeX3DhServerUrl() on it, clone it first.");
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

      this.setLimeX3DhServerUrl(this.nativePtr, url);
   }

   private native String[] getLinphoneSpecsList(long var1);

   @NonNull
   public synchronized String[] getLinphoneSpecsList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLinphoneSpecsList() on it, clone it first.");
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

      return this.getLinphoneSpecsList(this.nativePtr);
   }

   private native void setLinphoneSpecsList(long var1, String[] var3);

   public synchronized void setLinphoneSpecsList(@Nullable String[] specs) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLinphoneSpecsList() on it, clone it first.");
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

      this.setLinphoneSpecsList(this.nativePtr, specs);
   }

   private native boolean isLocalPermissionEnabled(long var1);

   public synchronized boolean isLocalPermissionEnabled() {
      return this.isLocalPermissionEnabled(this.nativePtr);
   }

   private native String getLogCollectionUploadServerUrl(long var1);

   @Nullable
   public synchronized String getLogCollectionUploadServerUrl() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLogCollectionUploadServerUrl() on it, clone it first.");
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

      return this.getLogCollectionUploadServerUrl(this.nativePtr);
   }

   private native void setLogCollectionUploadServerUrl(long var1, String var3);

   public synchronized void setLogCollectionUploadServerUrl(@Nullable String serverUrl) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogCollectionUploadServerUrl() on it, clone it first.");
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

      this.setLogCollectionUploadServerUrl(this.nativePtr, serverUrl);
   }

   private native int getMaxCalls(long var1);

   public synchronized int getMaxCalls() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMaxCalls() on it, clone it first.");
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

      return this.getMaxCalls(this.nativePtr);
   }

   private native void setMaxCalls(long var1, int var3);

   public synchronized void setMaxCalls(int max) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMaxCalls() on it, clone it first.");
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

      this.setMaxCalls(this.nativePtr, max);
   }

   private native int getMaxSizeForAutoDownloadIncomingFiles(long var1);

   public synchronized int getMaxSizeForAutoDownloadIncomingFiles() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMaxSizeForAutoDownloadIncomingFiles() on it, clone it first.");
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

      return this.getMaxSizeForAutoDownloadIncomingFiles(this.nativePtr);
   }

   private native void setMaxSizeForAutoDownloadIncomingFiles(long var1, int var3);

   public synchronized void setMaxSizeForAutoDownloadIncomingFiles(int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMaxSizeForAutoDownloadIncomingFiles() on it, clone it first.");
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

      this.setMaxSizeForAutoDownloadIncomingFiles(this.nativePtr, size);
   }

   private native String getMediaDevice(long var1);

   @Nullable
   public synchronized String getMediaDevice() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMediaDevice() on it, clone it first.");
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

      return this.getMediaDevice(this.nativePtr);
   }

   private native int setMediaDevice(long var1, String var3);

   public synchronized int setMediaDevice(@Nullable String devid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMediaDevice() on it, clone it first.");
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

      return this.setMediaDevice(this.nativePtr, devid);
   }

   private native int getMediaEncryption(long var1);

   public synchronized MediaEncryption getMediaEncryption() {
      return MediaEncryption.fromInt(this.getMediaEncryption(this.nativePtr));
   }

   private native int setMediaEncryption(long var1, int var3);

   public synchronized int setMediaEncryption(MediaEncryption menc) {
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

      return this.setMediaEncryption(this.nativePtr, menc.toInt());
   }

   private native void setMediaEncryptionMandatory(long var1, boolean var3);

   public synchronized void setMediaEncryptionMandatory(boolean mandatory) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMediaEncryptionMandatory() on it, clone it first.");
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

      this.setMediaEncryptionMandatory(this.nativePtr, mandatory);
   }

   private native void setMediaNetworkReachable(long var1, boolean var3);

   public synchronized void setMediaNetworkReachable(boolean reachable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMediaNetworkReachable() on it, clone it first.");
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

      this.setMediaNetworkReachable(this.nativePtr, reachable);
   }

   private native int getMediaResourceMode(long var1);

   public synchronized MediaResourceMode getMediaResourceMode() {
      return MediaResourceMode.fromInt(this.getMediaResourceMode(this.nativePtr));
   }

   private native void setMediaResourceMode(long var1, int var3);

   public synchronized void setMediaResourceMode(MediaResourceMode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMediaResourceMode() on it, clone it first.");
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

      this.setMediaResourceMode(this.nativePtr, mode.toInt());
   }

   private native boolean isMicEnabled(long var1);

   public synchronized boolean isMicEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isMicEnabled() on it, clone it first.");
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

   private native float getMicGainDb(long var1);

   public synchronized float getMicGainDb() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMicGainDb() on it, clone it first.");
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

      return this.getMicGainDb(this.nativePtr);
   }

   private native void setMicGainDb(long var1, float var3);

   public synchronized void setMicGainDb(float level) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMicGainDb() on it, clone it first.");
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

      this.setMicGainDb(this.nativePtr, level);
   }

   private native int getMissedCallsCount(long var1);

   public synchronized int getMissedCallsCount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMissedCallsCount() on it, clone it first.");
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

      return this.getMissedCallsCount(this.nativePtr);
   }

   private native int getMtu(long var1);

   public synchronized int getMtu() {
      return this.getMtu(this.nativePtr);
   }

   private native void setMtu(long var1, int var3);

   public synchronized void setMtu(int mtu) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMtu() on it, clone it first.");
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

      this.setMtu(this.nativePtr, mtu);
   }

   private native String getNatAddress(long var1);

   @Nullable
   public synchronized String getNatAddress() {
      return this.getNatAddress(this.nativePtr);
   }

   private native void setNatAddress(long var1, String var3);

   public synchronized void setNatAddress(@Nullable String addr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNatAddress() on it, clone it first.");
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

      this.setNatAddress(this.nativePtr, addr);
   }

   private native NatPolicy getNatPolicy(long var1);

   @Nullable
   public synchronized NatPolicy getNatPolicy() {
      return this.getNatPolicy(this.nativePtr);
   }

   private native void setNatPolicy(long var1, NatPolicy var3);

   public synchronized void setNatPolicy(@Nullable NatPolicy policy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNatPolicy() on it, clone it first.");
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

      this.setNatPolicy(this.nativePtr, policy);
   }

   private native Object getNativePreviewWindowId(long var1);

   @Nullable
   public synchronized Object getNativePreviewWindowId() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getNativePreviewWindowId() on it, clone it first.");
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

      return this.getNativePreviewWindowId(this.nativePtr);
   }

   private native void setNativePreviewWindowId(long var1, Object var3);

   public synchronized void setNativePreviewWindowId(@Nullable Object windowId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNativePreviewWindowId() on it, clone it first.");
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

      this.setNativePreviewWindowId(this.nativePtr, windowId);
   }

   private native boolean isNativeRingingEnabled(long var1);

   public synchronized boolean isNativeRingingEnabled() {
      return this.isNativeRingingEnabled(this.nativePtr);
   }

   private native void setNativeRingingEnabled(long var1, boolean var3);

   public synchronized void setNativeRingingEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNativeRingingEnabled() on it, clone it first.");
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

      this.setNativeRingingEnabled(this.nativePtr, enable);
   }

   private native Object getNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object getNativeVideoWindowId() {
      return this.getNativeVideoWindowId(this.nativePtr);
   }

   private native void setNativeVideoWindowId(long var1, Object var3);

   public synchronized void setNativeVideoWindowId(@Nullable Object windowId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNativeVideoWindowId() on it, clone it first.");
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

      this.setNativeVideoWindowId(this.nativePtr, windowId);
   }

   private native void setNetworkReachable(long var1, boolean var3);

   public synchronized void setNetworkReachable(boolean reachable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNetworkReachable() on it, clone it first.");
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

      this.setNetworkReachable(this.nativePtr, reachable);
   }

   private native int getNortpTimeout(long var1);

   public synchronized int getNortpTimeout() {
      return this.getNortpTimeout(this.nativePtr);
   }

   private native void setNortpTimeout(long var1, int var3);

   public synchronized void setNortpTimeout(int seconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNortpTimeout() on it, clone it first.");
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

      this.setNortpTimeout(this.nativePtr, seconds);
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

   private native String getPlayFile(long var1);

   @Nullable
   public synchronized String getPlayFile() {
      return this.getPlayFile(this.nativePtr);
   }

   private native void setPlayFile(long var1, String var3);

   public synchronized void setPlayFile(@Nullable String file) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPlayFile() on it, clone it first.");
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

      this.setPlayFile(this.nativePtr, file);
   }

   private native String getPlaybackDevice(long var1);

   @Nullable
   public synchronized String getPlaybackDevice() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPlaybackDevice() on it, clone it first.");
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

      return this.getPlaybackDevice(this.nativePtr);
   }

   private native int setPlaybackDevice(long var1, String var3);

   public synchronized int setPlaybackDevice(@Nullable String devid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPlaybackDevice() on it, clone it first.");
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

      return this.setPlaybackDevice(this.nativePtr, devid);
   }

   private native float getPlaybackGainDb(long var1);

   public synchronized float getPlaybackGainDb() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPlaybackGainDb() on it, clone it first.");
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

      return this.getPlaybackGainDb(this.nativePtr);
   }

   private native void setPlaybackGainDb(long var1, float var3);

   public synchronized void setPlaybackGainDb(float level) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPlaybackGainDb() on it, clone it first.");
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

      this.setPlaybackGainDb(this.nativePtr, level);
   }

   private native float getPreferredFramerate(long var1);

   public synchronized float getPreferredFramerate() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPreferredFramerate() on it, clone it first.");
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

      return this.getPreferredFramerate(this.nativePtr);
   }

   private native void setPreferredFramerate(long var1, float var3);

   public synchronized void setPreferredFramerate(float fps) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPreferredFramerate() on it, clone it first.");
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

      this.setPreferredFramerate(this.nativePtr, fps);
   }

   private native VideoDefinition getPreferredVideoDefinition(long var1);

   @NonNull
   public synchronized VideoDefinition getPreferredVideoDefinition() {
      return this.getPreferredVideoDefinition(this.nativePtr);
   }

   private native void setPreferredVideoDefinition(long var1, VideoDefinition var3);

   public synchronized void setPreferredVideoDefinition(@NonNull VideoDefinition videoDefinition) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPreferredVideoDefinition() on it, clone it first.");
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

      this.setPreferredVideoDefinition(this.nativePtr, videoDefinition);
   }

   private native void setPreferredVideoDefinitionByName(long var1, String var3);

   public synchronized void setPreferredVideoDefinitionByName(@NonNull String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPreferredVideoDefinitionByName() on it, clone it first.");
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

      this.setPreferredVideoDefinitionByName(this.nativePtr, name);
   }

   private native PresenceModel getPresenceModel(long var1);

   @Nullable
   public synchronized PresenceModel getPresenceModel() {
      return this.getPresenceModel(this.nativePtr);
   }

   private native void setPresenceModel(long var1, PresenceModel var3);

   public synchronized void setPresenceModel(@Nullable PresenceModel presence) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPresenceModel() on it, clone it first.");
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

      this.setPresenceModel(this.nativePtr, presence);
   }

   private native VideoDefinition getPreviewVideoDefinition(long var1);

   @Nullable
   public synchronized VideoDefinition getPreviewVideoDefinition() {
      return this.getPreviewVideoDefinition(this.nativePtr);
   }

   private native void setPreviewVideoDefinition(long var1, VideoDefinition var3);

   public synchronized void setPreviewVideoDefinition(@Nullable VideoDefinition videoDefinition) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPreviewVideoDefinition() on it, clone it first.");
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

      this.setPreviewVideoDefinition(this.nativePtr, videoDefinition);
   }

   private native void setPreviewVideoDefinitionByName(long var1, String var3);

   public synchronized void setPreviewVideoDefinitionByName(@NonNull String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPreviewVideoDefinitionByName() on it, clone it first.");
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

      this.setPreviewVideoDefinitionByName(this.nativePtr, name);
   }

   private native String getPrimaryContact(long var1);

   @NonNull
   public synchronized String getPrimaryContact() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPrimaryContact() on it, clone it first.");
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

      return this.getPrimaryContact(this.nativePtr);
   }

   private native int setPrimaryContact(long var1, String var3);

   public synchronized int setPrimaryContact(@NonNull String contact) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPrimaryContact() on it, clone it first.");
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

      return this.setPrimaryContact(this.nativePtr, contact);
   }

   private native Address getPrimaryContactParsed(long var1);

   @Nullable
   public synchronized Address getPrimaryContactParsed() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPrimaryContactParsed() on it, clone it first.");
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

      return this.getPrimaryContactParsed(this.nativePtr);
   }

   private native String getProvisioningUri(long var1);

   @Nullable
   public synchronized String getProvisioningUri() {
      return this.getProvisioningUri(this.nativePtr);
   }

   private native int setProvisioningUri(long var1, String var3);

   public synchronized int setProvisioningUri(@Nullable String uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProvisioningUri() on it, clone it first.");
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

      return this.setProvisioningUri(this.nativePtr, uri);
   }

   private native ProxyConfig[] getProxyConfigList(long var1);

   @NonNull
   public synchronized ProxyConfig[] getProxyConfigList() {
      return this.getProxyConfigList(this.nativePtr);
   }

   private native int getPushIncomingCallTimeout(long var1);

   public synchronized int getPushIncomingCallTimeout() {
      return this.getPushIncomingCallTimeout(this.nativePtr);
   }

   private native void setPushIncomingCallTimeout(long var1, int var3);

   public synchronized void setPushIncomingCallTimeout(int seconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPushIncomingCallTimeout() on it, clone it first.");
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

      this.setPushIncomingCallTimeout(this.nativePtr, seconds);
   }

   private native PushNotificationConfig getPushNotificationConfig(long var1);

   @Nullable
   public synchronized PushNotificationConfig getPushNotificationConfig() {
      return this.getPushNotificationConfig(this.nativePtr);
   }

   private native boolean isPushNotificationEnabled(long var1);

   public synchronized boolean isPushNotificationEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isPushNotificationEnabled() on it, clone it first.");
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

      return this.isPushNotificationEnabled(this.nativePtr);
   }

   private native void setPushNotificationEnabled(long var1, boolean var3);

   public synchronized void setPushNotificationEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPushNotificationEnabled() on it, clone it first.");
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

      this.setPushNotificationEnabled(this.nativePtr, enable);
   }

   private native boolean isQrcodeVideoPreviewEnabled(long var1);

   public synchronized boolean isQrcodeVideoPreviewEnabled() {
      return this.isQrcodeVideoPreviewEnabled(this.nativePtr);
   }

   private native void setQrcodeVideoPreviewEnabled(long var1, boolean var3);

   public synchronized void setQrcodeVideoPreviewEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setQrcodeVideoPreviewEnabled() on it, clone it first.");
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

      this.setQrcodeVideoPreviewEnabled(this.nativePtr, enable);
   }

   private native boolean isRealtimeTextEnabled(long var1);

   public synchronized boolean isRealtimeTextEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isRealtimeTextEnabled() on it, clone it first.");
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

      return this.isRealtimeTextEnabled(this.nativePtr);
   }

   private native boolean isRecordAwareEnabled(long var1);

   public synchronized boolean isRecordAwareEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isRecordAwareEnabled() on it, clone it first.");
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

      return this.isRecordAwareEnabled(this.nativePtr);
   }

   private native void setRecordAwareEnabled(long var1, boolean var3);

   public synchronized void setRecordAwareEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRecordAwareEnabled() on it, clone it first.");
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

      this.setRecordAwareEnabled(this.nativePtr, enable);
   }

   private native String getRecordFile(long var1);

   @Nullable
   public synchronized String getRecordFile() {
      return this.getRecordFile(this.nativePtr);
   }

   private native void setRecordFile(long var1, String var3);

   public synchronized void setRecordFile(@Nullable String file) {
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

      this.setRecordFile(this.nativePtr, file);
   }

   private native String getRemoteRingbackTone(long var1);

   @Nullable
   public synchronized String getRemoteRingbackTone() {
      return this.getRemoteRingbackTone(this.nativePtr);
   }

   private native void setRemoteRingbackTone(long var1, String var3);

   public synchronized void setRemoteRingbackTone(@Nullable String ring) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRemoteRingbackTone() on it, clone it first.");
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

      this.setRemoteRingbackTone(this.nativePtr, ring);
   }

   private native boolean isRetransmissionOnNackEnabled(long var1);

   public synchronized boolean isRetransmissionOnNackEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isRetransmissionOnNackEnabled() on it, clone it first.");
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

      return this.isRetransmissionOnNackEnabled(this.nativePtr);
   }

   private native void setRetransmissionOnNackEnabled(long var1, boolean var3);

   public synchronized void setRetransmissionOnNackEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRetransmissionOnNackEnabled() on it, clone it first.");
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

      this.setRetransmissionOnNackEnabled(this.nativePtr, enable);
   }

   private native String getRing(long var1);

   @Nullable
   public synchronized String getRing() {
      return this.getRing(this.nativePtr);
   }

   private native void setRing(long var1, String var3);

   public synchronized void setRing(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRing() on it, clone it first.");
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

      this.setRing(this.nativePtr, path);
   }

   private native boolean getRingDuringIncomingEarlyMedia(long var1);

   public synchronized boolean getRingDuringIncomingEarlyMedia() {
      return this.getRingDuringIncomingEarlyMedia(this.nativePtr);
   }

   private native void setRingDuringIncomingEarlyMedia(long var1, boolean var3);

   public synchronized void setRingDuringIncomingEarlyMedia(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRingDuringIncomingEarlyMedia() on it, clone it first.");
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

      this.setRingDuringIncomingEarlyMedia(this.nativePtr, enable);
   }

   private native String getRingback(long var1);

   @Nullable
   public synchronized String getRingback() {
      return this.getRingback(this.nativePtr);
   }

   private native void setRingback(long var1, String var3);

   public synchronized void setRingback(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRingback() on it, clone it first.");
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

      this.setRingback(this.nativePtr, path);
   }

   private native String getRingerDevice(long var1);

   @Nullable
   public synchronized String getRingerDevice() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getRingerDevice() on it, clone it first.");
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

      return this.getRingerDevice(this.nativePtr);
   }

   private native int setRingerDevice(long var1, String var3);

   public synchronized int setRingerDevice(@Nullable String devid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRingerDevice() on it, clone it first.");
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

      return this.setRingerDevice(this.nativePtr, devid);
   }

   private native String getRootCa(long var1);

   @Nullable
   public synchronized String getRootCa() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getRootCa() on it, clone it first.");
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

      return this.getRootCa(this.nativePtr);
   }

   private native void setRootCa(long var1, String var3);

   public synchronized void setRootCa(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRootCa() on it, clone it first.");
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

      this.setRootCa(this.nativePtr, path);
   }

   private native void setRootCaData(long var1, String var3);

   public synchronized void setRootCaData(@Nullable String data) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRootCaData() on it, clone it first.");
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

      this.setRootCaData(this.nativePtr, data);
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

   private native boolean isSdp200AckEnabled(long var1);

   public synchronized boolean isSdp200AckEnabled() {
      return this.isSdp200AckEnabled(this.nativePtr);
   }

   private native void setSdp200AckEnabled(long var1, boolean var3);

   public synchronized void setSdp200AckEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSdp200AckEnabled() on it, clone it first.");
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

      this.setSdp200AckEnabled(this.nativePtr, enable);
   }

   private native boolean isSelfViewEnabled(long var1);

   public synchronized boolean isSelfViewEnabled() {
      return this.isSelfViewEnabled(this.nativePtr);
   }

   private native void setSelfViewEnabled(long var1, boolean var3);

   public synchronized void setSelfViewEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSelfViewEnabled() on it, clone it first.");
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

      this.setSelfViewEnabled(this.nativePtr, enable);
   }

   private native void setSenderNameHiddenInForwardMessageEnabled(long var1, boolean var3);

   public synchronized void setSenderNameHiddenInForwardMessageEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSenderNameHiddenInForwardMessageEnabled() on it, clone it first.");
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

      this.setSenderNameHiddenInForwardMessageEnabled(this.nativePtr, enable);
   }

   private native boolean isSessionExpiresEnabled(long var1);

   public synchronized boolean isSessionExpiresEnabled() {
      return this.isSessionExpiresEnabled(this.nativePtr);
   }

   private native void setSessionExpiresEnabled(long var1, boolean var3);

   public synchronized void setSessionExpiresEnabled(boolean enabled) {
      this.setSessionExpiresEnabled(this.nativePtr, enabled);
   }

   private native int getSessionExpiresMinValue(long var1);

   public synchronized int getSessionExpiresMinValue() {
      return this.getSessionExpiresMinValue(this.nativePtr);
   }

   private native void setSessionExpiresMinValue(long var1, int var3);

   public synchronized void setSessionExpiresMinValue(int min) {
      this.setSessionExpiresMinValue(this.nativePtr, min);
   }

   private native int getSessionExpiresRefresherValue(long var1);

   public synchronized SessionExpiresRefresher getSessionExpiresRefresherValue() {
      return SessionExpiresRefresher.fromInt(this.getSessionExpiresRefresherValue(this.nativePtr));
   }

   private native void setSessionExpiresRefresherValue(long var1, int var3);

   public synchronized void setSessionExpiresRefresherValue(SessionExpiresRefresher refresher) {
      this.setSessionExpiresRefresherValue(this.nativePtr, refresher.toInt());
   }

   private native int getSessionExpiresValue(long var1);

   public synchronized int getSessionExpiresValue() {
      return this.getSessionExpiresValue(this.nativePtr);
   }

   private native void setSessionExpiresValue(long var1, int var3);

   public synchronized void setSessionExpiresValue(int expires) {
      this.setSessionExpiresValue(this.nativePtr, expires);
   }

   private native int getSipDscp(long var1);

   public synchronized int getSipDscp() {
      return this.getSipDscp(this.nativePtr);
   }

   private native void setSipDscp(long var1, int var3);

   public synchronized void setSipDscp(int dscp) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipDscp() on it, clone it first.");
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

      this.setSipDscp(this.nativePtr, dscp);
   }

   private native void setSipNetworkReachable(long var1, boolean var3);

   public synchronized void setSipNetworkReachable(boolean reachable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipNetworkReachable() on it, clone it first.");
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

      this.setSipNetworkReachable(this.nativePtr, reachable);
   }

   private native int getSipTransportTimeout(long var1);

   public synchronized int getSipTransportTimeout() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getSipTransportTimeout() on it, clone it first.");
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

      return this.getSipTransportTimeout(this.nativePtr);
   }

   private native void setSipTransportTimeout(long var1, int var3);

   public synchronized void setSipTransportTimeout(int timeoutMs) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSipTransportTimeout() on it, clone it first.");
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

      this.setSipTransportTimeout(this.nativePtr, timeoutMs);
   }

   private native String[] getSoundDevicesList(long var1);

   @NonNull
   public synchronized String[] getSoundDevicesList() {
      return this.getSoundDevicesList(this.nativePtr);
   }

   private native String getSrtpCryptoSuites(long var1);

   @NonNull
   public synchronized String getSrtpCryptoSuites() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getSrtpCryptoSuites() on it, clone it first.");
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

      return this.getSrtpCryptoSuites(this.nativePtr);
   }

   private native void setSrtpCryptoSuites(long var1, String var3);

   public synchronized void setSrtpCryptoSuites(@NonNull String suites) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSrtpCryptoSuites() on it, clone it first.");
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

      this.setSrtpCryptoSuites(this.nativePtr, suites);
   }

   private native String getStaticPicture(long var1);

   @Nullable
   public synchronized String getStaticPicture() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getStaticPicture() on it, clone it first.");
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

      return this.getStaticPicture(this.nativePtr);
   }

   private native int setStaticPicture(long var1, String var3);

   public synchronized int setStaticPicture(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStaticPicture() on it, clone it first.");
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

      return this.setStaticPicture(this.nativePtr, path);
   }

   private native float getStaticPictureFps(long var1);

   public synchronized float getStaticPictureFps() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getStaticPictureFps() on it, clone it first.");
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

      return this.getStaticPictureFps(this.nativePtr);
   }

   private native int setStaticPictureFps(long var1, float var3);

   public synchronized int setStaticPictureFps(float fps) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStaticPictureFps() on it, clone it first.");
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

      return this.setStaticPictureFps(this.nativePtr, fps);
   }

   private native String getStunServer(long var1);

   @Nullable
   public synchronized String getStunServer() {
      return this.getStunServer(this.nativePtr);
   }

   private native void setStunServer(long var1, String var3);

   public synchronized void setStunServer(@Nullable String server) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStunServer() on it, clone it first.");
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

      this.setStunServer(this.nativePtr, server);
   }

   private native String[] getSupportedFileFormatsList(long var1);

   @NonNull
   public synchronized String[] getSupportedFileFormatsList() {
      return this.getSupportedFileFormatsList(this.nativePtr);
   }

   private native void setSupportedTag(long var1, String var3);

   public synchronized void setSupportedTag(String tags) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSupportedTag() on it, clone it first.");
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

      this.setSupportedTag(this.nativePtr, tags);
   }

   private native int getTag100RelSupportLevel(long var1);

   public synchronized SupportLevel getTag100RelSupportLevel() {
      return SupportLevel.fromInt(this.getTag100RelSupportLevel(this.nativePtr));
   }

   private native void setTag100RelSupportLevel(long var1, int var3);

   public synchronized void setTag100RelSupportLevel(SupportLevel level) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTag100RelSupportLevel() on it, clone it first.");
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

      this.setTag100RelSupportLevel(this.nativePtr, level.toInt());
   }

   private native void setTcapLineMergingEnabled(long var1, boolean var3);

   public synchronized void setTcapLineMergingEnabled(boolean merge) {
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

      this.setTcapLineMergingEnabled(this.nativePtr, merge);
   }

   private native boolean isTcapLinesMergingEnabled(long var1);

   public synchronized boolean isTcapLinesMergingEnabled() {
      return this.isTcapLinesMergingEnabled(this.nativePtr);
   }

   private native PayloadType[] getTextPayloadTypes(long var1);

   @NonNull
   public synchronized PayloadType[] getTextPayloadTypes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getTextPayloadTypes() on it, clone it first.");
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

      return this.getTextPayloadTypes(this.nativePtr);
   }

   private native void setTextPayloadTypes(long var1, PayloadType[] var3);

   public synchronized void setTextPayloadTypes(@Nullable PayloadType[] payloadTypes) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTextPayloadTypes() on it, clone it first.");
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

      this.setTextPayloadTypes(this.nativePtr, payloadTypes);
   }

   private native int getTextPort(long var1);

   public synchronized int getTextPort() {
      return this.getTextPort(this.nativePtr);
   }

   private native void setTextPort(long var1, int var3);

   public synchronized void setTextPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTextPort() on it, clone it first.");
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

      this.setTextPort(this.nativePtr, port);
   }

   private native Range getTextPortsRange(long var1);

   @NonNull
   public synchronized Range getTextPortsRange() {
      return this.getTextPortsRange(this.nativePtr);
   }

   private native String getTlsCert(long var1);

   @Nullable
   public synchronized String getTlsCert() {
      return this.getTlsCert(this.nativePtr);
   }

   private native void setTlsCert(long var1, String var3);

   public synchronized void setTlsCert(@Nullable String tlsCert) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsCert() on it, clone it first.");
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

      this.setTlsCert(this.nativePtr, tlsCert);
   }

   private native String getTlsCertPath(long var1);

   @Nullable
   public synchronized String getTlsCertPath() {
      return this.getTlsCertPath(this.nativePtr);
   }

   private native void setTlsCertPath(long var1, String var3);

   public synchronized void setTlsCertPath(@Nullable String tlsCertPath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsCertPath() on it, clone it first.");
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

      this.setTlsCertPath(this.nativePtr, tlsCertPath);
   }

   private native String getTlsKey(long var1);

   @Nullable
   public synchronized String getTlsKey() {
      return this.getTlsKey(this.nativePtr);
   }

   private native void setTlsKey(long var1, String var3);

   public synchronized void setTlsKey(@Nullable String tlsKey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsKey() on it, clone it first.");
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

      this.setTlsKey(this.nativePtr, tlsKey);
   }

   private native String getTlsKeyPath(long var1);

   @Nullable
   public synchronized String getTlsKeyPath() {
      return this.getTlsKeyPath(this.nativePtr);
   }

   private native void setTlsKeyPath(long var1, String var3);

   public synchronized void setTlsKeyPath(@Nullable String tlsKeyPath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTlsKeyPath() on it, clone it first.");
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

      this.setTlsKeyPath(this.nativePtr, tlsKeyPath);
   }

   private native Transports getTransports(long var1);

   @NonNull
   public synchronized Transports getTransports() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getTransports() on it, clone it first.");
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

      return this.getTransports(this.nativePtr);
   }

   private native int setTransports(long var1, Transports var3);

   public synchronized int setTransports(@NonNull Transports transports) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTransports() on it, clone it first.");
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

      return this.setTransports(this.nativePtr, transports);
   }

   private native Transports getTransportsUsed(long var1);

   @NonNull
   public synchronized Transports getTransportsUsed() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getTransportsUsed() on it, clone it first.");
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

      return this.getTransportsUsed(this.nativePtr);
   }

   private native Tunnel getTunnel(long var1);

   @Nullable
   public synchronized Tunnel getTunnel() {
      return this.getTunnel(this.nativePtr);
   }

   private native int getUnreadChatMessageCount(long var1);

   public synchronized int getUnreadChatMessageCount() {
      return this.getUnreadChatMessageCount(this.nativePtr);
   }

   private native int getUnreadChatMessageCountFromActiveLocals(long var1);

   public synchronized int getUnreadChatMessageCountFromActiveLocals() {
      return this.getUnreadChatMessageCountFromActiveLocals(this.nativePtr);
   }

   private native int getUploadBandwidth(long var1);

   public synchronized int getUploadBandwidth() {
      return this.getUploadBandwidth(this.nativePtr);
   }

   private native void setUploadBandwidth(long var1, int var3);

   public synchronized void setUploadBandwidth(int bandwidth) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUploadBandwidth() on it, clone it first.");
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

      this.setUploadBandwidth(this.nativePtr, bandwidth);
   }

   private native int getUploadPtime(long var1);

   public synchronized int getUploadPtime() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUploadPtime() on it, clone it first.");
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

      return this.getUploadPtime(this.nativePtr);
   }

   private native void setUploadPtime(long var1, int var3);

   public synchronized void setUploadPtime(int ptime) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUploadPtime() on it, clone it first.");
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

      this.setUploadPtime(this.nativePtr, ptime);
   }

   private native String getUpnpExternalIpaddress(long var1);

   @Nullable
   public synchronized String getUpnpExternalIpaddress() {
      return this.getUpnpExternalIpaddress(this.nativePtr);
   }

   private native int getUpnpState(long var1);

   public synchronized UpnpState getUpnpState() {
      return UpnpState.fromInt(this.getUpnpState(this.nativePtr));
   }

   private native boolean getUseFiles(long var1);

   public synchronized boolean getUseFiles() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUseFiles() on it, clone it first.");
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

      return this.getUseFiles(this.nativePtr);
   }

   private native void setUseFiles(long var1, boolean var3);

   public synchronized void setUseFiles(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUseFiles() on it, clone it first.");
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

      this.setUseFiles(this.nativePtr, yesno);
   }

   private native boolean getUseInfoForDtmf(long var1);

   public synchronized boolean getUseInfoForDtmf() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUseInfoForDtmf() on it, clone it first.");
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

      return this.getUseInfoForDtmf(this.nativePtr);
   }

   private native void setUseInfoForDtmf(long var1, boolean var3);

   public synchronized void setUseInfoForDtmf(boolean useInfo) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUseInfoForDtmf() on it, clone it first.");
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

      this.setUseInfoForDtmf(this.nativePtr, useInfo);
   }

   private native boolean getUseRfc2833ForDtmf(long var1);

   public synchronized boolean getUseRfc2833ForDtmf() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUseRfc2833ForDtmf() on it, clone it first.");
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

      return this.getUseRfc2833ForDtmf(this.nativePtr);
   }

   private native void setUseRfc2833ForDtmf(long var1, boolean var3);

   public synchronized void setUseRfc2833ForDtmf(boolean useRfc2833) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUseRfc2833ForDtmf() on it, clone it first.");
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

      this.setUseRfc2833ForDtmf(this.nativePtr, useRfc2833);
   }

   private native String getUserAgent(long var1);

   @NonNull
   public synchronized String getUserAgent() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUserAgent() on it, clone it first.");
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

      return this.getUserAgent(this.nativePtr);
   }

   private native String getUserCertificatesPath(long var1);

   @Nullable
   public synchronized String getUserCertificatesPath() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUserCertificatesPath() on it, clone it first.");
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

      return this.getUserCertificatesPath(this.nativePtr);
   }

   private native void setUserCertificatesPath(long var1, String var3);

   public synchronized void setUserCertificatesPath(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUserCertificatesPath() on it, clone it first.");
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

      this.setUserCertificatesPath(this.nativePtr, path);
   }

   private native boolean isVibrationOnIncomingCallEnabled(long var1);

   public synchronized boolean isVibrationOnIncomingCallEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVibrationOnIncomingCallEnabled() on it, clone it first.");
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

      return this.isVibrationOnIncomingCallEnabled(this.nativePtr);
   }

   private native void setVibrationOnIncomingCallEnabled(long var1, boolean var3);

   public synchronized void setVibrationOnIncomingCallEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVibrationOnIncomingCallEnabled() on it, clone it first.");
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

      this.setVibrationOnIncomingCallEnabled(this.nativePtr, enable);
   }

   private native VideoActivationPolicy getVideoActivationPolicy(long var1);

   @NonNull
   public synchronized VideoActivationPolicy getVideoActivationPolicy() {
      return this.getVideoActivationPolicy(this.nativePtr);
   }

   private native void setVideoActivationPolicy(long var1, VideoActivationPolicy var3);

   public synchronized void setVideoActivationPolicy(@NonNull VideoActivationPolicy policy) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoActivationPolicy() on it, clone it first.");
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

      this.setVideoActivationPolicy(this.nativePtr, policy);
   }

   private native boolean isVideoAdaptiveJittcompEnabled(long var1);

   public synchronized boolean isVideoAdaptiveJittcompEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVideoAdaptiveJittcompEnabled() on it, clone it first.");
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

      return this.isVideoAdaptiveJittcompEnabled(this.nativePtr);
   }

   private native void setVideoAdaptiveJittcompEnabled(long var1, boolean var3);

   public synchronized void setVideoAdaptiveJittcompEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoAdaptiveJittcompEnabled() on it, clone it first.");
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

      this.setVideoAdaptiveJittcompEnabled(this.nativePtr, enable);
   }

   private native boolean isVideoCaptureEnabled(long var1);

   public synchronized boolean isVideoCaptureEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVideoCaptureEnabled() on it, clone it first.");
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

      return this.isVideoCaptureEnabled(this.nativePtr);
   }

   private native void setVideoCaptureEnabled(long var1, boolean var3);

   public synchronized void setVideoCaptureEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoCaptureEnabled() on it, clone it first.");
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

      this.setVideoCaptureEnabled(this.nativePtr, enable);
   }

   private native String getVideoDevice(long var1);

   @Nullable
   public synchronized String getVideoDevice() {
      return this.getVideoDevice(this.nativePtr);
   }

   private native int setVideoDevice(long var1, String var3);

   public synchronized int setVideoDevice(@Nullable String id) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoDevice() on it, clone it first.");
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

      return this.setVideoDevice(this.nativePtr, id);
   }

   private native String[] getVideoDevicesList(long var1);

   @NonNull
   public synchronized String[] getVideoDevicesList() {
      return this.getVideoDevicesList(this.nativePtr);
   }

   private native boolean isVideoDisplayEnabled(long var1);

   public synchronized boolean isVideoDisplayEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVideoDisplayEnabled() on it, clone it first.");
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

      return this.isVideoDisplayEnabled(this.nativePtr);
   }

   private native void setVideoDisplayEnabled(long var1, boolean var3);

   public synchronized void setVideoDisplayEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoDisplayEnabled() on it, clone it first.");
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

      this.setVideoDisplayEnabled(this.nativePtr, enable);
   }

   private native String getVideoDisplayFilter(long var1);

   @Nullable
   public synchronized String getVideoDisplayFilter() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getVideoDisplayFilter() on it, clone it first.");
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

      return this.getVideoDisplayFilter(this.nativePtr);
   }

   private native void setVideoDisplayFilter(long var1, String var3);

   public synchronized void setVideoDisplayFilter(@Nullable String filterName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoDisplayFilter() on it, clone it first.");
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

      this.setVideoDisplayFilter(this.nativePtr, filterName);
   }

   private native int getVideoDscp(long var1);

   public synchronized int getVideoDscp() {
      return this.getVideoDscp(this.nativePtr);
   }

   private native void setVideoDscp(long var1, int var3);

   public synchronized void setVideoDscp(int dscp) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoDscp() on it, clone it first.");
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

      this.setVideoDscp(this.nativePtr, dscp);
   }

   private native boolean isVideoEnabled(long var1);

   public synchronized boolean isVideoEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isVideoEnabled() on it, clone it first.");
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

      return this.isVideoEnabled(this.nativePtr);
   }

   private native int getVideoJittcomp(long var1);

   public synchronized int getVideoJittcomp() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getVideoJittcomp() on it, clone it first.");
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

      return this.getVideoJittcomp(this.nativePtr);
   }

   private native void setVideoJittcomp(long var1, int var3);

   public synchronized void setVideoJittcomp(int milliseconds) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoJittcomp() on it, clone it first.");
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

      this.setVideoJittcomp(this.nativePtr, milliseconds);
   }

   private native String getVideoMulticastAddr(long var1);

   @Nullable
   public synchronized String getVideoMulticastAddr() {
      return this.getVideoMulticastAddr(this.nativePtr);
   }

   private native int setVideoMulticastAddr(long var1, String var3);

   public synchronized int setVideoMulticastAddr(@Nullable String ip) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoMulticastAddr() on it, clone it first.");
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

      return this.setVideoMulticastAddr(this.nativePtr, ip);
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

   private native int getVideoMulticastTtl(long var1);

   public synchronized int getVideoMulticastTtl() {
      return this.getVideoMulticastTtl(this.nativePtr);
   }

   private native int setVideoMulticastTtl(long var1, int var3);

   public synchronized int setVideoMulticastTtl(int ttl) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoMulticastTtl() on it, clone it first.");
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

      return this.setVideoMulticastTtl(this.nativePtr, ttl);
   }

   private native PayloadType[] getVideoPayloadTypes(long var1);

   @NonNull
   public synchronized PayloadType[] getVideoPayloadTypes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getVideoPayloadTypes() on it, clone it first.");
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

      return this.getVideoPayloadTypes(this.nativePtr);
   }

   private native void setVideoPayloadTypes(long var1, PayloadType[] var3);

   public synchronized void setVideoPayloadTypes(@Nullable PayloadType[] payloadTypes) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoPayloadTypes() on it, clone it first.");
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

      this.setVideoPayloadTypes(this.nativePtr, payloadTypes);
   }

   private native int getVideoPort(long var1);

   public synchronized int getVideoPort() {
      return this.getVideoPort(this.nativePtr);
   }

   private native void setVideoPort(long var1, int var3);

   public synchronized void setVideoPort(int port) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoPort() on it, clone it first.");
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

      this.setVideoPort(this.nativePtr, port);
   }

   private native Range getVideoPortsRange(long var1);

   @NonNull
   public synchronized Range getVideoPortsRange() {
      return this.getVideoPortsRange(this.nativePtr);
   }

   private native String getVideoPreset(long var1);

   @Nullable
   public synchronized String getVideoPreset() {
      return this.getVideoPreset(this.nativePtr);
   }

   private native void setVideoPreset(long var1, String var3);

   public synchronized void setVideoPreset(@Nullable String preset) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoPreset() on it, clone it first.");
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

      this.setVideoPreset(this.nativePtr, preset);
   }

   private native boolean isVideoPreviewEnabled(long var1);

   public synchronized boolean isVideoPreviewEnabled() {
      return this.isVideoPreviewEnabled(this.nativePtr);
   }

   private native void setVideoPreviewEnabled(long var1, boolean var3);

   public synchronized void setVideoPreviewEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoPreviewEnabled() on it, clone it first.");
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

      this.setVideoPreviewEnabled(this.nativePtr, enable);
   }

   private native void setVideoSourceReuseEnabled(long var1, boolean var3);

   public synchronized void setVideoSourceReuseEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoSourceReuseEnabled() on it, clone it first.");
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

      this.setVideoSourceReuseEnabled(this.nativePtr, enable);
   }

   private native boolean isWifiOnlyEnabled(long var1);

   public synchronized boolean isWifiOnlyEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isWifiOnlyEnabled() on it, clone it first.");
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

      return this.isWifiOnlyEnabled(this.nativePtr);
   }

   private native void setWifiOnlyEnabled(long var1, boolean var3);

   public synchronized void setWifiOnlyEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setWifiOnlyEnabled() on it, clone it first.");
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

      this.setWifiOnlyEnabled(this.nativePtr, enable);
   }

   private native boolean isZeroRtpPortForStreamInactiveEnabled(long var1);

   public synchronized boolean isZeroRtpPortForStreamInactiveEnabled() {
      return this.isZeroRtpPortForStreamInactiveEnabled(this.nativePtr);
   }

   private native void setZeroRtpPortForStreamInactiveEnabled(long var1, boolean var3);

   public synchronized void setZeroRtpPortForStreamInactiveEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setZeroRtpPortForStreamInactiveEnabled() on it, clone it first.");
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

      this.setZeroRtpPortForStreamInactiveEnabled(this.nativePtr, enable);
   }

   private native int[] getZrtpAvailableKeyAgreementList(long var1);

   @NonNull
   public synchronized ZrtpKeyAgreement[] getZrtpAvailableKeyAgreementList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getZrtpAvailableKeyAgreementList() on it, clone it first.");
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

      return ZrtpKeyAgreement.fromIntArray(this.getZrtpAvailableKeyAgreementList(this.nativePtr));
   }

   private native boolean isZrtpGoClearEnabled(long var1);

   public synchronized boolean isZrtpGoClearEnabled() {
      return this.isZrtpGoClearEnabled(this.nativePtr);
   }

   private native void setZrtpGoClearEnabled(long var1, boolean var3);

   public synchronized void setZrtpGoClearEnabled(boolean enabled) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setZrtpGoClearEnabled() on it, clone it first.");
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

      this.setZrtpGoClearEnabled(this.nativePtr, enabled);
   }

   private native int[] getZrtpKeyAgreementList(long var1);

   @NonNull
   public synchronized ZrtpKeyAgreement[] getZrtpKeyAgreementList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getZrtpKeyAgreementList() on it, clone it first.");
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

      return ZrtpKeyAgreement.fromIntArray(this.getZrtpKeyAgreementList(this.nativePtr));
   }

   private native void setZrtpKeyAgreementSuites(long var1, int[] var3);

   public synchronized void setZrtpKeyAgreementSuites(@Nullable ZrtpKeyAgreement[] keyAgreements) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setZrtpKeyAgreementSuites() on it, clone it first.");
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

      this.setZrtpKeyAgreementSuites(this.nativePtr, ZrtpKeyAgreement.toIntArray(keyAgreements));
   }

   private native String getZrtpSecretsFile(long var1);

   @Nullable
   public synchronized String getZrtpSecretsFile() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getZrtpSecretsFile() on it, clone it first.");
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

      return this.getZrtpSecretsFile(this.nativePtr);
   }

   private native void setZrtpSecretsFile(long var1, String var3);

   public synchronized void setZrtpSecretsFile(@Nullable String file) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setZrtpSecretsFile() on it, clone it first.");
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

      this.setZrtpSecretsFile(this.nativePtr, file);
   }

   private native void activateAudioSession(long var1, boolean var3);

   public synchronized void activateAudioSession(boolean actived) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call activateAudioSession() on it, clone it first.");
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

      this.activateAudioSession(this.nativePtr, actived);
   }

   private native int addAccount(long var1, Account var3);

   public synchronized int addAccount(@NonNull Account account) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addAccount() on it, clone it first.");
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

      return this.addAccount(this.nativePtr, account);
   }

   private native int addAllToConference(long var1);

   public synchronized int addAllToConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addAllToConference() on it, clone it first.");
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

      return this.addAllToConference(this.nativePtr);
   }

   private native void addAuthInfo(long var1, AuthInfo var3);

   public synchronized void addAuthInfo(@NonNull AuthInfo info) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addAuthInfo() on it, clone it first.");
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

      this.addAuthInfo(this.nativePtr, info);
   }

   private native void addContentTypeSupport(long var1, String var3);

   public synchronized void addContentTypeSupport(@NonNull String contentType) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addContentTypeSupport() on it, clone it first.");
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

      this.addContentTypeSupport(this.nativePtr, contentType);
   }

   private native void addFriendList(long var1, FriendList var3);

   public synchronized void addFriendList(@NonNull FriendList list) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addFriendList() on it, clone it first.");
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

      this.addFriendList(this.nativePtr, list);
   }

   private native void addLdap(long var1, Ldap var3);

   public synchronized void addLdap(@NonNull Ldap ldap) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addLdap() on it, clone it first.");
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

      this.addLdap(this.nativePtr, ldap);
   }

   private native void addLinphoneSpec(long var1, String var3);

   public synchronized void addLinphoneSpec(@NonNull String spec) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addLinphoneSpec() on it, clone it first.");
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

      this.addLinphoneSpec(this.nativePtr, spec);
   }

   private native int addProxyConfig(long var1, ProxyConfig var3);

   public synchronized int addProxyConfig(@NonNull ProxyConfig config) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addProxyConfig() on it, clone it first.");
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

      return this.addProxyConfig(this.nativePtr, config);
   }

   private native void addSupportedTag(long var1, String var3);

   public synchronized void addSupportedTag(@NonNull String tag) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addSupportedTag() on it, clone it first.");
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

      this.addSupportedTag(this.nativePtr, tag);
   }

   private native int addToConference(long var1, Call var3);

   public synchronized int addToConference(@NonNull Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addToConference() on it, clone it first.");
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

      return this.addToConference(this.nativePtr, call);
   }

   private native void audioRouteChanged(long var1);

   public synchronized void audioRouteChanged() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call audioRouteChanged() on it, clone it first.");
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

      this.audioRouteChanged(this.nativePtr);
   }

   private native int chatRoomGetDefaultEphemeralMode(long var1);

   public synchronized ChatRoomEphemeralMode chatRoomGetDefaultEphemeralMode() {
      return ChatRoomEphemeralMode.fromInt(this.chatRoomGetDefaultEphemeralMode(this.nativePtr));
   }

   private native void chatRoomSetDefaultEphemeralMode(long var1, int var3);

   public synchronized void chatRoomSetDefaultEphemeralMode(ChatRoomEphemeralMode mode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call chatRoomSetDefaultEphemeralMode() on it, clone it first.");
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

      this.chatRoomSetDefaultEphemeralMode(this.nativePtr, mode.toInt());
   }

   private native void checkForUpdate(long var1, String var3);

   public synchronized void checkForUpdate(@NonNull String currentVersion) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call checkForUpdate() on it, clone it first.");
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

      this.checkForUpdate(this.nativePtr, currentVersion);
   }

   private native void clearAccounts(long var1);

   public synchronized void clearAccounts() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearAccounts() on it, clone it first.");
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

      this.clearAccounts(this.nativePtr);
   }

   private native void clearAllAuthInfo(long var1);

   public synchronized void clearAllAuthInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearAllAuthInfo() on it, clone it first.");
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

      this.clearAllAuthInfo(this.nativePtr);
   }

   private native void clearCallLogs(long var1);

   public synchronized void clearCallLogs() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearCallLogs() on it, clone it first.");
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

      this.clearCallLogs(this.nativePtr);
   }

   private native void clearLdaps(long var1);

   public synchronized void clearLdaps() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearLdaps() on it, clone it first.");
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

      this.clearLdaps(this.nativePtr);
   }

   private native void clearProxyConfig(long var1);

   public synchronized void clearProxyConfig() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearProxyConfig() on it, clone it first.");
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

      this.clearProxyConfig(this.nativePtr);
   }

   private native int configSync(long var1);

   public synchronized int configSync() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call configSync() on it, clone it first.");
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

      return this.configSync(this.nativePtr);
   }

   private native void configureAudioSession(long var1);

   public synchronized void configureAudioSession() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call configureAudioSession() on it, clone it first.");
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

      this.configureAudioSession(this.nativePtr);
   }

   private native Account createAccount(long var1, AccountParams var3);

   @NonNull
   public synchronized Account createAccount(@NonNull AccountParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createAccount() on it, clone it first.");
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

      return this.createAccount(this.nativePtr, params);
   }

   private native AccountCreator createAccountCreator(long var1, String var3);

   @NonNull
   public synchronized AccountCreator createAccountCreator(@Nullable String xmlrpcUrl) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createAccountCreator() on it, clone it first.");
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

      return this.createAccountCreator(this.nativePtr, xmlrpcUrl);
   }

   private native AccountParams createAccountParams(long var1);

   @NonNull
   public synchronized AccountParams createAccountParams() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createAccountParams() on it, clone it first.");
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

      return this.createAccountParams(this.nativePtr);
   }

   private native Address createAddress(long var1, String var3);

   @Nullable
   public synchronized Address createAddress(@Nullable String address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createAddress() on it, clone it first.");
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

      return this.createAddress(this.nativePtr, address);
   }

   private native CallLog createCallLog(long var1, Address var3, Address var4, int var5, int var6, long var7, long var9, int var11, boolean var12, float var13);

   @NonNull
   public synchronized CallLog createCallLog(@NonNull Address from, @NonNull Address to, Call.Dir dir, int duration, long startTime, long connectedTime, Call.Status status, boolean videoEnabled, float quality) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createCallLog() on it, clone it first.");
         } catch (CoreException var17) {
            Log.i(var17);
            StackTraceElement[] var13 = var17.getStackTrace();
            int var14 = var13.length;

            for(int var15 = 0; var15 < var14; ++var15) {
               StackTraceElement st = var13[var15];
               Log.i(st);
            }
         }
      }

      return this.createCallLog(this.nativePtr, from, to, dir.toInt(), duration, startTime, connectedTime, status.toInt(), videoEnabled, quality);
   }

   private native CallParams createCallParams(long var1, Call var3);

   @Nullable
   public synchronized CallParams createCallParams(@Nullable Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createCallParams() on it, clone it first.");
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

      return this.createCallParams(this.nativePtr, call);
   }

   private native ChatRoom createChatRoom3(long var1, String var3, Address[] var4);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull String subject, @NonNull Address[] participants) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
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

      return this.createChatRoom3(this.nativePtr, subject, participants);
   }

   private native ChatRoom createChatRoom2(long var1, ChatRoomParams var3, String var4, Address[] var5);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull ChatRoomParams params, String subject, @NonNull Address[] participants) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
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

      return this.createChatRoom2(this.nativePtr, params, subject, participants);
   }

   private native ChatRoom createChatRoom5(long var1, Address var3);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull Address participant) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
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

      return this.createChatRoom5(this.nativePtr, participant);
   }

   private native ChatRoom createChatRoom4(long var1, ChatRoomParams var3, Address var4, Address var5);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull ChatRoomParams params, @NonNull Address localAddr, @NonNull Address participant) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
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

      return this.createChatRoom4(this.nativePtr, params, localAddr, participant);
   }

   private native ChatRoom createChatRoom6(long var1, ChatRoomParams var3, Address var4, Address[] var5);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull ChatRoomParams params, @Nullable Address localAddr, @NonNull Address[] participants) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
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

      return this.createChatRoom6(this.nativePtr, params, localAddr, participants);
   }

   private native ChatRoom createChatRoom(long var1, ChatRoomParams var3, Address var4, String var5, Address[] var6);

   @Nullable
   public synchronized ChatRoom createChatRoom(@NonNull ChatRoomParams params, @NonNull Address localAddr, @NonNull String subject, @NonNull Address[] participants) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createChatRoom() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.createChatRoom(this.nativePtr, params, localAddr, subject, participants);
   }

   private native ChatRoom createClientGroupChatRoom(long var1, String var3, boolean var4);

   @Nullable
   public synchronized ChatRoom createClientGroupChatRoom(@NonNull String subject, boolean fallback) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createClientGroupChatRoom() on it, clone it first.");
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

      return this.createClientGroupChatRoom(this.nativePtr, subject, fallback);
   }

   private native ChatRoom createClientGroupChatRoom2(long var1, String var3, boolean var4, boolean var5);

   @Nullable
   public synchronized ChatRoom createClientGroupChatRoom(@NonNull String subject, boolean fallback, boolean encrypted) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createClientGroupChatRoom() on it, clone it first.");
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

      return this.createClientGroupChatRoom2(this.nativePtr, subject, fallback, encrypted);
   }

   private native ConferenceParams createConferenceParams2(long var1, Conference var3);

   @NonNull
   public synchronized ConferenceParams createConferenceParams(@Nullable Conference conference) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConferenceParams() on it, clone it first.");
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

      return this.createConferenceParams2(this.nativePtr, conference);
   }

   private native ConferenceScheduler createConferenceScheduler(long var1);

   @NonNull
   public synchronized ConferenceScheduler createConferenceScheduler() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConferenceScheduler() on it, clone it first.");
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

      return this.createConferenceScheduler(this.nativePtr);
   }

   private native Conference createConferenceWithParams(long var1, ConferenceParams var3);

   @Nullable
   public synchronized Conference createConferenceWithParams(@NonNull ConferenceParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConferenceWithParams() on it, clone it first.");
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

      return this.createConferenceWithParams(this.nativePtr, params);
   }

   private native Config createConfig(long var1, String var3);

   @NonNull
   public synchronized Config createConfig(@Nullable String filename) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConfig() on it, clone it first.");
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

      return this.createConfig(this.nativePtr, filename);
   }

   private native Content createContent(long var1);

   @NonNull
   public synchronized Content createContent() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createContent() on it, clone it first.");
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

      return this.createContent(this.nativePtr);
   }

   private native ChatRoomParams createDefaultChatRoomParams(long var1);

   @NonNull
   public synchronized ChatRoomParams createDefaultChatRoomParams() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createDefaultChatRoomParams() on it, clone it first.");
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

      return this.createDefaultChatRoomParams(this.nativePtr);
   }

   private native Friend createFriend(long var1);

   @NonNull
   public synchronized Friend createFriend() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createFriend() on it, clone it first.");
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

      return this.createFriend(this.nativePtr);
   }

   private native FriendList createFriendList(long var1);

   @NonNull
   public synchronized FriendList createFriendList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createFriendList() on it, clone it first.");
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

      return this.createFriendList(this.nativePtr);
   }

   private native Friend createFriendWithAddress(long var1, String var3);

   @Nullable
   public synchronized Friend createFriendWithAddress(@NonNull String address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createFriendWithAddress() on it, clone it first.");
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

      return this.createFriendWithAddress(this.nativePtr, address);
   }

   private native InfoMessage createInfoMessage(long var1);

   @NonNull
   public synchronized InfoMessage createInfoMessage() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createInfoMessage() on it, clone it first.");
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

      return this.createInfoMessage(this.nativePtr);
   }

   private native Ldap createLdap(long var1);

   @NonNull
   public synchronized Ldap createLdap() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createLdap() on it, clone it first.");
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

      return this.createLdap(this.nativePtr);
   }

   private native LdapParams createLdapParams(long var1);

   @NonNull
   public synchronized LdapParams createLdapParams() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createLdapParams() on it, clone it first.");
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

      return this.createLdapParams(this.nativePtr);
   }

   private native Ldap createLdapWithParams(long var1, LdapParams var3);

   @NonNull
   public synchronized Ldap createLdapWithParams(@NonNull LdapParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createLdapWithParams() on it, clone it first.");
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

      return this.createLdapWithParams(this.nativePtr, params);
   }

   private native Player createLocalPlayer(long var1, String var3, String var4, Object var5);

   @Nullable
   public synchronized Player createLocalPlayer(@Nullable String soundCardName, @Nullable String videoDisplayName, @Nullable Object windowId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createLocalPlayer() on it, clone it first.");
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

      return this.createLocalPlayer(this.nativePtr, soundCardName, videoDisplayName, windowId);
   }

   private native MagicSearch createMagicSearch(long var1);

   @NonNull
   public synchronized MagicSearch createMagicSearch() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createMagicSearch() on it, clone it first.");
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

      return this.createMagicSearch(this.nativePtr);
   }

   private native NatPolicy createNatPolicy(long var1);

   @NonNull
   public synchronized NatPolicy createNatPolicy() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createNatPolicy() on it, clone it first.");
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

      return this.createNatPolicy(this.nativePtr);
   }

   private native Object createNativePreviewWindowId(long var1);

   @Nullable
   public synchronized Object createNativePreviewWindowId() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createNativePreviewWindowId() on it, clone it first.");
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

      return this.createNativePreviewWindowId(this.nativePtr);
   }

   private native Object createNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object createNativeVideoWindowId() {
      return this.createNativeVideoWindowId(this.nativePtr);
   }

   private native Event createNotify(long var1, Address var3, String var4);

   @NonNull
   public synchronized Event createNotify(@NonNull Address resource, @NonNull String event) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createNotify() on it, clone it first.");
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

      return this.createNotify(this.nativePtr, resource, event);
   }

   private native Event createOneShotPublish(long var1, Address var3, String var4);

   @NonNull
   public synchronized Event createOneShotPublish(@NonNull Address resource, @NonNull String event) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createOneShotPublish() on it, clone it first.");
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

      return this.createOneShotPublish(this.nativePtr, resource, event);
   }

   private native PresenceActivity createPresenceActivity(long var1, int var3, String var4);

   @NonNull
   public synchronized PresenceActivity createPresenceActivity(PresenceActivity.Type acttype, @Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceActivity() on it, clone it first.");
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

      return this.createPresenceActivity(this.nativePtr, acttype.toInt(), description);
   }

   private native PresenceModel createPresenceModel(long var1);

   @NonNull
   public synchronized PresenceModel createPresenceModel() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceModel() on it, clone it first.");
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

      return this.createPresenceModel(this.nativePtr);
   }

   private native PresenceModel createPresenceModelWithActivity(long var1, int var3, String var4);

   @NonNull
   public synchronized PresenceModel createPresenceModelWithActivity(PresenceActivity.Type acttype, @Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceModelWithActivity() on it, clone it first.");
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

      return this.createPresenceModelWithActivity(this.nativePtr, acttype.toInt(), description);
   }

   private native PresenceModel createPresenceModelWithActivityAndNote(long var1, int var3, String var4, String var5, String var6);

   @NonNull
   public synchronized PresenceModel createPresenceModelWithActivityAndNote(PresenceActivity.Type acttype, @Nullable String description, @NonNull String note, @Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceModelWithActivityAndNote() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.createPresenceModelWithActivityAndNote(this.nativePtr, acttype.toInt(), description, note, lang);
   }

   private native PresenceNote createPresenceNote(long var1, String var3, String var4);

   @NonNull
   public synchronized PresenceNote createPresenceNote(@NonNull String content, @Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceNote() on it, clone it first.");
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

      return this.createPresenceNote(this.nativePtr, content, lang);
   }

   private native PresencePerson createPresencePerson(long var1, String var3);

   @NonNull
   public synchronized PresencePerson createPresencePerson(@NonNull String id) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresencePerson() on it, clone it first.");
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

      return this.createPresencePerson(this.nativePtr, id);
   }

   private native PresenceService createPresenceService(long var1, String var3, int var4, String var5);

   @NonNull
   public synchronized PresenceService createPresenceService(@NonNull String id, PresenceBasicStatus basicStatus, @NonNull String contact) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPresenceService() on it, clone it first.");
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

      return this.createPresenceService(this.nativePtr, id, basicStatus.toInt(), contact);
   }

   private native Address createPrimaryContactParsed(long var1);

   @Nullable
   public synchronized Address createPrimaryContactParsed() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPrimaryContactParsed() on it, clone it first.");
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

      return this.createPrimaryContactParsed(this.nativePtr);
   }

   private native ProxyConfig createProxyConfig(long var1);

   @NonNull
   public synchronized ProxyConfig createProxyConfig() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createProxyConfig() on it, clone it first.");
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

      return this.createProxyConfig(this.nativePtr);
   }

   private native Event createPublish(long var1, Address var3, String var4, int var5);

   @NonNull
   public synchronized Event createPublish(@NonNull Address resource, @NonNull String event, int expires) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createPublish() on it, clone it first.");
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

      return this.createPublish(this.nativePtr, resource, event, expires);
   }

   private native Recorder createRecorder(long var1, RecorderParams var3);

   @NonNull
   public synchronized Recorder createRecorder(@NonNull RecorderParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createRecorder() on it, clone it first.");
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

      return this.createRecorder(this.nativePtr, params);
   }

   private native RecorderParams createRecorderParams(long var1);

   @NonNull
   public synchronized RecorderParams createRecorderParams() {
      return this.createRecorderParams(this.nativePtr);
   }

   private native Event createSubscribe2(long var1, Address var3, ProxyConfig var4, String var5, int var6);

   @NonNull
   public synchronized Event createSubscribe(@NonNull Address resource, @NonNull ProxyConfig proxy, @NonNull String event, int expires) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createSubscribe() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.createSubscribe2(this.nativePtr, resource, proxy, event, expires);
   }

   private native Event createSubscribe(long var1, Address var3, String var4, int var5);

   @NonNull
   public synchronized Event createSubscribe(@NonNull Address resource, @NonNull String event, int expires) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createSubscribe() on it, clone it first.");
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

      return this.createSubscribe(this.nativePtr, resource, event, expires);
   }

   private native XmlRpcSession createXmlRpcSession(long var1, String var3);

   @NonNull
   public synchronized XmlRpcSession createXmlRpcSession(@NonNull String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createXmlRpcSession() on it, clone it first.");
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

      return this.createXmlRpcSession(this.nativePtr, url);
   }

   private native void deleteChatRoom(long var1, ChatRoom var3);

   public synchronized void deleteChatRoom(@NonNull ChatRoom chatRoom) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call deleteChatRoom() on it, clone it first.");
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

      this.deleteChatRoom(this.nativePtr, chatRoom);
   }

   private native void deleteConferenceInformation(long var1, ConferenceInfo var3);

   public synchronized void deleteConferenceInformation(@NonNull ConferenceInfo conferenceInfo) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call deleteConferenceInformation() on it, clone it first.");
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

      this.deleteConferenceInformation(this.nativePtr, conferenceInfo);
   }

   private native void didRegisterForRemotePush(long var1, Object var3);

   public synchronized void didRegisterForRemotePush(@Nullable Object deviceToken) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call didRegisterForRemotePush() on it, clone it first.");
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

      this.didRegisterForRemotePush(this.nativePtr, deviceToken);
   }

   private native void didRegisterForRemotePushWithStringifiedToken(long var1, String var3);

   public synchronized void didRegisterForRemotePushWithStringifiedToken(@Nullable String deviceTokenStr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call didRegisterForRemotePushWithStringifiedToken() on it, clone it first.");
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

      this.didRegisterForRemotePushWithStringifiedToken(this.nativePtr, deviceTokenStr);
   }

   private native void disableChat(long var1, int var3);

   public synchronized void disableChat(Reason denyReason) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call disableChat() on it, clone it first.");
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

      this.disableChat(this.nativePtr, denyReason.toInt());
   }

   private native void enableChat(long var1);

   public synchronized void enableChat() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enableChat() on it, clone it first.");
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

      this.enableChat(this.nativePtr);
   }

   private native void enableLime(long var1, int var3);

   public synchronized void enableLime(LimeState enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enableLime() on it, clone it first.");
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

      this.enableLime(this.nativePtr, enable.toInt());
   }

   private native void ensureRegistered(long var1);

   public synchronized void ensureRegistered() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call ensureRegistered() on it, clone it first.");
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

      this.ensureRegistered(this.nativePtr);
   }

   private native void enterBackground(long var1);

   public synchronized void enterBackground() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enterBackground() on it, clone it first.");
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

      this.enterBackground(this.nativePtr);
   }

   private native int enterConference(long var1);

   public synchronized int enterConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enterConference() on it, clone it first.");
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

      return this.enterConference(this.nativePtr);
   }

   private native void enterForeground(long var1);

   public synchronized void enterForeground() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enterForeground() on it, clone it first.");
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

      this.enterForeground(this.nativePtr);
   }

   private native boolean fileFormatSupported(long var1, String var3);

   public synchronized boolean fileFormatSupported(@NonNull String fmt) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call fileFormatSupported() on it, clone it first.");
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

      return this.fileFormatSupported(this.nativePtr, fmt);
   }

   private native AuthInfo findAuthInfo(long var1, String var3, String var4, String var5);

   @Nullable
   public synchronized AuthInfo findAuthInfo(@Nullable String realm, @NonNull String username, @Nullable String sipDomain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findAuthInfo() on it, clone it first.");
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

      return this.findAuthInfo(this.nativePtr, realm, username, sipDomain);
   }

   private native Call findCallFromUri(long var1, String var3);

   @Nullable
   public synchronized Call findCallFromUri(@NonNull String uri) {
      return this.findCallFromUri(this.nativePtr, uri);
   }

   private native CallLog findCallLog(long var1, String var3, int var4);

   @Nullable
   public synchronized CallLog findCallLog(@NonNull String callId, @NonNull int limit) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findCallLog() on it, clone it first.");
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

      return this.findCallLog(this.nativePtr, callId, limit);
   }

   private native CallLog findCallLogFromCallId(long var1, String var3);

   @Nullable
   public synchronized CallLog findCallLogFromCallId(@NonNull String callId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findCallLogFromCallId() on it, clone it first.");
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

      return this.findCallLogFromCallId(this.nativePtr, callId);
   }

   private native ChatRoom findChatRoom(long var1, Address var3, Address var4);

   @Nullable
   public synchronized ChatRoom findChatRoom(@NonNull Address peerAddr, @NonNull Address localAddr) {
      return this.findChatRoom(this.nativePtr, peerAddr, localAddr);
   }

   private native ConferenceInfo findConferenceInformationFromUri(long var1, Address var3);

   @Nullable
   public synchronized ConferenceInfo findConferenceInformationFromUri(@NonNull Address uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findConferenceInformationFromUri() on it, clone it first.");
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

      return this.findConferenceInformationFromUri(this.nativePtr, uri);
   }

   private native Address[] findContactsByChar(long var1, String var3, boolean var4);

   @NonNull
   public synchronized Address[] findContactsByChar(@NonNull String filter, boolean sipOnly) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findContactsByChar() on it, clone it first.");
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

      return this.findContactsByChar(this.nativePtr, filter, sipOnly);
   }

   private native Friend findFriend(long var1, Address var3);

   @Nullable
   public synchronized Friend findFriend(@NonNull Address address) {
      return this.findFriend(this.nativePtr, address);
   }

   private native Friend findFriendByPhoneNumber(long var1, String var3);

   @Nullable
   public synchronized Friend findFriendByPhoneNumber(@NonNull String phoneNumber) {
      return this.findFriendByPhoneNumber(this.nativePtr, phoneNumber);
   }

   private native Friend[] findFriends(long var1, Address var3);

   @NonNull
   public synchronized Friend[] findFriends(@NonNull Address address) {
      return this.findFriends(this.nativePtr, address);
   }

   private native ChatRoom findOneToOneChatRoom2(long var1, Address var3, Address var4, boolean var5);

   @Nullable
   public synchronized ChatRoom findOneToOneChatRoom(@NonNull Address localAddr, @NonNull Address participantAddr, boolean encrypted) {
      return this.findOneToOneChatRoom2(this.nativePtr, localAddr, participantAddr, encrypted);
   }

   private native Account getAccountByIdkey(long var1, String var3);

   @Nullable
   public synchronized Account getAccountByIdkey(@Nullable String idkey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getAccountByIdkey() on it, clone it first.");
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

      return this.getAccountByIdkey(this.nativePtr, idkey);
   }

   private native Call getCallByCallid(long var1, String var3);

   @Nullable
   public synchronized Call getCallByCallid(String callId) {
      return this.getCallByCallid(this.nativePtr, callId);
   }

   private native Call getCallByRemoteAddress(long var1, String var3);

   @Nullable
   public synchronized Call getCallByRemoteAddress(@NonNull String remoteAddress) {
      return this.getCallByRemoteAddress(this.nativePtr, remoteAddress);
   }

   private native Call getCallByRemoteAddress22(long var1, Address var3);

   @Nullable
   public synchronized Call getCallByRemoteAddress2(@NonNull Address remoteAddress) {
      return this.getCallByRemoteAddress22(this.nativePtr, remoteAddress);
   }

   private native CallLog[] getCallHistory2(long var1, Address var3, Address var4);

   @NonNull
   public synchronized CallLog[] getCallHistory(@NonNull Address peerAddress, @NonNull Address localAddress) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCallHistory() on it, clone it first.");
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

      return this.getCallHistory2(this.nativePtr, peerAddress, localAddress);
   }

   private native CallLog[] getCallHistoryForAddress(long var1, Address var3);

   @NonNull
   public synchronized CallLog[] getCallHistoryForAddress(@NonNull Address address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCallHistoryForAddress() on it, clone it first.");
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

      return this.getCallHistoryForAddress(this.nativePtr, address);
   }

   private native ChatRoom getChatRoom2(long var1, Address var3, Address var4);

   @Nullable
   public synchronized ChatRoom getChatRoom(@NonNull Address peerAddr, @NonNull Address localAddr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getChatRoom() on it, clone it first.");
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

      return this.getChatRoom2(this.nativePtr, peerAddr, localAddr);
   }

   private native ChatRoom getChatRoom(long var1, Address var3);

   @Nullable
   public synchronized ChatRoom getChatRoom(@NonNull Address addr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getChatRoom() on it, clone it first.");
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

      return this.getChatRoom(this.nativePtr, addr);
   }

   private native ChatRoom getChatRoomFromUri(long var1, String var3);

   @Nullable
   public synchronized ChatRoom getChatRoomFromUri(@NonNull String to) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getChatRoomFromUri() on it, clone it first.");
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

      return this.getChatRoomFromUri(this.nativePtr, to);
   }

   private native ConferenceInfo[] getConferenceInformationListAfterTime(long var1, long var3);

   @NonNull
   public synchronized ConferenceInfo[] getConferenceInformationListAfterTime(long time) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConferenceInformationListAfterTime() on it, clone it first.");
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

      return this.getConferenceInformationListAfterTime(this.nativePtr, time);
   }

   private native Friend getFriendByRefKey(long var1, String var3);

   @Nullable
   public synchronized Friend getFriendByRefKey(@NonNull String key) {
      return this.getFriendByRefKey(this.nativePtr, key);
   }

   private native FriendList getFriendListByName(long var1, String var3);

   @Nullable
   public synchronized FriendList getFriendListByName(@NonNull String name) {
      return this.getFriendListByName(this.nativePtr, name);
   }

   private native PayloadType getPayloadType(long var1, String var3, int var4, int var5);

   @Nullable
   public synchronized PayloadType getPayloadType(@NonNull String type, int rate, int channels) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPayloadType() on it, clone it first.");
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

      return this.getPayloadType(this.nativePtr, type, rate, channels);
   }

   private native ProxyConfig getProxyConfigByIdkey(long var1, String var3);

   @Nullable
   public synchronized ProxyConfig getProxyConfigByIdkey(String idkey) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getProxyConfigByIdkey() on it, clone it first.");
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

      return this.getProxyConfigByIdkey(this.nativePtr, idkey);
   }

   private native int getUnreadChatMessageCountFromLocal(long var1, Address var3);

   public synchronized int getUnreadChatMessageCountFromLocal(@NonNull Address address) {
      return this.getUnreadChatMessageCountFromLocal(this.nativePtr, address);
   }

   private native int getZrtpStatus(long var1, String var3);

   public synchronized ZrtpPeerStatus getZrtpStatus(@NonNull String addr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getZrtpStatus() on it, clone it first.");
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

      return ZrtpPeerStatus.fromInt(this.getZrtpStatus(this.nativePtr, addr));
   }

   private native boolean hasBuiltinEchoCanceller(long var1);

   public synchronized boolean hasBuiltinEchoCanceller() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call hasBuiltinEchoCanceller() on it, clone it first.");
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

      return this.hasBuiltinEchoCanceller(this.nativePtr);
   }

   private native boolean hasCrappyOpengl(long var1);

   public synchronized boolean hasCrappyOpengl() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call hasCrappyOpengl() on it, clone it first.");
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

      return this.hasCrappyOpengl(this.nativePtr);
   }

   private native boolean inCall(long var1);

   public synchronized boolean inCall() {
      return this.inCall(this.nativePtr);
   }

   private native Address interpretUrl(long var1, String var3);

   @Nullable
   public synchronized Address interpretUrl(@NonNull String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call interpretUrl() on it, clone it first.");
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

      return this.interpretUrl(this.nativePtr, url);
   }

   private native Address interpretUrl2(long var1, String var3, boolean var4);

   @Nullable
   public synchronized Address interpretUrl(@NonNull String url, boolean applyInternationalPrefix) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call interpretUrl() on it, clone it first.");
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

      return this.interpretUrl2(this.nativePtr, url, applyInternationalPrefix);
   }

   private native Call invite(long var1, String var3);

   @Nullable
   public synchronized Call invite(@NonNull String url) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call invite() on it, clone it first.");
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

      return this.invite(this.nativePtr, url);
   }

   private native Call inviteAddress(long var1, Address var3);

   @Nullable
   public synchronized Call inviteAddress(@NonNull Address addr) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call inviteAddress() on it, clone it first.");
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

      return this.inviteAddress(this.nativePtr, addr);
   }

   private native Call inviteAddressWithParams2(long var1, Address var3, CallParams var4, String var5, Content var6);

   @Nullable
   public synchronized Call inviteAddressWithParams(@NonNull Address addr, @NonNull CallParams params, @Nullable String subject, @Nullable Content content) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call inviteAddressWithParams() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.inviteAddressWithParams2(this.nativePtr, addr, params, subject, content);
   }

   private native Call inviteAddressWithParams(long var1, Address var3, CallParams var4);

   @Nullable
   public synchronized Call inviteAddressWithParams(@NonNull Address addr, @NonNull CallParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call inviteAddressWithParams() on it, clone it first.");
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

      return this.inviteAddressWithParams(this.nativePtr, addr, params);
   }

   private native Call inviteWithParams(long var1, String var3, CallParams var4);

   @Nullable
   public synchronized Call inviteWithParams(@NonNull String url, @NonNull CallParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call inviteWithParams() on it, clone it first.");
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

      return this.inviteWithParams(this.nativePtr, url, params);
   }

   private native boolean isContentTypeSupported(long var1, String var3);

   public synchronized boolean isContentTypeSupported(@NonNull String contentType) {
      return this.isContentTypeSupported(this.nativePtr, contentType);
   }

   private native boolean isMediaEncryptionSupported(long var1, int var3);

   public synchronized boolean isMediaEncryptionSupported(MediaEncryption menc) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isMediaEncryptionSupported() on it, clone it first.");
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

      return this.isMediaEncryptionSupported(this.nativePtr, menc.toInt());
   }

   private native boolean isMediaFilterSupported(long var1, String var3);

   public synchronized boolean isMediaFilterSupported(@NonNull String filtername) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isMediaFilterSupported() on it, clone it first.");
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

      return this.isMediaFilterSupported(this.nativePtr, filtername);
   }

   private native void iterate(long var1);

   public synchronized void iterate() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call iterate() on it, clone it first.");
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

      this.iterate(this.nativePtr);
   }

   private native boolean ldapAvailable(long var1);

   public synchronized boolean ldapAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call ldapAvailable() on it, clone it first.");
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

      return this.ldapAvailable(this.nativePtr);
   }

   private native int leaveConference(long var1);

   public synchronized int leaveConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call leaveConference() on it, clone it first.");
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

      return this.leaveConference(this.nativePtr);
   }

   private native boolean limeAvailable(long var1);

   public synchronized boolean limeAvailable() {
      return this.limeAvailable(this.nativePtr);
   }

   private native int limeEnabled(long var1);

   public synchronized LimeState limeEnabled() {
      return LimeState.fromInt(this.limeEnabled(this.nativePtr));
   }

   private native boolean limeX3DhAvailable(long var1);

   public synchronized boolean limeX3DhAvailable() {
      return this.limeX3DhAvailable(this.nativePtr);
   }

   private native void loadConfigFromXml(long var1, String var3);

   public synchronized void loadConfigFromXml(@NonNull String xmlUri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call loadConfigFromXml() on it, clone it first.");
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

      this.loadConfigFromXml(this.nativePtr, xmlUri);
   }

   private native boolean mediaEncryptionSupported(long var1, int var3);

   public synchronized boolean mediaEncryptionSupported(MediaEncryption menc) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call mediaEncryptionSupported() on it, clone it first.");
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

      return this.mediaEncryptionSupported(this.nativePtr, menc.toInt());
   }

   private native void migrateLogsFromRcToDb(long var1);

   public synchronized void migrateLogsFromRcToDb() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call migrateLogsFromRcToDb() on it, clone it first.");
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

      this.migrateLogsFromRcToDb(this.nativePtr);
   }

   private native int migrateToMultiTransport(long var1);

   public synchronized int migrateToMultiTransport() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call migrateToMultiTransport() on it, clone it first.");
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

      return this.migrateToMultiTransport(this.nativePtr);
   }

   private native void notifyAllFriends(long var1, PresenceModel var3);

   public synchronized void notifyAllFriends(@NonNull PresenceModel presence) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call notifyAllFriends() on it, clone it first.");
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

      this.notifyAllFriends(this.nativePtr, presence);
   }

   private native void notifyNotifyPresenceReceived(long var1, Friend var3);

   public synchronized void notifyNotifyPresenceReceived(@NonNull Friend linphoneFriend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call notifyNotifyPresenceReceived() on it, clone it first.");
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

      this.notifyNotifyPresenceReceived(this.nativePtr, linphoneFriend);
   }

   private native void notifyNotifyPresenceReceivedForUriOrTel(long var1, Friend var3, String var4, PresenceModel var5);

   public synchronized void notifyNotifyPresenceReceivedForUriOrTel(@NonNull Friend linphoneFriend, @NonNull String uriOrTel, @NonNull PresenceModel presenceModel) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call notifyNotifyPresenceReceivedForUriOrTel() on it, clone it first.");
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

      this.notifyNotifyPresenceReceivedForUriOrTel(this.nativePtr, linphoneFriend, uriOrTel, presenceModel);
   }

   private native int pauseAllCalls(long var1);

   public synchronized int pauseAllCalls() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call pauseAllCalls() on it, clone it first.");
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

      return this.pauseAllCalls(this.nativePtr);
   }

   private native void playDtmf(long var1, char var3, int var4);

   public synchronized void playDtmf(char dtmf, int durationMs) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call playDtmf() on it, clone it first.");
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

      this.playDtmf(this.nativePtr, dtmf, durationMs);
   }

   private native int playLocal(long var1, String var3);

   public synchronized int playLocal(@NonNull String audiofile) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call playLocal() on it, clone it first.");
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

      return this.playLocal(this.nativePtr, audiofile);
   }

   private native int preemptSoundResources(long var1);

   public synchronized int preemptSoundResources() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call preemptSoundResources() on it, clone it first.");
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

      return this.preemptSoundResources(this.nativePtr);
   }

   private native void previewOglRender(long var1);

   public synchronized void previewOglRender() {
      this.previewOglRender(this.nativePtr);
   }

   private native void processPushNotification(long var1, String var3);

   public synchronized void processPushNotification(@Nullable String callId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call processPushNotification() on it, clone it first.");
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

      this.processPushNotification(this.nativePtr, callId);
   }

   private native Event publish(long var1, Address var3, String var4, int var5, Content var6);

   @Nullable
   public synchronized Event publish(@NonNull Address resource, @NonNull String event, int expires, @NonNull Content body) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call publish() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.publish(this.nativePtr, resource, event, expires, body);
   }

   private native int realtimeTextGetKeepaliveInterval(long var1);

   public synchronized int realtimeTextGetKeepaliveInterval() {
      return this.realtimeTextGetKeepaliveInterval(this.nativePtr);
   }

   private native void realtimeTextSetKeepaliveInterval(long var1, int var3);

   public synchronized void realtimeTextSetKeepaliveInterval(int interval) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call realtimeTextSetKeepaliveInterval() on it, clone it first.");
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

      this.realtimeTextSetKeepaliveInterval(this.nativePtr, interval);
   }

   private native void refreshRegisters(long var1);

   public synchronized void refreshRegisters() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call refreshRegisters() on it, clone it first.");
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

      this.refreshRegisters(this.nativePtr);
   }

   private native void rejectSubscriber(long var1, Friend var3);

   public synchronized void rejectSubscriber(@NonNull Friend linphoneFriend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call rejectSubscriber() on it, clone it first.");
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

      this.rejectSubscriber(this.nativePtr, linphoneFriend);
   }

   private native void reloadMsPlugins(long var1, String var3);

   public synchronized void reloadMsPlugins(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reloadMsPlugins() on it, clone it first.");
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

      this.reloadMsPlugins(this.nativePtr, path);
   }

   private native void reloadSoundDevices(long var1);

   public synchronized void reloadSoundDevices() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reloadSoundDevices() on it, clone it first.");
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

      this.reloadSoundDevices(this.nativePtr);
   }

   private native void reloadVideoDevices(long var1);

   public synchronized void reloadVideoDevices() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reloadVideoDevices() on it, clone it first.");
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

      this.reloadVideoDevices(this.nativePtr);
   }

   private native void removeAccount(long var1, Account var3);

   public synchronized void removeAccount(@NonNull Account account) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeAccount() on it, clone it first.");
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

      this.removeAccount(this.nativePtr, account);
   }

   private native void removeAuthInfo(long var1, AuthInfo var3);

   public synchronized void removeAuthInfo(@NonNull AuthInfo info) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeAuthInfo() on it, clone it first.");
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

      this.removeAuthInfo(this.nativePtr, info);
   }

   private native void removeCallLog(long var1, CallLog var3);

   public synchronized void removeCallLog(@NonNull CallLog callLog) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeCallLog() on it, clone it first.");
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

      this.removeCallLog(this.nativePtr, callLog);
   }

   private native void removeContentTypeSupport(long var1, String var3);

   public synchronized void removeContentTypeSupport(@NonNull String contentType) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeContentTypeSupport() on it, clone it first.");
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

      this.removeContentTypeSupport(this.nativePtr, contentType);
   }

   private native void removeFriendList(long var1, FriendList var3);

   public synchronized void removeFriendList(@NonNull FriendList list) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeFriendList() on it, clone it first.");
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

      this.removeFriendList(this.nativePtr, list);
   }

   private native int removeFromConference(long var1, Call var3);

   public synchronized int removeFromConference(@NonNull Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeFromConference() on it, clone it first.");
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

      return this.removeFromConference(this.nativePtr, call);
   }

   private native void removeLdap(long var1, Ldap var3);

   public synchronized void removeLdap(@NonNull Ldap ldap) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeLdap() on it, clone it first.");
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

      this.removeLdap(this.nativePtr, ldap);
   }

   private native void removeLinphoneSpec(long var1, String var3);

   public synchronized void removeLinphoneSpec(@NonNull String spec) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeLinphoneSpec() on it, clone it first.");
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

      this.removeLinphoneSpec(this.nativePtr, spec);
   }

   private native void removeProxyConfig(long var1, ProxyConfig var3);

   public synchronized void removeProxyConfig(@NonNull ProxyConfig config) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeProxyConfig() on it, clone it first.");
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

      this.removeProxyConfig(this.nativePtr, config);
   }

   private native void removeSupportedTag(long var1, String var3);

   public synchronized void removeSupportedTag(@NonNull String tag) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeSupportedTag() on it, clone it first.");
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

      this.removeSupportedTag(this.nativePtr, tag);
   }

   private native void resetEchoCancellationCalibration(long var1);

   public synchronized void resetEchoCancellationCalibration() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call resetEchoCancellationCalibration() on it, clone it first.");
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

      this.resetEchoCancellationCalibration(this.nativePtr);
   }

   private native void resetMissedCallsCount(long var1);

   public synchronized void resetMissedCallsCount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call resetMissedCallsCount() on it, clone it first.");
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

      this.resetMissedCallsCount(this.nativePtr);
   }

   private native ChatRoom searchChatRoom(long var1, ChatRoomParams var3, Address var4, Address var5, Address[] var6);

   @Nullable
   public synchronized ChatRoom searchChatRoom(@Nullable ChatRoomParams params, @Nullable Address localAddr, @Nullable Address remoteAddr, @Nullable Address[] participants) {
      return this.searchChatRoom(this.nativePtr, params, localAddr, remoteAddr, participants);
   }

   private native Conference searchConference2(long var1, Address var3);

   @Nullable
   public synchronized Conference searchConference(@NonNull Address conferenceAddr) {
      return this.searchConference2(this.nativePtr, conferenceAddr);
   }

   private native Conference searchConference(long var1, ConferenceParams var3, Address var4, Address var5, Address[] var6);

   @Nullable
   public synchronized Conference searchConference(@Nullable ConferenceParams params, @Nullable Address localAddr, @Nullable Address remoteAddr, @Nullable Address[] participants) {
      return this.searchConference(this.nativePtr, params, localAddr, remoteAddr, participants);
   }

   private native void setAudioPortRange(long var1, int var3, int var4);

   public synchronized void setAudioPortRange(int minPort, int maxPort) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAudioPortRange() on it, clone it first.");
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

      this.setAudioPortRange(this.nativePtr, minPort, maxPort);
   }

   private native void setQrcodeDecodeRect(long var1, int var3, int var4, int var5, int var6);

   public synchronized void setQrcodeDecodeRect(int x, int y, int w, int h) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setQrcodeDecodeRect() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      this.setQrcodeDecodeRect(this.nativePtr, x, y, w, h);
   }

   private native void setTextPortRange(long var1, int var3, int var4);

   public synchronized void setTextPortRange(int minPort, int maxPort) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTextPortRange() on it, clone it first.");
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

      this.setTextPortRange(this.nativePtr, minPort, maxPort);
   }

   private native void setTone(long var1, int var3, String var4);

   public synchronized void setTone(ToneID toneId, @Nullable String audiofile) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTone() on it, clone it first.");
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

      this.setTone(this.nativePtr, toneId.toInt(), audiofile);
   }

   private native void setUserAgent(long var1, String var3, String var4);

   public synchronized void setUserAgent(@Nullable String name, @Nullable String version) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUserAgent() on it, clone it first.");
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

      this.setUserAgent(this.nativePtr, name, version);
   }

   private native void setVideoPortRange(long var1, int var3, int var4);

   public synchronized void setVideoPortRange(int minPort, int maxPort) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVideoPortRange() on it, clone it first.");
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

      this.setVideoPortRange(this.nativePtr, minPort, maxPort);
   }

   private native boolean soundDeviceCanCapture(long var1, String var3);

   public synchronized boolean soundDeviceCanCapture(@NonNull String device) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call soundDeviceCanCapture() on it, clone it first.");
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

      return this.soundDeviceCanCapture(this.nativePtr, device);
   }

   private native boolean soundDeviceCanPlayback(long var1, String var3);

   public synchronized boolean soundDeviceCanPlayback(@NonNull String device) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call soundDeviceCanPlayback() on it, clone it first.");
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

      return this.soundDeviceCanPlayback(this.nativePtr, device);
   }

   private native boolean soundResourcesLocked(long var1);

   public synchronized boolean soundResourcesLocked() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call soundResourcesLocked() on it, clone it first.");
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

      return this.soundResourcesLocked(this.nativePtr);
   }

   private native int start(long var1);

   public synchronized int start() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call start() on it, clone it first.");
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

      return this.start(this.nativePtr);
   }

   private native int startConferenceRecording(long var1, String var3);

   public synchronized int startConferenceRecording(@NonNull String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call startConferenceRecording() on it, clone it first.");
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

      return this.startConferenceRecording(this.nativePtr, path);
   }

   private native int startEchoCancellerCalibration(long var1);

   public synchronized int startEchoCancellerCalibration() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call startEchoCancellerCalibration() on it, clone it first.");
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

      return this.startEchoCancellerCalibration(this.nativePtr);
   }

   private native int startEchoTester(long var1, int var3);

   public synchronized int startEchoTester(int rate) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call startEchoTester() on it, clone it first.");
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

      return this.startEchoTester(this.nativePtr, rate);
   }

   private native void stop(long var1);

   public synchronized void stop() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stop() on it, clone it first.");
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

      this.stop(this.nativePtr);
   }

   private native void stopAsync(long var1);

   public synchronized void stopAsync() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopAsync() on it, clone it first.");
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

      this.stopAsync(this.nativePtr);
   }

   private native int stopConferenceRecording(long var1);

   public synchronized int stopConferenceRecording() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopConferenceRecording() on it, clone it first.");
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

      return this.stopConferenceRecording(this.nativePtr);
   }

   private native void stopDtmf(long var1);

   public synchronized void stopDtmf() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopDtmf() on it, clone it first.");
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

      this.stopDtmf(this.nativePtr);
   }

   private native int stopEchoTester(long var1);

   public synchronized int stopEchoTester() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopEchoTester() on it, clone it first.");
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

      return this.stopEchoTester(this.nativePtr);
   }

   private native void stopRinging(long var1);

   public synchronized void stopRinging() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopRinging() on it, clone it first.");
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

      this.stopRinging(this.nativePtr);
   }

   private native Event subscribe(long var1, Address var3, String var4, int var5, Content var6);

   @NonNull
   public synchronized Event subscribe(@NonNull Address resource, @NonNull String event, int expires, @Nullable Content body) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call subscribe() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      return this.subscribe(this.nativePtr, resource, event, expires, body);
   }

   private native int takePreviewSnapshot(long var1, String var3);

   public synchronized int takePreviewSnapshot(@NonNull String file) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call takePreviewSnapshot() on it, clone it first.");
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

      return this.takePreviewSnapshot(this.nativePtr, file);
   }

   private native int terminateAllCalls(long var1);

   public synchronized int terminateAllCalls() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call terminateAllCalls() on it, clone it first.");
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

      return this.terminateAllCalls(this.nativePtr);
   }

   private native int terminateConference(long var1);

   public synchronized int terminateConference() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call terminateConference() on it, clone it first.");
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

      return this.terminateConference(this.nativePtr);
   }

   private native void uploadLogCollection(long var1);

   public synchronized void uploadLogCollection() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call uploadLogCollection() on it, clone it first.");
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

      this.uploadLogCollection(this.nativePtr);
   }

   private native void usePreviewWindow(long var1, boolean var3);

   public synchronized void usePreviewWindow(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call usePreviewWindow() on it, clone it first.");
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

      this.usePreviewWindow(this.nativePtr, yesno);
   }

   private native void verifyServerCertificates(long var1, boolean var3);

   public synchronized void verifyServerCertificates(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call verifyServerCertificates() on it, clone it first.");
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

      this.verifyServerCertificates(this.nativePtr, yesno);
   }

   private native void verifyServerCn(long var1, boolean var3);

   public synchronized void verifyServerCn(boolean yesno) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call verifyServerCn() on it, clone it first.");
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

      this.verifyServerCn(this.nativePtr, yesno);
   }

   private native boolean videoSupported(long var1);

   public synchronized boolean videoSupported() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call videoSupported() on it, clone it first.");
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

      return this.videoSupported(this.nativePtr);
   }

   private native String compressLogCollection(long var1);

   @NonNull
   public synchronized String compressLogCollection() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call compressLogCollection() on it, clone it first.");
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

      return this.compressLogCollection(this.nativePtr);
   }

   private native void enableLogCollection(long var1, int var3);

   public synchronized void enableLogCollection(LogCollectionState state) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enableLogCollection() on it, clone it first.");
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

      this.enableLogCollection(this.nativePtr, state.toInt());
   }

   private native int getLogCollectionMaxFileSize(long var1);

   @NonNull
   public synchronized int getLogCollectionMaxFileSize() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLogCollectionMaxFileSize() on it, clone it first.");
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

      return this.getLogCollectionMaxFileSize(this.nativePtr);
   }

   private native String getLogCollectionPath(long var1);

   @NonNull
   public synchronized String getLogCollectionPath() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLogCollectionPath() on it, clone it first.");
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

      return this.getLogCollectionPath(this.nativePtr);
   }

   private native String getLogCollectionPrefix(long var1);

   @NonNull
   public synchronized String getLogCollectionPrefix() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getLogCollectionPrefix() on it, clone it first.");
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

      return this.getLogCollectionPrefix(this.nativePtr);
   }

   private native boolean getPostQuantumAvailable(long var1);

   public synchronized boolean getPostQuantumAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getPostQuantumAvailable() on it, clone it first.");
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

      return this.getPostQuantumAvailable(this.nativePtr);
   }

   private native String getVersion(long var1);

   @NonNull
   public synchronized String getVersion() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getVersion() on it, clone it first.");
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

      return this.getVersion(this.nativePtr);
   }

   private native int logCollectionEnabled(long var1);

   public synchronized LogCollectionState logCollectionEnabled() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call logCollectionEnabled() on it, clone it first.");
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

      return LogCollectionState.fromInt(this.logCollectionEnabled(this.nativePtr));
   }

   private native void resetLogCollection(long var1);

   public synchronized void resetLogCollection() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call resetLogCollection() on it, clone it first.");
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

      this.resetLogCollection(this.nativePtr);
   }

   private native void serializeLogs(long var1);

   public synchronized void serializeLogs() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call serializeLogs() on it, clone it first.");
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

      this.serializeLogs(this.nativePtr);
   }

   private native void setLogCollectionMaxFileSize(long var1, int var3);

   public synchronized void setLogCollectionMaxFileSize(int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogCollectionMaxFileSize() on it, clone it first.");
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

      this.setLogCollectionMaxFileSize(this.nativePtr, size);
   }

   private native void setLogCollectionPath(long var1, String var3);

   public synchronized void setLogCollectionPath(@NonNull String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogCollectionPath() on it, clone it first.");
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

      this.setLogCollectionPath(this.nativePtr, path);
   }

   private native void setLogCollectionPrefix(long var1, String var3);

   public synchronized void setLogCollectionPrefix(@NonNull String prefix) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogCollectionPrefix() on it, clone it first.");
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

      this.setLogCollectionPrefix(this.nativePtr, prefix);
   }

   private native boolean tunnelAvailable(long var1);

   public synchronized boolean tunnelAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call tunnelAvailable() on it, clone it first.");
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

      return this.tunnelAvailable(this.nativePtr);
   }

   private native boolean upnpAvailable(long var1);

   public synchronized boolean upnpAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call upnpAvailable() on it, clone it first.");
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

      return this.upnpAvailable(this.nativePtr);
   }

   private native boolean vcardSupported(long var1);

   public synchronized boolean vcardSupported() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call vcardSupported() on it, clone it first.");
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

      return this.vcardSupported(this.nativePtr);
   }

   private native void addListener(long var1, CoreListener var3);

   public synchronized void addListener(CoreListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, CoreListener var3);

   public synchronized void removeListener(CoreListener listener) {
      this.removeListener(this.nativePtr, listener);
   }

   private native org.linphone.mediastream.Factory getMediastreamerFactory(long var1);

   public org.linphone.mediastream.Factory getMediastreamerFactory() {
      return this.getMediastreamerFactory(this.nativePtr);
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

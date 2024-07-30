package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ConferenceImpl implements Conference {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ConferenceImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native ParticipantDevice getActiveSpeakerParticipantDevice(long var1);

   @Nullable
   public synchronized ParticipantDevice getActiveSpeakerParticipantDevice() {
      return this.getActiveSpeakerParticipantDevice(this.nativePtr);
   }

   private native Call getCall(long var1);

   @Nullable
   public synchronized Call getCall() {
      return this.getCall(this.nativePtr);
   }

   private native Address getConferenceAddress(long var1);

   @NonNull
   public synchronized Address getConferenceAddress() {
      return this.getConferenceAddress(this.nativePtr);
   }

   private native void setConferenceAddress(long var1, Address var3);

   public synchronized void setConferenceAddress(@NonNull Address address) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConferenceAddress() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setConferenceAddress(this.nativePtr, address);
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native ConferenceParams getCurrentParams(long var1);

   @NonNull
   public synchronized ConferenceParams getCurrentParams() {
      return this.getCurrentParams(this.nativePtr);
   }

   private native int getDuration(long var1);

   @Nullable
   public synchronized int getDuration() {
      return this.getDuration(this.nativePtr);
   }

   private native String getId(long var1);

   @NonNull
   public synchronized String getId() {
      return this.getId(this.nativePtr);
   }

   private native void setId(long var1, String var3);

   public synchronized void setId(@NonNull String conferenceId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setId() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setId(this.nativePtr, conferenceId);
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

   private native boolean isIn(long var1);

   public synchronized boolean isIn() {
      return this.isIn(this.nativePtr);
   }

   private native boolean isRecording(long var1);

   public synchronized boolean isRecording() {
      return this.isRecording(this.nativePtr);
   }

   private native Participant getMe(long var1);

   @NonNull
   public synchronized Participant getMe() {
      return this.getMe(this.nativePtr);
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

   private native int getParticipantCount(long var1);

   public synchronized int getParticipantCount() {
      return this.getParticipantCount(this.nativePtr);
   }

   private native ParticipantDevice[] getParticipantDeviceList(long var1);

   @NonNull
   public synchronized ParticipantDevice[] getParticipantDeviceList() {
      return this.getParticipantDeviceList(this.nativePtr);
   }

   private native Participant[] getParticipantList(long var1);

   @NonNull
   public synchronized Participant[] getParticipantList() {
      return this.getParticipantList(this.nativePtr);
   }

   private native Address[] getParticipants(long var1);

   @NonNull
   public synchronized Address[] getParticipants() {
      return this.getParticipants(this.nativePtr);
   }

   private native long getStartTime(long var1);

   @Nullable
   public synchronized long getStartTime() {
      return this.getStartTime(this.nativePtr);
   }

   private native int getState(long var1);

   public synchronized Conference.State getState() {
      return Conference.State.fromInt(this.getState(this.nativePtr));
   }

   private native String getSubject(long var1);

   @Nullable
   public synchronized String getSubject() {
      return this.getSubject(this.nativePtr);
   }

   private native void setSubject(long var1, String var3);

   public synchronized void setSubject(@Nullable String subject) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSubject() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setSubject(this.nativePtr, subject);
   }

   private native String getUsername(long var1);

   @Nullable
   public synchronized String getUsername() {
      return this.getUsername(this.nativePtr);
   }

   private native void setUsername(long var1, String var3);

   public synchronized void setUsername(@Nullable String username) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUsername() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setUsername(this.nativePtr, username);
   }

   private native int addParticipant2(long var1, Address var3);

   public synchronized int addParticipant(@NonNull Address uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.addParticipant2(this.nativePtr, uri);
   }

   private native int addParticipant(long var1, Call var3);

   public synchronized int addParticipant(@NonNull Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.addParticipant(this.nativePtr, call);
   }

   private native int addParticipants2(long var1, Address[] var3);

   public synchronized int addParticipants(@NonNull Address[] addresses) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addParticipants() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.addParticipants2(this.nativePtr, addresses);
   }

   private native int addParticipants(long var1, Call[] var3);

   public synchronized int addParticipants(@NonNull Call[] calls) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addParticipants() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.addParticipants(this.nativePtr, calls);
   }

   private native int enter(long var1);

   public synchronized int enter() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enter() on it, clone it first.");
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

      return this.enter(this.nativePtr);
   }

   private native Participant findParticipant(long var1, Address var3);

   @Nullable
   public synchronized Participant findParticipant(@NonNull Address uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call findParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.findParticipant(this.nativePtr, uri);
   }

   private native int getParticipantDeviceVolume(long var1, ParticipantDevice var3);

   public synchronized int getParticipantDeviceVolume(@NonNull ParticipantDevice device) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getParticipantDeviceVolume() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.getParticipantDeviceVolume(this.nativePtr, device);
   }

   private native int inviteParticipants(long var1, Address[] var3, CallParams var4);

   public synchronized int inviteParticipants(@NonNull Address[] addresses, @Nullable CallParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call inviteParticipants() on it, clone it first.");
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

      return this.inviteParticipants(this.nativePtr, addresses, params);
   }

   private native boolean isMe(long var1, Address var3);

   public synchronized boolean isMe(@NonNull Address uri) {
      return this.isMe(this.nativePtr, uri);
   }

   private native int leave(long var1);

   public synchronized int leave() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call leave() on it, clone it first.");
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

      return this.leave(this.nativePtr);
   }

   private native int removeParticipant2(long var1, Participant var3);

   public synchronized int removeParticipant(@NonNull Participant participant) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.removeParticipant2(this.nativePtr, participant);
   }

   private native int removeParticipant3(long var1, Call var3);

   public synchronized int removeParticipant(@NonNull Call call) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.removeParticipant3(this.nativePtr, call);
   }

   private native int removeParticipant(long var1, Address var3);

   public synchronized int removeParticipant(@NonNull Address uri) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call removeParticipant() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.removeParticipant(this.nativePtr, uri);
   }

   private native void setLocalParticipantStreamCapability(long var1, int var3, int var4);

   public synchronized void setLocalParticipantStreamCapability(MediaDirection direction, StreamType type) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLocalParticipantStreamCapability() on it, clone it first.");
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

      this.setLocalParticipantStreamCapability(this.nativePtr, direction.toInt(), type.toInt());
   }

   private native void setParticipantAdminStatus(long var1, Participant var3, boolean var4);

   public synchronized void setParticipantAdminStatus(@NonNull Participant participant, boolean isAdmin) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParticipantAdminStatus() on it, clone it first.");
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

      this.setParticipantAdminStatus(this.nativePtr, participant, isAdmin);
   }

   private native int startRecording(long var1, String var3);

   public synchronized int startRecording(@NonNull String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call startRecording() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.startRecording(this.nativePtr, path);
   }

   private native int stopRecording(long var1);

   public synchronized int stopRecording() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call stopRecording() on it, clone it first.");
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

      return this.stopRecording(this.nativePtr);
   }

   private native int terminate(long var1);

   public synchronized int terminate() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call terminate() on it, clone it first.");
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

      return this.terminate(this.nativePtr);
   }

   private native int updateParams(long var1, ConferenceParams var3);

   public synchronized int updateParams(@NonNull ConferenceParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call updateParams() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      return this.updateParams(this.nativePtr, params);
   }

   private native void addListener(long var1, ConferenceListener var3);

   public synchronized void addListener(ConferenceListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, ConferenceListener var3);

   public synchronized void removeListener(ConferenceListener listener) {
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

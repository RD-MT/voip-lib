package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ConferenceInfoImpl implements ConferenceInfo {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ConferenceInfoImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native long getDateTime(long var1);

   public synchronized long getDateTime() {
      return this.getDateTime(this.nativePtr);
   }

   private native void setDateTime(long var1, long var3);

   public synchronized void setDateTime(long datetime) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDateTime() on it, clone it first.");
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

      this.setDateTime(this.nativePtr, datetime);
   }

   private native String getDescription(long var1);

   @Nullable
   public synchronized String getDescription() {
      return this.getDescription(this.nativePtr);
   }

   private native void setDescription(long var1, String var3);

   public synchronized void setDescription(@Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDescription() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setDescription(this.nativePtr, description);
   }

   private native int getDuration(long var1);

   public synchronized int getDuration() {
      return this.getDuration(this.nativePtr);
   }

   private native void setDuration(long var1, int var3);

   public synchronized void setDuration(int duration) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDuration() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setDuration(this.nativePtr, duration);
   }

   private native String getIcalendarString(long var1);

   @Nullable
   public synchronized String getIcalendarString() {
      return this.getIcalendarString(this.nativePtr);
   }

   private native Address getOrganizer(long var1);

   @Nullable
   public synchronized Address getOrganizer() {
      return this.getOrganizer(this.nativePtr);
   }

   private native void setOrganizer(long var1, Address var3);

   public synchronized void setOrganizer(@Nullable Address organizer) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOrganizer() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setOrganizer(this.nativePtr, organizer);
   }

   private native Address[] getParticipants(long var1);

   @NonNull
   public synchronized Address[] getParticipants() {
      return this.getParticipants(this.nativePtr);
   }

   private native void setParticipants(long var1, Address[] var3);

   public synchronized void setParticipants(@Nullable Address[] participants) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParticipants() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setParticipants(this.nativePtr, participants);
   }

   private native int getState(long var1);

   @Nullable
   public synchronized ConferenceInfo.State getState() {
      return ConferenceInfo.State.fromInt(this.getState(this.nativePtr));
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

   private native Address getUri(long var1);

   @Nullable
   public synchronized Address getUri() {
      return this.getUri(this.nativePtr);
   }

   private native void addParticipant(long var1, Address var3);

   public synchronized void addParticipant(@NonNull Address participant) {
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

      this.addParticipant(this.nativePtr, participant);
   }

   private native ConferenceInfo clone(long var1);

   @NonNull
   public synchronized ConferenceInfo clone() {
      return this.clone(this.nativePtr);
   }

   private native void removeParticipant(long var1, Address var3);

   public synchronized void removeParticipant(@NonNull Address participant) {
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

      this.removeParticipant(this.nativePtr, participant);
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

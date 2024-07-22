package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class PresenceServiceImpl implements PresenceService {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PresenceServiceImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getBasicStatus(long var1);

   public synchronized PresenceBasicStatus getBasicStatus() {
      return PresenceBasicStatus.fromInt(this.getBasicStatus(this.nativePtr));
   }

   private native int setBasicStatus(long var1, int var3);

   public synchronized int setBasicStatus(PresenceBasicStatus basicStatus) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBasicStatus() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      return this.setBasicStatus(this.nativePtr, basicStatus.toInt());
   }

   private native String getContact(long var1);

   @Nullable
   public synchronized String getContact() {
      return this.getContact(this.nativePtr);
   }

   private native int setContact(long var1, String var3);

   public synchronized int setContact(@Nullable String contact) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setContact() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      return this.setContact(this.nativePtr, contact);
   }

   private native String getId(long var1);

   @Nullable
   public synchronized String getId() {
      return this.getId(this.nativePtr);
   }

   private native int setId(long var1, String var3);

   public synchronized int setId(@Nullable String id) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setId() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      return this.setId(this.nativePtr, id);
   }

   private native int getNbNotes(long var1);

   public synchronized int getNbNotes() {
      return this.getNbNotes(this.nativePtr);
   }

   private native String[] getServiceDescriptions(long var1);

   @NonNull
   public synchronized String[] getServiceDescriptions() {
      return this.getServiceDescriptions(this.nativePtr);
   }

   private native int setServiceDescriptions(long var1, String[] var3);

   public synchronized int setServiceDescriptions(@Nullable String[] descriptions) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setServiceDescriptions() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      return this.setServiceDescriptions(this.nativePtr, descriptions);
   }

   private native int addNote(long var1, PresenceNote var3);

   public synchronized int addNote(@NonNull PresenceNote note) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addNote() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      return this.addNote(this.nativePtr, note);
   }

   private native int clearNotes(long var1);

   public synchronized int clearNotes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearNotes() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.clearNotes(this.nativePtr);
   }

   private native PresenceNote getNthNote(long var1, int var3);

   @Nullable
   public synchronized PresenceNote getNthNote(int index) {
      return this.getNthNote(this.nativePtr, index);
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

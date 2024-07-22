package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class PresencePersonImpl implements PresencePerson {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PresencePersonImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
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

   private native int getNbActivities(long var1);

   public synchronized int getNbActivities() {
      return this.getNbActivities(this.nativePtr);
   }

   private native int getNbActivitiesNotes(long var1);

   public synchronized int getNbActivitiesNotes() {
      return this.getNbActivitiesNotes(this.nativePtr);
   }

   private native int getNbNotes(long var1);

   public synchronized int getNbNotes() {
      return this.getNbNotes(this.nativePtr);
   }

   private native int addActivitiesNote(long var1, PresenceNote var3);

   public synchronized int addActivitiesNote(@NonNull PresenceNote note) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addActivitiesNote() on it, clone it first.");
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

      return this.addActivitiesNote(this.nativePtr, note);
   }

   private native int addActivity(long var1, PresenceActivity var3);

   public synchronized int addActivity(@NonNull PresenceActivity activity) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addActivity() on it, clone it first.");
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

      return this.addActivity(this.nativePtr, activity);
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

   private native int clearActivities(long var1);

   public synchronized int clearActivities() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearActivities() on it, clone it first.");
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

      return this.clearActivities(this.nativePtr);
   }

   private native int clearActivitiesNotes(long var1);

   public synchronized int clearActivitiesNotes() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearActivitiesNotes() on it, clone it first.");
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

      return this.clearActivitiesNotes(this.nativePtr);
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

   private native PresenceNote getNthActivitiesNote(long var1, int var3);

   @Nullable
   public synchronized PresenceNote getNthActivitiesNote(int index) {
      return this.getNthActivitiesNote(this.nativePtr, index);
   }

   private native PresenceActivity getNthActivity(long var1, int var3);

   @Nullable
   public synchronized PresenceActivity getNthActivity(int index) {
      return this.getNthActivity(this.nativePtr, index);
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

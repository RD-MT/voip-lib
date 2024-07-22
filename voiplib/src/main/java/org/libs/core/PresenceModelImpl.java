package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class PresenceModelImpl implements PresenceModel {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PresenceModelImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native PresenceActivity getActivity(long var1);

   @Nullable
   public synchronized PresenceActivity getActivity() {
      return this.getActivity(this.nativePtr);
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

   private native int getCapabilities(long var1);

   public synchronized int getCapabilities() {
      return this.getCapabilities(this.nativePtr);
   }

   private native int getConsolidatedPresence(long var1);

   public synchronized ConsolidatedPresence getConsolidatedPresence() {
      return ConsolidatedPresence.fromInt(this.getConsolidatedPresence(this.nativePtr));
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

   private native boolean isOnline(long var1);

   public synchronized boolean isOnline() {
      return this.isOnline(this.nativePtr);
   }

   private native long getLatestActivityTimestamp(long var1);

   public synchronized long getLatestActivityTimestamp() {
      return this.getLatestActivityTimestamp(this.nativePtr);
   }

   private native int getNbActivities(long var1);

   public synchronized int getNbActivities() {
      return this.getNbActivities(this.nativePtr);
   }

   private native int getNbPersons(long var1);

   public synchronized int getNbPersons() {
      return this.getNbPersons(this.nativePtr);
   }

   private native int getNbServices(long var1);

   public synchronized int getNbServices() {
      return this.getNbServices(this.nativePtr);
   }

   private native Address getPresentity(long var1);

   @Nullable
   public synchronized Address getPresentity() {
      return this.getPresentity(this.nativePtr);
   }

   private native int setPresentity(long var1, Address var3);

   public synchronized int setPresentity(@Nullable Address presentity) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPresentity() on it, clone it first.");
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

      return this.setPresentity(this.nativePtr, presentity);
   }

   private native long getTimestamp(long var1);

   public synchronized long getTimestamp() {
      return this.getTimestamp(this.nativePtr);
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

   private native int addNote(long var1, String var3, String var4);

   public synchronized int addNote(@NonNull String noteContent, @Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addNote() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      return this.addNote(this.nativePtr, noteContent, lang);
   }

   private native int addPerson(long var1, PresencePerson var3);

   public synchronized int addPerson(@NonNull PresencePerson person) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addPerson() on it, clone it first.");
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

      return this.addPerson(this.nativePtr, person);
   }

   private native int addService(long var1, PresenceService var3);

   public synchronized int addService(@NonNull PresenceService service) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addService() on it, clone it first.");
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

      return this.addService(this.nativePtr, service);
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

   private native int clearPersons(long var1);

   public synchronized int clearPersons() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearPersons() on it, clone it first.");
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

      return this.clearPersons(this.nativePtr);
   }

   private native int clearServices(long var1);

   public synchronized int clearServices() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call clearServices() on it, clone it first.");
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

      return this.clearServices(this.nativePtr);
   }

   private native float getCapabilityVersion(long var1, int var3);

   public synchronized float getCapabilityVersion(FriendCapability capability) {
      return this.getCapabilityVersion(this.nativePtr, capability.toInt());
   }

   private native PresenceNote getNote(long var1, String var3);

   @Nullable
   public synchronized PresenceNote getNote(@Nullable String lang) {
      return this.getNote(this.nativePtr, lang);
   }

   private native PresenceActivity getNthActivity(long var1, int var3);

   @Nullable
   public synchronized PresenceActivity getNthActivity(int index) {
      return this.getNthActivity(this.nativePtr, index);
   }

   private native PresencePerson getNthPerson(long var1, int var3);

   @Nullable
   public synchronized PresencePerson getNthPerson(int index) {
      return this.getNthPerson(this.nativePtr, index);
   }

   private native PresenceService getNthService(long var1, int var3);

   @Nullable
   public synchronized PresenceService getNthService(int index) {
      return this.getNthService(this.nativePtr, index);
   }

   private native boolean hasCapability(long var1, int var3);

   public synchronized boolean hasCapability(FriendCapability capability) {
      return this.hasCapability(this.nativePtr, capability.toInt());
   }

   private native boolean hasCapabilityWithVersion(long var1, int var3, float var4);

   public synchronized boolean hasCapabilityWithVersion(FriendCapability capability, float version) {
      return this.hasCapabilityWithVersion(this.nativePtr, capability.toInt(), version);
   }

   private native boolean hasCapabilityWithVersionOrMore(long var1, int var3, float var4);

   public synchronized boolean hasCapabilityWithVersionOrMore(FriendCapability capability, float version) {
      return this.hasCapabilityWithVersionOrMore(this.nativePtr, capability.toInt(), version);
   }

   private native int setActivity(long var1, int var3, String var4);

   public synchronized int setActivity(PresenceActivity.Type activity, @Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setActivity() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      return this.setActivity(this.nativePtr, activity.toInt(), description);
   }

   private native PresenceModel newWithActivity(long var1, int var3, String var4);

   @Nullable
   public synchronized PresenceModel newWithActivity(PresenceActivity.Type activity, @Nullable String description) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithActivity() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      return this.newWithActivity(this.nativePtr, activity.toInt(), description);
   }

   private native PresenceModel newWithActivityAndNote(long var1, int var3, String var4, String var5, String var6);

   @Nullable
   public synchronized PresenceModel newWithActivityAndNote(PresenceActivity.Type activity, @Nullable String description, @NonNull String note, @Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithActivityAndNote() on it, clone it first.");
         } catch (CoreException var10) {
            Log.e(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.e(st);
            }
         }
      }

      return this.newWithActivityAndNote(this.nativePtr, activity.toInt(), description, note, lang);
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

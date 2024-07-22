package org.libs.core;

import androidx.annotation.NonNull;
import org.libs.mediastream.Log;

class DialPlanImpl implements DialPlan {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected DialPlanImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getCountry(long var1);

   public synchronized String getCountry() {
      return this.getCountry(this.nativePtr);
   }

   private native String getCountryCallingCode(long var1);

   @NonNull
   public synchronized String getCountryCallingCode() {
      return this.getCountryCallingCode(this.nativePtr);
   }

   private native String getInternationalCallPrefix(long var1);

   @NonNull
   public synchronized String getInternationalCallPrefix() {
      return this.getInternationalCallPrefix(this.nativePtr);
   }

   private native boolean isGeneric(long var1);

   public synchronized boolean isGeneric() {
      return this.isGeneric(this.nativePtr);
   }

   private native String getIsoCountryCode(long var1);

   @NonNull
   public synchronized String getIsoCountryCode() {
      return this.getIsoCountryCode(this.nativePtr);
   }

   private native int getNationalNumberLength(long var1);

   public synchronized int getNationalNumberLength() {
      return this.getNationalNumberLength(this.nativePtr);
   }

   private native DialPlan byCcc(long var1, String var3);

   @NonNull
   public synchronized DialPlan byCcc(@NonNull String ccc) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call byCcc() on it, clone it first.");
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

      return this.byCcc(this.nativePtr, ccc);
   }

   private native DialPlan byCccAsInt(long var1, int var3);

   @NonNull
   public synchronized DialPlan byCccAsInt(@NonNull int ccc) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call byCccAsInt() on it, clone it first.");
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

      return this.byCccAsInt(this.nativePtr, ccc);
   }

   private native DialPlan[] getAllList(long var1);

   @NonNull
   public synchronized DialPlan[] getAllList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getAllList() on it, clone it first.");
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

      return this.getAllList(this.nativePtr);
   }

   private native int lookupCccFromE1644(long var1, String var3);

   public synchronized int lookupCccFromE164(@NonNull String e164) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call lookupCccFromE164() on it, clone it first.");
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

      return this.lookupCccFromE1644(this.nativePtr, e164);
   }

   private native int lookupCccFromIso(long var1, String var3);

   public synchronized int lookupCccFromIso(@NonNull String iso) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call lookupCccFromIso() on it, clone it first.");
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

      return this.lookupCccFromIso(this.nativePtr, iso);
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

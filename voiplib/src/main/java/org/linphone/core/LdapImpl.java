package org.linphone.core;

import androidx.annotation.NonNull;
import org.linphone.mediastream.Log;

class LdapImpl implements Ldap {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected LdapImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCore() on it, clone it first.");
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

      return this.getCore(this.nativePtr);
   }

   private native int getIndex(long var1);

   public synchronized int getIndex() {
      return this.getIndex(this.nativePtr);
   }

   private native void setIndex(long var1, int var3);

   public synchronized void setIndex(int index) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIndex() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setIndex(this.nativePtr, index);
   }

   private native LdapParams getParams(long var1);

   @NonNull
   public synchronized LdapParams getParams() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getParams() on it, clone it first.");
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

      return this.getParams(this.nativePtr);
   }

   private native void setParams(long var1, LdapParams var3);

   public synchronized void setParams(@NonNull LdapParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setParams() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.setParams(this.nativePtr, params);
   }

   private native Ldap newWithParams(long var1, Core var3, LdapParams var4);

   @NonNull
   public synchronized Ldap newWithParams(@NonNull Core lc, @NonNull LdapParams params) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithParams() on it, clone it first.");
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

      return this.newWithParams(this.nativePtr, lc, params);
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

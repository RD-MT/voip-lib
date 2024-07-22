package org.libs.core;

import androidx.annotation.NonNull;
import org.libs.mediastream.Log;

class XmlRpcSessionImpl implements XmlRpcSession {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected XmlRpcSessionImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native XmlRpcRequest createRequest(long var1, int var3, String var4);

   @NonNull
   public synchronized XmlRpcRequest createRequest(XmlRpcArgType returnType, @NonNull String method) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createRequest() on it, clone it first.");
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

      return this.createRequest(this.nativePtr, returnType.toInt(), method);
   }

   private native void release(long var1);

   public synchronized void release() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call release() on it, clone it first.");
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

      this.release(this.nativePtr);
   }

   private native void sendRequest(long var1, XmlRpcRequest var3);

   public synchronized void sendRequest(@NonNull XmlRpcRequest request) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call sendRequest() on it, clone it first.");
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

      this.sendRequest(this.nativePtr, request);
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

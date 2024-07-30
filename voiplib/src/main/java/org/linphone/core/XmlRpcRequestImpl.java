package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class XmlRpcRequestImpl implements XmlRpcRequest {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected XmlRpcRequestImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getContent(long var1);

   @Nullable
   public synchronized String getContent() {
      return this.getContent(this.nativePtr);
   }

   private native int getIntResponse(long var1);

   public synchronized int getIntResponse() {
      return this.getIntResponse(this.nativePtr);
   }

   private native String[] getListResponse(long var1);

   @NonNull
   public synchronized String[] getListResponse() {
      return this.getListResponse(this.nativePtr);
   }

   private native String getRawResponse(long var1);

   @Nullable
   public synchronized String getRawResponse() {
      return this.getRawResponse(this.nativePtr);
   }

   private native int getStatus(long var1);

   public synchronized XmlRpcStatus getStatus() {
      return XmlRpcStatus.fromInt(this.getStatus(this.nativePtr));
   }

   private native String getStringResponse(long var1);

   @Nullable
   public synchronized String getStringResponse() {
      return this.getStringResponse(this.nativePtr);
   }

   private native void addIntArg(long var1, int var3);

   public synchronized void addIntArg(int value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addIntArg() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addIntArg(this.nativePtr, value);
   }

   private native void addStringArg(long var1, String var3);

   public synchronized void addStringArg(@NonNull String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addStringArg() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.i(st);
            }
         }
      }

      this.addStringArg(this.nativePtr, value);
   }

   private native void addListener(long var1, XmlRpcRequestListener var3);

   public synchronized void addListener(XmlRpcRequestListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, XmlRpcRequestListener var3);

   public synchronized void removeListener(XmlRpcRequestListener listener) {
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

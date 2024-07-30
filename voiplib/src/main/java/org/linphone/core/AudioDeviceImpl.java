package org.linphone.core;

import androidx.annotation.NonNull;

class AudioDeviceImpl implements AudioDevice {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AudioDeviceImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native int getCapabilities(long var1);

   public synchronized AudioDevice.Capabilities getCapabilities() {
      return AudioDevice.Capabilities.fromInt(this.getCapabilities(this.nativePtr));
   }

   private native String getDeviceName(long var1);

   @NonNull
   public synchronized String getDeviceName() {
      return this.getDeviceName(this.nativePtr);
   }

   private native String getDriverName(long var1);

   @NonNull
   public synchronized String getDriverName() {
      return this.getDriverName(this.nativePtr);
   }

   private native String getId(long var1);

   @NonNull
   public synchronized String getId() {
      return this.getId(this.nativePtr);
   }

   private native int getType(long var1);

   public synchronized AudioDevice.Type getType() {
      return AudioDevice.Type.fromInt(this.getType(this.nativePtr));
   }

   private native boolean hasCapability(long var1, int var3);

   public synchronized boolean hasCapability(AudioDevice.Capabilities capability) {
      return this.hasCapability(this.nativePtr, capability.toInt());
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

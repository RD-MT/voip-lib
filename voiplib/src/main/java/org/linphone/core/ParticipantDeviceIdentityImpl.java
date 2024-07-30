package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ParticipantDeviceIdentityImpl implements ParticipantDeviceIdentity {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ParticipantDeviceIdentityImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Address getAddress(long var1);

   @NonNull
   public synchronized Address getAddress() {
      return this.getAddress(this.nativePtr);
   }

   private native String getCapabilityDescriptor(long var1);

   public synchronized String getCapabilityDescriptor() {
      return this.getCapabilityDescriptor(this.nativePtr);
   }

   private native void setCapabilityDescriptor(long var1, String var3);

   public synchronized void setCapabilityDescriptor(String capabilityDescriptor) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCapabilityDescriptor() on it, clone it first.");
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

      this.setCapabilityDescriptor(this.nativePtr, capabilityDescriptor);
   }

   private native void setCapabilityDescriptor2(long var1, String[] var3);

   public synchronized void setCapabilityDescriptor(@Nullable String[] capabilityDescriptorList) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCapabilityDescriptor() on it, clone it first.");
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

      this.setCapabilityDescriptor2(this.nativePtr, capabilityDescriptorList);
   }

   private native String[] getCapabilityDescriptorList(long var1);

   @NonNull
   public synchronized String[] getCapabilityDescriptorList() {
      return this.getCapabilityDescriptorList(this.nativePtr);
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

package org.linphone.core;

import androidx.annotation.Nullable;

class SearchResultImpl implements SearchResult {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected SearchResultImpl(long ptr, boolean isConst) {
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

   @Nullable
   public synchronized Address getAddress() {
      return this.getAddress(this.nativePtr);
   }

   private native int getCapabilities(long var1);

   public synchronized int getCapabilities() {
      return this.getCapabilities(this.nativePtr);
   }

   private native Friend getFriend(long var1);

   @Nullable
   public synchronized Friend getFriend() {
      return this.getFriend(this.nativePtr);
   }

   private native String getPhoneNumber(long var1);

   @Nullable
   public synchronized String getPhoneNumber() {
      return this.getPhoneNumber(this.nativePtr);
   }

   private native int getSourceFlags(long var1);

   public synchronized int getSourceFlags() {
      return this.getSourceFlags(this.nativePtr);
   }

   private native int getWeight(long var1);

   public synchronized int getWeight() {
      return this.getWeight(this.nativePtr);
   }

   private native boolean hasCapability(long var1, int var3);

   public synchronized boolean hasCapability(FriendCapability capability) {
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

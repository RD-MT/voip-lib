package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class ParticipantImpl implements Participant {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ParticipantImpl(long ptr, boolean isConst) {
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

   private native long getCreationTime(long var1);

   public synchronized long getCreationTime() {
      return this.getCreationTime(this.nativePtr);
   }

   private native ParticipantDevice[] getDevices(long var1);

   @NonNull
   public synchronized ParticipantDevice[] getDevices() {
      return this.getDevices(this.nativePtr);
   }

   private native boolean isAdmin(long var1);

   public synchronized boolean isAdmin() {
      return this.isAdmin(this.nativePtr);
   }

   private native boolean isFocus(long var1);

   public synchronized boolean isFocus() {
      return this.isFocus(this.nativePtr);
   }

   private native int getSecurityLevel(long var1);

   public synchronized ChatRoomSecurityLevel getSecurityLevel() {
      return ChatRoomSecurityLevel.fromInt(this.getSecurityLevel(this.nativePtr));
   }

   private native ParticipantDevice findDevice(long var1, Address var3);

   @Nullable
   public synchronized ParticipantDevice findDevice(@NonNull Address address) {
      return this.findDevice(this.nativePtr, address);
   }

   private native ParticipantDevice findDevice2(long var1, Call var3);

   @Nullable
   public synchronized ParticipantDevice findDevice(@NonNull Call call) {
      return this.findDevice2(this.nativePtr, call);
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

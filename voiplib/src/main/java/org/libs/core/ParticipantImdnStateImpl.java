package org.libs.core;

import androidx.annotation.NonNull;

class ParticipantImdnStateImpl implements ParticipantImdnState {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ParticipantImdnStateImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Participant getParticipant(long var1);

   @NonNull
   public synchronized Participant getParticipant() {
      return this.getParticipant(this.nativePtr);
   }

   private native int getState(long var1);

   public synchronized ChatMessage.State getState() {
      return ChatMessage.State.fromInt(this.getState(this.nativePtr));
   }

   private native long getStateChangeTime(long var1);

   public synchronized long getStateChangeTime() {
      return this.getStateChangeTime(this.nativePtr);
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

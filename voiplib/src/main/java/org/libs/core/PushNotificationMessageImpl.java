package org.libs.core;

class PushNotificationMessageImpl implements PushNotificationMessage {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected PushNotificationMessageImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native boolean isConferenceInvitationCancellation(long var1);

   public synchronized boolean isConferenceInvitationCancellation() {
      return this.isConferenceInvitationCancellation(this.nativePtr);
   }

   private native boolean isConferenceInvitationNew(long var1);

   public synchronized boolean isConferenceInvitationNew() {
      return this.isConferenceInvitationNew(this.nativePtr);
   }

   private native boolean isConferenceInvitationUpdate(long var1);

   public synchronized boolean isConferenceInvitationUpdate() {
      return this.isConferenceInvitationUpdate(this.nativePtr);
   }

   private native boolean isIcalendar(long var1);

   public synchronized boolean isIcalendar() {
      return this.isIcalendar(this.nativePtr);
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

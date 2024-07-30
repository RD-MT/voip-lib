package org.linphone.core;

import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class EventLogImpl implements EventLog {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected EventLogImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native CallLog getCallLog(long var1);

   @Nullable
   public synchronized CallLog getCallLog() {
      return this.getCallLog(this.nativePtr);
   }

   private native ChatMessage getChatMessage(long var1);

   @Nullable
   public synchronized ChatMessage getChatMessage() {
      return this.getChatMessage(this.nativePtr);
   }

   private native ConferenceInfo getConferenceInfo(long var1);

   @Nullable
   public synchronized ConferenceInfo getConferenceInfo() {
      return this.getConferenceInfo(this.nativePtr);
   }

   private native long getCreationTime(long var1);

   public synchronized long getCreationTime() {
      return this.getCreationTime(this.nativePtr);
   }

   private native Address getDeviceAddress(long var1);

   @Nullable
   public synchronized Address getDeviceAddress() {
      return this.getDeviceAddress(this.nativePtr);
   }

   private native long getEphemeralMessageLifetime(long var1);

   public synchronized long getEphemeralMessageLifetime() {
      return this.getEphemeralMessageLifetime(this.nativePtr);
   }

   private native Address getLocalAddress(long var1);

   @Nullable
   public synchronized Address getLocalAddress() {
      return this.getLocalAddress(this.nativePtr);
   }

   private native int getNotifyId(long var1);

   public synchronized int getNotifyId() {
      return this.getNotifyId(this.nativePtr);
   }

   private native Address getParticipantAddress(long var1);

   @Nullable
   public synchronized Address getParticipantAddress() {
      return this.getParticipantAddress(this.nativePtr);
   }

   private native Address getPeerAddress(long var1);

   @Nullable
   public synchronized Address getPeerAddress() {
      return this.getPeerAddress(this.nativePtr);
   }

   private native Address getSecurityEventFaultyDeviceAddress(long var1);

   @Nullable
   public synchronized Address getSecurityEventFaultyDeviceAddress() {
      return this.getSecurityEventFaultyDeviceAddress(this.nativePtr);
   }

   private native int getSecurityEventType(long var1);

   public synchronized EventLog.SecurityEventType getSecurityEventType() {
      return EventLog.SecurityEventType.fromInt(this.getSecurityEventType(this.nativePtr));
   }

   private native String getSubject(long var1);

   @Nullable
   public synchronized String getSubject() {
      return this.getSubject(this.nativePtr);
   }

   private native int getType(long var1);

   public synchronized EventLog.Type getType() {
      return EventLog.Type.fromInt(this.getType(this.nativePtr));
   }

   private native void deleteFromDatabase(long var1);

   public synchronized void deleteFromDatabase() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call deleteFromDatabase() on it, clone it first.");
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

      this.deleteFromDatabase(this.nativePtr);
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

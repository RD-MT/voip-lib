package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ParticipantDeviceImpl implements ParticipantDevice {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ParticipantDeviceImpl(long ptr, boolean isConst) {
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

   private native int getDisconnectionMethod(long var1);

   public synchronized ParticipantDeviceDisconnectionMethod getDisconnectionMethod() {
      return ParticipantDeviceDisconnectionMethod.fromInt(this.getDisconnectionMethod(this.nativePtr));
   }

   private native String getDisconnectionReason(long var1);

   @Nullable
   public synchronized String getDisconnectionReason() {
      return this.getDisconnectionReason(this.nativePtr);
   }

   private native boolean isInConference(long var1);

   public synchronized boolean isInConference() {
      return this.isInConference(this.nativePtr);
   }

   private native boolean getIsMuted(long var1);

   public synchronized boolean getIsMuted() {
      return this.getIsMuted(this.nativePtr);
   }

   private native boolean getIsSpeaking(long var1);

   public synchronized boolean getIsSpeaking() {
      return this.getIsSpeaking(this.nativePtr);
   }

   private native int getJoiningMethod(long var1);

   public synchronized ParticipantDeviceJoiningMethod getJoiningMethod() {
      return ParticipantDeviceJoiningMethod.fromInt(this.getJoiningMethod(this.nativePtr));
   }

   private native String getName(long var1);

   @Nullable
   public synchronized String getName() {
      return this.getName(this.nativePtr);
   }

   private native Object getNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object getNativeVideoWindowId() {
      return this.getNativeVideoWindowId(this.nativePtr);
   }

   private native void setNativeVideoWindowId(long var1, Object var3);

   public synchronized void setNativeVideoWindowId(@Nullable Object windowId) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setNativeVideoWindowId() on it, clone it first.");
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

      this.setNativeVideoWindowId(this.nativePtr, windowId);
   }

   private native int getSecurityLevel(long var1);

   public synchronized ChatRoomSecurityLevel getSecurityLevel() {
      return ChatRoomSecurityLevel.fromInt(this.getSecurityLevel(this.nativePtr));
   }

   private native int getState(long var1);

   public synchronized ParticipantDeviceState getState() {
      return ParticipantDeviceState.fromInt(this.getState(this.nativePtr));
   }

   private native long getTimeOfDisconnection(long var1);

   public synchronized long getTimeOfDisconnection() {
      return this.getTimeOfDisconnection(this.nativePtr);
   }

   private native long getTimeOfJoining(long var1);

   public synchronized long getTimeOfJoining() {
      return this.getTimeOfJoining(this.nativePtr);
   }

   private native Object createNativeVideoWindowId(long var1);

   @Nullable
   public synchronized Object createNativeVideoWindowId() {
      return this.createNativeVideoWindowId(this.nativePtr);
   }

   private native int getSsrc(long var1, int var3);

   public synchronized int getSsrc(StreamType streamType) {
      return this.getSsrc(this.nativePtr, streamType.toInt());
   }

   private native boolean getStreamAvailability(long var1, int var3);

   public synchronized boolean getStreamAvailability(StreamType streamType) {
      return this.getStreamAvailability(this.nativePtr, streamType.toInt());
   }

   private native int getStreamCapability(long var1, int var3);

   public synchronized MediaDirection getStreamCapability(StreamType streamType) {
      return MediaDirection.fromInt(this.getStreamCapability(this.nativePtr, streamType.toInt()));
   }

   private native void addListener(long var1, ParticipantDeviceListener var3);

   public synchronized void addListener(ParticipantDeviceListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, ParticipantDeviceListener var3);

   public synchronized void removeListener(ParticipantDeviceListener listener) {
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

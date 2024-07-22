package org.libs.core;

class CallStatsImpl implements CallStats {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected CallStatsImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native float getDownloadBandwidth(long var1);

   public synchronized float getDownloadBandwidth() {
      return this.getDownloadBandwidth(this.nativePtr);
   }

   private native float getEstimatedDownloadBandwidth(long var1);

   public synchronized float getEstimatedDownloadBandwidth() {
      return this.getEstimatedDownloadBandwidth(this.nativePtr);
   }

   private native int getIceState(long var1);

   public synchronized IceState getIceState() {
      return IceState.fromInt(this.getIceState(this.nativePtr));
   }

   private native int getIpFamilyOfRemote(long var1);

   public synchronized AddressFamily getIpFamilyOfRemote() {
      return AddressFamily.fromInt(this.getIpFamilyOfRemote(this.nativePtr));
   }

   private native boolean isZrtpKeyAgreementAlgoPostQuantum(long var1);

   public synchronized boolean isZrtpKeyAgreementAlgoPostQuantum() {
      return this.isZrtpKeyAgreementAlgoPostQuantum(this.nativePtr);
   }

   private native float getJitterBufferSizeMs(long var1);

   public synchronized float getJitterBufferSizeMs() {
      return this.getJitterBufferSizeMs(this.nativePtr);
   }

   private native int getLatePacketsCumulativeNumber(long var1);

   public synchronized int getLatePacketsCumulativeNumber() {
      return this.getLatePacketsCumulativeNumber(this.nativePtr);
   }

   private native float getLocalLateRate(long var1);

   public synchronized float getLocalLateRate() {
      return this.getLocalLateRate(this.nativePtr);
   }

   private native float getLocalLossRate(long var1);

   public synchronized float getLocalLossRate() {
      return this.getLocalLossRate(this.nativePtr);
   }

   private native float getReceiverInterarrivalJitter(long var1);

   public synchronized float getReceiverInterarrivalJitter() {
      return this.getReceiverInterarrivalJitter(this.nativePtr);
   }

   private native float getReceiverLossRate(long var1);

   public synchronized float getReceiverLossRate() {
      return this.getReceiverLossRate(this.nativePtr);
   }

   private native float getRoundTripDelay(long var1);

   public synchronized float getRoundTripDelay() {
      return this.getRoundTripDelay(this.nativePtr);
   }

   private native float getRtcpDownloadBandwidth(long var1);

   public synchronized float getRtcpDownloadBandwidth() {
      return this.getRtcpDownloadBandwidth(this.nativePtr);
   }

   private native float getRtcpUploadBandwidth(long var1);

   public synchronized float getRtcpUploadBandwidth() {
      return this.getRtcpUploadBandwidth(this.nativePtr);
   }

   private native float getSenderInterarrivalJitter(long var1);

   public synchronized float getSenderInterarrivalJitter() {
      return this.getSenderInterarrivalJitter(this.nativePtr);
   }

   private native float getSenderLossRate(long var1);

   public synchronized float getSenderLossRate() {
      return this.getSenderLossRate(this.nativePtr);
   }

   private native int getType(long var1);

   public synchronized StreamType getType() {
      return StreamType.fromInt(this.getType(this.nativePtr));
   }

   private native float getUploadBandwidth(long var1);

   public synchronized float getUploadBandwidth() {
      return this.getUploadBandwidth(this.nativePtr);
   }

   private native int getUpnpState(long var1);

   public synchronized UpnpState getUpnpState() {
      return UpnpState.fromInt(this.getUpnpState(this.nativePtr));
   }

   private native String getZrtpAuthTagAlgo(long var1);

   public synchronized String getZrtpAuthTagAlgo() {
      return this.getZrtpAuthTagAlgo(this.nativePtr);
   }

   private native String getZrtpCipherAlgo(long var1);

   public synchronized String getZrtpCipherAlgo() {
      return this.getZrtpCipherAlgo(this.nativePtr);
   }

   private native String getZrtpHashAlgo(long var1);

   public synchronized String getZrtpHashAlgo() {
      return this.getZrtpHashAlgo(this.nativePtr);
   }

   private native String getZrtpKeyAgreementAlgo(long var1);

   public synchronized String getZrtpKeyAgreementAlgo() {
      return this.getZrtpKeyAgreementAlgo(this.nativePtr);
   }

   private native String getZrtpSasAlgo(long var1);

   public synchronized String getZrtpSasAlgo() {
      return this.getZrtpSasAlgo(this.nativePtr);
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

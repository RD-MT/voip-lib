package org.libs.core;

public interface CallStats {
   float getDownloadBandwidth();

   float getEstimatedDownloadBandwidth();

   IceState getIceState();

   AddressFamily getIpFamilyOfRemote();

   boolean isZrtpKeyAgreementAlgoPostQuantum();

   float getJitterBufferSizeMs();

   int getLatePacketsCumulativeNumber();

   float getLocalLateRate();

   float getLocalLossRate();

   float getReceiverInterarrivalJitter();

   float getReceiverLossRate();

   float getRoundTripDelay();

   float getRtcpDownloadBandwidth();

   float getRtcpUploadBandwidth();

   float getSenderInterarrivalJitter();

   float getSenderLossRate();

   StreamType getType();

   float getUploadBandwidth();

   UpnpState getUpnpState();

   String getZrtpAuthTagAlgo();

   String getZrtpCipherAlgo();

   String getZrtpHashAlgo();

   String getZrtpKeyAgreementAlgo();

   String getZrtpSasAlgo();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

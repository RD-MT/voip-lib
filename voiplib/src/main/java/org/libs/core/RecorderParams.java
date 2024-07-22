package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface RecorderParams {
   @Nullable
   AudioDevice getAudioDevice();

   void setAudioDevice(@Nullable AudioDevice var1);

   RecorderFileFormat getFileFormat();

   void setFileFormat(RecorderFileFormat var1);

   @Nullable
   String getVideoCodec();

   void setVideoCodec(@Nullable String var1);

   @Nullable
   String getWebcamName();

   void setWebcamName(@Nullable String var1);

   @Nullable
   Object getWindowId();

   void setWindowId(@Nullable Object var1);

   @NonNull
   RecorderParams clone();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Recorder {
   float getCaptureVolume();

   int getDuration();

   @Nullable
   String getFile();

   @NonNull
   RecorderParams getParams();

   void setParams(@NonNull RecorderParams var1);

   RecorderState getState();

   void close();

   @Nullable
   Content createContent();

   int open(@NonNull String var1);

   int pause();

   int start();

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

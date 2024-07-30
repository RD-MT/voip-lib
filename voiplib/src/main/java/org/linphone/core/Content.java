package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Content {
   @NonNull
   byte[] getBuffer();

   @Nullable
   String getDisposition();

   void setDisposition(@Nullable String var1);

   @Nullable
   String getEncoding();

   void setEncoding(@Nullable String var1);

   int getFileDuration();

   @Nullable
   String getFilePath();

   void setFilePath(@Nullable String var1);

   int getFileSize();

   boolean isFile();

   boolean isFileEncrypted();

   boolean isFileTransfer();

   boolean isIcalendar();

   boolean isMultipart();

   boolean isText();

   boolean isVoiceRecording();

   @Nullable
   String getKey();

   int getKeySize();

   @Nullable
   String getName();

   void setName(@Nullable String var1);

   @NonNull
   Content[] getParts();

   /** @deprecated */
   @Deprecated
   String getPlainFilePath();

   int getSize();

   void setSize(int var1);

   /** @deprecated */
   @Deprecated
   @NonNull
   String getStringBuffer();

   /** @deprecated */
   @Deprecated
   void setStringBuffer(@NonNull String var1);

   @NonNull
   String getSubtype();

   void setSubtype(@NonNull String var1);

   @NonNull
   String getType();

   void setType(@NonNull String var1);

   @Nullable
   String getUtf8Text();

   void setUtf8Text(@Nullable String var1);

   void addContentTypeParameter(@NonNull String var1, @Nullable String var2);

   void addCustomHeader(@NonNull String var1, @NonNull String var2);

   String exportPlainFile();

   @Nullable
   Content findPartByHeader(@NonNull String var1, @NonNull String var2);

   @Nullable
   String getCustomHeader(@NonNull String var1);

   @Nullable
   Content getPart(int var1);

   void setBuffer(@NonNull byte[] var1, int var2);

   void setKey(@NonNull String var1, int var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

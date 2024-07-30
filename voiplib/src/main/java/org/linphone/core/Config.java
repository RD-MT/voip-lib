package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Config {
   @NonNull
   String[] getSectionsNamesList();

   void cleanEntry(@NonNull String var1, @NonNull String var2);

   void cleanSection(@NonNull String var1);

   @NonNull
   String dump();

   @NonNull
   String dumpAsXml();

   boolean getBool(@NonNull String var1, @NonNull String var2, boolean var3);

   float getDefaultFloat(@NonNull String var1, @NonNull String var2, float var3);

   int getDefaultInt(@NonNull String var1, @NonNull String var2, int var3);

   int getDefaultInt64(@NonNull String var1, @NonNull String var2, int var3);

   String getDefaultString(@NonNull String var1, @NonNull String var2, String var3);

   float getFloat(@NonNull String var1, @NonNull String var2, float var3);

   int getInt(@NonNull String var1, @NonNull String var2, int var3);

   int getInt64(@NonNull String var1, @NonNull String var2, int var3);

   @NonNull
   String[] getKeysNamesList(@NonNull String var1);

   boolean getOverwriteFlagForEntry(@NonNull String var1, @NonNull String var2);

   boolean getOverwriteFlagForSection(@NonNull String var1);

   @Nullable
   String getSectionParamString(@NonNull String var1, @NonNull String var2, @Nullable String var3);

   boolean getSkipFlagForEntry(@NonNull String var1, String var2);

   boolean getSkipFlagForSection(@NonNull String var1);

   @Nullable
   String getString(@NonNull String var1, @NonNull String var2, @Nullable String var3);

   @NonNull
   String[] getStringList(@NonNull String var1, @NonNull String var2, @Nullable String[] var3);

   int hasEntry(@NonNull String var1, @NonNull String var2);

   int hasSection(@NonNull String var1);

   String loadFromXmlFile(@NonNull String var1);

   int loadFromXmlString(@NonNull String var1);

   int readFile(@NonNull String var1);

   boolean relativeFileExists(@NonNull String var1);

   void reload();

   void setBool(@NonNull String var1, @NonNull String var2, boolean var3);

   void setFloat(@NonNull String var1, @NonNull String var2, float var3);

   void setInt(@NonNull String var1, @NonNull String var2, int var3);

   void setInt64(@NonNull String var1, @NonNull String var2, int var3);

   void setIntHex(@NonNull String var1, @NonNull String var2, int var3);

   void setOverwriteFlagForEntry(@NonNull String var1, @NonNull String var2, boolean var3);

   void setOverwriteFlagForSection(@NonNull String var1, boolean var2);

   void setRange(@NonNull String var1, @NonNull String var2, int var3, int var4);

   void setSkipFlagForEntry(@NonNull String var1, @NonNull String var2, boolean var3);

   void setSkipFlagForSection(@NonNull String var1, boolean var2);

   void setString(@NonNull String var1, @NonNull String var2, @Nullable String var3);

   void setStringList(@NonNull String var1, @NonNull String var2, @Nullable String[] var3);

   int sync();

   void writeRelativeFile(@NonNull String var1, @NonNull String var2);

   @NonNull
   Config newFromBuffer(@NonNull String var1);

   @Nullable
   Config newWithFactory(@Nullable String var1, @Nullable String var2);

   void setUserData(Object var1);

   Object getUserData();

   long getNativePointer();

   String toString();
}

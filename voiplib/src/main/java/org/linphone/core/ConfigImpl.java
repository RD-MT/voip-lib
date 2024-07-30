package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ConfigImpl implements Config {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ConfigImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String[] getSectionsNamesList(long var1);

   @NonNull
   public synchronized String[] getSectionsNamesList() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getSectionsNamesList() on it, clone it first.");
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

      return this.getSectionsNamesList(this.nativePtr);
   }

   private native void cleanEntry(long var1, String var3, String var4);

   public synchronized void cleanEntry(@NonNull String section, @NonNull String key) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call cleanEntry() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.cleanEntry(this.nativePtr, section, key);
   }

   private native void cleanSection(long var1, String var3);

   public synchronized void cleanSection(@NonNull String section) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call cleanSection() on it, clone it first.");
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

      this.cleanSection(this.nativePtr, section);
   }

   private native String dump(long var1);

   @NonNull
   public synchronized String dump() {
      return this.dump(this.nativePtr);
   }

   private native String dumpAsXml(long var1);

   @NonNull
   public synchronized String dumpAsXml() {
      return this.dumpAsXml(this.nativePtr);
   }

   private native boolean getBool(long var1, String var3, String var4, boolean var5);

   public synchronized boolean getBool(@NonNull String section, @NonNull String key, boolean defaultValue) {
      return this.getBool(this.nativePtr, section, key, defaultValue);
   }

   private native float getDefaultFloat(long var1, String var3, String var4, float var5);

   public synchronized float getDefaultFloat(@NonNull String section, @NonNull String key, float defaultValue) {
      return this.getDefaultFloat(this.nativePtr, section, key, defaultValue);
   }

   private native int getDefaultInt(long var1, String var3, String var4, int var5);

   public synchronized int getDefaultInt(@NonNull String section, @NonNull String key, int defaultValue) {
      return this.getDefaultInt(this.nativePtr, section, key, defaultValue);
   }

   private native int getDefaultInt644(long var1, String var3, String var4, int var5);

   public synchronized int getDefaultInt64(@NonNull String section, @NonNull String key, int defaultValue) {
      return this.getDefaultInt644(this.nativePtr, section, key, defaultValue);
   }

   private native String getDefaultString(long var1, String var3, String var4, String var5);

   public synchronized String getDefaultString(@NonNull String section, @NonNull String key, String defaultValue) {
      return this.getDefaultString(this.nativePtr, section, key, defaultValue);
   }

   private native float getFloat(long var1, String var3, String var4, float var5);

   public synchronized float getFloat(@NonNull String section, @NonNull String key, float defaultValue) {
      return this.getFloat(this.nativePtr, section, key, defaultValue);
   }

   private native int getInt(long var1, String var3, String var4, int var5);

   public synchronized int getInt(@NonNull String section, @NonNull String key, int defaultValue) {
      return this.getInt(this.nativePtr, section, key, defaultValue);
   }

   private native int getInt644(long var1, String var3, String var4, int var5);

   public synchronized int getInt64(@NonNull String section, @NonNull String key, int defaultValue) {
      return this.getInt644(this.nativePtr, section, key, defaultValue);
   }

   private native String[] getKeysNamesList(long var1, String var3);

   @NonNull
   public synchronized String[] getKeysNamesList(@NonNull String section) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getKeysNamesList() on it, clone it first.");
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

      return this.getKeysNamesList(this.nativePtr, section);
   }

   private native boolean getOverwriteFlagForEntry(long var1, String var3, String var4);

   public synchronized boolean getOverwriteFlagForEntry(@NonNull String section, @NonNull String key) {
      return this.getOverwriteFlagForEntry(this.nativePtr, section, key);
   }

   private native boolean getOverwriteFlagForSection(long var1, String var3);

   public synchronized boolean getOverwriteFlagForSection(@NonNull String section) {
      return this.getOverwriteFlagForSection(this.nativePtr, section);
   }

   private native String getSectionParamString(long var1, String var3, String var4, String var5);

   @Nullable
   public synchronized String getSectionParamString(@NonNull String section, @NonNull String key, @Nullable String defaultValue) {
      return this.getSectionParamString(this.nativePtr, section, key, defaultValue);
   }

   private native boolean getSkipFlagForEntry(long var1, String var3, String var4);

   public synchronized boolean getSkipFlagForEntry(@NonNull String section, String key) {
      return this.getSkipFlagForEntry(this.nativePtr, section, key);
   }

   private native boolean getSkipFlagForSection(long var1, String var3);

   public synchronized boolean getSkipFlagForSection(@NonNull String section) {
      return this.getSkipFlagForSection(this.nativePtr, section);
   }

   private native String getString(long var1, String var3, String var4, String var5);

   @Nullable
   public synchronized String getString(@NonNull String section, @NonNull String key, @Nullable String defaultString) {
      return this.getString(this.nativePtr, section, key, defaultString);
   }

   private native String[] getStringList(long var1, String var3, String var4, String[] var5);

   @NonNull
   public synchronized String[] getStringList(@NonNull String section, @NonNull String key, @Nullable String[] defaultList) {
      return this.getStringList(this.nativePtr, section, key, defaultList);
   }

   private native int hasEntry(long var1, String var3, String var4);

   public synchronized int hasEntry(@NonNull String section, @NonNull String key) {
      return this.hasEntry(this.nativePtr, section, key);
   }

   private native int hasSection(long var1, String var3);

   public synchronized int hasSection(@NonNull String section) {
      return this.hasSection(this.nativePtr, section);
   }

   private native String loadFromXmlFile(long var1, String var3);

   public synchronized String loadFromXmlFile(@NonNull String filename) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call loadFromXmlFile() on it, clone it first.");
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

      return this.loadFromXmlFile(this.nativePtr, filename);
   }

   private native int loadFromXmlString(long var1, String var3);

   public synchronized int loadFromXmlString(@NonNull String buffer) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call loadFromXmlString() on it, clone it first.");
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

      return this.loadFromXmlString(this.nativePtr, buffer);
   }

   private native int readFile(long var1, String var3);

   public synchronized int readFile(@NonNull String filename) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call readFile() on it, clone it first.");
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

      return this.readFile(this.nativePtr, filename);
   }

   private native boolean relativeFileExists(long var1, String var3);

   public synchronized boolean relativeFileExists(@NonNull String filename) {
      return this.relativeFileExists(this.nativePtr, filename);
   }

   private native void reload(long var1);

   public synchronized void reload() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reload() on it, clone it first.");
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

      this.reload(this.nativePtr);
   }

   private native void setBool(long var1, String var3, String var4, boolean var5);

   public synchronized void setBool(@NonNull String section, @NonNull String key, boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBool() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setBool(this.nativePtr, section, key, value);
   }

   private native void setFloat(long var1, String var3, String var4, float var5);

   public synchronized void setFloat(@NonNull String section, @NonNull String key, float value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFloat() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setFloat(this.nativePtr, section, key, value);
   }

   private native void setInt(long var1, String var3, String var4, int var5);

   public synchronized void setInt(@NonNull String section, @NonNull String key, int value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInt() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setInt(this.nativePtr, section, key, value);
   }

   private native void setInt644(long var1, String var3, String var4, int var5);

   public synchronized void setInt64(@NonNull String section, @NonNull String key, int value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setInt64() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setInt644(this.nativePtr, section, key, value);
   }

   private native void setIntHex(long var1, String var3, String var4, int var5);

   public synchronized void setIntHex(@NonNull String section, @NonNull String key, int value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setIntHex() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setIntHex(this.nativePtr, section, key, value);
   }

   private native void setOverwriteFlagForEntry(long var1, String var3, String var4, boolean var5);

   public synchronized void setOverwriteFlagForEntry(@NonNull String section, @NonNull String key, boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOverwriteFlagForEntry() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setOverwriteFlagForEntry(this.nativePtr, section, key, value);
   }

   private native void setOverwriteFlagForSection(long var1, String var3, boolean var4);

   public synchronized void setOverwriteFlagForSection(@NonNull String section, boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setOverwriteFlagForSection() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.setOverwriteFlagForSection(this.nativePtr, section, value);
   }

   private native void setRange(long var1, String var3, String var4, int var5, int var6);

   public synchronized void setRange(@NonNull String section, @NonNull String key, int minValue, int maxValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRange() on it, clone it first.");
         } catch (CoreException var10) {
            Log.i(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               Log.i(st);
            }
         }
      }

      this.setRange(this.nativePtr, section, key, minValue, maxValue);
   }

   private native void setSkipFlagForEntry(long var1, String var3, String var4, boolean var5);

   public synchronized void setSkipFlagForEntry(@NonNull String section, @NonNull String key, boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSkipFlagForEntry() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setSkipFlagForEntry(this.nativePtr, section, key, value);
   }

   private native void setSkipFlagForSection(long var1, String var3, boolean var4);

   public synchronized void setSkipFlagForSection(@NonNull String section, boolean value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSkipFlagForSection() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      this.setSkipFlagForSection(this.nativePtr, section, value);
   }

   private native void setString(long var1, String var3, String var4, String var5);

   public synchronized void setString(@NonNull String section, @NonNull String key, @Nullable String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setString() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setString(this.nativePtr, section, key, value);
   }

   private native void setStringList(long var1, String var3, String var4, String[] var5);

   public synchronized void setStringList(@NonNull String section, @NonNull String key, @Nullable String[] value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStringList() on it, clone it first.");
         } catch (CoreException var9) {
            Log.i(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               Log.i(st);
            }
         }
      }

      this.setStringList(this.nativePtr, section, key, value);
   }

   private native int sync(long var1);

   public synchronized int sync() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call sync() on it, clone it first.");
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

      return this.sync(this.nativePtr);
   }

   private native void writeRelativeFile(long var1, String var3, String var4);

   public synchronized void writeRelativeFile(@NonNull String filename, @NonNull String data) {
      this.writeRelativeFile(this.nativePtr, filename, data);
   }

   private native Config newFromBuffer(long var1, String var3);

   @NonNull
   public synchronized Config newFromBuffer(@NonNull String buffer) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newFromBuffer() on it, clone it first.");
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

      return this.newFromBuffer(this.nativePtr, buffer);
   }

   private native Config newWithFactory(long var1, String var3, String var4);

   @Nullable
   public synchronized Config newWithFactory(@Nullable String configFilename, @Nullable String factoryConfigFilename) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call newWithFactory() on it, clone it first.");
         } catch (CoreException var8) {
            Log.i(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.i(st);
            }
         }
      }

      return this.newWithFactory(this.nativePtr, configFilename, factoryConfigFilename);
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

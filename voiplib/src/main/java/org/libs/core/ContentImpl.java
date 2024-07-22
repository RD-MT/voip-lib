package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class ContentImpl implements Content {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected ContentImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native byte[] getBuffer(long var1);

   @NonNull
   public synchronized byte[] getBuffer() {
      return this.getBuffer(this.nativePtr);
   }

   private native String getDisposition(long var1);

   @Nullable
   public synchronized String getDisposition() {
      return this.getDisposition(this.nativePtr);
   }

   private native void setDisposition(long var1, String var3);

   public synchronized void setDisposition(@Nullable String disposition) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDisposition() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setDisposition(this.nativePtr, disposition);
   }

   private native String getEncoding(long var1);

   @Nullable
   public synchronized String getEncoding() {
      return this.getEncoding(this.nativePtr);
   }

   private native void setEncoding(long var1, String var3);

   public synchronized void setEncoding(@Nullable String encoding) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEncoding() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setEncoding(this.nativePtr, encoding);
   }

   private native int getFileDuration(long var1);

   public synchronized int getFileDuration() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getFileDuration() on it, clone it first.");
         } catch (CoreException var6) {
            Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               Log.e(st);
            }
         }
      }

      return this.getFileDuration(this.nativePtr);
   }

   private native String getFilePath(long var1);

   @Nullable
   public synchronized String getFilePath() {
      return this.getFilePath(this.nativePtr);
   }

   private native void setFilePath(long var1, String var3);

   public synchronized void setFilePath(@Nullable String filePath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setFilePath() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setFilePath(this.nativePtr, filePath);
   }

   private native int getFileSize(long var1);

   public synchronized int getFileSize() {
      return this.getFileSize(this.nativePtr);
   }

   private native boolean isFile(long var1);

   public synchronized boolean isFile() {
      return this.isFile(this.nativePtr);
   }

   private native boolean isFileEncrypted(long var1);

   public synchronized boolean isFileEncrypted() {
      return this.isFileEncrypted(this.nativePtr);
   }

   private native boolean isFileTransfer(long var1);

   public synchronized boolean isFileTransfer() {
      return this.isFileTransfer(this.nativePtr);
   }

   private native boolean isIcalendar(long var1);

   public synchronized boolean isIcalendar() {
      return this.isIcalendar(this.nativePtr);
   }

   private native boolean isMultipart(long var1);

   public synchronized boolean isMultipart() {
      return this.isMultipart(this.nativePtr);
   }

   private native boolean isText(long var1);

   public synchronized boolean isText() {
      return this.isText(this.nativePtr);
   }

   private native boolean isVoiceRecording(long var1);

   public synchronized boolean isVoiceRecording() {
      return this.isVoiceRecording(this.nativePtr);
   }

   private native String getKey(long var1);

   @Nullable
   public synchronized String getKey() {
      return this.getKey(this.nativePtr);
   }

   private native int getKeySize(long var1);

   public synchronized int getKeySize() {
      return this.getKeySize(this.nativePtr);
   }

   private native String getName(long var1);

   @Nullable
   public synchronized String getName() {
      return this.getName(this.nativePtr);
   }

   private native void setName(long var1, String var3);

   public synchronized void setName(@Nullable String name) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setName() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setName(this.nativePtr, name);
   }

   private native Content[] getParts(long var1);

   @NonNull
   public synchronized Content[] getParts() {
      return this.getParts(this.nativePtr);
   }

   private native String getPlainFilePath(long var1);

   public synchronized String getPlainFilePath() {
      return this.getPlainFilePath(this.nativePtr);
   }

   private native int getSize(long var1);

   public synchronized int getSize() {
      return this.getSize(this.nativePtr);
   }

   private native void setSize(long var1, int var3);

   public synchronized void setSize(int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSize() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setSize(this.nativePtr, size);
   }

   private native String getStringBuffer(long var1);

   @NonNull
   public synchronized String getStringBuffer() {
      return this.getStringBuffer(this.nativePtr);
   }

   private native void setStringBuffer(long var1, String var3);

   public synchronized void setStringBuffer(@NonNull String buffer) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStringBuffer() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setStringBuffer(this.nativePtr, buffer);
   }

   private native String getSubtype(long var1);

   @NonNull
   public synchronized String getSubtype() {
      return this.getSubtype(this.nativePtr);
   }

   private native void setSubtype(long var1, String var3);

   public synchronized void setSubtype(@NonNull String subtype) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSubtype() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setSubtype(this.nativePtr, subtype);
   }

   private native String getType(long var1);

   @NonNull
   public synchronized String getType() {
      return this.getType(this.nativePtr);
   }

   private native void setType(long var1, String var3);

   public synchronized void setType(@NonNull String type) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setType() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setType(this.nativePtr, type);
   }

   private native String getUtf8Text(long var1);

   @Nullable
   public synchronized String getUtf8Text() {
      return this.getUtf8Text(this.nativePtr);
   }

   private native void setUtf8Text(long var1, String var3);

   public synchronized void setUtf8Text(@Nullable String buffer) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUtf8Text() on it, clone it first.");
         } catch (CoreException var7) {
            Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               Log.e(st);
            }
         }
      }

      this.setUtf8Text(this.nativePtr, buffer);
   }

   private native void addContentTypeParameter(long var1, String var3, String var4);

   public synchronized void addContentTypeParameter(@NonNull String name, @Nullable String value) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addContentTypeParameter() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      this.addContentTypeParameter(this.nativePtr, name, value);
   }

   private native void addCustomHeader(long var1, String var3, String var4);

   public synchronized void addCustomHeader(@NonNull String headerName, @NonNull String headerValue) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call addCustomHeader() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      this.addCustomHeader(this.nativePtr, headerName, headerValue);
   }

   private native String exportPlainFile(long var1);

   public synchronized String exportPlainFile() {
      return this.exportPlainFile(this.nativePtr);
   }

   private native Content findPartByHeader(long var1, String var3, String var4);

   @Nullable
   public synchronized Content findPartByHeader(@NonNull String headerName, @NonNull String headerValue) {
      return this.findPartByHeader(this.nativePtr, headerName, headerValue);
   }

   private native String getCustomHeader(long var1, String var3);

   @Nullable
   public synchronized String getCustomHeader(@NonNull String headerName) {
      return this.getCustomHeader(this.nativePtr, headerName);
   }

   private native Content getPart(long var1, int var3);

   @Nullable
   public synchronized Content getPart(int index) {
      return this.getPart(this.nativePtr, index);
   }

   private native void setBuffer(long var1, byte[] var3, int var4);

   public synchronized void setBuffer(@NonNull byte[] buffer, int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setBuffer() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      this.setBuffer(this.nativePtr, buffer, size);
   }

   private native void setKey(long var1, String var3, int var4);

   public synchronized void setKey(@NonNull String key, int keyLength) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setKey() on it, clone it first.");
         } catch (CoreException var8) {
            Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               Log.e(st);
            }
         }
      }

      this.setKey(this.nativePtr, key, keyLength);
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

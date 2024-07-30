package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class LoggingServiceImpl implements LoggingService {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected LoggingServiceImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDomain() on it, clone it first.");
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

      return this.getDomain(this.nativePtr);
   }

   private native void setDomain(long var1, String var3);

   public synchronized void setDomain(@Nullable String domain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDomain() on it, clone it first.");
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

      this.setDomain(this.nativePtr, domain);
   }

   private native void setLogLevel(long var1, int var3);

   public synchronized void setLogLevel(LogLevel level) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogLevel() on it, clone it first.");
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

      this.setLogLevel(this.nativePtr, level.toInt());
   }

   private native int getLogLevelMask(long var1);

   public synchronized int getLogLevelMask() {
      return this.getLogLevelMask(this.nativePtr);
   }

   private native void setLogLevelMask(long var1, int var3);

   public synchronized void setLogLevelMask(int mask) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogLevelMask() on it, clone it first.");
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

      this.setLogLevelMask(this.nativePtr, mask);
   }

   private native void setStackTraceDumpsEnabled(long var1, boolean var3);

   public synchronized void setStackTraceDumpsEnabled(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setStackTraceDumpsEnabled() on it, clone it first.");
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

      this.setStackTraceDumpsEnabled(this.nativePtr, enable);
   }

   private native void debug(long var1, String var3);

   public synchronized void debug(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call debug() on it, clone it first.");
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

      this.debug(this.nativePtr, message);
   }

   private native void error(long var1, String var3);

   public synchronized void error(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call error() on it, clone it first.");
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

      this.error(this.nativePtr, message);
   }

   private native void fatal(long var1, String var3);

   public synchronized void fatal(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call fatal() on it, clone it first.");
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

      this.fatal(this.nativePtr, message);
   }

   private native void message(long var1, String var3);

   public synchronized void message(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call message() on it, clone it first.");
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

      this.message(this.nativePtr, message);
   }

   private native void setLogFile(long var1, String var3, String var4, int var5);

   public synchronized void setLogFile(@NonNull String dir, @NonNull String filename, int maxSize) {
      this.setLogFile(this.nativePtr, dir, filename, maxSize);
   }

   private native void trace(long var1, String var3);

   public synchronized void trace(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call trace() on it, clone it first.");
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

      this.trace(this.nativePtr, message);
   }

   private native void warning(long var1, String var3);

   public synchronized void warning(@NonNull String message) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call warning() on it, clone it first.");
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

      this.warning(this.nativePtr, message);
   }

   private native LoggingService get(long var1);

   @NonNull
   public synchronized LoggingService get() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call get() on it, clone it first.");
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

      return this.get(this.nativePtr);
   }

   private native void addListener(long var1, LoggingServiceListener var3);

   public synchronized void addListener(LoggingServiceListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, LoggingServiceListener var3);

   public synchronized void removeListener(LoggingServiceListener listener) {
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

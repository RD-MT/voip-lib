package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class PlayerImpl implements Player {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected PlayerImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this.core = this.getCore();
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native int getCurrentPosition(long var1);

   public synchronized int getCurrentPosition() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getCurrentPosition() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getCurrentPosition(this.nativePtr);
      }
   }

   private native int getDuration(long var1);

   public synchronized int getDuration() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getDuration() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getDuration(this.nativePtr);
      }
   }

   private native boolean getIsVideoAvailable(long var1);

   public synchronized boolean getIsVideoAvailable() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getIsVideoAvailable() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getIsVideoAvailable(this.nativePtr);
      }
   }

   private native int getState(long var1);

   public synchronized Player.State getState() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getState() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return Player.State.fromInt(this.getState(this.nativePtr));
      }
   }

   private native float getVolumeGain(long var1);

   public synchronized float getVolumeGain() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getVolumeGain() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.getVolumeGain(this.nativePtr);
      }
   }

   private native void setVolumeGain(long var1, float var3);

   public synchronized void setVolumeGain(float gain) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setVolumeGain() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setVolumeGain(this.nativePtr, gain);
      }
   }

   private native void setWindowId(long var1, Object var3);

   public synchronized void setWindowId(@Nullable Object windowId) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setWindowId() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         this.setWindowId(this.nativePtr, windowId);
      }
   }

   private native void close(long var1);

   public synchronized void close() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call close() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         this.close(this.nativePtr);
      }
   }

   private native Object createWindowId(long var1);

   @Nullable
   public synchronized Object createWindowId() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createWindowId() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.createWindowId(this.nativePtr);
      }
   }

   private native int open(long var1, String var3);

   public synchronized int open(@NonNull String filename) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call open() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.open(this.nativePtr, filename);
      }
   }

   private native int pause(long var1);

   public synchronized int pause() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call pause() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.pause(this.nativePtr);
      }
   }

   private native int seek(long var1, int var3);

   public synchronized int seek(int timeMs) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call seek() on it, clone it first.");
            } catch (CoreException var9) {
               Log.i(var9);
               StackTraceElement[] var4 = var9.getStackTrace();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  StackTraceElement st = var4[var6];
                  Log.i(st);
               }
            }
         }

         return this.seek(this.nativePtr, timeMs);
      }
   }

   private native int start(long var1);

   public synchronized int start() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call start() on it, clone it first.");
            } catch (CoreException var8) {
               Log.i(var8);
               StackTraceElement[] var3 = var8.getStackTrace();
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  StackTraceElement st = var3[var5];
                  Log.i(st);
               }
            }
         }

         return this.start(this.nativePtr);
      }
   }

   private native void addListener(long var1, PlayerListener var3);

   public synchronized void addListener(PlayerListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, PlayerListener var3);

   public synchronized void removeListener(PlayerListener listener) {
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

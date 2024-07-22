package org.libs.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Version;

class FactoryImpl extends Factory {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;
   protected LoggingService loggingService = null;

   protected FactoryImpl() {
      this.nativePtr = this.init();
   }

   private native long init();

   public long getNativePointer() {
      return this.nativePtr;
   }

   private static boolean loadOptionalLibrary(String s) {
      try {
         System.loadLibrary(s);
         return true;
      } catch (Throwable var2) {
         Log.w("FactoryImpl", "Unable to load optional library " + s + ": " + var2.getMessage());
         return false;
      }
   }

   private native Core getCore(long var1, long var3);

   public Core getCore(long ptr) {
      return this.getCore(this.nativePtr, ptr);
   }

   public LoggingService getLoggingService() {
      if (this.loggingService == null) {
         this.loggingService = (new LoggingServiceImpl(0L, false)).get();
      }

      return this.loggingService;
   }

   public native void setDebugMode(boolean var1, String var2);

   public native void setLoggerDomain(String var1);

   public native void enableLogcatLogs(boolean var1);

   public boolean isConst() {
      return this._isConst;
   }

   private native void setCacheDir(long var1, String var3);

   public synchronized void setCacheDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setCacheDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setCacheDir(this.nativePtr, path);
   }

   private native void setConfigDir(long var1, String var3);

   public synchronized void setConfigDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setConfigDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setConfigDir(this.nativePtr, path);
   }

   private native void setDataDir(long var1, String var3);

   public synchronized void setDataDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDataDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setDataDir(this.nativePtr, path);
   }

   private native String getDataResourcesDir(long var1);

   @Nullable
   public synchronized String getDataResourcesDir() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDataResourcesDir() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getDataResourcesDir(this.nativePtr);
   }

   private native void setDataResourcesDir(long var1, String var3);

   public synchronized void setDataResourcesDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDataResourcesDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setDataResourcesDir(this.nativePtr, path);
   }

   private native DialPlan[] getDialPlans(long var1);

   @NonNull
   public synchronized DialPlan[] getDialPlans() {
      return this.getDialPlans(this.nativePtr);
   }

   private native void setDownloadDir(long var1, String var3);

   public synchronized void setDownloadDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDownloadDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setDownloadDir(this.nativePtr, path);
   }

   private native String getImageResourcesDir(long var1);

   @Nullable
   public synchronized String getImageResourcesDir() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getImageResourcesDir() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getImageResourcesDir(this.nativePtr);
   }

   private native void setImageResourcesDir(long var1, String var3);

   public synchronized void setImageResourcesDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setImageResourcesDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setImageResourcesDir(this.nativePtr, path);
   }

   private native boolean isCacheDirSet(long var1);

   public synchronized boolean isCacheDirSet() {
      return this.isCacheDirSet(this.nativePtr);
   }

   private native boolean isConfigDirSet(long var1);

   public synchronized boolean isConfigDirSet() {
      return this.isConfigDirSet(this.nativePtr);
   }

   private native boolean isDataDirSet(long var1);

   public synchronized boolean isDataDirSet() {
      return this.isDataDirSet(this.nativePtr);
   }

   private native boolean isDatabaseStorageAvailable(long var1);

   public synchronized boolean isDatabaseStorageAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isDatabaseStorageAvailable() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.isDatabaseStorageAvailable(this.nativePtr);
   }

   private native boolean isDownloadDirSet(long var1);

   public synchronized boolean isDownloadDirSet() {
      return this.isDownloadDirSet(this.nativePtr);
   }

   private native boolean isImdnAvailable(long var1);

   public synchronized boolean isImdnAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isImdnAvailable() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.isImdnAvailable(this.nativePtr);
   }

   private native boolean isQrcodeAvailable(long var1);

   public synchronized boolean isQrcodeAvailable() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isQrcodeAvailable() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.isQrcodeAvailable(this.nativePtr);
   }

   private native void setLogCollectionPath(long var1, String var3);

   public synchronized void setLogCollectionPath(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLogCollectionPath() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setLogCollectionPath(this.nativePtr, path);
   }

   private native String getMspluginsDir(long var1);

   @Nullable
   public synchronized String getMspluginsDir() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getMspluginsDir() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getMspluginsDir(this.nativePtr);
   }

   private native void setMspluginsDir(long var1, String var3);

   public synchronized void setMspluginsDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMspluginsDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setMspluginsDir(this.nativePtr, path);
   }

   private native VideoDefinition[] getRecommendedVideoDefinitions(long var1);

   @NonNull
   public synchronized VideoDefinition[] getRecommendedVideoDefinitions() {
      return this.getRecommendedVideoDefinitions(this.nativePtr);
   }

   private native String getRingResourcesDir(long var1);

   @Nullable
   public synchronized String getRingResourcesDir() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getRingResourcesDir() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getRingResourcesDir(this.nativePtr);
   }

   private native void setRingResourcesDir(long var1, String var3);

   public synchronized void setRingResourcesDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRingResourcesDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setRingResourcesDir(this.nativePtr, path);
   }

   private native String getSoundResourcesDir(long var1);

   @Nullable
   public synchronized String getSoundResourcesDir() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getSoundResourcesDir() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getSoundResourcesDir(this.nativePtr);
   }

   private native void setSoundResourcesDir(long var1, String var3);

   public synchronized void setSoundResourcesDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSoundResourcesDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setSoundResourcesDir(this.nativePtr, path);
   }

   private native VideoDefinition[] getSupportedVideoDefinitions(long var1);

   @NonNull
   public synchronized VideoDefinition[] getSupportedVideoDefinitions() {
      return this.getSupportedVideoDefinitions(this.nativePtr);
   }

   private native String getTopResourcesDir(long var1);

   @Nullable
   public synchronized String getTopResourcesDir() {
      return this.getTopResourcesDir(this.nativePtr);
   }

   private native void setTopResourcesDir(long var1, String var3);

   public synchronized void setTopResourcesDir(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTopResourcesDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setTopResourcesDir(this.nativePtr, path);
   }

   private native String computeHa1ForAlgorithm(long var1, String var3, String var4, String var5, String var6);

   @Nullable
   public synchronized String computeHa1ForAlgorithm(@NonNull String userid, @NonNull String password, @NonNull String realm, @NonNull String algorithm) {
      return this.computeHa1ForAlgorithm(this.nativePtr, userid, password, realm, algorithm);
   }

   private native Address createAddress(long var1, String var3);

   @Nullable
   public synchronized Address createAddress(@NonNull String addr) {
      return this.createAddress(this.nativePtr, addr);
   }

   private native AuthInfo createAuthInfo(long var1, String var3, String var4, String var5, String var6, String var7, String var8);

   @NonNull
   public synchronized AuthInfo createAuthInfo(@NonNull String username, @Nullable String userid, @Nullable String passwd, @Nullable String ha1, @Nullable String realm, @Nullable String domain) {
      return this.createAuthInfo(this.nativePtr, username, userid, passwd, ha1, realm, domain);
   }

   private native AuthInfo createAuthInfo2(long var1, String var3, String var4, String var5, String var6, String var7, String var8, String var9);

   @NonNull
   public synchronized AuthInfo createAuthInfo(@NonNull String username, @Nullable String userid, @Nullable String passwd, @Nullable String ha1, @Nullable String realm, @Nullable String domain, @Nullable String algorithm) {
      return this.createAuthInfo2(this.nativePtr, username, userid, passwd, ha1, realm, domain, algorithm);
   }

   private native Buffer createBuffer(long var1);

   @NonNull
   public synchronized Buffer createBuffer() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createBuffer() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createBuffer(this.nativePtr);
   }

   private native Buffer createBufferFromData(long var1, byte[] var3, int var4);

   @NonNull
   public synchronized Buffer createBufferFromData(@NonNull byte[] data, int size) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createBufferFromData() on it, clone it first.");
         } catch (CoreException var8) {
            org.libs.mediastream.Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createBufferFromData(this.nativePtr, data, size);
   }

   private native Buffer createBufferFromString(long var1, String var3);

   @NonNull
   public synchronized Buffer createBufferFromString(@NonNull String data) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createBufferFromString() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createBufferFromString(this.nativePtr, data);
   }

   private native ConferenceInfo createConferenceInfo(long var1);

   @NonNull
   public synchronized ConferenceInfo createConferenceInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConferenceInfo() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createConferenceInfo(this.nativePtr);
   }

   private native ConferenceInfo createConferenceInfoFromIcalendarContent(long var1, Content var3);

   @Nullable
   public synchronized ConferenceInfo createConferenceInfoFromIcalendarContent(@NonNull Content content) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConferenceInfoFromIcalendarContent() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createConferenceInfoFromIcalendarContent(this.nativePtr, content);
   }

   private native Config createConfig(long var1, String var3);

   @NonNull
   public synchronized Config createConfig(@Nullable String path) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConfig() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createConfig(this.nativePtr, path);
   }

   private native Config createConfigFromString(long var1, String var3);

   @NonNull
   public synchronized Config createConfigFromString(@NonNull String data) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConfigFromString() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createConfigFromString(this.nativePtr, data);
   }

   private native Config createConfigWithFactory(long var1, String var3, String var4);

   @NonNull
   public synchronized Config createConfigWithFactory(@Nullable String path, @Nullable String factoryPath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createConfigWithFactory() on it, clone it first.");
         } catch (CoreException var8) {
            org.libs.mediastream.Log.e(var8);
            StackTraceElement[] var4 = var8.getStackTrace();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               StackTraceElement st = var4[var6];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createConfigWithFactory(this.nativePtr, path, factoryPath);
   }

   private native Content createContent(long var1);

   @NonNull
   public synchronized Content createContent() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createContent() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createContent(this.nativePtr);
   }

   private native Content createContentFromFile(long var1, String var3);

   @NonNull
   public synchronized Content createContentFromFile(@NonNull String filePath) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createContentFromFile() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createContentFromFile(this.nativePtr, filePath);
   }

   private native Core createCore3(long var1, String var3, String var4, Object var5);

   @NonNull
   public synchronized Core createCore(@Nullable String configPath, @Nullable String factoryConfigPath, @Nullable Object systemContext) {
      return this.createCore3(this.nativePtr, configPath, factoryConfigPath, systemContext);
   }

   private native Core createCoreWithConfig3(long var1, Config var3, Object var4);

   @NonNull
   public synchronized Core createCoreWithConfig(@NonNull Config config, @Nullable Object systemContext) {
      return this.createCoreWithConfig3(this.nativePtr, config, systemContext);
   }

   private native DigestAuthenticationPolicy createDigestAuthenticationPolicy(long var1);

   @NonNull
   public synchronized DigestAuthenticationPolicy createDigestAuthenticationPolicy() {
      return this.createDigestAuthenticationPolicy(this.nativePtr);
   }

   private native ErrorInfo createErrorInfo(long var1);

   @NonNull
   public synchronized ErrorInfo createErrorInfo() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createErrorInfo() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createErrorInfo(this.nativePtr);
   }

   private native FriendPhoneNumber createFriendPhoneNumber(long var1, String var3, String var4);

   @NonNull
   public synchronized FriendPhoneNumber createFriendPhoneNumber(@NonNull String phoneNumber, @Nullable String label) {
      return this.createFriendPhoneNumber(this.nativePtr, phoneNumber, label);
   }

   private native ParticipantDeviceIdentity createParticipantDeviceIdentity(long var1, Address var3, String var4);

   @NonNull
   public synchronized ParticipantDeviceIdentity createParticipantDeviceIdentity(@NonNull Address address, @Nullable String name) {
      return this.createParticipantDeviceIdentity(this.nativePtr, address, name);
   }

   private native Content createQrcode(long var1, String var3, int var4, int var5, int var6);

   @Nullable
   public synchronized Content createQrcode(@NonNull String code, int width, int height, int margin) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createQrcode() on it, clone it first.");
         } catch (CoreException var10) {
            org.libs.mediastream.Log.e(var10);
            StackTraceElement[] var6 = var10.getStackTrace();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               StackTraceElement st = var6[var8];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createQrcode(this.nativePtr, code, width, height, margin);
   }

   private native Range createRange(long var1);

   @NonNull
   public synchronized Range createRange() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createRange() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createRange(this.nativePtr);
   }

   private native Transports createTransports(long var1);

   @NonNull
   public synchronized Transports createTransports() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createTransports() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createTransports(this.nativePtr);
   }

   private native TunnelConfig createTunnelConfig(long var1);

   @NonNull
   public synchronized TunnelConfig createTunnelConfig() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createTunnelConfig() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createTunnelConfig(this.nativePtr);
   }

   private native Vcard createVcard(long var1);

   @NonNull
   public synchronized Vcard createVcard() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createVcard() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createVcard(this.nativePtr);
   }

   private native VideoActivationPolicy createVideoActivationPolicy(long var1);

   @NonNull
   public synchronized VideoActivationPolicy createVideoActivationPolicy() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createVideoActivationPolicy() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createVideoActivationPolicy(this.nativePtr);
   }

   private native VideoDefinition createVideoDefinition(long var1, int var3, int var4);

   @NonNull
   public synchronized VideoDefinition createVideoDefinition(int width, int height) {
      return this.createVideoDefinition(this.nativePtr, width, height);
   }

   private native VideoDefinition createVideoDefinitionFromName(long var1, String var3);

   @NonNull
   public synchronized VideoDefinition createVideoDefinitionFromName(@NonNull String name) {
      return this.createVideoDefinitionFromName(this.nativePtr, name);
   }

   private native VideoSourceDescriptor createVideoSourceDescriptor(long var1);

   @NonNull
   public synchronized VideoSourceDescriptor createVideoSourceDescriptor() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createVideoSourceDescriptor() on it, clone it first.");
         } catch (CoreException var6) {
            org.libs.mediastream.Log.e(var6);
            StackTraceElement[] var2 = var6.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement st = var2[var4];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.createVideoSourceDescriptor(this.nativePtr);
   }

   private native void enableLogCollection(long var1, int var3);

   public synchronized void enableLogCollection(LogCollectionState state) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call enableLogCollection() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.enableLogCollection(this.nativePtr, state.toInt());
   }

   private native String getCacheDir(long var1, Object var3);

   @Nullable
   public synchronized String getCacheDir(@Nullable Object context) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getCacheDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getCacheDir(this.nativePtr, context);
   }

   private native String getConfigDir(long var1, Object var3);

   @Nullable
   public synchronized String getConfigDir(@Nullable Object context) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getConfigDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getConfigDir(this.nativePtr, context);
   }

   private native String getDataDir(long var1, Object var3);

   @Nullable
   public synchronized String getDataDir(@Nullable Object context) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDataDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getDataDir(this.nativePtr, context);
   }

   private native String getDownloadDir(long var1, Object var3);

   @Nullable
   public synchronized String getDownloadDir(@Nullable Object context) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getDownloadDir() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.getDownloadDir(this.nativePtr, context);
   }

   private native boolean isChatroomBackendAvailable(long var1, int var3);

   public synchronized boolean isChatroomBackendAvailable(ChatRoomBackend chatroomBackend) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isChatroomBackendAvailable() on it, clone it first.");
         } catch (CoreException var7) {
            org.libs.mediastream.Log.e(var7);
            StackTraceElement[] var3 = var7.getStackTrace();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               StackTraceElement st = var3[var5];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.isChatroomBackendAvailable(this.nativePtr, chatroomBackend.toInt());
   }

   private native void setVfsEncryption(long var1, int var3, byte[] var4, int var5);

   public synchronized void setVfsEncryption(int encryptionModule, @Nullable byte[] secret, int secretSize) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setVfsEncryption() on it, clone it first.");
         } catch (CoreException var9) {
            org.libs.mediastream.Log.e(var9);
            StackTraceElement[] var5 = var9.getStackTrace();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               StackTraceElement st = var5[var7];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      this.setVfsEncryption(this.nativePtr, encryptionModule, secret, secretSize);
   }

   private native int writeQrcodeFile(long var1, String var3, String var4, int var5, int var6, int var7);

   public synchronized int writeQrcodeFile(@NonNull String filePath, @NonNull String code, int width, int height, int margin) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call writeQrcodeFile() on it, clone it first.");
         } catch (CoreException var11) {
            org.libs.mediastream.Log.e(var11);
            StackTraceElement[] var7 = var11.getStackTrace();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               StackTraceElement st = var7[var9];
               org.libs.mediastream.Log.e(st);
            }
         }
      }

      return this.writeQrcodeFile(this.nativePtr, filePath, code, width, height, margin);
   }

   public void setUserData(Object data) {
      this.userData = data;
   }

   public Object getUserData() {
      return this.userData;
   }

   static {
      System.loadLibrary("c++_shared");
      loadOptionalLibrary("ffmpeg-linphone");
      System.loadLibrary("bctoolbox");
      System.loadLibrary("ortp");
      System.loadLibrary("mediastreamer");
      System.loadLibrary("linphone");
      Version.dumpCapabilities();
   }
}

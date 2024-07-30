package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class MagicSearchImpl implements MagicSearch {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected MagicSearchImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getDelimiter(long var1);

   @Nullable
   public synchronized String getDelimiter() {
      return this.getDelimiter(this.nativePtr);
   }

   private native void setDelimiter(long var1, String var3);

   public synchronized void setDelimiter(@Nullable String delimiter) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDelimiter() on it, clone it first.");
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

      this.setDelimiter(this.nativePtr, delimiter);
   }

   private native SearchResult[] getLastSearch(long var1);

   @NonNull
   public synchronized SearchResult[] getLastSearch() {
      return this.getLastSearch(this.nativePtr);
   }

   private native boolean getLimitedSearch(long var1);

   public synchronized boolean getLimitedSearch() {
      return this.getLimitedSearch(this.nativePtr);
   }

   private native void setLimitedSearch(long var1, boolean var3);

   public synchronized void setLimitedSearch(boolean limited) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLimitedSearch() on it, clone it first.");
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

      this.setLimitedSearch(this.nativePtr, limited);
   }

   private native int getMaxWeight(long var1);

   public synchronized int getMaxWeight() {
      return this.getMaxWeight(this.nativePtr);
   }

   private native void setMaxWeight(long var1, int var3);

   public synchronized void setMaxWeight(int weight) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMaxWeight() on it, clone it first.");
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

      this.setMaxWeight(this.nativePtr, weight);
   }

   private native int getMinWeight(long var1);

   public synchronized int getMinWeight() {
      return this.getMinWeight(this.nativePtr);
   }

   private native void setMinWeight(long var1, int var3);

   public synchronized void setMinWeight(int weight) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setMinWeight() on it, clone it first.");
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

      this.setMinWeight(this.nativePtr, weight);
   }

   private native int getSearchLimit(long var1);

   public synchronized int getSearchLimit() {
      return this.getSearchLimit(this.nativePtr);
   }

   private native void setSearchLimit(long var1, int var3);

   public synchronized void setSearchLimit(int limit) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setSearchLimit() on it, clone it first.");
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

      this.setSearchLimit(this.nativePtr, limit);
   }

   private native boolean getUseDelimiter(long var1);

   public synchronized boolean getUseDelimiter() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getUseDelimiter() on it, clone it first.");
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

      return this.getUseDelimiter(this.nativePtr);
   }

   private native void setUseDelimiter(long var1, boolean var3);

   public synchronized void setUseDelimiter(boolean enable) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUseDelimiter() on it, clone it first.");
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

      this.setUseDelimiter(this.nativePtr, enable);
   }

   private native SearchResult[] getContactListFromFilter(long var1, String var3, String var4);

   @NonNull
   public synchronized SearchResult[] getContactListFromFilter(@Nullable String filter, @Nullable String domain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactListFromFilter() on it, clone it first.");
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

      return this.getContactListFromFilter(this.nativePtr, filter, domain);
   }

   private native void getContactListFromFilterAsync(long var1, String var3, String var4);

   public synchronized void getContactListFromFilterAsync(@Nullable String filter, @Nullable String domain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactListFromFilterAsync() on it, clone it first.");
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

      this.getContactListFromFilterAsync(this.nativePtr, filter, domain);
   }

   private native SearchResult[] getContacts(long var1, String var3, String var4, int var5);

   @NonNull
   public synchronized SearchResult[] getContacts(@Nullable String filter, @Nullable String domain, int sourceFlags) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContacts() on it, clone it first.");
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

      return this.getContacts(this.nativePtr, filter, domain, sourceFlags);
   }

   private native void getContactsAsync(long var1, String var3, String var4, int var5);

   public synchronized void getContactsAsync(@Nullable String filter, @Nullable String domain, int sourceFlags) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactsAsync() on it, clone it first.");
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

      this.getContactsAsync(this.nativePtr, filter, domain, sourceFlags);
   }

   private native SearchResult[] getContactsList(long var1, String var3, String var4, int var5, int var6);

   @NonNull
   public synchronized SearchResult[] getContactsList(@Nullable String filter, @Nullable String domain, int sourceFlags, MagicSearchAggregation aggregation) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactsList() on it, clone it first.");
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

      return this.getContactsList(this.nativePtr, filter, domain, sourceFlags, aggregation.toInt());
   }

   private native void getContactsListAsync(long var1, String var3, String var4, int var5, int var6);

   public synchronized void getContactsListAsync(@Nullable String filter, @Nullable String domain, int sourceFlags, MagicSearchAggregation aggregation) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call getContactsListAsync() on it, clone it first.");
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

      this.getContactsListAsync(this.nativePtr, filter, domain, sourceFlags, aggregation.toInt());
   }

   private native void resetSearchCache(long var1);

   public synchronized void resetSearchCache() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call resetSearchCache() on it, clone it first.");
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

      this.resetSearchCache(this.nativePtr);
   }

   private native void addListener(long var1, MagicSearchListener var3);

   public synchronized void addListener(MagicSearchListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, MagicSearchListener var3);

   public synchronized void removeListener(MagicSearchListener listener) {
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

package org.libs.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.libs.mediastream.Log;

class AccountCreatorImpl implements AccountCreator {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected boolean _isConst = false;

   protected AccountCreatorImpl(long ptr, boolean isConst) {
      this.nativePtr = ptr;
      this._isConst = isConst;
   }

   public long getNativePointer() {
      return this.nativePtr;
   }

   public boolean isConst() {
      return this._isConst;
   }

   private native String getAccountCreationRequestToken(long var1);

   @Nullable
   public synchronized String getAccountCreationRequestToken() {
      return this.getAccountCreationRequestToken(this.nativePtr);
   }

   private native void setAccountCreationRequestToken(long var1, String var3);

   public synchronized void setAccountCreationRequestToken(@Nullable String token) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAccountCreationRequestToken() on it, clone it first.");
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

      this.setAccountCreationRequestToken(this.nativePtr, token);
   }

   private native String getActivationCode(long var1);

   @Nullable
   public synchronized String getActivationCode() {
      return this.getActivationCode(this.nativePtr);
   }

   private native int setActivationCode(long var1, String var3);

   public synchronized AccountCreator.ActivationCodeStatus setActivationCode(@Nullable String activationCode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setActivationCode() on it, clone it first.");
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

      return AccountCreator.ActivationCodeStatus.fromInt(this.setActivationCode(this.nativePtr, activationCode));
   }

   private native String getAlgorithm(long var1);

   @Nullable
   public synchronized String getAlgorithm() {
      return this.getAlgorithm(this.nativePtr);
   }

   private native int setAlgorithm(long var1, String var3);

   public synchronized AccountCreatorAlgoStatus setAlgorithm(@Nullable String algorithm) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAlgorithm() on it, clone it first.");
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

      return AccountCreatorAlgoStatus.fromInt(this.setAlgorithm(this.nativePtr, algorithm));
   }

   private native int setAsDefault(long var1, boolean var3);

   public synchronized AccountCreator.Status setAsDefault(boolean setAsDefault) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setAsDefault() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.setAsDefault(this.nativePtr, setAsDefault));
   }

   private native String getDisplayName(long var1);

   @Nullable
   public synchronized String getDisplayName() {
      return this.getDisplayName(this.nativePtr);
   }

   private native int setDisplayName(long var1, String var3);

   public synchronized AccountCreator.UsernameStatus setDisplayName(@Nullable String displayName) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDisplayName() on it, clone it first.");
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

      return AccountCreator.UsernameStatus.fromInt(this.setDisplayName(this.nativePtr, displayName));
   }

   private native String getDomain(long var1);

   @Nullable
   public synchronized String getDomain() {
      return this.getDomain(this.nativePtr);
   }

   private native int setDomain(long var1, String var3);

   public synchronized AccountCreator.DomainStatus setDomain(@Nullable String domain) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setDomain() on it, clone it first.");
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

      return AccountCreator.DomainStatus.fromInt(this.setDomain(this.nativePtr, domain));
   }

   private native String getEmail(long var1);

   @Nullable
   public synchronized String getEmail() {
      return this.getEmail(this.nativePtr);
   }

   private native int setEmail(long var1, String var3);

   public synchronized AccountCreator.EmailStatus setEmail(@Nullable String email) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setEmail() on it, clone it first.");
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

      return AccountCreator.EmailStatus.fromInt(this.setEmail(this.nativePtr, email));
   }

   private native String getHa11(long var1);

   @Nullable
   public synchronized String getHa1() {
      return this.getHa11(this.nativePtr);
   }

   private native int setHa11(long var1, String var3);

   public synchronized AccountCreator.PasswordStatus setHa1(@Nullable String ha1) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setHa1() on it, clone it first.");
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

      return AccountCreator.PasswordStatus.fromInt(this.setHa11(this.nativePtr, ha1));
   }

   private native String getLanguage(long var1);

   @Nullable
   public synchronized String getLanguage() {
      return this.getLanguage(this.nativePtr);
   }

   private native int setLanguage(long var1, String var3);

   public synchronized AccountCreator.LanguageStatus setLanguage(@Nullable String lang) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setLanguage() on it, clone it first.");
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

      return AccountCreator.LanguageStatus.fromInt(this.setLanguage(this.nativePtr, lang));
   }

   private native String getPassword(long var1);

   @Nullable
   public synchronized String getPassword() {
      return this.getPassword(this.nativePtr);
   }

   private native int setPassword(long var1, String var3);

   public synchronized AccountCreator.PasswordStatus setPassword(@Nullable String password) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPassword() on it, clone it first.");
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

      return AccountCreator.PasswordStatus.fromInt(this.setPassword(this.nativePtr, password));
   }

   private native String getPhoneCountryCode(long var1);

   @Nullable
   public synchronized String getPhoneCountryCode() {
      return this.getPhoneCountryCode(this.nativePtr);
   }

   private native String getPhoneNumber(long var1);

   @Nullable
   public synchronized String getPhoneNumber() {
      return this.getPhoneNumber(this.nativePtr);
   }

   private native String getPnParam(long var1);

   @Nullable
   public synchronized String getPnParam() {
      return this.getPnParam(this.nativePtr);
   }

   private native void setPnParam(long var1, String var3);

   public synchronized void setPnParam(@Nullable String pnParam) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPnParam() on it, clone it first.");
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

      this.setPnParam(this.nativePtr, pnParam);
   }

   private native String getPnPrid(long var1);

   @Nullable
   public synchronized String getPnPrid() {
      return this.getPnPrid(this.nativePtr);
   }

   private native void setPnPrid(long var1, String var3);

   public synchronized void setPnPrid(@Nullable String pnPrid) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPnPrid() on it, clone it first.");
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

      this.setPnPrid(this.nativePtr, pnPrid);
   }

   private native String getPnProvider(long var1);

   @Nullable
   public synchronized String getPnProvider() {
      return this.getPnProvider(this.nativePtr);
   }

   private native void setPnProvider(long var1, String var3);

   public synchronized void setPnProvider(@Nullable String pnProvider) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPnProvider() on it, clone it first.");
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

      this.setPnProvider(this.nativePtr, pnProvider);
   }

   private native void setProxyConfig(long var1, ProxyConfig var3);

   public synchronized void setProxyConfig(@Nullable ProxyConfig cfg) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setProxyConfig() on it, clone it first.");
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

      this.setProxyConfig(this.nativePtr, cfg);
   }

   private native String getRoute(long var1);

   @Nullable
   public synchronized String getRoute() {
      return this.getRoute(this.nativePtr);
   }

   private native int setRoute(long var1, String var3);

   public synchronized AccountCreator.Status setRoute(@Nullable String route) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setRoute() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.setRoute(this.nativePtr, route));
   }

   private native boolean getSetAsDefault(long var1);

   public synchronized boolean getSetAsDefault() {
      return this.getSetAsDefault(this.nativePtr);
   }

   private native String getToken(long var1);

   @Nullable
   public synchronized String getToken() {
      return this.getToken(this.nativePtr);
   }

   private native void setToken(long var1, String var3);

   public synchronized void setToken(@Nullable String token) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setToken() on it, clone it first.");
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

      this.setToken(this.nativePtr, token);
   }

   private native int getTransport(long var1);

   public synchronized TransportType getTransport() {
      return TransportType.fromInt(this.getTransport(this.nativePtr));
   }

   private native int setTransport(long var1, int var3);

   public synchronized AccountCreator.TransportStatus setTransport(TransportType transport) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setTransport() on it, clone it first.");
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

      return AccountCreator.TransportStatus.fromInt(this.setTransport(this.nativePtr, transport.toInt()));
   }

   private native String getUsername(long var1);

   @Nullable
   public synchronized String getUsername() {
      return this.getUsername(this.nativePtr);
   }

   private native int setUsername(long var1, String var3);

   public synchronized AccountCreator.UsernameStatus setUsername(@Nullable String username) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setUsername() on it, clone it first.");
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

      return AccountCreator.UsernameStatus.fromInt(this.setUsername(this.nativePtr, username));
   }

   private native int activateAccount(long var1);

   public synchronized AccountCreator.Status activateAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call activateAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.activateAccount(this.nativePtr));
   }

   private native int activateAlias(long var1);

   public synchronized AccountCreator.Status activateAlias() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call activateAlias() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.activateAlias(this.nativePtr));
   }

   private native int createAccount(long var1);

   public synchronized AccountCreator.Status createAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call createAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.createAccount(this.nativePtr));
   }

   private native Account createAccountInCore(long var1);

   @Nullable
   public synchronized Account createAccountInCore() {
      return this.createAccountInCore(this.nativePtr);
   }

   private native ProxyConfig createProxyConfig(long var1);

   @Nullable
   public synchronized ProxyConfig createProxyConfig() {
      return this.createProxyConfig(this.nativePtr);
   }

   private native int isAccountActivated(long var1);

   public synchronized AccountCreator.Status isAccountActivated() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAccountActivated() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.isAccountActivated(this.nativePtr));
   }

   private native int isAccountExist(long var1);

   public synchronized AccountCreator.Status isAccountExist() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAccountExist() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.isAccountExist(this.nativePtr));
   }

   private native int isAccountLinked(long var1);

   public synchronized AccountCreator.Status isAccountLinked() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAccountLinked() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.isAccountLinked(this.nativePtr));
   }

   private native int isAliasUsed(long var1);

   public synchronized AccountCreator.Status isAliasUsed() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call isAliasUsed() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.isAliasUsed(this.nativePtr));
   }

   private native int linkAccount(long var1);

   public synchronized AccountCreator.Status linkAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call linkAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.linkAccount(this.nativePtr));
   }

   private native int loginLinphoneAccount(long var1);

   public synchronized AccountCreator.Status loginLinphoneAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call loginLinphoneAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.loginLinphoneAccount(this.nativePtr));
   }

   private native int recoverAccount(long var1);

   public synchronized AccountCreator.Status recoverAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call recoverAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.recoverAccount(this.nativePtr));
   }

   private native int requestAccountCreationRequestToken(long var1);

   public synchronized AccountCreator.Status requestAccountCreationRequestToken() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call requestAccountCreationRequestToken() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.requestAccountCreationRequestToken(this.nativePtr));
   }

   private native int requestAccountCreationTokenUsingRequestToken(long var1);

   public synchronized AccountCreator.Status requestAccountCreationTokenUsingRequestToken() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call requestAccountCreationTokenUsingRequestToken() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.requestAccountCreationTokenUsingRequestToken(this.nativePtr));
   }

   private native int requestAuthToken(long var1);

   public synchronized AccountCreator.Status requestAuthToken() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call requestAuthToken() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.requestAuthToken(this.nativePtr));
   }

   private native void reset(long var1);

   public synchronized void reset() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call reset() on it, clone it first.");
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

      this.reset(this.nativePtr);
   }

   private native int setPhoneNumber(long var1, String var3, String var4);

   public synchronized int setPhoneNumber(@Nullable String phoneNumber, @Nullable String countryCode) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call setPhoneNumber() on it, clone it first.");
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

      return this.setPhoneNumber(this.nativePtr, phoneNumber, countryCode);
   }

   private native int updateAccount(long var1);

   public synchronized AccountCreator.Status updateAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call updateAccount() on it, clone it first.");
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

      return AccountCreator.Status.fromInt(this.updateAccount(this.nativePtr));
   }

   private native void useTestAdminAccount(long var1);

   public synchronized void useTestAdminAccount() {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call useTestAdminAccount() on it, clone it first.");
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

      this.useTestAdminAccount(this.nativePtr);
   }

   private native AccountCreator create(long var1, Core var3);

   @NonNull
   public synchronized AccountCreator create(@NonNull Core core) {
      if (this._isConst) {
         try {
            throw new CoreException(this.toString() + " is const! If you want to call create() on it, clone it first.");
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

      return this.create(this.nativePtr, core);
   }

   private native void addListener(long var1, AccountCreatorListener var3);

   public synchronized void addListener(AccountCreatorListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, AccountCreatorListener var3);

   public synchronized void removeListener(AccountCreatorListener listener) {
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

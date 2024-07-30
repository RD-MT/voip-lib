package org.linphone.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.linphone.mediastream.Log;

class ChatRoomImpl implements ChatRoom {
   protected long nativePtr = 0L;
   protected transient Object userData = null;
   protected Core core = null;
   protected boolean _isConst = false;

   protected ChatRoomImpl(long ptr, boolean isConst) {
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

   private native Call getCall(long var1);

   @Nullable
   public synchronized Call getCall() {
      synchronized(this.core) {
         return this.getCall(this.nativePtr);
      }
   }

   private native int getCapabilities(long var1);

   public synchronized int getCapabilities() {
      synchronized(this.core) {
         return this.getCapabilities(this.nativePtr);
      }
   }

   private native int getChar(long var1);

   public synchronized int getChar() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getChar() on it, clone it first.");
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

         return this.getChar(this.nativePtr);
      }
   }

   private native Address[] getComposingAddresses(long var1);

   @NonNull
   public synchronized Address[] getComposingAddresses() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getComposingAddresses() on it, clone it first.");
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

         return this.getComposingAddresses(this.nativePtr);
      }
   }

   private native Address getConferenceAddress(long var1);

   @Nullable
   public synchronized Address getConferenceAddress() {
      synchronized(this.core) {
         return this.getConferenceAddress(this.nativePtr);
      }
   }

   private native void setConferenceAddress(long var1, Address var3);

   public synchronized void setConferenceAddress(@Nullable Address conferenceAddress) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setConferenceAddress() on it, clone it first.");
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

         this.setConferenceAddress(this.nativePtr, conferenceAddress);
      }
   }

   private native Core getCore(long var1);

   @NonNull
   public synchronized Core getCore() {
      return this.getCore(this.nativePtr);
   }

   private native long getCreationTime(long var1);

   public synchronized long getCreationTime() {
      synchronized(this.core) {
         return this.getCreationTime(this.nativePtr);
      }
   }

   private native ChatRoomParams getCurrentParams(long var1);

   @NonNull
   public synchronized ChatRoomParams getCurrentParams() {
      synchronized(this.core) {
         return this.getCurrentParams(this.nativePtr);
      }
   }

   private native boolean isEphemeralEnabled(long var1);

   public synchronized boolean isEphemeralEnabled() {
      synchronized(this.core) {
         return this.isEphemeralEnabled(this.nativePtr);
      }
   }

   private native void setEphemeralEnabled(long var1, boolean var3);

   public synchronized void setEphemeralEnabled(boolean enable) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setEphemeralEnabled() on it, clone it first.");
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

         this.setEphemeralEnabled(this.nativePtr, enable);
      }
   }

   private native long getEphemeralLifetime(long var1);

   public synchronized long getEphemeralLifetime() {
      synchronized(this.core) {
         return this.getEphemeralLifetime(this.nativePtr);
      }
   }

   private native void setEphemeralLifetime(long var1, long var3);

   public synchronized void setEphemeralLifetime(long time) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setEphemeralLifetime() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         this.setEphemeralLifetime(this.nativePtr, time);
      }
   }

   private native int getEphemeralMode(long var1);

   public synchronized ChatRoomEphemeralMode getEphemeralMode() {
      synchronized(this.core) {
         return ChatRoomEphemeralMode.fromInt(this.getEphemeralMode(this.nativePtr));
      }
   }

   private native void setEphemeralMode(long var1, int var3);

   public synchronized void setEphemeralMode(ChatRoomEphemeralMode mode) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setEphemeralMode() on it, clone it first.");
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

         this.setEphemeralMode(this.nativePtr, mode.toInt());
      }
   }

   private native int getHistoryEventsSize(long var1);

   public synchronized int getHistoryEventsSize() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryEventsSize() on it, clone it first.");
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

         return this.getHistoryEventsSize(this.nativePtr);
      }
   }

   private native int getHistorySize(long var1);

   public synchronized int getHistorySize() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistorySize() on it, clone it first.");
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

         return this.getHistorySize(this.nativePtr);
      }
   }

   private native boolean isEmpty(long var1);

   public synchronized boolean isEmpty() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call isEmpty() on it, clone it first.");
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

         return this.isEmpty(this.nativePtr);
      }
   }

   private native boolean isReadOnly(long var1);

   public synchronized boolean isReadOnly() {
      synchronized(this.core) {
         return this.isReadOnly(this.nativePtr);
      }
   }

   private native boolean isRemoteComposing(long var1);

   public synchronized boolean isRemoteComposing() {
      synchronized(this.core) {
         return this.isRemoteComposing(this.nativePtr);
      }
   }

   private native ChatMessage getLastMessageInHistory(long var1);

   @Nullable
   public synchronized ChatMessage getLastMessageInHistory() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getLastMessageInHistory() on it, clone it first.");
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

         return this.getLastMessageInHistory(this.nativePtr);
      }
   }

   private native long getLastUpdateTime(long var1);

   public synchronized long getLastUpdateTime() {
      synchronized(this.core) {
         return this.getLastUpdateTime(this.nativePtr);
      }
   }

   private native Address getLocalAddress(long var1);

   @NonNull
   public synchronized Address getLocalAddress() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getLocalAddress() on it, clone it first.");
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

         return this.getLocalAddress(this.nativePtr);
      }
   }

   private native Participant getMe(long var1);

   @Nullable
   public synchronized Participant getMe() {
      synchronized(this.core) {
         return this.getMe(this.nativePtr);
      }
   }

   private native int getNbParticipants(long var1);

   public synchronized int getNbParticipants() {
      synchronized(this.core) {
         return this.getNbParticipants(this.nativePtr);
      }
   }

   private native Participant[] getParticipants(long var1);

   @NonNull
   public synchronized Participant[] getParticipants() {
      synchronized(this.core) {
         return this.getParticipants(this.nativePtr);
      }
   }

   private native Address getPeerAddress(long var1);

   @NonNull
   public synchronized Address getPeerAddress() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getPeerAddress() on it, clone it first.");
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

         return this.getPeerAddress(this.nativePtr);
      }
   }

   private native int getSecurityLevel(long var1);

   public synchronized ChatRoomSecurityLevel getSecurityLevel() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getSecurityLevel() on it, clone it first.");
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

         return ChatRoomSecurityLevel.fromInt(this.getSecurityLevel(this.nativePtr));
      }
   }

   private native int getState(long var1);

   public synchronized ChatRoom.State getState() {
      synchronized(this.core) {
         return ChatRoom.State.fromInt(this.getState(this.nativePtr));
      }
   }

   private native String getSubject(long var1);

   @Nullable
   public synchronized String getSubject() {
      synchronized(this.core) {
         return this.getSubject(this.nativePtr);
      }
   }

   private native void setSubject(long var1, String var3);

   public synchronized void setSubject(@Nullable String subject) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setSubject() on it, clone it first.");
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

         this.setSubject(this.nativePtr, subject);
      }
   }

   private native ChatMessage[] getUnreadHistory(long var1);

   @NonNull
   public synchronized ChatMessage[] getUnreadHistory() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getUnreadHistory() on it, clone it first.");
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

         return this.getUnreadHistory(this.nativePtr);
      }
   }

   private native int getUnreadMessagesCount(long var1);

   public synchronized int getUnreadMessagesCount() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getUnreadMessagesCount() on it, clone it first.");
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

         return this.getUnreadMessagesCount(this.nativePtr);
      }
   }

   private native void addParticipant(long var1, Address var3);

   public synchronized void addParticipant(@NonNull Address addr) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addParticipant() on it, clone it first.");
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

         this.addParticipant(this.nativePtr, addr);
      }
   }

   private native boolean addParticipants(long var1, Address[] var3);

   public synchronized boolean addParticipants(@NonNull Address[] addresses) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call addParticipants() on it, clone it first.");
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

         return this.addParticipants(this.nativePtr, addresses);
      }
   }

   private native void allowCpim(long var1);

   public synchronized void allowCpim() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call allowCpim() on it, clone it first.");
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

         this.allowCpim(this.nativePtr);
      }
   }

   private native void allowMultipart(long var1);

   public synchronized void allowMultipart() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call allowMultipart() on it, clone it first.");
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

         this.allowMultipart(this.nativePtr);
      }
   }

   private native boolean canHandleParticipants(long var1);

   public synchronized boolean canHandleParticipants() {
      synchronized(this.core) {
         return this.canHandleParticipants(this.nativePtr);
      }
   }

   private native void compose(long var1);

   public synchronized void compose() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call compose() on it, clone it first.");
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

         this.compose(this.nativePtr);
      }
   }

   private native ChatMessage createEmptyMessage(long var1);

   @NonNull
   public synchronized ChatMessage createEmptyMessage() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createEmptyMessage() on it, clone it first.");
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

         return this.createEmptyMessage(this.nativePtr);
      }
   }

   private native ChatMessage createFileTransferMessage(long var1, Content var3);

   @NonNull
   public synchronized ChatMessage createFileTransferMessage(@NonNull Content initialContent) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createFileTransferMessage() on it, clone it first.");
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

         return this.createFileTransferMessage(this.nativePtr, initialContent);
      }
   }

   private native ChatMessage createForwardMessage(long var1, ChatMessage var3);

   @NonNull
   public synchronized ChatMessage createForwardMessage(@NonNull ChatMessage message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createForwardMessage() on it, clone it first.");
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

         return this.createForwardMessage(this.nativePtr, message);
      }
   }

   private native ChatMessage createMessage(long var1, String var3);

   @NonNull
   public synchronized ChatMessage createMessage(@Nullable String message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createMessage() on it, clone it first.");
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

         return this.createMessage(this.nativePtr, message);
      }
   }

   private native ChatMessage createMessageFromUtf88(long var1, String var3);

   @NonNull
   public synchronized ChatMessage createMessageFromUtf8(@Nullable String message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createMessageFromUtf8() on it, clone it first.");
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

         return this.createMessageFromUtf88(this.nativePtr, message);
      }
   }

   private native ChatMessage createReplyMessage(long var1, ChatMessage var3);

   @NonNull
   public synchronized ChatMessage createReplyMessage(@NonNull ChatMessage message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createReplyMessage() on it, clone it first.");
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

         return this.createReplyMessage(this.nativePtr, message);
      }
   }

   private native ChatMessage createVoiceRecordingMessage(long var1, Recorder var3);

   @NonNull
   public synchronized ChatMessage createVoiceRecordingMessage(@NonNull Recorder recorder) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call createVoiceRecordingMessage() on it, clone it first.");
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

         return this.createVoiceRecordingMessage(this.nativePtr, recorder);
      }
   }

   private native void deleteHistory(long var1);

   public synchronized void deleteHistory() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call deleteHistory() on it, clone it first.");
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

         this.deleteHistory(this.nativePtr);
      }
   }

   private native void deleteMessage(long var1, ChatMessage var3);

   public synchronized void deleteMessage(@NonNull ChatMessage message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call deleteMessage() on it, clone it first.");
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

         this.deleteMessage(this.nativePtr, message);
      }
   }

   private native boolean ephemeralSupportedByAllParticipants(long var1);

   public synchronized boolean ephemeralSupportedByAllParticipants() {
      synchronized(this.core) {
         return this.ephemeralSupportedByAllParticipants(this.nativePtr);
      }
   }

   private native ChatMessage findMessage(long var1, String var3);

   @Nullable
   public synchronized ChatMessage findMessage(@NonNull String messageId) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call findMessage() on it, clone it first.");
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

         return this.findMessage(this.nativePtr, messageId);
      }
   }

   private native Participant findParticipant(long var1, Address var3);

   @Nullable
   public synchronized Participant findParticipant(@NonNull Address address) {
      synchronized(this.core) {
         return this.findParticipant(this.nativePtr, address);
      }
   }

   private native ChatMessage[] getHistory(long var1, int var3);

   @NonNull
   public synchronized ChatMessage[] getHistory(int nbMessage) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistory() on it, clone it first.");
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

         return this.getHistory(this.nativePtr, nbMessage);
      }
   }

   private native EventLog[] getHistoryEvents(long var1, int var3);

   @NonNull
   public synchronized EventLog[] getHistoryEvents(int nbEvents) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryEvents() on it, clone it first.");
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

         return this.getHistoryEvents(this.nativePtr, nbEvents);
      }
   }

   private native EventLog[] getHistoryMessageEvents(long var1, int var3);

   @NonNull
   public synchronized EventLog[] getHistoryMessageEvents(int nbEvents) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryMessageEvents() on it, clone it first.");
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

         return this.getHistoryMessageEvents(this.nativePtr, nbEvents);
      }
   }

   private native ChatMessage[] getHistoryRange(long var1, int var3, int var4);

   @NonNull
   public synchronized ChatMessage[] getHistoryRange(int begin, int end) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryRange() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         return this.getHistoryRange(this.nativePtr, begin, end);
      }
   }

   private native EventLog[] getHistoryRangeEvents(long var1, int var3, int var4);

   @NonNull
   public synchronized EventLog[] getHistoryRangeEvents(int begin, int end) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryRangeEvents() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         return this.getHistoryRangeEvents(this.nativePtr, begin, end);
      }
   }

   private native EventLog[] getHistoryRangeMessageEvents(long var1, int var3, int var4);

   @NonNull
   public synchronized EventLog[] getHistoryRangeMessageEvents(int begin, int end) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call getHistoryRangeMessageEvents() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         return this.getHistoryRangeMessageEvents(this.nativePtr, begin, end);
      }
   }

   private native boolean hasBeenLeft(long var1);

   public synchronized boolean hasBeenLeft() {
      synchronized(this.core) {
         return this.hasBeenLeft(this.nativePtr);
      }
   }

   private native boolean hasCapability(long var1, int var3);

   public synchronized boolean hasCapability(int mask) {
      synchronized(this.core) {
         return this.hasCapability(this.nativePtr, mask);
      }
   }

   private native void leave(long var1);

   public synchronized void leave() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call leave() on it, clone it first.");
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

         this.leave(this.nativePtr);
      }
   }

   private native boolean limeAvailable(long var1);

   public synchronized boolean limeAvailable() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call limeAvailable() on it, clone it first.");
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

         return this.limeAvailable(this.nativePtr);
      }
   }

   private native void markAsRead(long var1);

   public synchronized void markAsRead() {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call markAsRead() on it, clone it first.");
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

         this.markAsRead(this.nativePtr);
      }
   }

   private native void notifyParticipantDeviceRegistration(long var1, Address var3);

   public synchronized void notifyParticipantDeviceRegistration(@NonNull Address participantDevice) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call notifyParticipantDeviceRegistration() on it, clone it first.");
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

         this.notifyParticipantDeviceRegistration(this.nativePtr, participantDevice);
      }
   }

   private native void receiveChatMessage(long var1, ChatMessage var3);

   public synchronized void receiveChatMessage(@NonNull ChatMessage message) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call receiveChatMessage() on it, clone it first.");
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

         this.receiveChatMessage(this.nativePtr, message);
      }
   }

   private native void removeParticipant(long var1, Participant var3);

   public synchronized void removeParticipant(@NonNull Participant participant) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeParticipant() on it, clone it first.");
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

         this.removeParticipant(this.nativePtr, participant);
      }
   }

   private native void removeParticipants(long var1, Participant[] var3);

   public synchronized void removeParticipants(@NonNull Participant[] participants) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call removeParticipants() on it, clone it first.");
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

         this.removeParticipants(this.nativePtr, participants);
      }
   }

   private native void setParticipantAdminStatus(long var1, Participant var3, boolean var4);

   public synchronized void setParticipantAdminStatus(@NonNull Participant participant, boolean isAdmin) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setParticipantAdminStatus() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         this.setParticipantAdminStatus(this.nativePtr, participant, isAdmin);
      }
   }

   private native void setParticipantDevices(long var1, Address var3, ParticipantDeviceIdentity[] var4);

   public synchronized void setParticipantDevices(@NonNull Address participantAddress, @NonNull ParticipantDeviceIdentity[] deviceIdentities) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call setParticipantDevices() on it, clone it first.");
            } catch (CoreException var10) {
               Log.i(var10);
               StackTraceElement[] var5 = var10.getStackTrace();
               int var6 = var5.length;

               for(int var7 = 0; var7 < var6; ++var7) {
                  StackTraceElement st = var5[var7];
                  Log.i(st);
               }
            }
         }

         this.setParticipantDevices(this.nativePtr, participantAddress, deviceIdentities);
      }
   }

   private native String stateToString(long var1, int var3);

   @NonNull
   public synchronized String stateToString(ChatRoom.State state) {
      synchronized(this.core) {
         if (this._isConst) {
            try {
               throw new CoreException(this.toString() + " is const! If you want to call stateToString() on it, clone it first.");
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

         return this.stateToString(this.nativePtr, state.toInt());
      }
   }

   private native void addListener(long var1, ChatRoomListener var3);

   public synchronized void addListener(ChatRoomListener listener) {
      this.addListener(this.nativePtr, listener);
   }

   private native void removeListener(long var1, ChatRoomListener var3);

   public synchronized void removeListener(ChatRoomListener listener) {
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

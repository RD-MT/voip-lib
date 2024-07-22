package org.libs.core.tools.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.AudioAttributes.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.net.Uri;
import android.provider.Settings.System;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioFocusRequestCompat;
import androidx.media.AudioManagerCompat;
import java.io.FileInputStream;
import java.io.IOException;
import org.libs.core.Address;
import org.libs.core.AudioDevice;
import org.libs.core.Core;
import org.libs.core.tools.Log;
import org.libs.core.tools.compatibility.DeviceUtils;
import org.libs.core.tools.receiver.HeadsetReceiver;
import org.libs.core.tools.service.CoreManager;

public class AudioHelper implements OnAudioFocusChangeListener {
   private AudioManager mAudioManager;
   private AudioFocusRequestCompat mRingingRequest;
   private AudioFocusRequestCompat mCallRequest;
   private MediaPlayer mPlayer;
   private Ringtone mRingtone;
   private int mVolumeBeforeEchoTest;
   private AudioDevice mPreviousDefaultOutputAudioDevice;
   private HeadsetReceiver mHeadsetReceiver;

   public AudioHelper(Context context) {
      this.mAudioManager = (AudioManager)context.getSystemService("audio");
      this.mRingingRequest = null;
      this.mCallRequest = null;
      this.mHeadsetReceiver = new HeadsetReceiver();
      IntentFilter filter = new IntentFilter("android.intent.action.HEADSET_PLUG");
      context.registerReceiver(this.mHeadsetReceiver, filter);
      Log.i("[Audio Helper] Helper created");
   }

   public void destroy(Context context) {
      Log.i("[Audio Helper] Destroying");
      if (this.mHeadsetReceiver != null) {
         context.unregisterReceiver(this.mHeadsetReceiver);
         this.mHeadsetReceiver = null;
      }

      this.stopRinging();
      this.releaseRingingAudioFocus();
      this.releaseCallAudioFocus();
      Log.i("[Audio Helper] Destroyed");
   }

   public void startAudioForEchoTestOrCalibration() {
      this.requestCallAudioFocus(true);
      this.mVolumeBeforeEchoTest = this.mAudioManager.getStreamVolume(0);
      int maxVolume = this.mAudioManager.getStreamMaxVolume(0);

      try {
         this.mAudioManager.setStreamVolume(0, maxVolume, 0);
      } catch (SecurityException var3) {
         Log.e("[Audio Helper] Couldn't increase volume: ", var3);
      }

   }

   public void stopAudioForEchoTestOrCalibration() {
      try {
         this.mAudioManager.setStreamVolume(0, this.mVolumeBeforeEchoTest, 0);
      } catch (SecurityException var2) {
         Log.e("[Audio Helper] Couldn't restore volume: ", var2);
      }

      this.releaseCallAudioFocus();
   }

   public void startRinging(Context context, String ringtone, Address caller) {
      if (this.mPlayer == null && this.mRingtone == null) {
         int ringerMode = this.mAudioManager.getRingerMode();
         if (ringerMode == 0 || ringerMode == 1) {
            if (!DeviceUtils.checkIfDoNotDisturbAllowsExceptionForFavoriteContacts(context)) {
               Log.w("[Audio Helper] Do not play ringtone as ringer mode is set to silent or vibrate (", ringerMode, ")");
               return;
            }

            boolean isContactFavorite = DeviceUtils.checkIfIsFavoriteContact(context, caller);
            if (!isContactFavorite) {
               Log.w("[Audio Helper] Do not play ringtone as ringer mode is set to silent or vibrate (", ringerMode, ") and calling username / SIP address isn't part of a favorite contact");
               return;
            }

            Log.w("[Audio Helper] Ringer mode is set to silent or vibrate (", ringerMode, ") unless for favorite contact, which seems to be the case here, so ringing");
         }

         this.requestRingingAudioFocus();
         AudioAttributes audioAttrs = (new Builder()).setUsage(6).setContentType(2).build();
         if (ringtone != null && !ringtone.isEmpty()) {
            this.playSoundUsingMediaPlayer(context, audioAttrs, ringtone);
         } else {
            Log.i("[Audio Helper] Core ringtone path is null, using device ringtone if possible");
            Uri defaultRingtoneUri = this.getDefaultRingtoneUri(context);
            if (defaultRingtoneUri == null) {
               Log.w("[Audio Helper] Couldn't get ringtone URI through RingtoneManager, trying with Settings.System.DEFAULT_RINGTONE_URI");
               ringtone = System.DEFAULT_RINGTONE_URI.toString();
               this.playSoundUsingMediaPlayer(context, audioAttrs, ringtone);
            } else {
               try {
                  this.mRingtone = RingtoneManager.getRingtone(context, defaultRingtoneUri);
                  if (this.mRingtone != null) {
                     DeviceUtils.playRingtone(this.mRingtone, audioAttrs);
                  } else {
                     Log.e("[Audio Helper] Couldn't retrieve Ringtone object from manager!");
                  }
               } catch (Exception var8) {
                  Log.e("[Audio Helper] Failed to play ringtone [", defaultRingtoneUri, "] : ", var8);
               }
            }
         }

      } else {
         Log.w("[Audio Helper] Already ringing, skipping...");
      }
   }

   public void stopRinging() {
      if (this.mRingtone != null) {
         this.releaseRingingAudioFocus();
         this.mRingtone.stop();
         this.mRingtone = null;
         Log.i("[Audio Helper] Ringtone ringing stopped");
      }

      if (this.mPlayer != null) {
         this.releaseRingingAudioFocus();
         this.mPlayer.stop();
         this.mPlayer.release();
         this.mPlayer = null;
         Log.i("[Audio Helper] Media player ringing stopped");
      }

   }

   public void requestRingingAudioFocus() {
      if (this.isAudioFocusDisabled()) {
         Log.i("[Audio Helper] We were asked not to require audio focus, skipping");
      } else if (this.mRingingRequest != null) {
         Log.w("[Audio Helper] Ringing audio focus request still active, skipping");
      } else {
         AudioAttributesCompat audioAttrs = (new androidx.media.AudioAttributesCompat.Builder()).setUsage(6).setContentType(2).build();
         this.mRingingRequest = (new androidx.media.AudioFocusRequestCompat.Builder(4)).setAudioAttributes(audioAttrs).setOnAudioFocusChangeListener(this).build();
         int result = AudioManagerCompat.requestAudioFocus(this.mAudioManager, this.mRingingRequest);
         if (result == 1) {
            Log.i("[Audio Helper] Ringing audio focus request granted");
         } else if (result == 0) {
            Log.w("[Audio Helper] Ringing audio focus request failed");
         } else if (result == 2) {
            Log.w("[Audio Helper] Ringing audio focus request delayed");
         }

      }
   }

   public void releaseRingingAudioFocus() {
      if (this.mRingingRequest != null) {
         int result = AudioManagerCompat.abandonAudioFocusRequest(this.mAudioManager, this.mRingingRequest);
         if (result == 1) {
            Log.i("[Audio Helper] Ringing audio focus request abandonned");
            this.mRingingRequest = null;
         } else if (!this.isAudioFocusDisabled()) {
            Log.e("[Audio Helper] Ringing audio focus abandon request failed");
         }
      }

   }

   public void requestCallAudioFocus(boolean force) {
      if (this.isAudioFocusDisabled() && !force) {
         Log.i("[Audio Helper] We were asked not to require audio focus, skipping");
      } else {
         if (this.mRingingRequest != null) {
            Log.w("[Audio Helper] Ringing audio focus request not abandonned, let's do it");
            this.releaseRingingAudioFocus();
         }

         if (this.mCallRequest != null) {
            Log.w("[Audio Helper] Call audio focus request still active, skipping");
         } else {
            AudioAttributesCompat audioAttrs = (new androidx.media.AudioAttributesCompat.Builder()).setUsage(2).setContentType(1).build();
            this.mCallRequest = (new androidx.media.AudioFocusRequestCompat.Builder(2)).setAudioAttributes(audioAttrs).setOnAudioFocusChangeListener(this).build();
            int result = AudioManagerCompat.requestAudioFocus(this.mAudioManager, this.mCallRequest);
            if (result == 1) {
               Log.i("[Audio Helper] Call audio focus request granted");
               this.setAudioManagerInCommunicationMode();
            } else {
               if (result == 0) {
                  Log.w("[Audio Helper] Call audio focus request failed");
               } else if (result == 2) {
                  Log.w("[Audio Helper] Call audio focus request delayed");
               }

               this.releaseCallAudioFocus();
            }

         }
      }
   }

   public void releaseCallAudioFocus() {
      if (this.mCallRequest != null) {
         int result = AudioManagerCompat.abandonAudioFocusRequest(this.mAudioManager, this.mCallRequest);
         if (result == 1) {
            Log.i("[Audio Helper] Call audio focus request abandonned");
            this.mCallRequest = null;
         } else {
            Log.e("[Audio Helper] Call audio focus abandon request failed");
         }

         this.setAudioManagerInNormalMode();
      } else if (!this.isAudioFocusDisabled()) {
         Log.i("[Audio Helper] Call audio focus request was already abandonned");
      }

   }

   public void onAudioFocusChange(int focusChange) {
      switch(focusChange) {
      case -3:
         Log.w("[Audio Helper] Focus lost (transient, can duck)");
         break;
      case -2:
         Log.w("[Audio Helper] Focus lost (transient)");
         if (CoreManager.isReady()) {
            CoreManager.instance().onAudioFocusLost();
         }
         break;
      case -1:
         Log.w("[Audio Helper] Focus lost");
         if (CoreManager.isReady()) {
            CoreManager.instance().onAudioFocusLost();
         }
      case 0:
      default:
         break;
      case 1:
         Log.i("[Audio Helper] Focus gained");
      }

   }

   public void setAudioManagerInCommunicationMode() {
      Log.i("[Audio Helper] Setting audio manager in communication mode");
      this.mAudioManager.setMode(3);
   }

   public void setAudioManagerInNormalMode() {
      Log.i("[Audio Helper] Setting audio manager in normal mode");
      this.mAudioManager.setMode(0);
   }

   public void restorePreviousAudioRoute() {
      if (!CoreManager.isReady()) {
         Log.e("[Audio Helper] CoreManager has been destroyed already!");
      } else {
         Core core = CoreManager.instance().getCore();
         if (core != null) {
            core.setDefaultOutputAudioDevice(this.mPreviousDefaultOutputAudioDevice);
            Log.i("[Audio Helper] Restored previous default output audio device: " + this.mPreviousDefaultOutputAudioDevice);
            this.mPreviousDefaultOutputAudioDevice = null;
         } else {
            Log.e("[Audio Helper] CoreManager instance found but Core is null!");
         }

      }
   }

   public void routeAudioToSpeaker() {
      if (!CoreManager.isReady()) {
         Log.e("[Audio Helper] CoreManager has been destroyed already!");
      } else {
         Core core = CoreManager.instance().getCore();
         if (core != null) {
            this.mPreviousDefaultOutputAudioDevice = core.getDefaultOutputAudioDevice();
            if (this.mPreviousDefaultOutputAudioDevice.getType() == AudioDevice.Type.Speaker) {
               Log.i("[Audio Helper] Current default output audio device is already the speaker: " + this.mPreviousDefaultOutputAudioDevice);
               return;
            }

            Log.i("[Audio Helper] Saved current default output audio device: " + this.mPreviousDefaultOutputAudioDevice);
            AudioDevice[] var2 = core.getAudioDevices();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               AudioDevice audioDevice = var2[var4];
               if (audioDevice.getType() == AudioDevice.Type.Speaker) {
                  Log.i("[Audio Helper] Found speaker device, replacing default output audio device with: " + audioDevice);
                  core.setDefaultOutputAudioDevice(audioDevice);
                  return;
               }
            }

            Log.e("[Audio Helper] Couldn't find speaker audio device");
         } else {
            Log.e("[Audio Helper] CoreManager instance found but Core is null!");
         }

      }
   }

   private void playSoundUsingMediaPlayer(Context context, AudioAttributes audioAttrs, String ringtone) {
      Log.i("[Audio Helper] Trying to play ringtone [", ringtone, "]");
      this.mPlayer = new MediaPlayer();
      this.mPlayer.setAudioAttributes(audioAttrs);

      try {
         if (ringtone.startsWith("content://")) {
            this.mPlayer.setDataSource(context, Uri.parse(ringtone));
         } else {
            FileInputStream fis = new FileInputStream(ringtone);
            this.mPlayer.setDataSource(fis.getFD());
            fis.close();
         }

         this.mPlayer.prepare();
         this.mPlayer.setLooping(true);
         this.mPlayer.start();
         Log.i("[Audio Helper] Media player ringing started");
      } catch (IOException var5) {
         Log.e("[Audio Helper] Cannot play ringtone [", ringtone, "]: ", var5);
      } catch (SecurityException var6) {
         Log.e("[Audio Helper] Cannot play ringtone [", ringtone, "]: ", var6);
      }

   }

   private boolean isAudioFocusDisabled() {
      if (!CoreManager.isReady()) {
         Log.e("[Audio Helper] CoreManager has been destroyed already!");
         return false;
      } else {
         Core core = CoreManager.instance().getCore();
         if (core != null) {
            return core.getConfig().getBool("audio", "android_disable_audio_focus_requests", false);
         } else {
            Log.w("[Audio Helper] Core has been destroyed already");
            return false;
         }
      }
   }

   private Uri getDefaultRingtoneUri(Context context) {
      Uri uri = null;

      try {
         uri = RingtoneManager.getActualDefaultRingtoneUri(context, 1);
      } catch (SecurityException var7) {
      }

      if (uri == null) {
         Log.w("[Audio Helper] Failed to get actual default ringtone URI, trying to get a valid one");
         uri = RingtoneManager.getValidRingtoneUri(context);
      }

      if (uri == null) {
         Log.w("[Audio Helper] Failed to get a valid ringtone URI, trying the first one avalaible");
         RingtoneManager ringtoneManager = new RingtoneManager(context);
         ringtoneManager.setType(1);
         Cursor cursor = ringtoneManager.getCursor();
         if (cursor.moveToFirst()) {
            String idString = cursor.getString(0);
            String uriString = cursor.getString(2);
            uri = Uri.parse(uriString + '/' + idString);
         }

         cursor.close();
      }

      return uri;
   }
}

package org.linphone.core.tools.compatibility;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class DeviceUtils26 {
   public static boolean isSurfaceTextureReleased(SurfaceTexture surfaceTexture) {
      return surfaceTexture.isReleased();
   }

   public static void vibrate(Vibrator vibrator) {
      long[] timings = new long[]{0L, 1000L, 1000L};
      int[] amplitudes = new int[]{0, -1, 0};
      VibrationEffect effect = VibrationEffect.createWaveform(timings, amplitudes, 1);
      AudioAttributes audioAttrs = (new Builder()).setUsage(6).build();
      vibrator.vibrate(effect, audioAttrs);
   }

   public static void startForegroundService(Context context, Intent intent) {
      context.startForegroundService(intent);
   }
}

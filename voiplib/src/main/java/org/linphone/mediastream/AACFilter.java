package org.linphone.mediastream;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaCodec.BufferInfo;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public class AACFilter {
   int sampleRate;
   int channelCount;
   int bitrate;
   MediaCodec encoder;
   BufferInfo encoderBufferInfo;
   ByteBuffer[] encoderOutputBuffers;
   ByteBuffer[] encoderInputBuffers;
   MediaCodec decoder;
   BufferInfo decoderBufferInfo;
   ByteBuffer[] decoderOutputBuffers;
   ByteBuffer[] decoderInputBuffers;
   boolean initialized = false;
   private static AACFilter singleton;

   public static AACFilter instance() {
      if (singleton == null) {
         singleton = new AACFilter();
      }

      return singleton;
   }

   public boolean preprocess(int sampleRate, int channelCount, int bitrate, boolean sbr_enabled) {
      if (this.initialized) {
         return true;
      } else {
         this.sampleRate = sampleRate;
         this.channelCount = channelCount;
         this.bitrate = bitrate;
         byte[] asc = null;

         MediaFormat mediaFormat;
         try {
            mediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", sampleRate, channelCount);
            mediaFormat.setInteger("aac-profile", 39);
            mediaFormat.setInteger("bitrate", bitrate);
            this.encoder = MediaCodec.createByCodecName("OMX.google.aac.encoder");
            this.encoder.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 0); // Edit
            this.encoder.start();
            this.encoderBufferInfo = new BufferInfo();

            /*for(int ascPollCount = 0; asc == null && ascPollCount < 1000; ++ascPollCount) {
               boolean encInBufIdx = true;
               int encInBufIdx = this.encoder.dequeueOutputBuffer(this.encoderBufferInfo, 0L);
               if (encInBufIdx >= 0 && this.encoderBufferInfo.flags == 2) {
                  asc = new byte[this.encoderBufferInfo.size];
                  this.encoder.getOutputBuffers()[encInBufIdx].get(asc, 0, this.encoderBufferInfo.size);
                  this.encoder.getOutputBuffers()[encInBufIdx].position(0);
                  this.encoder.releaseOutputBuffer(encInBufIdx, false);
               }
            }*/

            this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            this.encoderInputBuffers = this.encoder.getInputBuffers();
            if (asc == null) {
               Log.i("Sigh, failed to read asc from encoder");
            }
         } catch (Exception var10) {
            Log.i(var10, "Unable to create AAC Encoder");
            return false;
         }

         Log.i("AAC encoder initialized");

         try {
            mediaFormat = null;
            if (asc != null) {
               mediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 0, 0);
               ByteBuffer ascBuf = ByteBuffer.wrap(asc);
               mediaFormat.setByteBuffer("csd-0", ascBuf);
            } else {
               mediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", sampleRate, channelCount);
               mediaFormat.setInteger("bitrate", bitrate);
            }

            this.decoder = MediaCodec.createByCodecName("OMX.google.aac.decoder");
            this.decoder.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 0);
            this.decoder.start();
            this.decoderOutputBuffers = this.decoder.getOutputBuffers();
            this.decoderInputBuffers = this.decoder.getInputBuffers();
            this.decoderBufferInfo = new BufferInfo();
         } catch (Exception var9) {
            Log.i(var9, "Unable to create AAC Decoder");
            return false;
         }

         Log.i("AAC decoder initialized");
         this.initialized = true;
         return true;
      }
   }

   public boolean pushToDecoder(byte[] data, int size) {
      try {
         return data != null && this.decoder != null ? queueData(this.decoder, this.decoderInputBuffers, data, size) : false;
      } catch (Exception var4) {
         Log.i(var4, "Push to decoder failed");
         return false;
      }
   }

   public int pullFromDecoder(byte[] b) {
      try {
         int result = dequeueData(this.decoder, this.decoderOutputBuffers, this.decoderBufferInfo, b);
         if (result == -3) {
            this.decoderOutputBuffers = this.decoder.getOutputBuffers();
            return this.pullFromDecoder(b);
         } else {
            return result;
         }
      } catch (Exception var3) {
         return 0;
      }
   }

   public boolean pushToEncoder(byte[] data, int size) {
      try {
         return data != null && this.encoder != null ? queueData(this.encoder, this.encoderInputBuffers, data, size) : false;
      } catch (Exception var4) {
         Log.i(var4, "Push to encoder failed");
         return false;
      }
   }

   public int pullFromEncoder(byte[] b) {
      try {
         int result = dequeueData(this.encoder, this.encoderOutputBuffers, this.encoderBufferInfo, b);
         if (result == -3) {
            this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            return this.pullFromDecoder(b);
         } else {
            return result;
         }
      } catch (Exception var3) {
         return 0;
      }
   }

   public boolean postprocess() {
      if (this.initialized) {
         this.encoder.flush();
         Log.i("Stopping encoder");
         this.encoder.stop();
         Log.i("Stopping decoder");
         this.decoder.flush();
         this.decoder.stop();
         Log.i("Release encoder");
         this.encoder.release();
         Log.i("Release decoder");
         this.decoder.release();
         this.encoder = null;
         this.decoder = null;
         this.initialized = false;
      }

      return true;
   }

   private static boolean queueData(MediaCodec codec, ByteBuffer[] inputBuffers, byte[] data, int size) {
      int bufdex = codec.dequeueInputBuffer(0L);
      if (bufdex >= 0) {
         inputBuffers[bufdex].position(0);
         inputBuffers[bufdex].put(data, 0, size);
         codec.queueInputBuffer(bufdex, 0, size, 0L, 0);
         return true;
      } else {
         return false;
      }
   }

   private static int dequeueData(MediaCodec codec, ByteBuffer[] ouputBuffers, BufferInfo bufferInfo, byte[] b) {
      for(int pcmbufPollCount = 0; pcmbufPollCount < 1; ++pcmbufPollCount) {
         int decBufIdx = codec.dequeueOutputBuffer(bufferInfo, 100L);
         if (decBufIdx >= 0) {
            if (b.length < bufferInfo.size) {
               Log.i("array is too small " + b.length + " < " + bufferInfo.size);
            }

            if (bufferInfo.flags == 2) {
               Log.i("JUST READ MediaCodec.BUFFER_FLAG_CODEC_CONFIG buffer");
            }

            ouputBuffers[decBufIdx].get(b, 0, bufferInfo.size);
            ouputBuffers[decBufIdx].position(0);
            codec.releaseOutputBuffer(decBufIdx, false);
            return bufferInfo.size;
         }

         if (decBufIdx == -3) {
            return -3;
         }

         if (decBufIdx == -2) {
            Log.i("MediaCodec.INFO_OUTPUT_FORMAT_CHANGED");
            Log.i("CHANNEL_COUNT: " + codec.getOutputFormat().getInteger("channel-count"));
            Log.i("SAMPLE_RATE: " + codec.getOutputFormat().getInteger("sample-rate"));
         } else if (decBufIdx == -1) {
         }
      }

      return 0;
   }
}

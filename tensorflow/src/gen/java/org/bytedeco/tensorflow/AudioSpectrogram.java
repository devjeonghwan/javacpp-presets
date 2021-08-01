// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup audio_ops Audio Ops
 *  \{
 <p>
 *  Produces a visualization of audio data over time.
 * 
 *  Spectrograms are a standard way of representing audio information as a series of
 *  slices of frequency information, one slice for each window of time. By joining
 *  these together into a sequence, they form a distinctive fingerprint of the sound
 *  over time.
 * 
 *  This op expects to receive audio data as an input, stored as floats in the range
 *  -1 to 1, together with a window width in samples, and a stride specifying how
 *  far to move the window between slices. From this it generates a three
 *  dimensional output. The first dimension is for the channels in the input, so a
 *  stereo audio input would have two here for example. The second dimension is time,
 *  with successive frequency slices. The third dimension has an amplitude value for
 *  each frequency during that time slice.
 * 
 *  This means the layout when converted and saved as an image is rotated 90 degrees
 *  clockwise from a typical spectrogram. Time is descending down the Y axis, and
 *  the frequency decreases from left to right.
 * 
 *  Each value in the result represents the square root of the sum of the real and
 *  imaginary parts of an FFT on the current window of samples. In this way, the
 *  lowest dimension represents the power of each frequency in the current window,
 *  and adjacent windows are concatenated in the next dimension.
 * 
 *  To get a more intuitive and visual look at what this operation does, you can run
 *  tensorflow/examples/wav_to_spectrogram to read in an audio file and save out the
 *  resulting spectrogram as a PNG image.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Float representation of audio data.
 *  * window_size: How wide the input window is in samples. For the highest efficiency
 *  this should be a power of two, but other values are accepted.
 *  * stride: How widely apart the center of adjacent sample windows should be.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * magnitude_squared: Whether to return the squared magnitude or just the
 *  magnitude. Using squared magnitude can avoid extra calculations.
 * 
 *  Returns:
 *  * {@code Output}: 3D representation of the audio frequencies as an image. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AudioSpectrogram extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AudioSpectrogram(Pointer p) { super(p); }

  /** Optional attribute setters for AudioSpectrogram */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Whether to return the squared magnitude or just the
     *  magnitude. Using squared magnitude can avoid extra calculations.
     * 
     *  Defaults to false */
    public native @ByVal Attrs MagnitudeSquared(@Cast("bool") boolean x);

    public native @Cast("bool") boolean magnitude_squared_(); public native Attrs magnitude_squared_(boolean setter);
  }
  public AudioSpectrogram(@Const @ByRef Scope scope, @ByVal Input input,
                   @Cast("tensorflow::int64") long window_size, @Cast("tensorflow::int64") long stride) { super((Pointer)null); allocate(scope, input, window_size, stride); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                   @Cast("tensorflow::int64") long window_size, @Cast("tensorflow::int64") long stride);
  public AudioSpectrogram(@Const @ByRef Scope scope, @ByVal Input input,
                   @Cast("tensorflow::int64") long window_size, @Cast("tensorflow::int64") long stride, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, window_size, stride, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                   @Cast("tensorflow::int64") long window_size, @Cast("tensorflow::int64") long stride, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs MagnitudeSquared(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native AudioSpectrogram operation(Operation setter);
  public native @ByRef Output spectrogram(); public native AudioSpectrogram spectrogram(Output setter);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes rectified linear: {@code max(features, features * alpha)}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The activations tensor. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LeakyRelu extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LeakyRelu(Pointer p) { super(p); }

  /** Optional attribute setters for LeakyRelu */
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
  
    /** Defaults to 0.2 */
    public native @ByVal Attrs Alpha(float x);

    public native float alpha_(); public native Attrs alpha_(float setter);
  }
  public LeakyRelu(@Const @ByRef Scope scope, @ByVal Input features) { super((Pointer)null); allocate(scope, features); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input features);
  public LeakyRelu(@Const @ByRef Scope scope, @ByVal Input features, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, features, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input features, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Alpha(float x);

  public native @ByRef Operation operation(); public native LeakyRelu operation(Operation setter);
  public native @ByRef Output activations(); public native LeakyRelu activations(Output setter);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the lower regularized incomplete Gamma function {@code P(a, x)}.
 * 
 *  The lower regularized incomplete Gamma function is defined as:
 * 
 * 
 *  \(P(a, x) = gamma(a, x) / Gamma(a) = 1 - Q(a, x)\)
 * 
 *  where
 * 
 *  \(gamma(a, x) = \int_{0}^{x} t^{a-1} exp(-t) dt\)
 * 
 *  is the lower incomplete Gamma function.
 * 
 *  Note, above {@code Q(a, x)} ({@code Igammac}) is the upper regularized complete
 *  Gamma function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Igamma extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Igamma(Pointer p) { super(p); }

  public Igamma(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input x) { super((Pointer)null); allocate(scope, a, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Igamma operation(Operation setter);
  public native @ByRef Output z(); public native Igamma z(Output setter);
}

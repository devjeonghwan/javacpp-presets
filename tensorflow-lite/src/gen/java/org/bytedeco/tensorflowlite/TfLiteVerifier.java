// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Abstract interface that verifies whether a given model is legit.
 *  It facilitates the use-case to verify and build a model without loading it
 *  twice.
 *  (See also "tensorflow/lite/tools/verifier.h".) */
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteVerifier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteVerifier(Pointer p) { super(p); }

  /** Returns true if the model is legit. */
  public native @Cast("bool") boolean Verify(@Cast("const char*") BytePointer data, int length,
                        ErrorReporter reporter);
  public native @Cast("bool") boolean Verify(String data, int length,
                        ErrorReporter reporter);
}

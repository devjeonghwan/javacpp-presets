// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Delete the tensor specified by its handle in the session.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle for a tensor stored in the session state.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeleteSessionTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeleteSessionTensor(Pointer p) { super(p); }

  public DeleteSessionTensor(@Const @ByRef Scope scope, @ByVal Input handle) { super((Pointer)null); allocate(scope, handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native DeleteSessionTensor operation(Operation setter);
}

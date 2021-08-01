// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// A structure representing an instance of a node.
// This structure only exhibits the inputs, outputs and user defined data, not
// other features like the type.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteNode position(long position) {
        return (TfLiteNode)super.position(position);
    }
    @Override public TfLiteNode getPointer(long i) {
        return new TfLiteNode((Pointer)this).offsetAddress(i);
    }

  // Inputs to this node expressed as indices into the simulator's tensors.
  public native TfLiteIntArray inputs(); public native TfLiteNode inputs(TfLiteIntArray setter);

  // Outputs to this node expressed as indices into the simulator's tensors.
  public native TfLiteIntArray outputs(); public native TfLiteNode outputs(TfLiteIntArray setter);

  // intermediate tensors to this node expressed as indices into the simulator's
  // tensors.
  public native TfLiteIntArray intermediates(); public native TfLiteNode intermediates(TfLiteIntArray setter);

  // Temporary tensors uses during the computations. This usually contains no
  // tensors, but ops are allowed to change that if they need scratch space of
  // any sort.
  public native TfLiteIntArray temporaries(); public native TfLiteNode temporaries(TfLiteIntArray setter);

  // Opaque data provided by the node implementer through `Registration.init`.
  public native Pointer user_data(); public native TfLiteNode user_data(Pointer setter);

  // Opaque data provided to the node if the node is a builtin. This is usually
  // a structure defined in builtin_op_data.h
  public native Pointer builtin_data(); public native TfLiteNode builtin_data(Pointer setter);

  // Custom initial data. This is the opaque data provided in the flatbuffer.
  // WARNING: This is an experimental interface that is subject to change.
  public native @Const Pointer custom_initial_data(); public native TfLiteNode custom_initial_data(Pointer setter);
  public native int custom_initial_data_size(); public native TfLiteNode custom_initial_data_size(int setter);

  // The pointer to the delegate. This is non-null only when the node is
  // created by calling `interpreter.ModifyGraphWithDelegate`.
  // WARNING: This is an experimental interface that is subject to change.
  public native TfLiteDelegate delegate(); public native TfLiteNode delegate(TfLiteDelegate setter);
}

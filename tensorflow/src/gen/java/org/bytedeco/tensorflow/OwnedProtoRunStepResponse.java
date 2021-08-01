// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Proto-based message wrapper for use on the client side of the RunStep RPC.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OwnedProtoRunStepResponse extends MutableRunStepResponseWrapper {
    static { Loader.load(); }
    /** Default native constructor. */
    public OwnedProtoRunStepResponse() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OwnedProtoRunStepResponse(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OwnedProtoRunStepResponse(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OwnedProtoRunStepResponse position(long position) {
        return (OwnedProtoRunStepResponse)super.position(position);
    }
    @Override public OwnedProtoRunStepResponse getPointer(long i) {
        return new OwnedProtoRunStepResponse((Pointer)this).offsetAddress(i);
    }

  // MutableRunStepResponseWrapper methods.
  public native @Cast("size_t") long num_tensors();
  public native @StdString BytePointer tensor_name(@Cast("size_t") long i);
  public native @ByVal Status TensorValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @ByVal Status AddTensorFromRunGraphResponse(
        @StdString BytePointer name, MutableRunGraphResponseWrapper run_graph_response,
        @Cast("size_t") long i);
  public native @ByVal Status AddTensorFromRunGraphResponse(
        @StdString String name, MutableRunGraphResponseWrapper run_graph_response,
        @Cast("size_t") long i);
  public native @Const @ByRef RunMetadata metadata();
  public native RunMetadata mutable_metadata();
  public native @Cast("tensorflow::errors::Code") int status_code();
  public native @StdString BytePointer status_error_message();
  public native void set_status(@Const @ByRef Status status);
}

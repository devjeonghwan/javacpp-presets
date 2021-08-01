// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Async Remote Tensor Handle: A handle to a Tensor on a remote host. Once the
// shape has been computed this is replaced with a remote tensor handle.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UnshapedRemoteTensorHandleData extends TensorHandleData {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnshapedRemoteTensorHandleData(Pointer p) { super(p); }

  public UnshapedRemoteTensorHandleData(@Cast("tensorflow::int64") long op_id, int output_num,
                                   EagerClient eager_client,
                                   @Cast("tensorflow::uint64") long context_id, EagerContext ctx) { super((Pointer)null); allocate(op_id, output_num, eager_client, context_id, ctx); }
  private native void allocate(@Cast("tensorflow::int64") long op_id, int output_num,
                                   EagerClient eager_client,
                                   @Cast("tensorflow::uint64") long context_id, EagerContext ctx);

  // Unshaped remote tensor handles are not ready and hence cannot satisfy any
  // of these requests.
  public native @ByVal Status Tensor(@Cast("const tensorflow::Tensor**") PointerPointer t);
  public native @ByVal Status Tensor(@Const @ByPtrPtr Tensor t);
  public native @ByVal Status TensorValue(TensorValue t);
  public native @ByVal Status Shape(TensorShape shape);
  public native @ByVal Status NumDims(IntPointer num_dims);
  public native @ByVal Status NumDims(IntBuffer num_dims);
  public native @ByVal Status NumDims(int... num_dims);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongPointer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongBuffer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") long... dim);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongPointer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongBuffer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") long... num_elements);

  public native @StdString BytePointer DebugString();

  public native @Cast("tensorflow::int64") long op_id();
  public native int output_num();
  public native EagerClient eager_client();
  public native @Cast("tensorflow::uint64") long context_id();
  public native EagerContext ctx();

  // When constructed, UnshapedRemoteTensorHandleData owns the remote
  // TensorHandle and should delete it by issuing an RPC. Once the remote
  // shape has been learned, the ownership is transferred to
  // RemoteTensorHandleData. This method must be called to let `this` know
  // that it no longer owns the remote handle.
  // TODO(iga): Add a factory method here that will create a new
  // RemoteTensorHandleData from this and transfer ownership in the process.
  public native void ReleaseRemoteTensorHandle();
}

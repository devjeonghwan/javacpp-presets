// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


////////////////////////////////////////////////////////////////////////////////
//
// Wrapper classes for the `MasterService.RunStep` request message.
//
// The `RunStepRequest` message can contain potentially large tensor
// data as part of its `feed` submessages. Here we provide specialized
// wrappers that avoid copying the tensor data wherever possible.
//
// See `RunStepRequest` in tensorflow/core/protobuf/master.proto for the
// protocol buffer definition.
//
////////////////////////////////////////////////////////////////////////////////

// Abstract interface for an immutable RunStepRequest message.
//
// This interface is typically used by server-side components in the
// TensorFlow master.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunStepRequestWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunStepRequestWrapper(Pointer p) { super(p); }


  // REQUIRED: session_handle must be returned by a CreateSession call
  // to the same master service.
  public native @StdString BytePointer session_handle();

  // Partial run handle (optional). If specified, this will be a partial run
  // execution, run up to the specified fetches.
  public native @StdString BytePointer partial_run_handle();

  // Tensors to be fed in the step. Each feed is a named tensor.
  public native @Cast("size_t") long num_feeds();
  public native @StdString BytePointer feed_name(@Cast("size_t") long i);

  // Stores the content of the feed value at index `i` in `tensor`.
  public native @ByVal Status FeedValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @ByVal Status FeedValue(@Cast("size_t") long i, TensorProto out_tensor);

  // Fetches. A list of tensor names. The caller expects a tensor to
  // be returned for each fetch[i] (see RunStepResponse.tensor). The
  // order of specified fetches does not change the execution order.
  public native @Cast("size_t") long num_fetches();
  public native @StdString BytePointer fetch_name(@Cast("size_t") long i);

  // Target Nodes. A list of node names. The named nodes will be run
  // to but their outputs will not be fetched.
  public native @Cast("size_t") long num_targets();
  public native @StdString BytePointer target_name(@Cast("size_t") long i);

  // Options for the run call.
  public native @Const @ByRef RunOptions options();

  // If true then some errors, e.g., execution errors that have long
  // error messages, may return an OK RunStepResponse with the actual
  // error saved in the status_code/status_error_message fields of the
  // response body. This is a workaround since the RPC subsystem may
  // truncate long metadata messages.
  public native @Cast("bool") boolean store_errors_in_response_body();

  // Unique identifier for this request. Every RunGraphRequest must have a
  // unique request_id, and retried RunGraphRequests must have the same
  // request_id. If request_id is zero, retry detection is disabled.
  public native @Cast("tensorflow::int64") long request_id();

  // Returns a human-readable representation of this message for debugging.
  public native @StdString BytePointer DebugString();

  // Returns the wrapped data as a protocol buffer message.
  public native @Const @ByRef RunStepRequest ToProto();
}

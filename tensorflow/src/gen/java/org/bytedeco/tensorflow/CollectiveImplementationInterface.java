// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface of a Collective Op implementation.  Each specific CollectiveOp will
// implement this interface and register the implementation via the
// CollectiveRegistry detailed below.  See common_runtime/ring_reducer and
// common_runtime/hierarchical_tree_broadcaster for examples.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveImplementationInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveImplementationInterface(Pointer p) { super(p); }


  // Initializes the portions of `col_params` specific to this
  // implementation.  Called exactly once for every Collective instance during
  // the CollectiveParams resolution process when the graph is first executed,
  // at the end of `CompleteInstanceLocal()`.
  // NOTE(ayushd): This is effectively a static function because it modifies the
  // `col_params` passed in and should not manipulate any data members.  However
  // because it is virtual and needs to be implemented by every derived class we
  // do not mark it as static.
  public native @ByVal Status InitializeCollectiveParams(CollectiveParams col_params);

  // Prepares the CollectiveContext for executing this CollectiveImplementation.
  // Called from CollectiveExecutor right before calling Run().  The
  // CollectiveContext passed in must outlive the CollectiveImplementation
  // object.
  public native @ByVal Status InitializeCollectiveContext(CollectiveContext col_ctx);

  // Performs collective implementation specific group initialization.  The
  // intention is to do group-specific initialization of runtime details for the
  // collective implementation.  Currently used only to set `communicator_key`
  // in techniques which use a communicator for distributed collectives (NCCL).
  public native @ByVal Status InitializeCollectiveGroupRuntimeDetails(
        CollGroupRuntimeDetails col_group_runtime_details);

  // Processes and moves data according to the logic of this Collective
  // implementation.  Relies on appropriate initialization of op-specific
  // CollectiveParams in InitializeCollectiveParams(), as well as appropriate
  // context initialization in InitializeCollectiveContext().
  public native void Run(@ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
}

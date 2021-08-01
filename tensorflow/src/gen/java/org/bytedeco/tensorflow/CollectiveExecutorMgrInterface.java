// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface that provides access to per-step CollectiveExecutor
// instances and various distributed resolution capabilities.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveExecutorMgrInterface extends StepSequenceInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveExecutorMgrInterface(Pointer p) { super(p); }


  // Returns the step-specific CollectiveExecutor, creating if one does not
  // already exist.  The caller assumes ownership of one Ref on the object.
  public native CollectiveExecutor FindOrCreate(@Cast("tensorflow::int64") long step_id);

  // If there is a CollectiveExecutor for step_id, remove it from the
  // table.
  public native void Cleanup(@Cast("tensorflow::int64") long step_id);

  public native ParamResolverInterface GetParamResolver();

  public native DeviceResolverInterface GetDeviceResolver();
}

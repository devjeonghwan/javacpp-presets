// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// ResourceBase is an abstract base class for resources.
/** WARNING: Experimental interface, subject to change. */
@Namespace("tflite::resource") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class ResourceBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceBase(Pointer p) { super(p); }


  // Returns true if it is initialized.
  public native @Cast("bool") boolean IsInitialized();
}

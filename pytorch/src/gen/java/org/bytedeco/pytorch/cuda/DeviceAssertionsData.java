// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


/** Used to hold assertions generated by the device
 *  Held in managed memory and access by both the CPU and the GPU. */
@Namespace("c10::cuda") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class DeviceAssertionsData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeviceAssertionsData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceAssertionsData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceAssertionsData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeviceAssertionsData position(long position) {
        return (DeviceAssertionsData)super.position(position);
    }
    @Override public DeviceAssertionsData getPointer(long i) {
        return new DeviceAssertionsData((Pointer)this).offsetAddress(i);
    }

  /** Total number of assertions found; a subset of thse will be recorded
   *  in {@code assertions} */
  public native int assertion_count(); public native DeviceAssertionsData assertion_count(int setter);
  /** An array of assertions that will be written to in a race-free manner */
  public native @ByRef DeviceAssertionData assertions(int i); public native DeviceAssertionsData assertions(int i, DeviceAssertionData setter);
  @MemberGetter public native DeviceAssertionData assertions();
}

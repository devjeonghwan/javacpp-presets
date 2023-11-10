// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PrivateUse1HooksInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PrivateUse1HooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PrivateUse1HooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrivateUse1HooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PrivateUse1HooksInterface position(long position) {
        return (PrivateUse1HooksInterface)super.position(position);
    }
    @Override public PrivateUse1HooksInterface getPointer(long i) {
        return new PrivateUse1HooksInterface((Pointer)this).offsetAddress(i);
    }

  public native @Const @ByRef Generator getDefaultGenerator(@Cast("c10::DeviceIndex") byte device_index);

  public native @ByVal Device getDeviceFromPtr(Pointer data);
}

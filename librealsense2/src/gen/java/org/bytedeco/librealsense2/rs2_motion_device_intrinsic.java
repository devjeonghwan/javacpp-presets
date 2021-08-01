// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


/** \brief Motion device intrinsics: scale, bias, and variances. */
@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_motion_device_intrinsic extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs2_motion_device_intrinsic() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs2_motion_device_intrinsic(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs2_motion_device_intrinsic(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs2_motion_device_intrinsic position(long position) {
        return (rs2_motion_device_intrinsic)super.position(position);
    }
    @Override public rs2_motion_device_intrinsic getPointer(long i) {
        return new rs2_motion_device_intrinsic((Pointer)this).offsetAddress(i);
    }

    /* \internal
    * Scale X       cross axis  cross axis  Bias X \n
    * cross axis    Scale Y     cross axis  Bias Y \n
    * cross axis    cross axis  Scale Z     Bias Z */
    /** Interpret data array values */
    public native float data(int i, int j); public native rs2_motion_device_intrinsic data(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[3]*/ )[4]") FloatPointer data();

    /** Variance of noise for X, Y, and Z axis */
    public native float noise_variances(int i); public native rs2_motion_device_intrinsic noise_variances(int i, float setter);
    @MemberGetter public native FloatPointer noise_variances();
    /** Variance of bias for X, Y, and Z axis */
    public native float bias_variances(int i); public native rs2_motion_device_intrinsic bias_variances(int i, float setter);
    @MemberGetter public native FloatPointer bias_variances();
}

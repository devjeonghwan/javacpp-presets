// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class HW_PROFILE_INFOA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HW_PROFILE_INFOA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HW_PROFILE_INFOA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HW_PROFILE_INFOA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HW_PROFILE_INFOA position(long position) {
        return (HW_PROFILE_INFOA)super.position(position);
    }
    @Override public HW_PROFILE_INFOA getPointer(long i) {
        return new HW_PROFILE_INFOA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwDockInfo(); public native HW_PROFILE_INFOA dwDockInfo(int setter);
    public native @Cast("CHAR") byte szHwProfileGuid(int i); public native HW_PROFILE_INFOA szHwProfileGuid(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer szHwProfileGuid();
    public native @Cast("CHAR") byte szHwProfileName(int i); public native HW_PROFILE_INFOA szHwProfileName(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer szHwProfileName();
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OSVERSIONINFOA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OSVERSIONINFOA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OSVERSIONINFOA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OSVERSIONINFOA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OSVERSIONINFOA position(long position) {
        return (OSVERSIONINFOA)super.position(position);
    }
    @Override public OSVERSIONINFOA getPointer(long i) {
        return new OSVERSIONINFOA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwOSVersionInfoSize(); public native OSVERSIONINFOA dwOSVersionInfoSize(int setter);
    public native @Cast("DWORD") int dwMajorVersion(); public native OSVERSIONINFOA dwMajorVersion(int setter);
    public native @Cast("DWORD") int dwMinorVersion(); public native OSVERSIONINFOA dwMinorVersion(int setter);
    public native @Cast("DWORD") int dwBuildNumber(); public native OSVERSIONINFOA dwBuildNumber(int setter);
    public native @Cast("DWORD") int dwPlatformId(); public native OSVERSIONINFOA dwPlatformId(int setter);
    public native @Cast("CHAR") byte szCSDVersion(int i); public native OSVERSIONINFOA szCSDVersion(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer szCSDVersion();     // Maintenance string for PSS usage
}

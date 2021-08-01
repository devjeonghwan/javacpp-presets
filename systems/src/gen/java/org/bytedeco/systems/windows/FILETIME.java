// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #else
// #endif

//
//  File System time stamps are represented with the following structure:
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILETIME extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILETIME() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILETIME(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILETIME(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILETIME position(long position) {
        return (FILETIME)super.position(position);
    }
    @Override public FILETIME getPointer(long i) {
        return new FILETIME((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwLowDateTime(); public native FILETIME dwLowDateTime(int setter);
    public native @Cast("DWORD") int dwHighDateTime(); public native FILETIME dwHighDateTime(int setter);
}

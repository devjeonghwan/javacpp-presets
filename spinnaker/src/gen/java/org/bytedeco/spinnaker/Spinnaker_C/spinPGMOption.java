// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/** Options for saving PGM images. */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinPGMOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinPGMOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinPGMOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinPGMOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinPGMOption position(long position) {
        return (spinPGMOption)super.position(position);
    }
    @Override public spinPGMOption getPointer(long i) {
        return new spinPGMOption((Pointer)this).offsetAddress(i);
    }

    /** Whether to save the PPM as a binary file. */
    public native @Cast("bool8_t") byte binaryFile(); public native spinPGMOption binaryFile(byte setter);
    /** Reserved for future use. */
    public native @Cast("unsigned int") int reserved(int i); public native spinPGMOption reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /*
    _spinPGMOption()
    {
        binaryFile = true;
        memset(reserved, 0, sizeof(reserved));
    }*/
}

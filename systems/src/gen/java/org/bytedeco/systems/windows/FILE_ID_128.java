// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
 
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_ID_128 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_ID_128() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_ID_128(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_ID_128(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_ID_128 position(long position) {
        return (FILE_ID_128)super.position(position);
    }
    @Override public FILE_ID_128 getPointer(long i) {
        return new FILE_ID_128((Pointer)this).offsetAddress(i);
    }
                               
    public native @Cast("BYTE") byte Identifier(int i); public native FILE_ID_128 Identifier(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Identifier();                                   
}

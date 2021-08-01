// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Eigen makes it extremely difficult to dereference a tensor of string* into
// string, so we roll our own loop instead.
@Name("tensorflow::CopyThatWorksWithStringPointer<tensorflow::tstring>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CopyThatWorksWithStringPointer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CopyThatWorksWithStringPointer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CopyThatWorksWithStringPointer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CopyThatWorksWithStringPointer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CopyThatWorksWithStringPointer position(long position) {
        return (CopyThatWorksWithStringPointer)super.position(position);
    }
    @Override public CopyThatWorksWithStringPointer getPointer(long i) {
        return new CopyThatWorksWithStringPointer((Pointer)this).offsetAddress(i);
    }

}

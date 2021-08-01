// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessCallback3<const UNICHARSET&,int,PAGE_RES*>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TruthCallback3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TruthCallback3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TruthCallback3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TruthCallback3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TruthCallback3 position(long position) {
        return (TruthCallback3)super.position(position);
    }
    @Override public TruthCallback3 getPointer(long i) {
        return new TruthCallback3((Pointer)this).offsetAddress(i);
    }

  @Virtual(true) public native void Run(@Const @ByRef UNICHARSET arg0, int arg1, PAGE_RES arg2);
}

// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;

// #endif // GUID

/**
 * \struct _NVENC_RECT
 * Defines a Rectangle. Used in ::NV_ENC_PREPROCESS_FRAME.
 */
@Name("NVENC_RECT") @Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class RECT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RECT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RECT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RECT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RECT position(long position) {
        return (RECT)super.position(position);
    }
    @Override public RECT getPointer(long i) {
        return new RECT((Pointer)this).offsetAddress(i);
    }

    /** [in]: X coordinate of the upper left corner of rectangular area to be specified.       */
    public native @Cast("uint32_t") int left(); public native RECT left(int setter);
    /** [in]: Y coordinate of the upper left corner of the rectangular area to be specified.   */
    public native @Cast("uint32_t") int top(); public native RECT top(int setter);
    /** [in]: X coordinate of the bottom right corner of the rectangular area to be specified. */
    public native @Cast("uint32_t") int right(); public native RECT right(int setter);
    /** [in]: Y coordinate of the bottom right corner of the rectangular area to be specified. */
    public native @Cast("uint32_t") int bottom(); public native RECT bottom(int setter);
}

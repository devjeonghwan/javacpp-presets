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


/**
 * \struct _NV_ENC_SEI_PAYLOAD
 *  User SEI message
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_SEI_PAYLOAD extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_SEI_PAYLOAD() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_SEI_PAYLOAD(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_SEI_PAYLOAD(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_SEI_PAYLOAD position(long position) {
        return (NV_ENC_SEI_PAYLOAD)super.position(position);
    }
    @Override public NV_ENC_SEI_PAYLOAD getPointer(long i) {
        return new NV_ENC_SEI_PAYLOAD((Pointer)this).offsetAddress(i);
    }

    /** [in] SEI payload size in bytes. SEI payload must be byte aligned, as described in Annex D */
    public native @Cast("uint32_t") int payloadSize(); public native NV_ENC_SEI_PAYLOAD payloadSize(int setter);
    /** [in] SEI payload types and syntax can be found in Annex D of the H.264 Specification. */
    public native @Cast("uint32_t") int payloadType(); public native NV_ENC_SEI_PAYLOAD payloadType(int setter);
    /** [in] pointer to user data */
    public native @Cast("uint8_t*") BytePointer payload(); public native NV_ENC_SEI_PAYLOAD payload(BytePointer setter);
}

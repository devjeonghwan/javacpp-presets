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
 * \struct _NVENC_EXTERNAL_ME_SB_HINT
 * External Motion Vector SB hint structure for AV1
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NVENC_EXTERNAL_ME_SB_HINT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NVENC_EXTERNAL_ME_SB_HINT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NVENC_EXTERNAL_ME_SB_HINT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NVENC_EXTERNAL_ME_SB_HINT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NVENC_EXTERNAL_ME_SB_HINT position(long position) {
        return (NVENC_EXTERNAL_ME_SB_HINT)super.position(position);
    }
    @Override public NVENC_EXTERNAL_ME_SB_HINT getPointer(long i) {
        return new NVENC_EXTERNAL_ME_SB_HINT((Pointer)this).offsetAddress(i);
    }

    /** [in]: Specifies the reference index (31=invalid) */
    public native @Cast("int16_t") @NoOffset short refidx(); public native NVENC_EXTERNAL_ME_SB_HINT refidx(short setter);
    /** [in]: Specifies the direction of motion estimation . 0=L0 1=L1.*/
    public native @Cast("int16_t") @NoOffset short direction(); public native NVENC_EXTERNAL_ME_SB_HINT direction(short setter);
    /** [in]: Specifies reference mode 0=single mv, 1=compound mv */
    public native @Cast("int16_t") @NoOffset short bi(); public native NVENC_EXTERNAL_ME_SB_HINT bi(short setter);
    /** [in]: Specifies the partition type: 0: 2NX2N, 1:2NxN, 2:Nx2N. reserved 3bits for future modes */
    public native @Cast("int16_t") @NoOffset short partition_type(); public native NVENC_EXTERNAL_ME_SB_HINT partition_type(short setter);
    /** [in]: Specifies the current partition's top left x position in 8 pixel unit */
    public native @Cast("int16_t") @NoOffset short x8(); public native NVENC_EXTERNAL_ME_SB_HINT x8(short setter);
    /** [in]: Set to 1 for the last MV current CU */
    public native @Cast("int16_t") @NoOffset short last_of_cu(); public native NVENC_EXTERNAL_ME_SB_HINT last_of_cu(short setter);
    /** [in]: Set to 1 for the last MV of current SB */
    public native @Cast("int16_t") @NoOffset short last_of_sb(); public native NVENC_EXTERNAL_ME_SB_HINT last_of_sb(short setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("int16_t") @NoOffset short reserved0(); public native NVENC_EXTERNAL_ME_SB_HINT reserved0(short setter);
    /** [in]: Specifies the x component of integer pixel MV (relative to current MB) S12.2. */
    public native @Cast("int16_t") @NoOffset short mvx(); public native NVENC_EXTERNAL_ME_SB_HINT mvx(short setter);
    /** [in]: Specifies the CU size: 0: 8x8, 1: 16x16, 2:32x32, 3:64x64 */
    public native @Cast("int16_t") @NoOffset short cu_size(); public native NVENC_EXTERNAL_ME_SB_HINT cu_size(short setter);
    /** [in]: Specifies the y component of integer pixel MV (relative to current MB) S10.2 .*/
    public native @Cast("int16_t") @NoOffset short mvy(); public native NVENC_EXTERNAL_ME_SB_HINT mvy(short setter);
    /** [in]: Specifies the current partition's top left y position in 8 pixel unit */
    public native @Cast("int16_t") @NoOffset short y8(); public native NVENC_EXTERNAL_ME_SB_HINT y8(short setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("int16_t") @NoOffset short reserved1(); public native NVENC_EXTERNAL_ME_SB_HINT reserved1(short setter);
}

// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

/**
 * \typedef typedef struct CUgreenCtx_st* CUgreenCtx
 * A green context handle. This handle can be used safely from only one CPU thread at a time.
 * Created via ::cuGreenCtxCreate
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUgreenCtx_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUgreenCtx_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUgreenCtx_st(Pointer p) { super(p); }
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.plasma;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.plasma.*;


@Namespace("plasma::internal") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.plasma.class)
public class CudaIpcPlaceholder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CudaIpcPlaceholder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CudaIpcPlaceholder(Pointer p) { super(p); }
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract") @Opaque @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class Dict extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Dict() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dict(Pointer p) { super(p); }
}

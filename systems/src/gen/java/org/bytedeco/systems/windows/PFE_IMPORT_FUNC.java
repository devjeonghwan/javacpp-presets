// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PFE_IMPORT_FUNC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFE_IMPORT_FUNC(Pointer p) { super(p); }
    protected PFE_IMPORT_FUNC() { allocate(); }
    private native void allocate();
    public native @Cast("DWORD") int call(
    @Cast("PBYTE") BytePointer pbData,
    @Cast("PVOID") Pointer pvCallbackContext,
    @Cast("PULONG") long ulLength
    );
}

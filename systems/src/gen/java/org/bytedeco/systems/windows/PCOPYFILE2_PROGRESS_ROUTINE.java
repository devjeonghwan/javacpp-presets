// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PCOPYFILE2_PROGRESS_ROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PCOPYFILE2_PROGRESS_ROUTINE(Pointer p) { super(p); }
    protected PCOPYFILE2_PROGRESS_ROUTINE() { allocate(); }
    private native void allocate();
    public native @Cast("COPYFILE2_MESSAGE_ACTION") int call(
  @Const COPYFILE2_MESSAGE pMessage,
  @Cast("PVOID") Pointer pvCallbackContext
);
}

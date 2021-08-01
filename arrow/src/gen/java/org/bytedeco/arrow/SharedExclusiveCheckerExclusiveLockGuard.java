// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::io::internal::ExclusiveLockGuard<arrow::io::internal::SharedExclusiveChecker>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SharedExclusiveCheckerExclusiveLockGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SharedExclusiveCheckerExclusiveLockGuard(Pointer p) { super(p); }

  public SharedExclusiveCheckerExclusiveLockGuard(SharedExclusiveChecker lock) { super((Pointer)null); allocate(lock); }
  private native void allocate(SharedExclusiveChecker lock);
}

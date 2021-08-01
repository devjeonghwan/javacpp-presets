// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ProjectOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProjectOptions(Pointer p) { super(p); }

  public ProjectOptions(@ByVal StringVector n, @ByVal BoolVector r,
                   @ByVal KeyValueMetadataVector m) { super((Pointer)null); allocate(n, r, m); }
  private native void allocate(@ByVal StringVector n, @ByVal BoolVector r,
                   @ByVal KeyValueMetadataVector m);

  public ProjectOptions(@ByVal StringVector n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal StringVector n);

  /** Names for wrapped columns */
  public native @ByRef StringVector field_names(); public native ProjectOptions field_names(StringVector setter);

  /** Nullability bits for wrapped columns */
  public native @ByRef BoolVector field_nullability(); public native ProjectOptions field_nullability(BoolVector setter);

  /** Metadata attached to wrapped columns */
  public native @ByRef KeyValueMetadataVector field_metadata(); public native ProjectOptions field_metadata(KeyValueMetadataVector setter);
}

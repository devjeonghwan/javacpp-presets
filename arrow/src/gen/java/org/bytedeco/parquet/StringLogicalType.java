// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Allowed for physical type BYTE_ARRAY, must be encoded as UTF-8. */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class StringLogicalType extends LogicalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringLogicalType(Pointer p) { super(p); }

  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make();
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TemporalScalar<arrow::DurationType>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseDurationScalar extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseDurationScalar(Pointer p) { super(p); }


  public BaseDurationScalar(@Cast("arrow::TemporalScalar<arrow::DurationType>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@Cast("arrow::TemporalScalar<arrow::DurationType>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
}

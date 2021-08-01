// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::DateScalar<arrow::Date64Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseDate64Scalar extends BaseBaseDate64Scalar {
    static { Loader.load(); }

  
  
    public BaseDate64Scalar(@Cast("arrow::TemporalScalar<arrow::Date64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@Cast("arrow::TemporalScalar<arrow::Date64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseDate64Scalar(Pointer p) { super(p); }


  public BaseDate64Scalar(@Cast("arrow::DateScalar<arrow::Date64Type>::ValueType") long value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::DateScalar<arrow::Date64Type>::ValueType") long value);
  public BaseDate64Scalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}

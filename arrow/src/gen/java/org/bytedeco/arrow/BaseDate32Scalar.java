// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::DateScalar<arrow::Date32Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseDate32Scalar extends BaseBaseDate32Scalar {
    static { Loader.load(); }

  
  
    public BaseDate32Scalar(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseDate32Scalar(Pointer p) { super(p); }


  public BaseDate32Scalar(@Cast("arrow::DateScalar<arrow::Date32Type>::ValueType") int value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::DateScalar<arrow::Date32Type>::ValueType") int value);
  public BaseDate32Scalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}

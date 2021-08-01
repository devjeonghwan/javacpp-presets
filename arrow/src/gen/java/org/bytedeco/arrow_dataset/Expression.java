// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** An unbound expression which maps a single Datum to another Datum.
 *  An expression is one of
 *  - A literal Datum.
 *  - A reference to a single (potentially nested) field of the input Datum.
 *  - A call to a compute function, with arguments specified by other Expressions. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class Expression extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Expression(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Expression(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Expression position(long position) {
        return (Expression)super.position(position);
    }
    @Override public Expression getPointer(long i) {
        return new Expression((Pointer)this).offsetAddress(i);
    }

  public static class Call extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Call() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Call(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Call(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Call position(long position) {
          return (Call)super.position(position);
      }
      @Override public Call getPointer(long i) {
          return new Call((Pointer)this).offsetAddress(i);
      }
  
    public native @StdString String function_name(); public native Call function_name(String setter);
    public native @StdVector Expression arguments(); public native Call arguments(Expression setter);
    public native @SharedPtr FunctionOptions options(); public native Call options(FunctionOptions setter);

    // post-Bind properties:
    public native @SharedPtr org.bytedeco.arrow.Function function(); public native Call function(org.bytedeco.arrow.Function setter);
    public native @Const Kernel kernel(); public native Call kernel(Kernel setter);
    public native @SharedPtr KernelState kernel_state(); public native Call kernel_state(KernelState setter);
    public native @ByRef ValueDescr descr(); public native Call descr(ValueDescr setter);
  }

  public native @StdString String ToString();
  public native @Cast("bool") boolean Equals(@Const @ByRef Expression other);
  public native @Cast("size_t") long hash();
  public static class Hash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hash position(long position) {
          return (Hash)super.position(position);
      }
      @Override public Hash getPointer(long i) {
          return new Hash((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef Expression expr);
  }

  /** Bind this expression to the given input type, looking up Kernels and field types.
   *  Some expression simplification may be performed and implicit casts will be inserted.
   *  Any state necessary for execution will be initialized and returned. */
  public native @ByVal ExpressionResult Bind(@ByVal ValueDescr in, ExecContext arg1/*=nullptr*/);
  public native @ByVal ExpressionResult Bind(@ByVal ValueDescr in);
  public native @ByVal ExpressionResult Bind(@Const @ByRef Schema in_schema, ExecContext arg1/*=nullptr*/);
  public native @ByVal ExpressionResult Bind(@Const @ByRef Schema in_schema);

  // XXX someday
  // Clone all KernelState in this bound expression. If any function referenced by this
  // expression has mutable KernelState, it is not safe to execute or apply simplification
  // passes to it (or copies of it!) from multiple threads. Cloning state produces new
  // KernelStates where necessary to ensure that Expressions may be manipulated safely
  // on multiple threads.
  // Result<ExpressionState> CloneState() const;
  // Status SetState(ExpressionState);

  /** Return true if all an expression's field references have explicit ValueDescr and all
   *  of its functions' kernels are looked up. */
  public native @Cast("bool") boolean IsBound();

  /** Return true if this expression is composed only of Scalar literals, field
   *  references, and calls to ScalarFunctions. */
  public native @Cast("bool") boolean IsScalarExpression();

  /** Return true if this expression is literal and entirely null. */
  public native @Cast("bool") boolean IsNullLiteral();

  /** Return true if this expression could evaluate to true. */
  public native @Cast("bool") boolean IsSatisfiable();

  // XXX someday
  // Result<PipelineGraph> GetPipelines();

  /** Access a Call or return nullptr if this expression is not a call */
  public native @Const Call call();
  /** Access a Datum or return nullptr if this expression is not a literal */
  public native @Const Datum literal();
  /** Access a FieldRef or return nullptr if this expression is not a field_ref */
  public native @Const FieldRef field_ref();

  /** The type and shape to which this expression will evaluate */
  public native @ByVal ValueDescr descr();
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
  // XXX someday
  // NullGeneralization::type nullable() const;

  public static class Parameter extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Parameter() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Parameter(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Parameter(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Parameter position(long position) {
          return (Parameter)super.position(position);
      }
      @Override public Parameter getPointer(long i) {
          return new Parameter((Pointer)this).offsetAddress(i);
      }
  
    public native @ByRef FieldRef ref(); public native Parameter ref(FieldRef setter);
    public native @ByRef ValueDescr descr(); public native Parameter descr(ValueDescr setter);
  }

  public Expression() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Expression(@ByVal Call call) { super((Pointer)null); allocate(call); }
  private native void allocate(@ByVal Call call);
  public Expression(@ByVal Datum literal) { super((Pointer)null); allocate(literal); }
  private native void allocate(@ByVal Datum literal);
  public Expression(@ByVal Parameter parameter) { super((Pointer)null); allocate(parameter); }
  private native void allocate(@ByVal Parameter parameter);
}

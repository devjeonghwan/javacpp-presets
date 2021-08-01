// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // namespace op_resolver_hasher

// An OpResolver that is mutable, also used as the op in gen_op_registration.
// A typical usage:
//   MutableOpResolver resolver;
//   resolver.AddBuiltin(BuiltinOperator_ADD, Register_ADD());
//   resolver.AddCustom("CustomOp", Register_CUSTOM_OP());
//   InterpreterBuilder(model, resolver)(&interpreter);
@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class MutableOpResolver extends OpResolver {
    static { Loader.load(); }
    /** Default native constructor. */
    public MutableOpResolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MutableOpResolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MutableOpResolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MutableOpResolver position(long position) {
        return (MutableOpResolver)super.position(position);
    }
    @Override public MutableOpResolver getPointer(long i) {
        return new MutableOpResolver((Pointer)this).offsetAddress(i);
    }

  public native @Const TfLiteRegistration FindOp(@Cast("tflite::BuiltinOperator") int op,
                                     int version);
  public native @Const TfLiteRegistration FindOp(@Cast("const char*") BytePointer op, int version);
  public native @Const TfLiteRegistration FindOp(String op, int version);
  public native void AddBuiltin(@Cast("tflite::BuiltinOperator") int op,
                    @Const TfLiteRegistration registration, int version/*=1*/);
  public native void AddBuiltin(@Cast("tflite::BuiltinOperator") int op,
                    @Const TfLiteRegistration registration);
  public native void AddBuiltin(@Cast("tflite::BuiltinOperator") int op,
                    @Const TfLiteRegistration registration, int min_version,
                    int max_version);
  public native void AddCustom(@Cast("const char*") BytePointer name, @Const TfLiteRegistration registration,
                   int version/*=1*/);
  public native void AddCustom(@Cast("const char*") BytePointer name, @Const TfLiteRegistration registration);
  public native void AddCustom(String name, @Const TfLiteRegistration registration,
                   int version/*=1*/);
  public native void AddCustom(String name, @Const TfLiteRegistration registration);
  public native void AddCustom(@Cast("const char*") BytePointer name, @Const TfLiteRegistration registration,
                   int min_version, int max_version);
  public native void AddCustom(String name, @Const TfLiteRegistration registration,
                   int min_version, int max_version);
  public native void AddAll(@Const @ByRef MutableOpResolver other);
}

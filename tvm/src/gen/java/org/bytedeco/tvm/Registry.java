// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief Registry for global function */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Registry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Registry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Registry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Registry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Registry position(long position) {
        return (Registry)super.position(position);
    }
    @Override public Registry getPointer(long i) {
        return new Registry((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief set the body of the function to be f
   * @param f The body of the function.
   */
  public native @ByRef Registry set_body(@ByVal PackedFunc f);  // NOLINT(*)
  /**
   * \brief set the body of the function to be f
   * @param f The body of the function.
   */
  public native @ByRef Registry set_body(@ByVal PackedFuncFType f);
  /**
   * \brief set the body of the function to the given function.
   *        Note that this will ignore default arg values and always require all arguments to be
   * provided.
   *
   * <pre>{@code
   *
   * int multiply(int x, int y) {
   *   return x * y;
   * }
   *
   * TVM_REGISTER_GLOBAL("multiply")
   * .set_body_typed(multiply); // will have type int(int, int)
   *
   * // will have type int(int, int)
   * TVM_REGISTER_GLOBAL("sub")
   * .set_body_typed([](int a, int b) -> int { return a - b; });
   *
   * }</pre>
   *
   * @param f The function to forward to.
   * \tparam FLambda The signature of the function.
   */
  /**
   * \brief set the body of the function to be the passed method pointer.
   *        Note that this will ignore default arg values and always require all arguments to be
   * provided.
   *
   * <pre>{@code
   *
   * // node subclass:
   * struct Example {
   *    int doThing(int x);
   * }
   * TVM_REGISTER_GLOBAL("Example_doThing")
   * .set_body_method(&Example::doThing); // will have type int(Example, int)
   *
   * }</pre>
   *
   * @param f the method pointer to forward to.
   * \tparam T the type containing the method (inferred).
   * \tparam R the return type of the function (inferred).
   * \tparam Args the argument types of the function (inferred).
   */

  /**
   * \brief set the body of the function to be the passed method pointer.
   *        Note that this will ignore default arg values and always require all arguments to be
   * provided.
   *
   * <pre>{@code
   *
   * // node subclass:
   * struct Example {
   *    int doThing(int x);
   * }
   * TVM_REGISTER_GLOBAL("Example_doThing")
   * .set_body_method(&Example::doThing); // will have type int(Example, int)
   *
   * }</pre>
   *
   * @param f the method pointer to forward to.
   * \tparam T the type containing the method (inferred).
   * \tparam R the return type of the function (inferred).
   * \tparam Args the argument types of the function (inferred).
   */

  /**
   * \brief set the body of the function to be the passed method pointer.
   *        Used when calling a method on a Node subclass through a ObjectRef subclass.
   *        Note that this will ignore default arg values and always require all arguments to be
   * provided.
   *
   * <pre>{@code
   *
   * // node subclass:
   * struct ExampleNode: BaseNode {
   *    int doThing(int x);
   * }
   *
   * // noderef subclass
   * struct Example;
   *
   * TVM_REGISTER_GLOBAL("Example_doThing")
   * .set_body_method<Example>(&ExampleNode::doThing); // will have type int(Example, int)
   *
   * // note that just doing:
   * // .set_body_method(&ExampleNode::doThing);
   * // wouldn't work, because ExampleNode can't be taken from a TVMArgValue.
   *
   * }</pre>
   *
   * @param f the method pointer to forward to.
   * \tparam TObjectRef the node reference type to call the method on
   * \tparam TNode the node type containing the method (inferred).
   * \tparam R the return type of the function (inferred).
   * \tparam Args the argument types of the function (inferred).
   */

  /**
   * \brief set the body of the function to be the passed method pointer.
   *        Used when calling a method on a Node subclass through a ObjectRef subclass.
   *        Note that this will ignore default arg values and always require all arguments to be
   * provided.
   *
   * <pre>{@code
   *
   * // node subclass:
   * struct ExampleNode: BaseNode {
   *    int doThing(int x);
   * }
   *
   * // noderef subclass
   * struct Example;
   *
   * TVM_REGISTER_GLOBAL("Example_doThing")
   * .set_body_method<Example>(&ExampleNode::doThing); // will have type int(Example, int)
   *
   * // note that just doing:
   * // .set_body_method(&ExampleNode::doThing);
   * // wouldn't work, because ExampleNode can't be taken from a TVMArgValue.
   *
   * }</pre>
   *
   * @param f the method pointer to forward to.
   * \tparam TObjectRef the node reference type to call the method on
   * \tparam TNode the node type containing the method (inferred).
   * \tparam R the return type of the function (inferred).
   * \tparam Args the argument types of the function (inferred).
   */

  /**
   * \brief Register a function with given name
   * @param name The name of the function.
   * @param override Whether allow oveeride existing function.
   * @return Reference to theregistry.
   */
  public static native @ByRef Registry Register(@StdString BytePointer name, @Cast("bool") boolean override/*=false*/);
  public static native @ByRef Registry Register(@StdString BytePointer name);
  public static native @ByRef Registry Register(@StdString String name, @Cast("bool") boolean override/*=false*/);
  public static native @ByRef Registry Register(@StdString String name);  // NOLINT(*)
  /**
   * \brief Erase global function from registry, if exist.
   * @param name The name of the function.
   * @return Whether function exist.
   */
  public static native @Cast("bool") boolean Remove(@StdString BytePointer name);
  public static native @Cast("bool") boolean Remove(@StdString String name);
  /**
   * \brief Get the global function by name.
   * @param name The name of the function.
   * @return pointer to the registered function,
   *   nullptr if it does not exist.
   */
  public static native @Const PackedFunc Get(@StdString BytePointer name);
  public static native @Const PackedFunc Get(@StdString String name);  // NOLINT(*)
  /**
   * \brief Get the names of currently registered global function.
   * @return The names
   */
  public static native @ByVal StringVector ListNames();

  // Internal class.
}

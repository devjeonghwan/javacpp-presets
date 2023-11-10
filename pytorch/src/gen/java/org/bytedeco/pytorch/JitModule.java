// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::jit::Module") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitModule extends JitObject {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JitModule(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public JitModule position(long position) {
        return (JitModule)super.position(position);
    }
    @Override public JitModule getPointer(long i) {
        return new JitModule((Pointer)this).offsetAddress(i);
    }

  public JitModule(@ByVal QualifiedName class_name) { super((Pointer)null); allocate(class_name); }
  private native void allocate(@ByVal QualifiedName class_name);
  public JitModule(@SharedPtr CompilationUnit cu, @Const @SharedPtr("c10::ClassType") @ByRef ClassType type) { super((Pointer)null); allocate(cu, type); }
  private native void allocate(@SharedPtr CompilationUnit cu, @Const @SharedPtr("c10::ClassType") @ByRef ClassType type);
  public JitModule() { super((Pointer)null); allocate(); }
  private native void allocate();
  public JitModule(@Const @ByRef JitModule arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef JitModule arg0);
  public native @ByRef @Name("operator =") JitModule put(@Const @ByRef JitModule arg0);
  public JitModule(
        @ByVal QualifiedName arg0,
        @SharedPtr CompilationUnit cu,
        @Cast("bool") boolean shouldMangle/*=false*/) { super((Pointer)null); allocate(arg0, cu, shouldMangle); }
  private native void allocate(
        @ByVal QualifiedName arg0,
        @SharedPtr CompilationUnit cu,
        @Cast("bool") boolean shouldMangle/*=false*/);
  public JitModule(
        @ByVal QualifiedName arg0,
        @SharedPtr CompilationUnit cu) { super((Pointer)null); allocate(arg0, cu); }
  private native void allocate(
        @ByVal QualifiedName arg0,
        @SharedPtr CompilationUnit cu);
  public JitModule(@ByVal @Cast("torch::jit::ModulePtr*") Pointer module_value) { super((Pointer)null); allocate(module_value); }
  private native void allocate(@ByVal @Cast("torch::jit::ModulePtr*") Pointer module_value);

  public native void set_optimized(@Cast("bool") boolean o);

  public native @Cast("bool") boolean is_optimized();

  public native @ByVal IValue forward(@ByVal IValueVector inputs, @Cast("const torch::jit::Kwargs*") @ByRef(nullValue = "torch::jit::Kwargs()") StringIValueMap kwargs);
  public native @ByVal IValue forward(@ByVal IValueVector inputs);

  // In script modules, buffers are Tensors attribute that are _not_ registered
  // as parameters. This is different than in nn.Module where there is a special
  // register_buffer method. With this simplification, we only need to track
  // whether a slot is a parameter to be able to classify it.
  public native void register_buffer(@StdString BytePointer name, @ByVal Tensor v);
  public native void register_buffer(@StdString String name, @ByVal Tensor v);

  public native void register_parameter(
        @StdString BytePointer name,
        @ByVal Tensor v,
        @Cast("bool") boolean is_buffer);
  public native void register_parameter(
        @StdString String name,
        @ByVal Tensor v,
        @Cast("bool") boolean is_buffer);

  public native void register_attribute(
        @StdString BytePointer name,
        @Const @ByRef Type.TypePtr t,
        @ByVal IValue v,
        @Cast("bool") boolean is_param/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native void register_attribute(
        @StdString BytePointer name,
        @Const @ByRef Type.TypePtr t,
        @ByVal IValue v);
  public native void register_attribute(
        @StdString String name,
        @Const @ByRef Type.TypePtr t,
        @ByVal IValue v,
        @Cast("bool") boolean is_param/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native void register_attribute(
        @StdString String name,
        @Const @ByRef Type.TypePtr t,
        @ByVal IValue v);

  public native void register_module(@StdString BytePointer name, @Const @ByRef JitModule module);
  public native void register_module(@StdString String name, @Const @ByRef JitModule module);

  public native void apply(@Const @ByRef JitModuleApplyFunction fn);

  public native @ByVal buffer_list buffers(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal buffer_list buffers();
  public native @ByVal named_buffer_list named_buffers(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal named_buffer_list named_buffers();

  public native @ByVal module_list children(); // direct modules
  public native @ByVal named_module_list named_children();
  public native @ByVal module_list modules(); // all modules, including this one, recursively
  public native @ByVal named_module_list named_modules();

  // all tensors involved in gradient optimization
  public native @ByVal parameter_list parameters(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal parameter_list parameters();
  public native @ByVal named_parameter_list named_parameters(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal named_parameter_list named_parameters();

  // all members of the object, similar to iterating over dir(obj) in python
  public native @ByVal attribute_list attributes(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal attribute_list attributes();
  public native @ByVal named_attribute_list named_attributes(@Cast("bool") boolean recurse/*=true*/);
  public native @ByVal named_attribute_list named_attributes();

  public native void dump(
        @Cast("bool") boolean print_method_bodies,
        @Cast("bool") boolean print_attr_values,
        @Cast("bool") boolean print_param_values);

  public native @StdString BytePointer dump_to_str(
        @Cast("bool") boolean print_method_bodies,
        @Cast("bool") boolean print_attr_values,
        @Cast("bool") boolean print_param_values);

  /** Enables "training" mode. */
  public native void train(@Cast("bool") boolean on/*=true*/);
  public native void train();
  /** Calls train(false) to enable "eval" mode.
   *  Do not override this method, override {@code train()} instead. */
  public native void eval();
  /** True if the module is in training mode. */
  
  ///
  public native @Cast("bool") boolean is_training();

  /** Recursively casts all parameters to the given {@code dtype} and {@code device}.
   * 
   *  If {@code non_blocking} is true and the source is in pinned memory and
   *  destination is on the GPU or vice versa, the copy is performed
   *  asynchronously with respect to the host. Otherwise, the argument has no
   *  effect. */
  
  ///
  public native void to(@ByVal Device device, ScalarType dtype, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(@ByVal Device device, ScalarType dtype);

  /** Recursively casts all parameters to the given dtype.
   * 
   *  If {@code non_blocking} is true and the source is in pinned memory and
   *  destination is on the GPU or vice versa, the copy is performed
   *  asynchronously with respect to the host. Otherwise, the argument has no
   *  effect. */
  
  ///
  public native void to(ScalarType dtype, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(ScalarType dtype);

  /** Recursively moves all parameters to the given device.
   * 
   *  If {@code non_blocking} is true and the source is in pinned memory and
   *  destination is on the GPU or vice versa, the copy is performed
   *  asynchronously with respect to the host. Otherwise, the argument has no
   *  effect. */
  public native void to(@ByVal Device device, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(@ByVal Device device);

  public native void save(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files);
  public native void save(
        @Cast("std::ostream*") @ByRef Pointer out);

  public native void save(
        @StdString BytePointer filename,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files);
  public native void save(
        @StdString BytePointer filename);
  public native void save(
        @StdString String filename,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files);
  public native void save(
        @StdString String filename);

  public native void _save_for_mobile(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files,
        @Cast("bool") boolean save_mobile_debug_info/*=false*/,
        @Cast("bool") boolean use_flatbuffer/*=false*/);
  public native void _save_for_mobile(
        @Cast("std::ostream*") @ByRef Pointer out);

  public native void _save_for_mobile(
        @StdString BytePointer filename,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files,
        @Cast("bool") boolean save_mobile_debug_info/*=false*/,
        @Cast("bool") boolean use_flatbuffer/*=false*/);
  public native void _save_for_mobile(
        @StdString BytePointer filename);
  public native void _save_for_mobile(
        @StdString String filename,
        @Const @ByRef(nullValue = "torch::jit::ExtraFilesMap()") ExtraFilesMap extra_files,
        @Cast("bool") boolean save_mobile_debug_info/*=false*/,
        @Cast("bool") boolean use_flatbuffer/*=false*/);
  public native void _save_for_mobile(
        @StdString String filename);

  public native @ByVal JitModule copy();

  public native @ByVal JitModule deepcopy(@ByVal(nullValue = "c10::optional<at::Device>(c10::nullopt)") DeviceOptional device);
  public native @ByVal JitModule deepcopy();

  // Clones both the underlying `ClassType` and the module instance(data), this
  // function creates a new `ClassType` and returns a new instance that has the
  // same data as the current instance but with the new type, shared ClassType
  // will be preserved as well
  public native @ByVal JitModule clone(@Cast("bool") boolean inplace/*=false*/);
  public native @ByVal JitModule clone();

  // Clones both the underlying `ClassType` and the module instance(data), this
  // function creates a new `ClassType` and returns a new instance that has the
  // same data as the current instance but with the new type, shared ClassType
  // will be preserved as well. Also allows the caller to specify a set of
  // method and attribute names to not clone.
  public native @ByVal JitModule clone(
        @Cast("bool") boolean inplace,
        @Const @ByRef StringSet ignored_method,
        @Const @ByRef StringSet ignored_attributes);

  public native void clone_method(@Const @ByRef JitModule orig, @StdString BytePointer name);
  public native void clone_method(@Const @ByRef JitModule orig, @StdString String name);

  public native @ByVal @Name("operator ()") IValue apply(@ByVal IValueVector inputs);

  public native @ByVal IValue create_class(@Const @ByRef QualifiedName name, @ByVal IValueVector stack);

  public native @Cast("bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef JitModule y);

  public native void set_delete_memory(@Cast("char*") @SharedPtr BytePointer delete_mem);
  public native void set_delete_memory(@Cast("char*") @SharedPtr ByteBuffer delete_mem);
  public native void set_delete_memory(@Cast("char*") @SharedPtr byte[] delete_mem);

  // A set of functions to maintain input shapes through torch.jit.save and
  // torch.jit.load. It only works on tensors and lists/dicts of tensors
  // because tracing is only supported by these types.
  public native void store_traced_inputs(@StdString BytePointer func_name, @ByVal IValueVector inputs);
  public native void store_traced_inputs(@StdString String func_name, @ByVal IValueVector inputs);

  public native @ByVal StringGenericListDict retrieve_traced_inputs();
}

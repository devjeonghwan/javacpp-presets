// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \brief An implementation of Env that forwards all calls to another Env.
 * 
 *  May be useful to clients who wish to override just part of the
 *  functionality of another Env. */
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EnvWrapper extends Env {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnvWrapper(Pointer p) { super(p); }

  /** Initializes an EnvWrapper that delegates all calls to *t */
  public EnvWrapper(Env t) { super((Pointer)null); allocate(t); }
  private native void allocate(Env t);

  /** Returns the target to which this Env forwards all calls */
  public native Env target();

  public native @ByVal Status GetFileSystemForFile(@StdString BytePointer fname,
                                @Cast("tensorflow::FileSystem**") PointerPointer result);
  public native @ByVal Status GetFileSystemForFile(@StdString BytePointer fname,
                                @ByPtrPtr FileSystem result);
  public native @ByVal Status GetFileSystemForFile(@StdString String fname,
                                @ByPtrPtr FileSystem result);

  public native @ByVal Status GetRegisteredFileSystemSchemes(StringVector schemes);

  public native @ByVal Status RegisterFileSystem(@StdString BytePointer scheme,
                              @ByVal @Cast("tensorflow::FileSystemRegistry::Factory*") FactoryFn factory);
  public native @ByVal Status RegisterFileSystem(@StdString String scheme,
                              @ByVal @Cast("tensorflow::FileSystemRegistry::Factory*") FactoryFn factory);

  public native @Cast("bool") boolean MatchPath(@StdString BytePointer path, @StdString BytePointer pattern);
  public native @Cast("bool") boolean MatchPath(@StdString String path, @StdString String pattern);

  public native @Cast("tensorflow::uint64") long NowMicros();
  public native void SleepForMicroseconds(@Cast("tensorflow::int64") long micros);
  public native Thread StartThread(@Const @ByRef ThreadOptions thread_options, @StdString BytePointer name,
                        @ByVal Fn fn);
  public native Thread StartThread(@Const @ByRef ThreadOptions thread_options, @StdString String name,
                        @ByVal Fn fn);
  public native int GetCurrentThreadId();
  public native @Cast("bool") boolean GetCurrentThreadName(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native void SchedClosure(@ByVal Fn closure);
  public native void SchedClosureAfter(@Cast("tensorflow::int64") long micros, @ByVal Fn closure);
  public native @ByVal Status LoadLibrary(@Cast("const char*") BytePointer library_filename, @Cast("void**") PointerPointer handle);
  public native @ByVal Status LoadLibrary(@Cast("const char*") BytePointer library_filename, @Cast("void**") @ByPtrPtr Pointer handle);
  public native @ByVal Status LoadLibrary(String library_filename, @Cast("void**") @ByPtrPtr Pointer handle);
  public native @ByVal Status GetSymbolFromLibrary(Pointer handle, @Cast("const char*") BytePointer symbol_name,
                                @Cast("void**") PointerPointer symbol);
  public native @ByVal Status GetSymbolFromLibrary(Pointer handle, @Cast("const char*") BytePointer symbol_name,
                                @Cast("void**") @ByPtrPtr Pointer symbol);
  public native @ByVal Status GetSymbolFromLibrary(Pointer handle, String symbol_name,
                                @Cast("void**") @ByPtrPtr Pointer symbol);
  public native @StdString BytePointer FormatLibraryFileName(@StdString BytePointer name,
                                 @StdString BytePointer version);
  public native @StdString String FormatLibraryFileName(@StdString String name,
                                 @StdString String version);

  public native @StdString BytePointer GetRunfilesDir();
}

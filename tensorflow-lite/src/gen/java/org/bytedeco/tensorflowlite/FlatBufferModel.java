// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** An RAII object that represents a read-only tflite model, copied from disk,
 *  or mmapped. This uses flatbuffers as the serialization format.
 * 
 *  NOTE: The current API requires that a FlatBufferModel instance be kept alive
 *  by the client as long as it is in use by any dependent Interpreter
 *  instances. As the FlatBufferModel instance is effectively immutable after
 *  creation, the client may safely use a single model with multiple dependent
 *  Interpreter instances, even across multiple threads (though note that each
 *  Interpreter instance is *not* thread-safe).
 * 
 *  <pre><code>
 *  using namespace tflite;
 *  StderrReporter error_reporter;
 *  auto model = FlatBufferModel::BuildFromFile("interesting_model.tflite",
 *                                              &error_reporter);
 *  MyOpResolver resolver;  // You need to subclass OpResolver to provide
 *                          // implementations.
 *  InterpreterBuilder builder(*model, resolver);
 *  std::unique_ptr<Interpreter> interpreter;
 *  if(builder(&interpreter) == kTfLiteOk) {
 *    .. run model inference with interpreter
 *  }
 *  </code></pre>
 * 
 *  OpResolver must be defined to provide your kernel implementations to the
 *  interpreter. This is environment specific and may consist of just the
 *  builtin ops, or some custom operators you defined to extend tflite. */

@Namespace("tflite::impl") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class FlatBufferModel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlatBufferModel(Pointer p) { super(p); }

  /** Builds a model based on a file.
   *  Caller retains ownership of {@code error_reporter} and must ensure its lifetime
   *  is longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure. */
  public static native @UniquePtr FlatBufferModel BuildFromFile(
        @Cast("const char*") BytePointer filename,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromFile(
        @Cast("const char*") BytePointer filename);
  public static native @UniquePtr FlatBufferModel BuildFromFile(
        String filename,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromFile(
        String filename);

  /** Verifies whether the content of the file is legit, then builds a model
   *  based on the file.
   *  The extra_verifier argument is an additional optional verifier for the
   *  file contents. By default, we always check with tflite::VerifyModelBuffer.
   *  If extra_verifier is supplied, the file contents is also checked against
   *  the extra_verifier after the check against tflite::VerifyModelBuilder.
   *  Caller retains ownership of {@code error_reporter} and must ensure its lifetime
   *  is longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure. */
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromFile(
        @Cast("const char*") BytePointer filename, TfLiteVerifier extra_verifier/*=nullptr*/,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromFile(
        @Cast("const char*") BytePointer filename);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromFile(
        String filename, TfLiteVerifier extra_verifier/*=nullptr*/,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromFile(
        String filename);

  /** Builds a model based on a pre-loaded flatbuffer.
   *  Caller retains ownership of the buffer and should keep it alive until
   *  the returned object is destroyed. Caller also retains ownership of
   *  {@code error_reporter} and must ensure its lifetime is longer than the
   *  FlatBufferModel instance.
   *  Returns a nullptr in case of failure.
   *  NOTE: this does NOT validate the buffer so it should NOT be called on
   *  invalid/untrusted input. Use VerifyAndBuildFromBuffer in that case */
  public static native @UniquePtr FlatBufferModel BuildFromBuffer(
        @Cast("const char*") BytePointer caller_owned_buffer, @Cast("size_t") long buffer_size,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromBuffer(
        @Cast("const char*") BytePointer caller_owned_buffer, @Cast("size_t") long buffer_size);
  public static native @UniquePtr FlatBufferModel BuildFromBuffer(
        String caller_owned_buffer, @Cast("size_t") long buffer_size,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromBuffer(
        String caller_owned_buffer, @Cast("size_t") long buffer_size);

  /** Verifies whether the content of the buffer is legit, then builds a model
   *  based on the pre-loaded flatbuffer.
   *  The extra_verifier argument is an additional optional verifier for the
   *  buffer. By default, we always check with tflite::VerifyModelBuffer. If
   *  extra_verifier is supplied, the buffer is checked against the
   *  extra_verifier after the check against tflite::VerifyModelBuilder. The
   *  caller retains ownership of the buffer and should keep it alive until the
   *  returned object is destroyed. Caller retains ownership of {@code error_reporter}
   *  and must ensure its lifetime is longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure. */
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromBuffer(
        @Cast("const char*") BytePointer caller_owned_buffer, @Cast("size_t") long buffer_size,
        TfLiteVerifier extra_verifier/*=nullptr*/,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromBuffer(
        @Cast("const char*") BytePointer caller_owned_buffer, @Cast("size_t") long buffer_size);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromBuffer(
        String caller_owned_buffer, @Cast("size_t") long buffer_size,
        TfLiteVerifier extra_verifier/*=nullptr*/,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromBuffer(
        String caller_owned_buffer, @Cast("size_t") long buffer_size);

  /** Builds a model directly from an allocation.
   *  Ownership of the allocation is passed to the model, but the caller
   *  retains ownership of {@code error_reporter} and must ensure its lifetime is
   *  longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure (e.g., the allocation is invalid). */
  public static native @UniquePtr FlatBufferModel BuildFromAllocation(
        @UniquePtr Allocation allocation,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromAllocation(
        @UniquePtr Allocation allocation);

  /** Verifies whether the content of the allocation is legit, then builds a
   *  model based on the provided allocation.
   *  The extra_verifier argument is an additional optional verifier for the
   *  buffer. By default, we always check with tflite::VerifyModelBuffer. If
   *  extra_verifier is supplied, the buffer is checked against the
   *  extra_verifier after the check against tflite::VerifyModelBuilder.
   *  Ownership of the allocation is passed to the model, but the caller
   *  retains ownership of {@code error_reporter} and must ensure its lifetime is
   *  longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure. */
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromAllocation(
        @UniquePtr Allocation allocation,
        TfLiteVerifier extra_verifier/*=nullptr*/,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel VerifyAndBuildFromAllocation(
        @UniquePtr Allocation allocation);

  /** Builds a model directly from a flatbuffer pointer
   *  Caller retains ownership of the buffer and should keep it alive until the
   *  returned object is destroyed. Caller retains ownership of {@code error_reporter}
   *  and must ensure its lifetime is longer than the FlatBufferModel instance.
   *  Returns a nullptr in case of failure. */
  public static native @UniquePtr FlatBufferModel BuildFromModel(
        @Cast("const tflite::Model*") Pointer caller_owned_model_spec,
        ErrorReporter error_reporter/*=tflite::DefaultErrorReporter()*/);
  public static native @UniquePtr FlatBufferModel BuildFromModel(
        @Cast("const tflite::Model*") Pointer caller_owned_model_spec);

// #if FLATBUFFERS_LITTLEENDIAN == 0
// #endif

  // Releases memory or unmaps mmaped memory.

  // Copying or assignment is disallowed to simplify ownership semantics.
  
  

  public native @Cast("bool") boolean initialized();
  public native @Cast("const tflite::Model*") @Name("operator ->") Pointer access();
  public native @Cast("const tflite::Model*") Pointer GetModel();
  public native ErrorReporter error_reporter();
  public native @Const Allocation allocation();

  // Returns the minimum runtime version from the flatbuffer. This runtime
  // version encodes the minimum required interpreter version to run the
  // flatbuffer model. If the minimum version can't be determined, an empty
  // string will be returned.
  // Note that the returned minimum version is a lower-bound but not a strict
  // lower-bound; ops in the graph may not have an associated runtime version,
  // in which case the actual required runtime might be greater than the
  // reported minimum.
  public native @StdString String GetMinimumRuntime();

  // Return model metadata as a mapping of name & buffer strings.
  // See Metadata table in TFLite schema.
  public native @ByVal StringStringMap ReadAllMetadata();

  // Return model metadata as a mapping of name & buffer strings.
  // See Metadata table in TFLite schema.
  public static native @ByVal StringStringMap ReadAllMetadata(
        @Cast("const tflite::Model*") Pointer model);

  // If the buffer is stored as part of the Flatbuffer or outside
  // return false if the buffers are part of the Flatbuffer
  public static native @Cast("bool") boolean CheckBufferOutsideModel(@Cast("const tflite::Model*") Pointer model);

  // Validates if the FlatBufferModel's buffer is well-formed. Specifically, it
  // checks if the 0th entry of the model buffers is an empty buffer (sentinel).
  // This is a convention so that tensors without a buffer can provide 0
  // as their buffer.
  // NOTE: The function doesn't explicitly fail for backward compatibility
  // reasons; it just provides a warning in case of failures.
  public native void ValidateModelBuffers(ErrorReporter error_reporter);

  /** Returns true if the model identifier is correct (otherwise false and
   *  reports an error). */
  public native @Cast("bool") boolean CheckModelIdentifier();
}

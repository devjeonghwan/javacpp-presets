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


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                               Node
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// A `Node` is an abstract class that represents an operation taking zero
// or more input `Variable`s and producing zero or more output `Variable`s. All
// functions in PyTorch's autograd machinery derive from this class and
// override its `apply` method. Instances of such subclasses will then be
// invokeable via the call operator.
//
//                    Nodes in the Autograd Graph
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// When viewing the autograd system as a graph, `Node`s are the vertices or
// nodes, connected to each other via (directed) `Edge`s, which themselves are
// represented via (`Node`, input_nr) pairs. `Variable`s are the outputs to
// and inputs of `Node`s, and travel between these edges during execution
// of the graph. When two or more `Edge`s (from different sources) point at the
// same input to a `Node`, the values produced along all of these edges are
// implicitly summed prior to being forwarded to the target `Node`.
//
//                              Hierarchy
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Subclasses usually represent differentiable functions as well as their
// gradient operators. Note, however, that due to the very general definition
// of a `Node` taking *zero* or more inputs and producing *zero* or more
// outputs, uses of `Node`s are flexible and extend beyond purely
// mathematical operations. For example, the `AccumulateGrad` function is a
// *sink*: it takes one input, but produces no outputs, instead accumulating
// the input as a side effect. At the other extreme, the `GraphRoot` function
// receives no inputs from other functions, but produces multiple outputs.
//
//                              Interface
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// The most important method on `Node` is the call operator, which takes in
// a list of variables and produces a list of variables. The precise size of
// these lists can be determined with `num_inputs()` and `num_outputs()`.
// `Node`s are stitched together via their `next_edge` interface, which let
// you manipulate the set of outgoing edges of a `Node`. You can add an
// edge with `add_next_edge()`, retrieve an edge with `next_edge(index)` and
// iterate over them via the `next_edges()` method. Other methods exist for
// integration with the JIT and other parts of PyTorch. Every `Node` has a
// *sequence number* that increases monotonically in the order of `Node`
// construction. It can be retrieved via the `sequence_nr()` method. Note that
// this sequence number is *thread local*. This means that when `Node`s
// `A`, `B` and `C` are created consecutively in the same thread, their
// sequence numbers will be ordered `A` < `B` < `C`. If, however, `A` and `B`
// are created in one thread and `C` is created in a new thread, there are *no
// guarantees* w.r.t. the ordering of `C` relative to `A` or `B`.
// See NOTE [ Sequence Number] for more details on the usages of sequence
// number.
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Node extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Node(Pointer p) { super(p); }

  /** Construct a new {@code Node} with the given {@code next_edges} */

  /** Nodes are neither copyable nor moveable. */
  
  
  
  

  public native @SharedPtr Node getptr();
  /** Evaluates the function on the given inputs and returns the result of the
   *  function call. */
  public native @Name("operator ()") @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector apply(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector inputs);

  // Graph Connectivity API
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // Inputs. NOTE: inputs of the grad_fn correspond to Tensor outputs of the
  // forward function.

  // Marker for expected undefined input
  @Opaque public static class undefined_input extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public undefined_input() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public undefined_input(Pointer p) { super(p); }
  }

  /** Adds the type and shape metadata for a new input. Returns the index of
   *  of the new input. */
  public native @Cast("uint32_t") @NoException(true) int add_input_metadata(
        @Const @ByRef TensorOptions options,
        @ByVal SymIntArrayRef shape,
        @Cast("bool") boolean is_tensor_subclass);

  public native @Cast("uint32_t") @NoException(true) int add_input_metadata(@Const @ByRef Tensor t);

  /** Adds a placeholder for an input that will not be used. */
  public native @Cast("uint32_t") @NoException(true) int add_input_metadata(@ByVal undefined_input u);

  public native @Cast("uint32_t") @NoException(true) int num_inputs();

  // Danger: not thread safe, caller must protect with lock

  /**
   * Note: Function Streams
   * A function's stream (for a given device type) is the stream of the first
   * element of its input buffer on a device of that type.
   *
   * If all elements are on the same device they MUST share a stream. If
   * elements are on different devices (across multiple GPUs, for example)
   * they may have different streams.
   */
  public native @ByVal StreamOptional stream(DeviceType device_type);
  public native @ByVal StreamOptional stream(@Cast("c10::DeviceType") byte device_type);

  public native void clear_input_metadata();

  // Outputs ("Next Edges")

  public native void update_topological_nr(@Const @ByRef Edge edge);

  public native void set_next_edge(@Cast("size_t") long index, @ByVal Edge edge);

  public native void add_next_edge(@ByVal Edge edge);

  public native void set_next_edges(@Cast({"", "std::vector<torch::autograd::Edge>"}) @StdMove EdgeVector next_edges);

  public native @Const @ByRef @NoException(true) Edge next_edge(@Cast("size_t") long index);

  public native @ByRef @NoException(true) EdgeVector next_edges();

  
  ///
  ///
  public native @Cast("uint32_t") @NoException(true) int num_outputs();

  // Miscellaneous Methods
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /** NOTE [ Sequence Number]
   * 
   *  The sequence_nr has two main usages in autograd:
   * 
   *  1) Helps determine the node's execution priority in the engine.
   *     All else being equal, nodes with higher priority numbers are executed
   *     first. Thus, nodes corresponding to ops executed later are the first to
   *     be executed in the backward pass. One caveat is that we prioritize
   *     AccumulateGrad nodes by explicitly setting its sequence_nr to be
   *     UINT64_MAX.
   *  2) The sequence number of this {@code Node} is paired with with thread_id it was
   *  created in
   *     as a unique identifier by the profiler to annotate recorded events.
   *     The purpose of this is to help users (and possibly programs)
   *     interpreting the profiler's output to correlate backward nodes with its
   *     forward ops. We need both sequence_nr and thread_id to identify a node
   *     because sequence_nr is thread_local, i.e., starts counting up from zero
   *     in a new thread */
  public native @Cast("uint64_t") @NoException(true) long sequence_nr();

  // NOTE [ Topological Number ]
  //
  // topological_nr is used to prune branches in the DAG during autograd
  // discovery as maintaining topological_nr helps us check in O(1) if there
  // does NOT exist a directed path between two nodes.
  //
  // The topological order number of this `Node` representing the length of the
  // longest possible path from this Node to any leaf node. If you are leaf
  // node, aka AccumulateGrad, this will be zero. This value has the property
  // that For every pair of nodes X, Y in G, existence of a directed path from X
  // to Y implies topo_nr(X) > topo_nr(Y). The converse is not true, however, so
  // we cannot prove existence of a path from X to Y, only non-existence.
  //
  // One assumption we make when using topo_nr is that once a node
  // has been used, i.e., has a parent node, its own topo_nr does not change
  // we have added some checks with the `has_parent_` field to enforce this.
  //
  // What NOT to do:
  //
  //   1) 2 -> 1 -> 0               In this diagram we label nodes with their
  //   topo_nr.
  //      2 -> 1 -> 0               We have two simple graphs that can each
  //      arise from
  //                                `t.exp().exp()`, for example.
  //   2)        2 -> 1 -> 0
  //            /
  //      2 -> 1 -> 0               We add 2 as a next edge to 1 even though 1
  //      already
  //                                has a parent.
  //   3)        2 -> 1 -> 0
  //            /
  //      2 -> 3 -> 0               2 < 3, yet there exists a path from 2 to 3!
  //
  public native @Cast("uint64_t") @NoException(true) long topological_nr();

  // assigning a node as a parent to this node
  public native void assign_parent();

  /** Id of the thread that created Node */
  public native @Cast("uint64_t") @NoException(true) long thread_id();

  /** Returns the name of the dynamic type of the function, for debugging. */
  
  ///
  public native @StdString BytePointer name();

  /** The difference between functions {@code should_compute_output} and
   *  {@code task_should_compute_output}:
   *  - {@code should_compute_output} should only be used during graph construction
   *  and takes into account only requires_grad information
   *  - {@code task_should_compute_output} should only be called during the backward
   *  pass (unless called directly through grad_fn) and takes into account the
   *  current graph task.  Specifically, the autograd engine trims unnecessary
   *  edges when {@code inputs} are specified, and during backward untrimmed nodes
   *  left on the graph can/should check {@code task_should_compute_output} to see if
   *  any outgoing edges have been trimmed by the engine. If that is the case,
   *  gradient computation wrt those edges can be omitted.
   * 
   *  Returns true if the particular output edge is active, and that particular
   *  output of this function should be computed. */
  public native @Cast("bool") boolean should_compute_output(@Cast("size_t") long output_edge_index);

  /** Returns true if any of the output edges in any of the ranges are active. */

  /** Same as the above {@code should_compute_output} function but will also
   *  check whether this edge is needed within the current graph task. */
  public native @Cast("bool") boolean task_should_compute_output(@Cast("size_t") long output_edge_index);

  /** Returns true if any of the output edges in any of the ranges are active
   *  and should be computed in the current graph task. */

  /** Returns the {@code PyObject} stored for this {@code Node} (for Python
   *  interaction). */
  public native @Cast("PyObject*") @NoException(true) Pointer pyobj();

  /** Sets the {@code PyObject} stored for this {@code Node} (for Python interaction). */
  public native @NoException(true) void set_pyobj(@Cast("PyObject*") Pointer pyobj);

  /** Returns the anomaly metadata stored for this {@code Node}.
   *  If none exist, creates a new empty one. */
  public native @NoException(true) AnomalyMetadata metadata();

  // Hook API
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public native @Cast("uintptr_t") long add_post_hook(@UniquePtr @Cast({"", "std::unique_ptr<torch::autograd::FunctionPostHook>&&"}) FunctionPostHook post_hook);

  // delete a post hook matching the key
  public native @Cast("bool") boolean del_post_hook(@Cast("const uintptr_t") long key);

  public native @ByRef @NoException(true) FunctionPostHookVector post_hooks();

  public native void add_pre_hook(@UniquePtr @Cast({"", "std::unique_ptr<torch::autograd::FunctionPreHook>&&"}) FunctionPreHook pre_hook);

  public native void add_tensor_pre_hook(@UniquePtr @Cast({"", "std::unique_ptr<torch::autograd::FunctionPreHook>&&"}) FunctionPreHook pre_hook);

  public native void add_retains_grad_hook(
        @UniquePtr @Cast({"", "std::unique_ptr<torch::autograd::FunctionPreHook>&&"}) FunctionPreHook pre_hook,
        int output_idx);

  public native @UniquePtr @Cast({"", "std::unique_ptr<torch::autograd::FunctionPreHook>&&"}) FunctionPreHook pop_retains_grad_hook(int output_idx);

  public native @ByRef @NoException(true) FunctionPreHookVector pre_hooks();

  public native @ByRef @NoException(true) FunctionPreHookVector tensor_pre_hooks();

  public native @UniquePtr @NoException(true) PostAccumulateGradHook tensor_post_acc_grad_hooks();

  

  // Customization Points for Subclasses
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /** Releases saved variables if the operation won't be reused. */
  public native void release_variables();

  /** Called before an apply if {@code release_variables()} is going to be called.
   *  Allows larger ops like {@code InterpreterAutogradFunction} to incrementally
   *  release variables as they run. */
  public native void will_release_variables();

  /** Returns true if this function is traceable. An op is traceable if all
   *  operations happening within {@code apply()} are performed on autograd
   *  {@code Variables} (i.e. apply mostly instantiates and applies other functions). */
  public native @Cast("bool") boolean is_traceable();

  /** A {@code Node} is said to pass state transparently to backward, if the
   *  state consists only of (Saved)Variables and only non-variable objects
   *  that parameterize the operation in some way that defines the graph
   *  structure AND the backward function is traceable. In particular,
   *  parametrization MUST NOT depend on the data of any {@code Variable}.
   *  TODO: it might be possible to handle cases where backward is
   *  non-traceable but state passing could be considered transparent. This
   *  will probably depend on saved_variable_list being mutable.
   *  NOTE: this value matters only if is_traceable() returns false. */
  public native @Cast("bool") boolean passes_state_transparently();

  // see [Note: Compiled Autograd]
  // Used by compiled autograd to
  //   1) Extract tensors/symint args
  //   2) Collect node information for specialization and caching
  // Implementations in subclasses should call args.collect() with all node
  // attrs. These functions are only called durring backward.
  public native void compiled_args(@ByRef CompiledNodeArgs args);

  // Used by compiled autograd to call apply() with different saved tensors
  // Implementations should call saved.before() on all attrs, then apply(), then
  // saved.after() on all attrs in the same order.
  public native @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector apply_with_saved(
        @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector inputs,
        @ByRef SwapSavedVariables saved);
}

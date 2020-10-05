// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class IoBinding extends BaseIoBinding {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IoBinding(Pointer p) { super(p); }

  public IoBinding(@ByRef Session session) { super((Pointer)null); allocate(session); }
  private native void allocate(@ByRef Session session);
  public native void BindInput(@Cast("const char*") BytePointer name, @StdMove Value arg1);
  public native void BindInput(String name, @StdMove Value arg1);
  public native void BindOutput(@Cast("const char*") BytePointer name, @StdMove Value arg1);
  public native void BindOutput(String name, @StdMove Value arg1);
  public native void BindOutput(@Cast("const char*") BytePointer name, @Const @ByRef MemoryInfo arg1);
  public native void BindOutput(String name, @Const @ByRef MemoryInfo arg1);
  public native @ByVal StringVector GetOutputNames();
  public native @ByVal StringVector GetOutputNames(@ByRef Allocator arg0);
  public native @StdMove ValueVector GetOutputValues();
  public native @StdMove ValueVector GetOutputValues(@ByRef Allocator arg0);
  public native void ClearBoundInputs();
  public native void ClearBoundOutputs();
}

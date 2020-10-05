// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_ArrayDescr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_ArrayDescr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_ArrayDescr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_ArrayDescr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_ArrayDescr position(long position) {
        return (PyArray_ArrayDescr)super.position(position);
    }
    @Override public PyArray_ArrayDescr getPointer(long i) {
        return new PyArray_ArrayDescr(this).position(position + i);
    }

        public native PyArray_Descr base(); public native PyArray_ArrayDescr base(PyArray_Descr setter);
        public native PyObject shape(); public native PyArray_ArrayDescr shape(PyObject setter);       /* a tuple */
}

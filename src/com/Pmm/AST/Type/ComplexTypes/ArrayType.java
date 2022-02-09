package com.Pmm.AST.Type.ComplexTypes;

import com.Pmm.AST.Type.Type;
import com.Pmm.AST.Type.TypeAbs;

public class ArrayType extends TypeAbs {

    private int size;
    private Type of;

    public ArrayType(int colum, int line, int size, Type of) {
        super(colum, line);
        this.size = size;
        this.of = of;
    }

    public int getSize() {
        return size;
    }

    public Type getOf() {
        return of;
    }
}

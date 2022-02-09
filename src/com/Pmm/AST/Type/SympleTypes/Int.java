package com.Pmm.AST.Type.SympleTypes;

import com.Pmm.AST.Type.TypeAbs;

public class Int extends TypeAbs {

    private int number;

    public Int(int colum, int line, int number) {
        super(colum, line);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

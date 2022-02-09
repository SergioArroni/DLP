package com.Pmm.AST.Type.SympleTypes;

import com.Pmm.AST.Type.TypeAbs;

public class Double extends TypeAbs {

    private double number;

    public Double(int colum, int line, double number) {
        super(colum, line);
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}

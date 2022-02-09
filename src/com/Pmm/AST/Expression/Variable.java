package com.Pmm.AST.Expression;

public class Variable extends ExpressionAbs {

    private String name;

    public Variable(int colum, int line, String name) {
        super(colum, line);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

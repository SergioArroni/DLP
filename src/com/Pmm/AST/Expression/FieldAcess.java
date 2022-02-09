package com.Pmm.AST.Expression;

public class FieldAcess extends UnaryExpression {

    private String name;

    public FieldAcess(int colum, int line, Expression expression, String name) {
        super(colum, line, expression);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

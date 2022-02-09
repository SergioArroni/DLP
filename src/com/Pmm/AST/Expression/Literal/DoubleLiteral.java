package com.Pmm.AST.Expression.Literal;

import com.Pmm.AST.Expression.ExpressionAbs;

public class DoubleLiteral extends ExpressionAbs {

    private Double value;

    public DoubleLiteral(int colum, int line, Double value) {
        super(colum, line);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}

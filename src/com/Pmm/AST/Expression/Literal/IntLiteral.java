package com.Pmm.AST.Expression.Literal;

import com.Pmm.AST.Expression.ExpressionAbs;

public class IntLiteral extends ExpressionAbs {

    private Integer value;

    public IntLiteral(int colum, int line, Integer value) {
        super(colum, line);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

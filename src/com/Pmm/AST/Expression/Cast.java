package com.Pmm.AST.Expression;

import com.Pmm.AST.Type.Type;

public class Cast extends UnaryExpression {

    private Type castType;

    public Cast(int colum, int line, Expression expression, Type castType) {
        super(colum, line, expression);
        this.castType =  castType;
    }

    public Type getCastType() {
        return castType;
    }
}

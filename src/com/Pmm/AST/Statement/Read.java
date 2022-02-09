package com.Pmm.AST.Statement;

import com.Pmm.AST.Expression.Expression;

import java.util.ArrayList;

public class Read extends StatementAbs {

    private Expression expression;

    public Read(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

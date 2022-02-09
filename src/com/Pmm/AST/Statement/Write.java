package com.Pmm.AST.Statement;

import com.Pmm.AST.Expression.Expression;

public class Write extends StatementAbs {

    private Expression expression;

    public Write(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

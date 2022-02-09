package com.Pmm.AST.Statement;

import com.Pmm.AST.Expression.Expression;

public class Return extends StatementAbs {

    private Expression expression;

    public Return(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

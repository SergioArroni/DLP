package com.Pmm.AST.Expression.Operator;

import com.Pmm.AST.Expression.BinaryExpression;
import com.Pmm.AST.Expression.Expression;
import com.Pmm.AST.Expression.ExpressionAbs;

public abstract class ExpressionOperatorAbs extends BinaryExpression {

    private String operator;

    public ExpressionOperatorAbs(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}

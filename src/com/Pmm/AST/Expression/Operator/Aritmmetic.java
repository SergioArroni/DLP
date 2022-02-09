package com.Pmm.AST.Expression.Operator;

import com.Pmm.AST.Expression.Expression;
import com.Pmm.AST.Expression.Operator.ExpressionOperatorAbs;

public class Aritmmetic extends ExpressionOperatorAbs {


    public Aritmmetic(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }
}

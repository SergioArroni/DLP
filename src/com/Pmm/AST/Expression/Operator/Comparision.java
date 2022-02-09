package com.Pmm.AST.Expression.Operator;

import com.Pmm.AST.Expression.Expression;

public class Comparision extends ExpressionOperatorAbs {


    public Comparision(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }
}

package ast.Expression.Operator;

import ast.Expression.Expression;

public class Logic extends ExpressionOperatorAbs {


    public Logic(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }
}
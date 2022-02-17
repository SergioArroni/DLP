package AST.Expression.Operator;

import AST.Expression.Expression;

public class Aritmmetic extends ExpressionOperatorAbs {


    public Aritmmetic(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }
}

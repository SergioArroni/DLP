package AST.Expression.Operator;

import AST.Expression.Expression;

public class Comparision extends ExpressionOperatorAbs {


    public Comparision(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }
}

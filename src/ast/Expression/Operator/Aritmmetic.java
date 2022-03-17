package ast.Expression.Operator;

import ast.Expression.Expression;
import visitor.Visitor;

public class Aritmmetic extends ExpressionOperatorAbs {


    public Aritmmetic(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

package ast.expression.operator;

import ast.expression.Expression;
import visitor.Visitor;

public class Comparision extends ExpressionOperatorAbs {


    public Comparision(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right, operator);
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

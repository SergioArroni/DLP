package ast.expression;

import visitor.Visitor;

public class UnaryMinus extends UnaryExpression {

    public UnaryMinus(int colum, int line, Expression expression) {
        super(colum, line, expression);
    }

    @Override
    public String toString() {
        return "UnaryMinus{}";
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

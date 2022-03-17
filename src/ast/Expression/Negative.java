package ast.Expression;

import visitor.Visitor;

public class Negative extends UnaryExpression {

    public Negative(int colum, int line, Expression expression) {
        super(colum, line, expression);
    }

    @Override
    public String toString() {
        return "Negative{}";
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}


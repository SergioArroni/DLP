package ast.Expression;

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
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

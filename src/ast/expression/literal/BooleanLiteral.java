package ast.expression.literal;

import ast.expression.ExpressionAbs;
import visitor.Visitor;

public class BooleanLiteral extends ExpressionAbs {

    private int value;

    public BooleanLiteral(int colum, int line, int value) {
        super(colum, line);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IntLiteral{" +
                "value=" + value +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

package ast.expression.literal;

import ast.expression.ExpressionAbs;
import visitor.Visitor;

public class IntLiteral extends ExpressionAbs {

    private Integer value;

    public IntLiteral(int colum, int line, Integer value) {
        super(colum, line);
        this.value = value;
    }

    public Integer getValue() {
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

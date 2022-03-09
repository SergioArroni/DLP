package ast.Expression.Literal;

import ast.Expression.ExpressionAbs;

public class DoubleLiteral extends ExpressionAbs {

    private Double value;

    public DoubleLiteral(int colum, int line, Double value) {
        super(colum, line);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DoubleLiteral{" +
                "value=" + value +
                '}';
    }
}
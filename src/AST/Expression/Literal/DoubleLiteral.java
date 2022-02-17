package AST.Expression.Literal;

import AST.Expression.ExpressionAbs;

public class DoubleLiteral extends ExpressionAbs {

    private Double value;

    public DoubleLiteral(int colum, int line, Double value) {
        super(colum, line);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}

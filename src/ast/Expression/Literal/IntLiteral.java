package ast.Expression.Literal;

import ast.Expression.ExpressionAbs;

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
}

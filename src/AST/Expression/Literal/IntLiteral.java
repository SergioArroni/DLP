package AST.Expression.Literal;

import AST.Expression.ExpressionAbs;

public class IntLiteral extends ExpressionAbs {

    private Integer value;

    public IntLiteral(int colum, int line, Integer value) {
        super(colum, line);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

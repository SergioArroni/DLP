package AST.Expression.Literal;

import AST.Expression.ExpressionAbs;

public class CharLiteral extends ExpressionAbs {

    private Character value;

    public CharLiteral(int colum, int line, Character value) {
        super(colum, line);
        this.value = value;
    }

    public Character getValue() {
        return value;
    }
}

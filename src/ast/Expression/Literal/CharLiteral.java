package ast.Expression.Literal;

import ast.Expression.ExpressionAbs;

public class CharLiteral extends ExpressionAbs {

    private Character value;

    public CharLiteral(int colum, int line, Character value) {
        super(colum, line);
        this.value = value;
    }

    public Character getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CharLiteral{" +
                "value=" + value +
                '}';
    }
}

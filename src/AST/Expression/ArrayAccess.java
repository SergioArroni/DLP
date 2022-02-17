package AST.Expression;

public class ArrayAccess extends BinaryExpression {

    public ArrayAccess(int colum, int line, Expression left, Expression right) {
        super(colum, line, left, right);
    }
}

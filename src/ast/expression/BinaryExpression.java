package ast.expression;

public abstract class BinaryExpression extends ExpressionAbs {

    private Expression left;
    private Expression right;

    public BinaryExpression(int colum, int line, Expression left, Expression right) {
        super(colum, line);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}

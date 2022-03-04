package ast.Expression;

public abstract class UnaryExpression extends ExpressionAbs {

    private Expression expression;

    public UnaryExpression(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "UnaryExpression{" +
                "expression=" + expression +
                '}';
    }
}

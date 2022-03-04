package ast.Expression;

public class UnaryMinus extends UnaryExpression {

    public UnaryMinus(int colum, int line, Expression expression) {
        super(colum, line, expression);
    }

    @Override
    public String toString() {
        return "UnaryMinus{}";
    }
}

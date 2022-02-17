package AST.Expression;

public class Negative extends UnaryExpression {

    public Negative(int colum, int line, Expression expression) {
        super(colum, line, expression);
    }
}

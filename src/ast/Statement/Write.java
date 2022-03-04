package ast.Statement;

import ast.Expression.Expression;

public class Write extends StatementAbs {

    private Expression expression;

    public Write(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Write{" +
                "expression=" + expression +
                '}';
    }
}

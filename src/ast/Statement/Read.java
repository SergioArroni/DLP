package ast.Statement;

import ast.Expression.Expression;

public class Read extends StatementAbs {

    private Expression expression;

    public Read(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Read{" +
                "expression=" + expression +
                '}';
    }
}

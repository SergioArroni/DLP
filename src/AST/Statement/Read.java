package AST.Statement;

import AST.Expression.Expression;

public class Read extends StatementAbs {

    private Expression expression;

    public Read(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

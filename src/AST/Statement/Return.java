package AST.Statement;

import AST.Expression.Expression;

public class Return extends StatementAbs {

    private Expression expression;

    public Return(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

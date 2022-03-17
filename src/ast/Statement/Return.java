package ast.Statement;

import ast.Expression.Expression;
import visitor.Visitor;

public class Return extends StatementAbs {

    private Expression expression;

    public Return(int colum, int line, Expression expression) {
        super(colum, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Return{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

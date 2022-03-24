package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

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

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

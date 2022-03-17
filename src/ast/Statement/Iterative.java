package ast.Statement;

import ast.Expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Iterative extends StatementAbs {

    private List<Statement> loopStatement;
    private Expression condition;

    public Iterative(int colum, int line, Expression condition, List<Statement> loopStatement) {
        super(colum, line);
        this.condition = condition;
        this.loopStatement = loopStatement;
    }

    public List<Statement> getLoopStatement() {
        return loopStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Iterative{" +
                "loopStatement=" + loopStatement +
                ", condition=" + condition +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

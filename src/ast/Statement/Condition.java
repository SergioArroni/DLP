package ast.Statement;

import ast.Expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Condition extends StatementAbs {

    private List<Statement> ifStatement;
    private List<Statement> elseStatement;
    private Expression condition;

    public Condition(int colum, int line, Expression condition, List<Statement> ifStatement, List<Statement> elseStatement) {
        super(colum, line);
        this.condition = condition;
        this.elseStatement = elseStatement;
        this.ifStatement = ifStatement;
    }

    public List<Statement> getIfStatement() {
        return ifStatement;
    }

    public List<Statement> getElseStatement() {
        return elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "ifStatement=" + ifStatement +
                ", elseStatement=" + elseStatement +
                ", condition=" + condition +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

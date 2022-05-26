package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.List;

public class IterativeFor extends StatementAbs {

    private Statement initial2;
    private List<Statement> loopStatement;
    private Statement initial1;
    private Expression condition;

    public IterativeFor(int colum, int line, Statement initial1 , Expression condition, Statement initial2, List<Statement> loopStatement) {
        super(colum, line);
        this.initial1 = initial1;
        this.condition = condition;
        this.initial2 = initial2;
        this.loopStatement = loopStatement;
    }

    public Statement getInitial2() {
        return initial2;
    }

    public Statement getInitial1() {
        return initial1;
    }

    public List<Statement> getLoopStatement() {
        return loopStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "IterativeFor{" +
                "loopStatement=" + loopStatement +
                ", condition=" + condition +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

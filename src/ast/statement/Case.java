package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

public class Case extends StatementAbs {

    private Statement caseBody;
    private String temporal;
    private Expression condition;

    public Case(int colum, int line, Expression condition, Statement caseBody, String temporal) {
        super(colum, line);
        this.condition = condition;
        this.temporal = temporal;
        this.caseBody = caseBody;
    }

    public Statement getCaseBody() {
        return caseBody;
    }

    public String getTemporal() {
        return temporal;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Case{" +
                "switchBody=" + caseBody +
                ", temporal='" + temporal + '\'' +
                ", condition=" + condition +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

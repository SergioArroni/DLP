package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.List;

public class Case extends StatementAbs {

    private List<Statement> caseBody;
    private String temporal;
    private Expression condition;

    public Case(int colum, int line, Expression condition, List<Statement> caseBody, String temporal) {
        super(colum, line);
        this.condition = condition;
        this.temporal = temporal;
        this.caseBody = caseBody;
    }

    public List<Statement> getCaseBody() {
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

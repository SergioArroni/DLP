package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.List;

public class Switch extends StatementAbs {

    private List<Case> switchBody;
    private Expression condition;
    private Case defaults;

    public Switch(int colum, int line, Expression condition, List<Case> switchBody, Case defaults) {
        super(colum, line);
        this.condition = condition;
        this.defaults = defaults;
        this.switchBody = switchBody;
    }

    public List<Case> getSwitchBody() {
        return switchBody;
    }

    public Case getDefaulta() {
        return defaults;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Case{" +
                "switchBody=" + switchBody +
                ", default='" + defaults + '\'' +
                ", condition=" + condition +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

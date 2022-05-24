package ast.definition;

import ast.expression.Expression;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VarDefinition extends DefinitionAbs implements Statement {

    private int offset;
    private Expression expr;

    public VarDefinition(int column, int line, String name, Type type, Expression expr) {
        super(column, line, name, type);
        this.expr = expr;
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

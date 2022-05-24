package ast.expression;

import visitor.Visitor;

public class Ternaria {

    private Expression exprIf;
    private Expression exprElse;
    private Expression condition;

    public Ternaria(int colum, int line, Expression exprIf, Expression exprElse, Expression condition) {
        //super(colum, line);

        this.exprIf = exprIf;
        this.exprElse = exprElse;
        this.condition = condition;

    }

    public Expression getExprIf() {
        return exprIf;
    }

    public Expression getExprElse() {
        return exprElse;
    }

    public Expression getCondition() {
        return condition;
    }
/**
    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
    */
}

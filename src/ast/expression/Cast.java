package ast.expression;

import ast.type.Type;
import visitor.Visitor;

public class Cast extends UnaryExpression {

    private Type castType;

    public Cast(int colum, int line, Expression expression, Type castType) {
        super(colum, line, expression);
        this.castType =  castType;
    }

    public Type getCastType() {
        return castType;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "castType=" + castType +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

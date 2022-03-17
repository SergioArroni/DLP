package ast.Expression;

import ast.Type.Type;
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
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

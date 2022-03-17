package ast.Expression;

import visitor.Visitor;

public class ArrayAccess extends BinaryExpression {

    public ArrayAccess(int colum, int line, Expression left, Expression right) {
        super(colum, line, left, right);
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }

}

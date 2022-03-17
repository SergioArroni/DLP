package ast.Expression;

import visitor.Visitor;

public class ArrayAccess extends BinaryExpression {

    public ArrayAccess(int colum, int line, Expression left, Expression right) {
        super(colum, line, left, right);
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

}

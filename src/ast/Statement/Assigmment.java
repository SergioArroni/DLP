package ast.Statement;

import ast.Expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;

public class Assigmment extends StatementAbs {

    private Expression left;
    private Expression right;

    public Assigmment(int colum, int line, Expression left, Expression right) {
        super(colum, line);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Assigmment{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

}

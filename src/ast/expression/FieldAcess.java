package ast.expression;

import visitor.Visitor;

public class FieldAcess extends UnaryExpression {

    private String name;

    public FieldAcess(int colum, int line, Expression expression, String name) {
        super(colum, line, expression);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FieldAcess{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

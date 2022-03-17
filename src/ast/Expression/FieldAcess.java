package ast.Expression;

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
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

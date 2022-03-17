package ast.Expression;

import visitor.Visitor;

public class Variable extends ExpressionAbs {

    private String name;

    public Variable(int colum, int line, String name) {
        super(colum, line);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }
}

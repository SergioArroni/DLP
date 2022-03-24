package ast.expression;

import ast.definition.Definition;
import visitor.Visitor;

public class Variable extends ExpressionAbs {

    private String name;
    private Definition definition;

    public Variable(int colum, int line, String name) {
        super(colum, line);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }
}

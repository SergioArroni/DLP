package ast.expression;

import ast.definition.Definition;
import ast.statement.Statement;
import visitor.Visitor;

public class VariablePlus extends ExpressionAbs implements Statement {

    private String name;
    private String operator;
    private Definition definition;

    public VariablePlus(int colum, int line, String name, String operator) {
        super(colum, line);
        this.name = name;
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
        return "VariablePlus{" +
                "name='" + name + '\'' +
                ", operator='" + operator + '\'' +
                ", definition=" + definition +
                '}';
    }
}

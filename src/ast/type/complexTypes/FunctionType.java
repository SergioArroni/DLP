package ast.type.complexTypes;

import ast.AstNode;
import ast.definition.VarDefinition;
import ast.expression.Expression;
import ast.type.Type;
import ast.type.TypeAbs;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends TypeAbs {

    private List<VarDefinition> parameters;
    private Type typeReturn;
    private String name;

    public FunctionType(int colum, int line, String name, List<VarDefinition> parameters, Type typeReturn) {
        super(colum, line);
        this.parameters = parameters;
        this.typeReturn = typeReturn;
        this.name = name;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    public Type getTypeReturn() {
        return typeReturn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "parameters=" + parameters +
                ", typeReturn=" + typeReturn +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type parenthesis(List<Expression> parameters, AstNode node) {
        if (parameters.equals(this.parameters)) {
            return this;
        }
        return super.parenthesis(parameters, node);
    }
}

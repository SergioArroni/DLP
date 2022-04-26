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
    private int paramOffset;

    public FunctionType(int colum, int line, String name, List<VarDefinition> parameters, Type typeReturn) {
        super(colum, line);
        this.parameters = parameters;
        this.typeReturn = typeReturn;
        int cont = 0;
        for (VarDefinition ele : parameters) {
            cont += ele.getType().getNumberOfBytes();
        }
        super.setNumberOfBytes(cont);
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
        if (parameters.size() != this.parameters.size())
            return new ErrorType(node.getColumn(), node.getLine(), "Error, the number of parameters entered: " + parameters.size() + ", is incorrect, it should be: " + this.parameters.size());

        for (int i = 0; i < parameters.size(); i++) {
            parameters.get(i).getType().promotesTo(this.parameters.get(i).getType(), parameters.get(i));
        }
        return this.typeReturn;
    }

}

package ast.Type.ComplexTypes;

import ast.Definition.VarDefinition;
import ast.Type.Type;
import ast.Type.TypeAbs;

import java.util.ArrayList;
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
}

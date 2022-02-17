package AST.Type.ComplexTypes;

import AST.Definition.VarDefinition;
import AST.Type.Type;
import AST.Type.TypeAbs;

import java.util.ArrayList;

public class FunctionType extends TypeAbs {

    private ArrayList<VarDefinition> parameters;
    private Type typeReturn;

    public FunctionType(int colum, int line, ArrayList<VarDefinition> parameters, Type typeReturn) {
        super(colum, line);
        this.parameters = parameters;
        this.typeReturn = typeReturn;
    }

    public ArrayList<VarDefinition> getParameters() {
        return parameters;
    }

    public Type getTypeReturn() {
        return typeReturn;
    }
}

package com.Pmm.AST.Type.ComplexTypes;

import com.Pmm.AST.Definition.VarDefinition;
import com.Pmm.AST.Type.Type;
import com.Pmm.AST.Type.TypeAbs;

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

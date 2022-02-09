package com.Pmm.AST.Definition;

import com.Pmm.AST.Statement.Statement;
import com.Pmm.AST.Type.Type;

import java.util.ArrayList;

public abstract class DefinitionAbs implements Definition {

    private Type type;
    private String name;

    public DefinitionAbs(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public Type GetType() {
        return type;
    }
}

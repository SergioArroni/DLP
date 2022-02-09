package com.Pmm.AST.Definition;

import com.Pmm.AST.Statement.Statement;
import com.Pmm.AST.Type.Type;

import java.util.ArrayList;

public class FuncDefinition extends DefinitionAbs {

    private ArrayList<VarDefinition> varDefinitions;
    private ArrayList<Statement> statements;


    public FuncDefinition(String name, Type type, ArrayList<VarDefinition> varDefinitions, ArrayList<Statement> statements) {
        super(name,type);
        this.statements =  statements;
        this.varDefinitions =  varDefinitions;
    }

}

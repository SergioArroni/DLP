package ast.Definition;

import ast.Statement.Statement;
import ast.Type.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends DefinitionAbs {

    private List<VarDefinition> varDefinitions;
    private List<Statement> statements;


    public FuncDefinition(int column, int line, String name, Type type, List<VarDefinition> varDefinitions, List<Statement> statements) {
        super(column, line, name,type);
        this.statements =  statements;
        this.varDefinitions =  varDefinitions;
    }

    @Override
    public String toString() {
        return "FuncDefinition{" +
                "varDefinitions=" + varDefinitions +
                ", statements=" + statements +
                '}';
    }
}

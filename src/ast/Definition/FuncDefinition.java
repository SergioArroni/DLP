package ast.Definition;

import ast.Statement.Statement;
import ast.Type.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends DefinitionAbs {

    private List<Statement> statements;


    public FuncDefinition(int column, int line, String name, Type type, List<Statement> statements) {
        super(column, line, name, type);
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "FuncDefinition{" +
                ", statements=" + statements +
                '}';
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return v.visit(this, p);
    }
}

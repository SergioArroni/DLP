package ast.Definition;

import ast.Statement.Statement;
import ast.Type.Type;
import visitor.Visitor;

public class VarDefinition extends DefinitionAbs implements Statement {

    public VarDefinition(int column, int line,String name, Type type) {
        super(column, line, name, type);
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

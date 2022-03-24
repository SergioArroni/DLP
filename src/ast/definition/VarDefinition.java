package ast.definition;

import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VarDefinition extends DefinitionAbs implements Statement {

    public VarDefinition(int column, int line,String name, Type type) {
        super(column, line, name, type);
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

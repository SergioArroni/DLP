package ast.Definition;

import ast.Statement.Statement;
import ast.Type.Type;

public class VarDefinition extends DefinitionAbs implements Statement {

    public VarDefinition(int column, int line,String name, Type type) {
        super(column, line, name, type);
    }


}

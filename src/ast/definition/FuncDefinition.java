package ast.definition;

import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

import java.util.List;

public class FuncDefinition extends DefinitionAbs {

    private List<Statement> statements;
    private int localOffsetAux;

    public FuncDefinition(int column, int line, String name, Type type, List<Statement> statements) {
        super(column, line, name, type);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "FuncDefinition{" +
                ", statements=" + statements +
                '}';
    }

    public int getLocalOffsetAux() {
        return localOffsetAux;
    }

    public void setLocalOffsetAux(int localOffsetAux) {
        this.localOffsetAux = localOffsetAux;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

}

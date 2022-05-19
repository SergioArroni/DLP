package ast.definition;

import ast.statement.Statement;
import ast.type.Type;
import ast.type.complexTypes.FunctionType;
import visitor.Visitor;

import java.util.List;

public class FuncDefinition extends DefinitionAbs {

    private List<Statement> statements;
    private int localOffsetAux;
    private Type returnType;

    public FuncDefinition(int column, int line, String name, FunctionType type, List<Statement> statements) {
        super(column, line, name, type);
        this.statements = statements;
    }

    public Type getReturnType() {
        return returnType;
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

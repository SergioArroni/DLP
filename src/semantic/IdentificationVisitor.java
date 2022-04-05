package semantic;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.statement.Statement;
import ast.type.complexTypes.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends VisitorAbs {

    private final SymbolTable symbolTable;

    public IdentificationVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {

        var insert = symbolTable.insert(v);
        if (!insert) {
            new ErrorType(v.getColumn(), v.getLine(), "Error, variable already defined: " + v.getName());
        }
        symbolTable.set();
        v.getType().Accept(this, p);
        for (Statement st : v.getStatements())
            st.Accept(this, p);
        symbolTable.reset();
        return null;
    }

    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        v.getType().Accept(this, p);
        var insert = symbolTable.insert(v);
        if (!insert) {
            new ErrorType(v.getColumn(), v.getLine(), "Error, variable already defined: " + v.getName());
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        var find = symbolTable.find(v.getName());
        if (find == null) {
            var error = new ErrorType(v.getColumn(), v.getLine(), "Error, variable not defined: " + v.getName());
            v.setDefinition(new VarDefinition(v.getColumn(),v.getLine(),v.getName(),error));
            return null;
        }
        v.setDefinition(find);
        return null;
    }

}

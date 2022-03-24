package semantic;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.type.complexTypes.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends VisitorAbs {

    private SymbolTable symbolTable;

    public IdentificationVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {
        super.visit(v, p);
        var insert = symbolTable.insert(v);
        if (!insert) {
            new ErrorType(v.getLine(), v.getColumn(), "Error variable ya definida: " + v.getName());
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        super.visit(v, p);
        var insert = symbolTable.insert(v);
        if (!insert) {
            new ErrorType(v.getLine(), v.getColumn(), "Error variable ya definida: " + v.getName());
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        super.visit(v, p);
        var find = symbolTable.find(v.getName());
        if (find == null) {
            new ErrorType(v.getLine(), v.getColumn(), "Error variable no definida: " + v.getName());
            return null;
        }
        v.setDefinition(find);
        return null;
    }

}

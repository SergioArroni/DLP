package semantic;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.expression.VariablePlus;
import ast.statement.Statement;
import ast.type.complexTypes.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends VisitorAbs<Void, Void> {

    private final SymbolTable symbolTable;

    public IdentificationVisitor() {
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visit(FuncDefinition v, Void p) {

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
    public Void visit(VarDefinition v, Void p) {
        v.getType().Accept(this, p);
        var insert = symbolTable.insert(v);
        if (!insert) {
            new ErrorType(v.getColumn(), v.getLine(), "Error, variable already defined: " + v.getName());
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Void p) {
        var find = symbolTable.find(v.getName());
        if (find == null) {
            var error = new ErrorType(v.getColumn(), v.getLine(), "Error, variable not defined: " + v.getName());
            v.setDefinition(new VarDefinition(v.getColumn(), v.getLine(), v.getName(), error,v));
            return null;
        }
        v.setDefinition(find);
        return null;
    }

    @Override
    public Void visit(VariablePlus v, Void p) {
        var find = symbolTable.find(v.getName());
        if (find == null) {
            var error = new ErrorType(v.getColumn(), v.getLine(), "Error, variable not defined: " + v.getName());
            v.setDefinition(new VarDefinition(v.getColumn(), v.getLine(), v.getName(), error,v));
            return null;
        }
        v.setDefinition(find);
        return null;
    }


}

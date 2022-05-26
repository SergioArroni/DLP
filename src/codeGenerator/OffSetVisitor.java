package codeGenerator;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.statement.Statement;
import ast.type.complexTypes.FunctionType;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import semantic.VisitorAbs;

import java.util.*;

public class OffSetVisitor extends VisitorAbs<Void, Void> {
    private int globalVariablesOffset = 0;
    private int localVariablesOffset = 0;
    private int structsOffset = 0;
    private int parametersOffset = 4;

    //===============DEF===============

    @Override
    public Void visit(VarDefinition v, Void p) {
        super.visit(v, p);
        if (v.getScope() == 0) {
            v.setOffset(globalVariablesOffset);
            globalVariablesOffset += v.getType().getNumberOfBytes();
        } else {
            localVariablesOffset += v.getType().getNumberOfBytes();
            v.setOffset(-localVariablesOffset);
        }
        return null;
    }

    @Override
    public Void visit(FuncDefinition v, Void p) {
        v.getType().Accept(this,p);

        localVariablesOffset = 0;
        parametersOffset = 4;

        for(Statement s : v.getStatements())
            s.Accept(this, p);

        v.setLocalOffsetAux(-localVariablesOffset);

        return null;
    }

    //===============TYPE===============

    @Override
    public Void visit(FunctionType v, Void p) {
        super.visit(v, p);
        List<VarDefinition> param = new ArrayList<>(v.getParameters());
        Collections.reverse(param);
        for (VarDefinition ele : param) {
            ele.setOffset(parametersOffset);
            parametersOffset += ele.getType().getNumberOfBytes();
        }

        return null;
    }

    @Override
    public Void visit(Struct v, Void p) {
        structsOffset = 0;
        super.visit(v, p);

        return null;
    }

    @Override
    public Void visit(RecordField v, Void p) {
        super.visit(v, p);

        v.setOffset(structsOffset);
        structsOffset += v.getNumberOfBytes();

        return null;
    }

}

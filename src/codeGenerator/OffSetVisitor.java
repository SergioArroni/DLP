package codeGenerator;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.type.complexTypes.FunctionType;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import semantic.VisitorAbs;

import java.util.*;

public class OffSetVisitor extends VisitorAbs {
    private int globalVariablesOffset = 0;
    private int localVariablesOffset = 0;
    private int structsOffset = 0;
    private int parametersOffset = 4;

    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        super.visit(v, p);
        if (v.getScope() == 0) {
            v.setOffset(globalVariablesOffset);
            globalVariablesOffset += v.getType().getNumberOfBytes();
        } else {
            localVariablesOffset -= v.getType().getNumberOfBytes();
            v.setOffset(-localVariablesOffset);
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {

        localVariablesOffset = 0;
        parametersOffset = 4;

        super.visit(v, p);

        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionType v, TP p) {
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
    public <TR, TP> TR visit(Struct v, TP p) {
        structsOffset = 0;
        super.visit(v, p);

        return null;
    }

    @Override
    public <TR, TP> TR visit(RecordField v, TP p) {
        super.visit(v, p);

        v.setOffset(structsOffset);
        structsOffset += v.getNumberOfBytes();

        return null;
    }

}

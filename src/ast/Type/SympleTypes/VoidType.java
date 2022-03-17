package ast.Type.SympleTypes;

import ast.Type.TypeAbs;
import visitor.Visitor;

public class VoidType extends TypeAbs {

    private static VoidType instance;

    private VoidType(int colum, int line) {
        super(colum, line);

    }

    public static VoidType getInstance(int colum, int line) {
        if (instance == null) {
            instance = new VoidType(colum, line);
        }
        return instance;
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

package ast.type.sympleTypes;

import ast.type.TypeAbs;
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
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

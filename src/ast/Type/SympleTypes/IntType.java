package ast.Type.SympleTypes;

import ast.Type.TypeAbs;
import visitor.Visitor;

public class IntType extends TypeAbs {

    private static IntType instance;

    private IntType(int colum, int line) {
        super(colum, line);

    }

    public static IntType getInstance(int colum, int line) {
        if (instance == null) {
            instance = new IntType(colum, line);
        }
        return instance;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

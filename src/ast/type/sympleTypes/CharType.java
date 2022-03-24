package ast.type.sympleTypes;

import ast.type.TypeAbs;
import visitor.Visitor;

public class CharType extends TypeAbs {
    private static CharType instance;

    private CharType(int colum, int line) {
        super(colum, line);

    }

    public static CharType getInstance(int colum, int line) {
        if (instance == null) {
            instance = new CharType(colum, line);
        }
        return instance;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

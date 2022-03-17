package ast.Type.SympleTypes;

import ast.Type.TypeAbs;
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
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

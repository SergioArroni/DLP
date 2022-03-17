package ast.Type.SympleTypes;

import ast.Type.TypeAbs;
import visitor.Visitor;

public class DoubleType extends TypeAbs {
    private static DoubleType instance;

    private DoubleType(int colum, int line) {
        super(colum, line);

    }

    public static DoubleType getInstance(int colum, int line) {
        if (instance == null) {
            instance = new DoubleType(colum, line);
        }
        return instance;
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

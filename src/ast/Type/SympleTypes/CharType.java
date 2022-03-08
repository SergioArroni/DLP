package ast.Type.SympleTypes;

import ast.Type.TypeAbs;

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



}

package ast.Type.SympleTypes;

import ast.Type.TypeAbs;

public class IntType extends TypeAbs {

    private int number;

    public IntType(int colum, int line, int number) {
        super(colum, line);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Int{" +
                "number=" + number +
                '}';
    }
}

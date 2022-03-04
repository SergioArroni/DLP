package ast.Type.SympleTypes;

import ast.Type.TypeAbs;

public class Int extends TypeAbs {

    private int number;

    public Int(int colum, int line, int number) {
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

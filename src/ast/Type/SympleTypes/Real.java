package ast.Type.SympleTypes;

import ast.Type.TypeAbs;

public class Real extends TypeAbs {

    private double number;

    public Real(int colum, int line, double number) {
        super(colum, line);
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Real{" +
                "number=" + number +
                '}';
    }
}

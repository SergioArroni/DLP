package ast.Type.ComplexTypes;

import ast.Type.Type;
import ast.Type.TypeAbs;
import visitor.Visitor;

public class ArrayType extends TypeAbs {

    private int size;
    private Type of;

    public ArrayType(int colum, int line, int size, Type of) {
        super(colum, line);
        this.size = size;
        this.of = of;
    }

    public int getSize() {
        return size;
    }

    public Type getOf() {
        return of;
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "size=" + size +
                ", of=" + of +
                '}';
    }

    @Override
    public <TR, TP> TR Accept(Visitor v, TP p) {
        return null;
    }
}

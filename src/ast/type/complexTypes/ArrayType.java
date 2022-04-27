package ast.type.complexTypes;

import ast.AstNode;
import ast.type.Type;
import ast.type.TypeAbs;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.IntType;
import visitor.Visitor;

public class ArrayType extends TypeAbs {

    private int size;
    private Type of;

    public ArrayType(int colum, int line, int size, Type of) {
        super(colum, line);
        this.size = size;
        this.of = of;
        super.setNumberOfBytes(size * of.getNumberOfBytes());
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
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type squareBrackets(Type other, AstNode node) {
        if (other instanceof IntType || other instanceof ErrorType) {
            return of;
        }
        return super.squareBrackets(other,node);
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        if (other instanceof ErrorType)
            return other;
        else if (other instanceof ArrayType && other.equals(CharType.getInstance(other.getColumn(), other.getLine())) && of.equals(CharType.getInstance(other.getColumn(), other.getLine()))) {
            return of;
        }
        return super.promotesTo(other, node);
    }


}

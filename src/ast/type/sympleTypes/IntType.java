package ast.type.sympleTypes;

import ast.AstNode;
import ast.type.Type;
import ast.type.TypeAbs;
import ast.type.complexTypes.ErrorType;
import visitor.Visitor;

public class IntType extends TypeAbs {

    private static IntType instance;

    private IntType(int colum, int line) {
        super(colum, line);
        setLogical(false);
        super.setNumberOfBytes(2);
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

    @Override
    public Type aritmmetic(AstNode node) {
        return this;
    }

    @Override
    public Type comparision(Type other, AstNode node) {
        if (other.equals(IntType.getInstance(other.getColumn(), other.getLine()))) {
            return BooleanType.getInstance(getColumn(), getLine());
        } else if (other instanceof ErrorType) {
            return other;
        } else {
            return super.comparision(other, node);
        }
    }



    @Override
    public Type aritmmetic(Type other, AstNode node) {
        if (other.equals(IntType.getInstance(other.getColumn(), other.getLine())) || other instanceof ErrorType) {
            return other;
        } else {
            return super.aritmmetic(other, node);
        }
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        if (other instanceof ErrorType || other.equals(CharType.getInstance(other.getColumn(), other.getLine())) || other.equals(IntType.getInstance(other.getColumn(), other.getLine())) || other.equals(DoubleType.getInstance(other.getColumn(), other.getLine())))
            return other;
        else
            return super.promotesTo(other, node);
    }

    @Override
    public Type canBeCast(Type other, AstNode node) {
        if (other instanceof ErrorType || other.equals(IntType.getInstance(other.getColumn(), other.getLine())) || other.equals(DoubleType.getInstance(other.getColumn(), other.getLine())) || other.equals(CharType.getInstance(other.getColumn(), other.getLine())))
            return other;
        else
            return super.canBeCast(other, node);
    }

    @Override
    public char suffix() {
        return 'I';
    }

    @Override
    public String toString() {
        return "IntType{Line: " + this.getLine() + "\t Column: " + this.getColumn() + "\t}";
    }
}

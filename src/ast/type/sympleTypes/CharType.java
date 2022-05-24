package ast.type.sympleTypes;

import ast.AstNode;
import ast.type.Type;
import ast.type.TypeAbs;
import ast.type.complexTypes.ErrorType;
import visitor.Visitor;

public class CharType extends TypeAbs {
    private static CharType instance;

    private CharType(int colum, int line) {
        super(colum, line);
        super.setNumberOfBytes(1);
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

    @Override
    public Type aritmmetic(Type other, AstNode node) {

        if (other.equals(CharType.getInstance(other.getColumn(), other.getLine())) || other instanceof ErrorType) {
            return other;
        } else {
            return super.aritmmetic(other, node);
        }
    }

    @Override
    public Type aritmmetic(AstNode node) {
        return this;
    }

    @Override
    public Type comparision(Type other, AstNode node) {
        if (other.equals(CharType.getInstance(other.getColumn(), other.getLine())) || other instanceof ErrorType) {
            return IntType.getInstance(getColumn(),getLine());
        } else {
            return super.comparision(other, node);
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
        if (other instanceof ErrorType || other.equals(CharType.getInstance(other.getColumn(), other.getLine())) || other.equals(IntType.getInstance(other.getColumn(), other.getLine())) || other.equals(DoubleType.getInstance(other.getColumn(), other.getLine())))
            return other;
        else
            return super.canBeCast(other, node);
    }

    @Override
    public char suffix() {
        return 'B';
    }

    @Override
    public String toString() {
        return "CharType{Line: " + this.getLine() + "\t Column: " + this.getColumn() + "\t}";
    }

}

package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import ast.type.complexTypes.ErrorType;

import java.util.List;

public abstract class TypeAbs implements Type {

    private int colum;
    private int line;
    private boolean logical;
    private int numberOfBytes;

    public TypeAbs(int colum, int line) {
        this.colum = colum;
        this.line = line;
        this.logical = false;
    }

    @Override
    public int getColumn() {
        return colum;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public boolean isLogical() {
        return logical;
    }

    @Override
    public void setLogical(boolean logical) {
        this.logical = logical;
    }

    @Override
    public Type aritmmetic(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this arithmetic operation cannot be performed: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type aritmmetic(AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this arithmetic operation cannot be performed: { " + this.toString() + " }");
    }

    @Override
    public Type comparision(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this comparison operation cannot be performed: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type logical(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this logical operation cannot be performed: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type logical(AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this logical operation cannot be performed: { " + this.toString() + " }");
    }

    @Override
    public Type dot(AstNode node, String field) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this field access operation cannot be performed: { " + this.toString() + "\n" + field + " }");
    }

    @Override
    public Type squareBrackets(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this array access operation cannot be performed: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type canBeCast(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this cast operation cannot be performed: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this promotion operation is not possible: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type parenthesis(List<Expression> parameters, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, this function access operation cannot be performed: { " + this.toString() + " }");
    }

    @Override
    public int getNumberOfBytes() {
        return numberOfBytes;
    }

    @Override
    public void setNumberOfBytes(int numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    @Override
    public char suffix() {
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "TypeAbs{" +
                "colum=" + colum +
                ", line=" + line +
                '}';
    }
}

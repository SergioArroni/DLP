package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import ast.type.complexTypes.ErrorType;
import introspector.test.ast.ASTNode;

import java.util.List;

public abstract class TypeAbs implements Type {

    private int colum;
    private int line;
    private boolean logical;

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
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion aritmetica: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type aritmmetic(AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion aritmetica: { " + this.toString() + " }");
    }

    @Override
    public Type comparision(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de comparacion: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type logical(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion logica: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type logical(AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion logica: { " + this.toString() + " }");
    }

    @Override
    public Type dot(AstNode node, String field) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de acceso a campo: { " + this.toString() + "\n" + field + " }");
    }

    @Override
    public Type squareBrackets(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de acceso a un array: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type canBeCast(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de cast: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de promocion: { " + this.toString() + "\n" + other.toString() + " }");
    }

    @Override
    public Type parenthesis(List<Expression> parameters, AstNode node) {
        return new ErrorType(node.getColumn(), node.getLine(), "Error, no se puede realizar esa operacion de acceso a funcion : { " + this.toString() + " }");
    }

    @Override
    public String toString() {
        return "TypeAbs{" +
                "colum=" + colum +
                ", line=" + line +
                '}';
    }
}

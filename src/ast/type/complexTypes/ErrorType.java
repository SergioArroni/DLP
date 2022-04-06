package ast.type.complexTypes;

import ast.AstNode;
import ast.expression.Expression;
import ast.type.Type;
import errorhandler.ErrorHandler;
import ast.type.TypeAbs;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends TypeAbs {

    private String Message;

    public ErrorType(int colum, int line, String message) {
        super(colum, line);
        this.Message = message;
        ErrorHandler.getInstance().AddError(this);
    }

    public String getMessage() {
        return Message;
    }


    @Override
    public String toString() {
        return "ErrorType{" + "\n\tIn Line: " + this.getLine() + "; In Column: " + this.getColumn() +
                "\tMessage='" + getMessage() + '\'' +
                "\n\t\t  }";
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }


    @Override
    public Type aritmmetic(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type aritmmetic(AstNode node) {
        return this;
    }

    @Override
    public Type comparision(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type logical(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type logical(AstNode node) {
        return this;
    }

    @Override
    public Type dot(AstNode node, String field) {
        return this;
    }

    @Override
    public Type squareBrackets(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type canBeCast(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        return this;
    }

    @Override
    public Type parenthesis(List<Expression> parameters, AstNode node) {
        return this;
    }

}

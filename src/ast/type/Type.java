package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import ast.expression.operator.Aritmmetic;

import java.util.List;

public interface Type extends AstNode {
    public boolean isLogical();

    public void setLogical(boolean logical);

    public Type aritmmetic(Type other, AstNode node);

    public Type aritmmetic(AstNode node);

    public Type comparision(Type other, AstNode node);

    public Type logical(Type other, AstNode node);

    public Type logical(AstNode node);

    public Type dot(AstNode node, String field);

    public Type squareBrackets(Type other, AstNode node);

    public Type canBeCast(Type other, AstNode node);

    public Type promotesTo(Type other, AstNode node);

    public Type parenthesis(List<Expression> parameters, AstNode node);



}

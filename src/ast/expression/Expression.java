package ast.expression;

import ast.AstNode;

public interface Expression extends AstNode {
    public Boolean getLValue();

    public void setLValue(Boolean b);
}

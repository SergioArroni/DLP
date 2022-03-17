package ast.Expression;

import ast.AstNode;

public interface Expression extends AstNode {
    public Boolean getLValue();

    public void setLValue(Boolean b);
}

package ast.expression;

import ast.AstNode;
import ast.type.Type;

public interface Expression extends AstNode {
    public Boolean getLValue();

    public void setLValue(Boolean b);

    public Type getType();

    public void setType(Type type);
}

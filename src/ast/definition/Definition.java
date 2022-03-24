package ast.definition;

import ast.AstNode;
import ast.type.Type;

public interface Definition extends AstNode {

    public String getName();
    public Type getType();
    public int getScope();
    public void setScore(int scope);

}

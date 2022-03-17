package ast.Definition;

import ast.AstNode;
import ast.Type.Type;

public interface Definition extends AstNode {

    public String GetName();
    public Type GetType();

}

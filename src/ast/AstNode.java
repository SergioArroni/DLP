package ast;

import visitor.Visitor;

public interface AstNode {

    public int getLine();

    public int getColumn();

    public <TR, TP> TR Accept(Visitor v, TP p);

}

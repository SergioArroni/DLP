package ast;

import visitor.Visitor;

public interface AstNode {

    public int getLine();

    public int getColumn();

    public Object Accept(Visitor v, Object p);

}

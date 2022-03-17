package ast;

import ast.Definition.Definition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program implements AstNode {

    List<Definition> definitions = new ArrayList<>();

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitions=" + definitions +
                '}';
    }
}

package ast;

import ast.Definition.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program {

    List<Definition> definitions = new ArrayList<>();

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitions=" + definitions +
                '}';
    }
}

package ast.Definition;

import ast.Type.Type;

import java.util.List;

public abstract class DefinitionAbs implements Definition {

    private Type type;
    private String name;

    private int colum;
    private int line;

    public DefinitionAbs(int colum, int line, String name, Type type) {
        this.name = name;
        this.type = type;
        this.colum = colum;
        this.line = line;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public Type GetType() {
        return type;
    }

    @Override
    public int getColumn() {
        return colum;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "DefinitionAbs{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", colum=" + colum +
                ", line=" + line +
                '}';
    }
}

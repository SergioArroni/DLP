package ast.definition;

import ast.type.Type;

public abstract class DefinitionAbs implements Definition {

    private Type type;
    private String name;

    private int colum;
    private int line;
    private int scope;

    public DefinitionAbs(int colum, int line, String name, Type type) {
        this.name = name;
        this.type = type;
        this.colum = colum;
        this.line = line;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
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
    public int getScope() {
        return scope;
    }

    @Override
    public void setScore(int scope) {
        this.scope = scope;
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

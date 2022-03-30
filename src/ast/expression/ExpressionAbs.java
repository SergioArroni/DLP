package ast.expression;

import ast.type.Type;

public abstract class ExpressionAbs implements Expression {

    private int colum;
    private int line;
    private boolean LValue;
    private Type type;

    public ExpressionAbs(int colum, int line) {
        this.colum = colum;
        this.line = line;
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
    public Boolean getLValue() {
        return LValue;
    }

    @Override
    public void setLValue(Boolean b) {
        LValue = b;
    }


    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ExpressionAbs{" +
                "colum=" + colum +
                ", line=" + line +
                '}';
    }
}

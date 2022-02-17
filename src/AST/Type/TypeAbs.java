package AST.Type;

public abstract class TypeAbs implements Type {

    private int colum;
    private int line;

    public TypeAbs(int colum, int line) {
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
}

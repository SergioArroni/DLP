package ast.Statement;

public abstract class StatementAbs implements Statement {

    private int colum;
    private int line;

    public StatementAbs(int colum, int line) {
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
    public String toString() {
        return "StatementAbs{" +
                "colum=" + colum +
                ", line=" + line +
                '}';
    }
}

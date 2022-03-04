package ast.Expression;

public abstract class ExpressionAbs implements Expression {

    private int colum;
    private int line;

    public ExpressionAbs(int colum, int line){
    this.colum =  colum;
    this.line =  line;
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
        return "ExpressionAbs{" +
                "colum=" + colum +
                ", line=" + line +
                '}';
    }
}

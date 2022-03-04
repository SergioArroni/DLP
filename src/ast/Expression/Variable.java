package ast.Expression;

public class Variable extends ExpressionAbs {

    private String name;

    public Variable(int colum, int line, String name) {
        super(colum, line);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }
}

package ast.Expression;

import ast.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvoke extends ExpressionAbs implements Statement {

    private List<Expression> expressions;
    private Variable function;

    public FunctionInvoke(int colum, int line, List<Expression> expressions, Variable function) {
        super(colum, line);
        this.expressions = expressions;
        this.function = function;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getFunction() {
        return function;
    }

    @Override
    public String toString() {
        return "FunctionInvoke{" +
                "expressions=" + expressions +
                ", function=" + function +
                '}';
    }
}

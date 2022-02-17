package AST.Expression;

import AST.Statement.Statement;

import java.util.ArrayList;

public class FunctionInvoke extends ExpressionAbs implements Statement {

    private ArrayList<Expression> expressions;
    private Variable function;

    public FunctionInvoke(int colum, int line, ArrayList<Expression> expressions, Variable function) {
        super(colum, line);
        this.expressions = expressions;
        this.function = function;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public Variable getFunction() {
        return function;
    }
}

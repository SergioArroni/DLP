package ast.expression;

import ast.statement.Statement;
import visitor.Visitor;

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
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public String toString() {
        return "FunctionInvoke{" +
                "expressions=" + expressions +
                ", function=" + function +
                '}';
    }
}

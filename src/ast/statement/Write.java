package ast.statement;

import ast.expression.Expression;
import visitor.Visitor;

import java.util.List;

public class Write extends StatementAbs {

    private List<Expression> expression;

    public Write(int colum, int line, List<Expression> expression) {
        super(colum, line);
        this.expression = expression;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Write{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

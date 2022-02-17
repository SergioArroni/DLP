package AST.Expression.Operator;

import AST.Expression.BinaryExpression;
import AST.Expression.Expression;

public abstract class ExpressionOperatorAbs extends BinaryExpression {

    private String operator;

    public ExpressionOperatorAbs(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}

package ast.Expression.Operator;

import ast.Expression.BinaryExpression;
import ast.Expression.Expression;

public abstract class ExpressionOperatorAbs extends BinaryExpression {

    private String operator;

    public ExpressionOperatorAbs(int colum, int line, Expression left, Expression right, String operator) {
        super(colum, line, left, right);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "ExpressionOperatorAbs{" +
                "operator='" + operator + '\'' +
                '}';
    }
}

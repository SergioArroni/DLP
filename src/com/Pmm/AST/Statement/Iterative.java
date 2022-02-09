package com.Pmm.AST.Statement;

import com.Pmm.AST.Expression.Expression;

import java.util.ArrayList;

public class Iterative extends StatementAbs {

    private ArrayList<Statement> loopStatement;
    private Expression condition;

    public Iterative(int colum, int line, Expression condition, ArrayList<Statement> loopStatement) {
        super(colum, line);
        this.condition = condition;
        this.loopStatement = loopStatement;
    }

    public ArrayList<Statement> getLoopStatement() {
        return loopStatement;
    }

    public Expression getCondition() {
        return condition;
    }
}

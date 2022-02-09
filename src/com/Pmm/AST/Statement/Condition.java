package com.Pmm.AST.Statement;

import com.Pmm.AST.Expression.Expression;

import java.util.ArrayList;

public class Condition extends StatementAbs {

    private ArrayList<Statement> ifStatement;
    private ArrayList<Statement> elseStatement;
    private Expression condition;

    public Condition(int colum, int line, Expression condition, ArrayList<Statement> ifStatement, ArrayList<Statement> elseStatement) {
        super(colum, line);
        this.condition = condition;
        this.elseStatement = elseStatement;
        this.ifStatement = ifStatement;
    }

    public ArrayList<Statement> getIfStatement() {
        return ifStatement;
    }

    public ArrayList<Statement> getElseStatement() {
        return elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }
}

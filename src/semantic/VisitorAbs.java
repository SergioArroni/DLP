package semantic;

import ast.type.sympleTypes.VoidType;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.expression.literal.CharLiteral;
import ast.expression.literal.DoubleLiteral;
import ast.expression.literal.IntLiteral;
import ast.expression.operator.Aritmmetic;
import ast.expression.operator.Comparision;
import ast.expression.operator.Logic;
import ast.Program;
import ast.statement.*;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;
import visitor.Visitor;

public abstract class VisitorAbs implements Visitor {

    @Override
    public <TR, TP> TR visit(Program v, TP p) {
        for (Definition c : v.getDefinitions())
            c.Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        v.getType().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {
        for (Statement st : v.getStatements())
            st.Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(IntLiteral v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(CharLiteral v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(DoubleLiteral v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(RecordField v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionType v, TP p) {
        for (Definition st : v.getParameters())
            st.Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(DoubleType v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(CharType v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(VoidType v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(IntType v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(Struct v, TP p) {
        for (RecordField st : v.getFields())
            st.Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(ArrayType v, TP p) {
        return null;
    }

    @Override
    public <TR, TP> TR visit(Aritmmetic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Comparision v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Logic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Negative v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(UnaryMinus v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Cast v, TP p) {
        v.getCastType().Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        for (Expression st : v.getExpressions())
            st.Accept(this, p);
        v.getFunction().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Return v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Assigmment v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Condition v, TP p) {
        v.getCondition().Accept(this, p);
        for (Statement st : v.getIfStatement())
            st.Accept(this, p);
        for (Statement st : v.getElseStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Write v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Read v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Iterative v, TP p) {
        for (Statement st : v.getLoopStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public <TR, TP> TR visit(ErrorType v, TP p) {
        return null;
    }
}

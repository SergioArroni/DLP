package semantic;

import ast.expression.literal.BooleanLiteral;
import ast.type.Type;
import ast.type.sympleTypes.*;
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
import visitor.Visitor;

public abstract class VisitorAbs<TR, TP> implements Visitor<TR, TP> {

    //===============PROGRAM===============

    @Override
    public TR visit(Program v, TP p) {
        for (Definition c : v.getDefinitions())
            c.Accept(this, p);
        return null;
    }

    //===============DEF===============

    @Override
    public TR visit(VarDefinition v, TP p) {
        v.getType().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FuncDefinition v, TP p) {
        v.getType().Accept(this, p);

        for (Statement st : v.getStatements())
            st.Accept(this, p);
        return null;
    }

    //===============TYPE===============

    @Override
    public TR visit(FunctionType v, TP p) {
        for (Definition st : v.getParameters())
            st.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(DoubleType v, TP p) {
        return null;
    }

    @Override
    public TR visit(CharType v, TP p) {
        return null;
    }

    @Override
    public TR visit(VoidType v, TP p) {
        return null;
    }

    @Override
    public TR visit(IntType v, TP p) {
        return null;
    }

    @Override
    public TR visit(Struct v, TP p) {
        for (RecordField st : v.getFields())
            st.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(ArrayType v, TP p) {
        return null;
    }

    @Override
    public TR visit(ErrorType v, TP p) {
        return null;
    }

    @Override
    public TR visit(BooleanType v, TP p) {
        return null;
    }

    //===============EXPRESSIONS===============

    @Override
    public TR visit(Variable v, TP p) {
        return null;
    }

    @Override
    public TR visit(IntLiteral v, TP p) {
        return null;
    }

    @Override
    public TR visit(CharLiteral v, TP p) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral v, TP p) {
        return null;
    }

    @Override
    public TR visit(BooleanLiteral v, TP p) {
        return null;
    }

    @Override
    public TR visit(RecordField v, TP p) {
        v.getTypeField().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Aritmmetic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Comparision v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Logic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Negative v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(ArrayAccess v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Cast v, TP p) {
        v.getCastType().Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FieldAcess v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    //===============STATEMENTS===============

    @Override
    public TR visit(FunctionInvoke v, TP p) {
        for (Expression st : v.getExpressions())
            st.Accept(this, p);
        v.getFunction().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Return v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Assigmment v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Condition v, TP p) {
        v.getCondition().Accept(this, p);
        for (Statement st : v.getIfStatement())
            st.Accept(this, p);
        for (Statement st : v.getElseStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Write v, TP p) {
        for (Expression e : v.getExpression()) {
            e.Accept(this, p);
        }
        return null;
    }

    @Override
    public TR visit(Read v, TP p) {
        for (Expression e : v.getExpression()) {
            e.Accept(this, p);
        }
        return null;
    }

    @Override
    public TR visit(Iterative v, TP p) {
        for (Statement st : v.getLoopStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

}

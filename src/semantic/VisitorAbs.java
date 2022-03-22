package semantic;

import ast.Definition.Definition;
import ast.Definition.FuncDefinition;
import ast.Definition.VarDefinition;
import ast.Expression.*;
import ast.Expression.Literal.CharLiteral;
import ast.Expression.Literal.DoubleLiteral;
import ast.Expression.Literal.IntLiteral;
import ast.Expression.Operator.Aritmmetic;
import ast.Expression.Operator.Comparision;
import ast.Expression.Operator.Logic;
import ast.Program;
import ast.Statement.*;
import ast.Type.ComplexTypes.*;
import ast.Type.SympleTypes.CharType;
import ast.Type.SympleTypes.DoubleType;
import ast.Type.SympleTypes.IntType;
import ast.Type.SympleTypes.VoidType;
import visitor.Visitor;

public abstract class VisitorAbs implements Visitor {

    @Override
    public Object visit(Program v, Object p) {
        for (Definition c : v.getDefinitions())
            c.Accept(this, p);
        return null;
    }

    @Override
    public Object visit(VarDefinition v, Object p) {
        v.GetType().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(FuncDefinition v, Object p) {
        for(Statement st : v.getStatements())
            st.Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Variable v, Object p) {
        return null;
    }

    @Override
    public Object visit(IntLiteral v, Object p) {
        return null;
    }

    @Override
    public Object visit(CharLiteral v, Object p) {
        return null;
    }

    @Override
    public Object visit(DoubleLiteral v, Object p) {
        return null;
    }

    @Override
    public Object visit(RecordField v, Object p) {
        return null;
    }

    @Override
    public Object visit(FunctionType v, Object p) {
        for (Definition st : v.getParameters())
            st.Accept(this, p);
        return null;
    }

    @Override
    public Object visit(DoubleType v, Object p) {
        return null;
    }

    @Override
    public Object visit(CharType v, Object p) {
        return null;
    }

    @Override
    public Object visit(VoidType v, Object p) {
        return null;
    }

    @Override
    public Object visit(IntType v, Object p) {
        return null;
    }

    @Override
    public Object visit(Struct v, Object p) {
        for (RecordField st : v.getFields())
            st.Accept(this, p);
        return null;
    }

    @Override
    public Object visit(ArrayType v, Object p) {
        return null;
    }

    @Override
    public Object visit(Aritmmetic v, Object p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Comparision v, Object p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Logic v, Object p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Negative v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(UnaryMinus v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(ArrayAccess v, Object p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Cast v, Object p) {
        v.getCastType().Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(FieldAcess v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(FunctionInvoke v, Object p) {
        for (Expression st : v.getExpressions())
            st.Accept(this, p);
        v.getFunction().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Return v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Assigmment v, Object p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Condition v, Object p) {
        for (Statement st : v.getIfStatement())
            st.Accept(this, p);
        for (Statement st : v.getElseStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Write v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Read v, Object p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(Iterative v, Object p) {
        for (Statement st : v.getLoopStatement())
            st.Accept(this, p);
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public Object visit(ErrorType v, Object p) {
        return null;
    }
}

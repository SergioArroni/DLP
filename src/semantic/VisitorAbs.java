package semantic;

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
import ast.Type.ComplexTypes.ArrayType;
import ast.Type.ComplexTypes.FunctionType;
import ast.Type.ComplexTypes.RecordField;
import ast.Type.ComplexTypes.Struct;
import ast.Type.SympleTypes.CharType;
import ast.Type.SympleTypes.DoubleType;
import ast.Type.SympleTypes.IntType;
import ast.Type.SympleTypes.VoidType;
import visitor.Visitor;

public abstract class VisitorAbs<TP, TR> implements Visitor {

    @Override
    public TR visit(Program v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(VarDefinition v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FuncDefinition v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Variable v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(IntLiteral v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(CharLiteral v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(RecordField v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FunctionType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(DoubleType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(CharType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(VoidType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(IntType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Struct v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(ArrayType v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Aritmmetic v, TP p) {
        v.Accept(this, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Comparision v, TP p) {
        v.Accept(this, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Logic v, TP p) {
        v.Accept(this, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Negative v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(ArrayAccess v, TP p) {
        v.Accept(this, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Cast v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FieldAcess v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(FunctionInvoke v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Return v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Assigmment v, TP p) {
        v.Accept(this, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Condition v, TP p) {
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Write v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Read v, TP p) {
        v.Accept(this, p);
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Iterative v, TP p) {
        v.Accept(this, p);
        return null;
    }

}

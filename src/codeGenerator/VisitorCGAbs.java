package codeGenerator;

import ast.Program;
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
import ast.statement.*;
import ast.type.Type;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;
import ast.type.sympleTypes.VoidType;
import visitor.Visitor;

public abstract class VisitorCGAbs<TR, TP> implements Visitor<TR, TP> {

    @Override
    public TR visit(Program v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VarDefinition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FuncDefinition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Variable v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IntLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(CharLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(DoubleLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(RecordField v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(DoubleType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(CharType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VoidType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IntType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Struct v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Aritmmetic v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Comparision v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Logic v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Negative v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(UnaryMinus v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayAccess v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Cast v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FieldAcess v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionInvoke v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Return v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Assigmment v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Condition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Write v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Read v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Iterative v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ErrorType v, TP p) {
        throw new IllegalStateException();
    }
}

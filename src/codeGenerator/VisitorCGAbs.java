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

public abstract class VisitorCGAbs implements Visitor {

    @Override
    public <TR, TP> TR visit(Program v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(IntLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(CharLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(DoubleLiteral v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(RecordField v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(FunctionType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(DoubleType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(CharType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(VoidType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(IntType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Struct v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(ArrayType v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Aritmmetic v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Comparision v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Logic v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Negative v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(UnaryMinus v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Cast v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Return v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Assigmment v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Condition v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Write v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Read v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(Iterative v, TP p) {
        throw new IllegalStateException();
    }

    @Override
    public <TR, TP> TR visit(ErrorType v, TP p) {
        throw new IllegalStateException();
    }
}

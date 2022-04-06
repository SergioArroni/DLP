package visitor;

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
import ast.type.Type;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;
import ast.type.sympleTypes.VoidType;

public interface Visitor {

    public <TR, TP> TR visit(Program v, TP p);

    public <TR, TP> TR visit(VarDefinition v, TP p);

    public <TR, TP> TR visit(FuncDefinition v, TP p);

    public <TR, TP> TR visit(Variable v, TP p);

    public <TR, TP> TR visit(IntLiteral v, TP p);

    public <TR, TP> TR visit(CharLiteral v, TP p);

    public <TR, TP> TR visit(DoubleLiteral v, TP p);

    public <TR, TP> TR visit(RecordField v, TP p);

    public <TR, TP> TR visit(FunctionType v, TP p);

    public <TR, TP> TR visit(DoubleType v, TP p);

    public <TR, TP> TR visit(CharType v, TP p);

    public <TR, TP> TR visit(VoidType v, TP p);

    public <TR, TP> TR visit(IntType v, TP p);

    public <TR, TP> TR visit(Struct v, TP p);

    public <TR, TP> TR visit(ArrayType v, TP p);

    public <TR, TP> TR visit(Aritmmetic v, TP p);

    public <TR, TP> TR visit(Comparision v, TP p);

    public <TR, TP> TR visit(Logic v, TP p);

    public <TR, TP> TR visit(Negative v, TP p);

    public <TR, TP> TR visit(UnaryMinus v, TP p);

    public <TR, TP> TR visit(ArrayAccess v, TP p);

    public <TR, TP> TR visit(Cast v, TP p);

    public <TR, TP> TR visit(FieldAcess v, TP p);

    public <TR, TP> TR visit(FunctionInvoke v, TP p);

    public Void visit(Return v, Type p);

    public <TR, TP> TR visit(Assigmment v, TP p);

    public <TR, TP> TR visit(Condition v, TP p);

    public <TR, TP> TR visit(Write v, TP p);

    public <TR, TP> TR visit(Read v, TP p);

    public <TR, TP> TR visit(Iterative v, TP p);

    public <TR, TP> TR visit(ErrorType v, TP p);

}

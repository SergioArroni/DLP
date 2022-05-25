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
import ast.type.complexTypes.*;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;
import ast.type.sympleTypes.VoidType;

public interface Visitor<TR, TP> {

    public TR visit(Program v, TP p);

    public TR visit(VarDefinition v, TP p);

    public TR visit(FuncDefinition v, TP p);

    public TR visit(Variable v, TP p);

    public TR visit(IntLiteral v, TP p);

    public TR visit(CharLiteral v, TP p);

    public TR visit(DoubleLiteral v, TP p);

    public TR visit(RecordField v, TP p);

    public TR visit(FunctionType v, TP p);

    public TR visit(DoubleType v, TP p);

    public TR visit(CharType v, TP p);

    public TR visit(VoidType v, TP p);

    public TR visit(IntType v, TP p);

    public TR visit(Struct v, TP p);

    public TR visit(ArrayType v, TP p);

    public TR visit(Aritmmetic v, TP p);

    public TR visit(Comparision v, TP p);

    public TR visit(Logic v, TP p);

    public TR visit(Negative v, TP p);

    public TR visit(UnaryMinus v, TP p);

    public TR visit(ArrayAccess v, TP p);

    public TR visit(Cast v, TP p);

    public TR visit(FieldAcess v, TP p);

    public TR visit(FunctionInvoke v, TP p);

    public TR visit(Return v, TP p);

    public TR visit(Assigmment v, TP p);

    public TR visit(Condition v, TP p);

    public TR visit(Write v, TP p);

    public TR visit(Read v, TP p);

    public TR visit(Iterative v, TP p);

    public TR visit(ErrorType v, TP p);

    public TR visit(Case v, TP p);

    public TR visit(Switch v, TP p);

    /**
    public TR visit(Ternaria v, TP p);
     */

}

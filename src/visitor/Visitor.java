package visitor;

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

public interface Visitor<TP, TR> {

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

}

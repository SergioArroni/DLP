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
import ast.Type.ComplexTypes.*;
import ast.Type.SympleTypes.CharType;
import ast.Type.SympleTypes.DoubleType;
import ast.Type.SympleTypes.IntType;
import ast.Type.SympleTypes.VoidType;

public interface Visitor {

    public Object visit(Program v, Object p);

    public Object visit(VarDefinition v, Object p);

    public Object visit(FuncDefinition v, Object p);

    public Object visit(Variable v, Object p);

    public Object visit(IntLiteral v, Object p);

    public Object visit(CharLiteral v, Object p);

    public Object visit(DoubleLiteral v, Object p);

    public Object visit(RecordField v, Object p);

    public Object visit(FunctionType v, Object p);

    public Object visit(DoubleType v, Object p);

    public Object visit(CharType v, Object p);

    public Object visit(VoidType v, Object p);

    public Object visit(IntType v, Object p);

    public Object visit(Struct v, Object p);

    public Object visit(ArrayType v, Object p);

    public Object visit(Aritmmetic v, Object p);

    public Object visit(Comparision v, Object p);

    public Object visit(Logic v, Object p);

    public Object visit(Negative v, Object p);

    public Object visit(UnaryMinus v, Object p);

    public Object visit(ArrayAccess v, Object p);

    public Object visit(Cast v, Object p);

    public Object visit(FieldAcess v, Object p);

    public Object visit(FunctionInvoke v, Object p);

    public Object visit(Return v, Object p);

    public Object visit(Assigmment v, Object p);

    public Object visit(Condition v, Object p);

    public Object visit(Write v, Object p);

    public Object visit(Read v, Object p);

    public Object visit(Iterative v, Object p);

    public Object visit(ErrorType v, Object p);

}

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
import ast.Type.ComplexTypes.*;

public class TypeChekingVisitor<TP, TR> extends VisitorAbs {

    @Override
    public TR visit(Program v, TP p) {
        return null;
    }

    @Override
    public TR visit(VarDefinition v, TP p) {
        return null;
    }

    @Override
    public TR visit(FuncDefinition v, TP p) {
        return null;
    }

    @Override
    public TR visit(Variable v, TP p) {
        v.setLValue(true);
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(IntLiteral v, TP p) {
        v.setLValue(false);
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(CharLiteral v, TP p) {
        v.setLValue(false);
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral v, TP p) {
        v.setLValue(false);
        v.Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Aritmmetic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Comparision v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Logic v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Negative v, TP p) {
        v.getExpression().Accept(this,p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(UnaryMinus v, TP p) {
        v.getExpression().Accept(this,p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(ArrayAccess v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public TR visit(Cast v, TP p) {
        v.getExpression().Accept(this, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public TR visit(FieldAcess v, TP p) {
        v.getExpression().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public TR visit(FunctionInvoke v, TP p) {
        for (Expression ex:v.getExpressions()) {
            ex.Accept(this,p);
            if ((!ex.getLValue())){
                new ErrorType(ex.getColumn(), ex.getLine(), "Error  en la parte izquierda de la invocacion de la funcion");
            }
        }
        v.setLValue(false);
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
        if (!v.getLeft().getLValue()) {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error  en la parte izquierda de la asignacion, no es asignale");
        }
        return null;
    }

    @Override
    public TR visit(Condition v, TP p) {
        v.getCondition().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Write v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Read v, TP p) {
        v.getExpression().Accept(this, p);
        return null;
    }

    @Override
    public TR visit(Iterative v, TP p) {
        v.getCondition().Accept(this, p);
        return null;
    }
}

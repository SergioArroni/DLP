package semantic;

import ast.expression.*;
import ast.expression.literal.CharLiteral;
import ast.expression.literal.DoubleLiteral;
import ast.expression.literal.IntLiteral;
import ast.expression.operator.Aritmmetic;
import ast.expression.operator.Comparision;
import ast.expression.operator.Logic;
import ast.statement.*;
import ast.type.complexTypes.*;

public class TypeCheckingVisitor extends VisitorAbs {

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(IntLiteral v, TP p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(CharLiteral v, TP p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(DoubleLiteral v, TP p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Aritmmetic v, TP p) {
        super.visit(v, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Comparision v, TP p) {
        super.visit(v, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Logic v, TP p) {
        super.visit(v, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Negative v, TP p) {
        super.visit(v, p);
        v.getExpression().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(UnaryMinus v, TP p) {
        v.getExpression().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        super.visit(v, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Cast v, TP p) {
        super.visit(v, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        super.visit(v, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        super.visit(v, p);
        for (Expression ex : v.getExpressions()) {
            if ((!ex.getLValue())) {
                new ErrorType(ex.getColumn(), ex.getLine(), "Error  en la parte izquierda de la invocacion de la funcion: no puede tener esas expresiones {" + ex + "}");
            }
        }
        v.setLValue(true);
        return null;
    }


    @Override
    public <TR, TP> TR visit(Assigmment v, TP p) {
        super.visit(v, p);
        if (!v.getLeft().getLValue()) {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error en la parte izquierda, de la asignacion:{" + v.getLeft() + "} no es asignable");
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(Read v, TP p) {
        super.visit(v, p);
        if (!v.getExpression().getLValue())
            new ErrorType(v.getLine(), v.getColumn(), "Error en la parte izquierda, esa expresion read: no puede tener esas expresiones{" + v.getExpression() + "}");
        return null;
    }

    @Override
    public <TR, TP> TR visit(Write v, TP p) {
        super.visit(v, p);
        if (!v.getExpression().getLValue())
            new ErrorType(v.getLine(), v.getColumn(), "Error en la parte izquierda, esa expresion write: no puede tener esas expresiones{" + v.getExpression() + "}");
        return null;
    }
}

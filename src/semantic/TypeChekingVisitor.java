package semantic;
import ast.Expression.*;
import ast.Expression.Literal.CharLiteral;
import ast.Expression.Literal.DoubleLiteral;
import ast.Expression.Literal.IntLiteral;
import ast.Expression.Operator.Aritmmetic;
import ast.Expression.Operator.Comparision;
import ast.Expression.Operator.Logic;
import ast.Statement.*;
import ast.Type.ComplexTypes.*;

public class TypeChekingVisitor extends VisitorAbs {

    @Override
    public Object visit(Variable v, Object p) {
        v.setLValue(true);
        return null;
    }

    @Override
    public Object visit(IntLiteral v, Object p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(CharLiteral v, Object p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral v, Object p) {
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Aritmmetic v, Object p) {
        super.visit(v,p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Comparision v, Object p) {
        super.visit(v,p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Logic v, Object p) {
        super.visit(v,p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Negative v, Object p) {
        super.visit(v,p);
        v.getExpression().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(UnaryMinus v, Object p) {
        v.getExpression().Accept(this, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(ArrayAccess v, Object p) {
        super.visit(v,p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Cast v, Object p) {
        super.visit(v, p);
        v.setLValue(true);
        return null;
    }

    @Override
    public Object visit(FieldAcess v, Object p) {
        super.visit(v, p);
        v.setLValue(false);
        return null;
    }

    @Override
    public Object visit(FunctionInvoke v, Object p) {
        super.visit(v, p);
        for (Expression ex : v.getExpressions()) {
            if ((!ex.getLValue())) {
                new ErrorType(ex.getColumn(), ex.getLine(), "Error  en la parte izquierda de la invocacion de la funcion: no puede tener esas expresiones {"+ex+"}");
            }
        }
        v.setLValue(true);
        return null;
    }


    @Override
    public Object visit(Assigmment v, Object p) {
        super.visit(v, p);
        if (!v.getLeft().getLValue()) {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error en la parte izquierda, de la asignacion:{"+v.getLeft()+"} no es asignable");
        }
        return null;
    }

    @Override
    public Object visit(Read v, Object p) {
        super.visit(v,p);
            if (!v.getExpression().getLValue())
                new ErrorType(v.getLine(),v.getColumn(),"Error en la parte izquierda, esa expresion read: no puede tener esas expresiones{"+v.getExpression()+"}");
        return null;
    }

    @Override
    public Object visit(Write v, Object p) {
        super.visit(v,p);
        if (!v.getExpression().getLValue())
            new ErrorType(v.getLine(),v.getColumn(),"Error en la parte izquierda, esa expresion write: no puede tener esas expresiones{"+v.getExpression()+"}");
        return null;
    }
}

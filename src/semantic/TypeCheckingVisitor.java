package semantic;

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

public class TypeCheckingVisitor extends VisitorAbs {

    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        v.setLValue(true);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public <TR, TP> TR visit(IntLiteral v, TP p) {
        v.setLValue(false);
        v.setType(IntType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public <TR, TP> TR visit(CharLiteral v, TP p) {
        v.setLValue(false);
        v.setType(CharType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public <TR, TP> TR visit(DoubleLiteral v, TP p) {
        v.setLValue(false);
        v.setType(DoubleType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public <TR, TP> TR visit(Aritmmetic v, TP p) {
        super.visit(v, p);
        v.setType(v.getLeft().getType().aritmmetic(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Comparision v, TP p) {
        super.visit(v, p);
        v.setType(v.getLeft().getType().comparision(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }


    @Override
    public <TR, TP> TR visit(Condition v, TP p) {
        v.getCondition().Accept(this, p);

        if (!v.getCondition().getType().isLogical()) {
            new ErrorType(v.getCondition().getColumn(), v.getCondition().getLine(), "Error, that conditional expression: { " + v.getCondition() + " } is not logical");
        }
        for (Statement st : v.getIfStatement())
            st.Accept(this, p);
        for (Statement st : v.getElseStatement())
            st.Accept(this, p);

        return null;
    }

    @Override
    public <TR, TP> TR visit(Iterative v, TP p) {
        v.getCondition().Accept(this, p);

        if (!v.getCondition().getType().isLogical()) {
            new ErrorType(v.getCondition().getColumn(), v.getCondition().getLine(), "Error, that conditional expression: { " + v.getCondition() + " } is not logical");
        }

        for (Statement st : v.getLoopStatement())
            st.Accept(this, p);

        return null;
    }

    @Override
    public <TR, TP> TR visit(Logic v, TP p) {
        super.visit(v, p);
        v.setType(v.getLeft().getType().logical(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Negative v, TP p) {
        super.visit(v, p);
        v.getExpression().Accept(this, p);
        v.setType(v.getExpression().getType().logical(v));
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(UnaryMinus v, TP p) {
        v.getExpression().Accept(this, p);
        v.setType(v.getType().aritmmetic(v));
        v.setLValue(false);
        return null;
    }

    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        super.visit(v, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setType(v.getLeft().getType().squareBrackets(v.getRight().getType(), v));
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Cast v, TP p) {
        super.visit(v, p);
        v.setType(v.getType().canBeCast(v.getCastType(), v));
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        super.visit(v, p);
        v.setType(v.getExpression().getType().dot(v.getExpression(), v.getName()));
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Return v, TP p) {
        super.visit(v, p);
        //var returnType = v.getExpression().getType().promotesTo(v.getExpression().getType(), v);
        //if (p instanceof VoidType) {
         //   v.getExpression().setType(new ErrorType(v.getColumn(), v.getLine(), "The return type of this function is Void. It shouldn't have a return statement"));
       // }
        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        super.visit(v, p);
        for (Expression ex : v.getExpressions()) {
            if ((!ex.getLValue())) {
                new ErrorType(ex.getColumn(), ex.getLine(), "Error, the invocation function: on the left side cannot have these expressions {" + ex + "}");
            }
        }
        v.setType(v.getFunction().getDefinition().getType().parenthesis(v.getExpressions(), v));
        v.setLValue(true);
        return null;
    }

    @Override
    public <TR, TP> TR visit(Assigmment v, TP p) {
        super.visit(v, p);
        if (!v.getLeft().getLValue()) {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error, the assignment expression: the left part  {" + v.getLeft() + "} is not assignable");
        }

        if (v.getLeft().getType() != v.getRight().getType()) {
            v.getRight().getType().promotesTo(v.getLeft().getType(), v.getRight());
        }


        return null;
    }

    @Override
    public <TR, TP> TR visit(Read v, TP p) {
        super.visit(v, p);
        if (!v.getExpression().getLValue())
            new ErrorType(v.getColumn(), v.getLine(), "Error, the expression input: cannot have these expressions {" + v.getExpression() + "}");
        return null;
    }

}

package semantic;

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

public class TypeCheckingVisitor extends VisitorAbs<Void, Type> {

    @Override
    public Void visit(Variable v, Type p) {
        v.setLValue(true);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral v, Type p) {
        v.setLValue(false);
        v.setType(IntType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public Void visit(CharLiteral v, Type p) {
        v.setLValue(false);
        v.setType(CharType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral v, Type p) {
        v.setLValue(false);
        v.setType(DoubleType.getInstance(v.getColumn(), v.getLine()));
        return null;
    }

    @Override
    public Void visit(Aritmmetic v, Type p) {
        super.visit(v, p);
        v.setType(v.getLeft().getType().aritmmetic(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparision v, Type p) {
        super.visit(v, p);

        v.setType(v.getLeft().getType().comparision(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Condition v, Type p) {
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
    public Void visit(Iterative v, Type p) {
        v.getCondition().Accept(this, p);

        if (!v.getCondition().getType().isLogical()) {
            new ErrorType(v.getCondition().getColumn(), v.getCondition().getLine(), "Error, that conditional expression: { " + v.getCondition() + " } is not logical");
        }

        for (Statement st : v.getLoopStatement())
            st.Accept(this, p);

        return null;
    }

    @Override
    public Void visit(Logic v, Type p) {
        super.visit(v, p);

        v.setType(v.getLeft().getType().logical(v.getRight().getType(), v.getLeft()));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Negative v, Type p) {
        super.visit(v, p);

        v.getExpression().Accept(this, p);
        v.setType(v.getExpression().getType().logical(v));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus v, Type p) {
        v.getExpression().Accept(this, p);
        v.setType(v.getExpression().getType().aritmmetic(v));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess v, Type p) {
        super.visit(v, p);
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);
        v.setType(v.getLeft().getType().squareBrackets(v.getRight().getType(), v));
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast v, Type p) {
        super.visit(v, p);
        v.setType(v.getExpression().getType().canBeCast(v.getCastType(), v));
        v.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAcess v, Type p) {
        super.visit(v, p);
        v.setType(v.getExpression().getType().dot(v.getExpression(), v.getName()));
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Return v, Type p) {
        super.visit(v, p);

        v.getExpression().setType(v.getExpression().getType().promotesTo(p, v.getExpression()));

        return null;
    }

    @Override
    public Void visit(FunctionInvoke v, Type p) {
        super.visit(v, p);
        v.setType(v.getFunction().getDefinition().getType().parenthesis(v.getExpressions(), v.getFunction()));
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(FuncDefinition v, Type p) {
        v.getType().Accept(this, p);
        for (Statement st : v.getStatements())
            st.Accept(this, ((FunctionType) v.getType()).getTypeReturn());

        return null;
    }

    @Override
    public Void visit(Assigmment v, Type p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this, p);

        if (!v.getLeft().getLValue()) {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error, the assignment expression: the left part  {" + v.getLeft() + "} is not assignable");
        }

        if (v.getLeft().getType() != v.getRight().getType()) {
            v.getRight().getType().promotesTo(v.getLeft().getType(), v.getRight());
        }
        return null;
    }

    @Override
    public Void visit(VarDefinition v, Type p) {
        if (v.getExpr() != null) {
            v.getExpr().Accept(this, p);

            if (!(v.getType() instanceof CharType || v.getType() instanceof DoubleType || v.getType() instanceof IntType)) {
                new ErrorType(v.getColumn(), v.getLine(), "Error, the assignment expression: the left part  {" + v + "} is not assignable");
            }

            if (v.getType() != v.getExpr().getType()) {
                v.getExpr().getType().promotesTo(v.getType(), v.getExpr());
            }
        }

        return null;
    }

    @Override
    public Void visit(Read v, Type p) {
        for (Expression e : v.getExpression()) {
            e.Accept(this, p);
            if (!e.getLValue())
                new ErrorType(v.getColumn(), v.getLine(), "Error, the expression input: cannot have these expressions {" + v.getExpression() + "}");
        }
        return null;
    }

    @Override
    public Void visit(Write v, Type p) {
        for (Expression e : v.getExpression()) {
            e.Accept(this, p);
            if (e.getType() instanceof ArrayType) {
                if (!(((ArrayType) e.getType()).getOf() instanceof CharType)) {
                    new ErrorType(v.getColumn(), v.getLine(), "Error, the expression input: cannot have these expressions {" + v.getExpression() + "}");
                }
            }
        }
        return null;
    }

    /**
     @Override public Void visit(Ternaria v, Type p) {
     super.visit(v, p);
     if (!v.getCondition().getType().isLogical()) {
     new ErrorType(v.getColumn(), v.getLine(), "Error, the expression ternaria: cannot have these expression {" + v.getCondition() + "}");
     }
     v.setType(v.getExprIf().getType());
     return null;
     }
     */
}

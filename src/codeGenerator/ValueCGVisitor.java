package codeGenerator;

import ast.expression.*;
import ast.expression.literal.CharLiteral;
import ast.expression.literal.DoubleLiteral;
import ast.expression.literal.IntLiteral;
import ast.expression.operator.Aritmmetic;
import ast.expression.operator.Comparision;
import ast.expression.operator.Logic;
import ast.type.complexTypes.ArrayType;
import ast.type.complexTypes.ErrorType;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;

public class ValueCGVisitor extends VisitorCGAbs<Void, Void> {

    private CodeGenerator cg;
    private AddressCGVisitor addrVisitor;

    public ValueCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        this.addrVisitor = new AddressCGVisitor(cg, this);
    }

    /**
     * Value[[Variable: Expression -> ID]]()=
     *      address[[expression]]
     *      <LOAD>expression.type.suffixe
     */
    @Override
    public Void visit(Variable v, Void p) {
        v.Accept(this.addrVisitor,p);
        cg.load(v.getType());
        return null;
    }

    /**
     * Value[[Aritmmetic: Expression -> left right operator]]()=
     *  Value[[left]]
     *  Value[[right]]
     *
     *  if(operator.equals("+"))
     *      <ADD> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("-"))
     *      <SUB> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("/"))
     *      <DIV> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("*"))
     *      <MUL> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("%"))
     *      <MOD>
     */
    @Override
    public Void visit(Aritmmetic v, Void p) {
        castChar(v.getLeft(), v.getColumn(), v.getLine(), v.getRight());

        if(v.getOperator().equals("+"))
           cg.add(v.getType());
        else if(v.getOperator().equals("-"))
            cg.sub(v.getType());
        else if(v.getOperator().equals("/"))
            cg.div(v.getType());
        else if(v.getOperator().equals("*"))
            cg.mul(v.getType());
        else if(v.getOperator().equals("%"))
            cg.mod();
        return null;
    }


    /**
     * Value[[Comparision: Expression -> left right operator]]()=
     *  Value[[left]]
     *  Value[[right]]
     *
     *  if(operator.equals("<"))
     *      <ADD> aritmmetic.getType().getsuffix()
     *  else if(operator.equals(">"))
     *      <SUB> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("<="))
     *      <DIV> aritmmetic.getType().getsuffix()
     *  else if(operator.equals(">="))
     *      <MUL> aritmmetic.getType().getsuffix()
     *  else if(operator.equals("=="))
     *      <MUL> aritmmetic.getType().getsuffix()
     */
    @Override
    public Void visit(Comparision v, Void p) {
        castChar(v.getLeft(), v.getColumn(), v.getLine(), v.getRight());


        if (v.getOperator().equals("<"))
            cg.lt(v.getType());
        else if (v.getOperator().equals(">"))
            cg.gt(v.getType());
        else if (v.getOperator().equals("<="))
            cg.le(v.getType());
        else if (v.getOperator().equals(">="))
            cg.ge(v.getType());
        else if (v.getOperator().equals("=="))
            cg.eq(v.getType());
        else if (v.getOperator().equals("!="))
            cg.ne(v.getType());
        return null;
    }

    /**
     * Value[[Logic: Expression -> left right operator]]()=
     *  Value[[left]]
     *  Value[[right]]
     *  if(operator.equals("&&"))
     *      <AND>
     *  else if(operator.equals("||"))
     *      <OR>
     */
    @Override
    public Void visit(Logic v, Void p) {

        castChar(v.getLeft(), v.getColumn(), v.getLine(), v.getRight());

        if(v.getOperator().equals("&&"))
            cg.and();
        else if(v.getOperator().equals("||"))
            cg.or();
        return null;
    }

    /**
     * Value[[Negative: Expression -> expression]]()=
     *  Value[[expression]]
     *  <NOT>
     */
    @Override
    public Void visit(Negative v, Void p) {

        v.getExpression().Accept(this, null);

        if (v.getExpression().getType() == CharType.getInstance(v.getExpression().getColumn(), v.getExpression().getLine())) {
            cg.b2i();
        }

        cg.not();
        return  null;
    }

    /**
     * Value[[UnaryMinus: Expression -> expression]]()=
     *
     *  <PUSH> 0
     *  Value[[expression]]()
     *  <SUB> exppression.getType().getSuffixe()
     *
     */
    @Override
    public Void visit(UnaryMinus v, Void p) {

        if(v.getType() instanceof  DoubleType){
            cg.push(0.0);
        }else{
            cg.push(0);
        }

        v.getExpression().Accept(this, null);
        cg.sub(v.getType());
        return  null;
    }

    /**
     *  value[[Cast : Expression -> expression type ]]() =
     *      Value[[expression]]()
     *  if(v.getExpression().getType().equals(IntType))
     *      if(v.getCastType().equals(DoubleType))
     *          <i2f>
     *      else if(v.getCastType().equals(CharType))
     *          <i2b>
     *  else if(v.getExpression().getType().equals(DoubleType))
     *      if(v.getCastType().equals(IntType))
     *          <f2i>
     *  else if(v.getExpression().getType().equals(CharType))
     *      if(v.getCastType().equals(IntType))
     *          <b2i>
     */
    @Override
    public Void visit(Cast v, Void p) {
        v.getExpression().Accept(this,p);

        if (v.getExpression().getType().getClass().equals(IntType.getInstance(v.getExpression().getType().getColumn(),v.getExpression().getType().getLine()).getClass())){
            if (v.getCastType().getClass().equals(DoubleType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.i2f();
            }else if (v.getCastType().getClass().equals(CharType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.i2b();
            }
        } else if (v.getExpression().getType().getClass().equals(DoubleType.getInstance(v.getExpression().getType().getColumn(),v.getExpression().getType().getLine()).getClass())){
            if (v.getCastType().getClass().equals(IntType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.f2i();
            }else if (v.getCastType().getClass().equals(CharType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.f2i();
                cg.i2b();
            }
        } else if (v.getExpression().getType().getClass().equals(CharType.getInstance(v.getExpression().getType().getColumn(),v.getExpression().getType().getLine()).getClass())){
            if (v.getCastType().getClass().equals(IntType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.b2i();
            }else if (v.getCastType().getClass().equals(DoubleType.getInstance(v.getCastType().getColumn(),v.getCastType().getLine()).getClass())){
                cg.b2i();
                cg.i2f();
            }
        }
        return null;
    }

    /**
     * value[[ArrayAccess : Expression -> left right ]]() =
     *      Address[[left]]()
     *      Value[[right]]()
     *      <LOAD>right.getType.getSuffix()
     */
    @Override
    public Void visit(ArrayAccess v, Void p) {
        v.getLeft().Accept(this.addrVisitor, p);
        v.getRight().Accept(this, p);
        cg.push(((ArrayType)v.getLeft().getType()).getOf().getNumberOfBytes());
        cg.mul(v.getRight().getType());
        cg.add(v.getRight().getType());
        cg.load(((ArrayType)v.getLeft().getType()).getOf());
        return null;
    }

    /**
     * value[[FieldAccess : Expression -> expression ID ]]() =
     *      Address[[FieldAccess]]()
     *      for (RecordField rf : (Struct)expression.getType.getDefinition)
     *          if (rf.name.equals(ID))
     *              <LOAD>rf.getType.getSuffix()
     */
    @Override
    public Void visit(FieldAcess v, Void p) {
        v.Accept(this.addrVisitor,p);
        if(v.getExpression().getType() instanceof Struct){
            for (RecordField rf: ((Struct)v.getExpression().getType()).getFields() ) {
                if(rf.getNameField().equals(v.getName())){
                    cg.load(rf.getTypeField());
                }
            }
        }else{
            new ErrorType(v.getExpression().getColumn(), v.getExpression().getLine(), "Error, v.getExpression().getType() not is a struct");
        }
        return null;
    }

    /**
     * Value[[FunctionInvoke:Expression -> expressions* function]]()=
     *     for(Expressions e: expressions){
     *         Value[[e]]()
     *     }
     *
     *      <CALL> function
     *
     */
    @Override
    public Void visit(FunctionInvoke v, Void p) {
        cg.line(v);
        cg.comment("FunctionInvoke");

        for (Expression e:v.getExpressions()) {
            e.Accept(this,p);
        }
        cg.call(v.getFunction().getName());

        return null;
    }

    /**
     * Value[[intLiteral: Expression -> value]]()=
     *      <PUSHI> value
     */
    @Override
    public Void visit(IntLiteral v, Void p) {
        cg.push(v.getValue());
        return null;
    }

    /**
     * Value[[charLiteral: Expression -> value]]()=
     *      <PUSHB> value
     */
    @Override
    public Void visit(CharLiteral v, Void p) {
        cg.push(v.getValue());
        return null;
    }

    /**
     * Value[[doubleLiteral: Expression -> value]]()=
     *      <PUSHF> value
     */
    @Override
    public Void visit(DoubleLiteral v, Void p) {
        cg.push(v.getValue());
        return null;
    }


    private void castChar(Expression left, int column, int line, Expression right) {
        left.Accept(this, null);
        if (left.getType() == CharType.getInstance(column, line)) {
            cg.b2i();
        }

        right.Accept(this, null);

        if (right.getType() == CharType.getInstance(column, line)) {
            cg.b2i();
        }
    }


}

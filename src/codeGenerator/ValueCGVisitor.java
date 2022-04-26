package codeGenerator;

import ast.expression.*;
import ast.expression.literal.CharLiteral;
import ast.expression.literal.DoubleLiteral;
import ast.expression.literal.IntLiteral;
import ast.expression.operator.Aritmmetic;
import ast.expression.operator.Comparision;
import ast.expression.operator.Logic;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;

public class ValueCGVisitor extends VisitorCGAbs {

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
    public <TR, TP> TR visit(Variable v, TP p) {
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
    public <TR, TP> TR visit(Aritmmetic v, TP p) {
        v.getLeft().Accept(this, null);
        v.getRight().Accept(this, null);

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
    public <TR, TP> TR visit(Comparision v, TP p) {
        v.getLeft().Accept(this, null);
        v.getRight().Accept(this, null);

        if(v.getOperator().equals("<"))
            cg.lt(v.getType());
        else if(v.getOperator().equals(">"))
            cg.gt(v.getType());
        else if(v.getOperator().equals("<="))
            cg.le(v.getType());
        else if(v.getOperator().equals(">="))
            cg.ge(v.getType());
        else if(v.getOperator().equals("=="))
            cg.eq(v.getType());
        else if(v.getOperator().equals("!="))
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
    public <TR, TP> TR visit(Logic v, TP p) {

        v.getLeft().Accept(this, null);
        v.getRight().Accept(this, null);

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
    public <TR, TP> TR visit(Negative v, TP p) {

        v.getExpression().Accept(this, null);
        cg.not();
        return  null;
    }

    /**
     * Value[[UnaryMinus: Expression -> expression]]()=
     *
     *  <PUSHI> 0
     *  Value[[expression]]()
     *  <SUB> exppression.getType().getSuffixe()
     *
     */
    @Override
    public <TR, TP> TR visit(UnaryMinus v, TP p) {
        cg.push(0);
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
    public <TR, TP> TR visit(Cast v, TP p) {
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
     *  Value[[right]]()
     *      <LOAD>right.getType.getSuffix()
     */
    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        v.getLeft().Accept(this.addrVisitor, p);
        v.getRight().Accept(this, p);
        cg.load(v.getRight().getType());
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
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        v.Accept(this.addrVisitor,p);
        if(v.getExpression().getType() instanceof Struct){
            for (RecordField rf: ((Struct)v.getExpression().getType()).getFields() ) {
                if(rf.getNameField().equals(v.getName())){
                    cg.load(rf.getTypeField());
                }
            }
        }
        return null;
    }

    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        return null;
    }

    /**
     * Value[[intLiteral: Expression -> value]]()=
     *      <PUSHI> value
     */
    @Override
    public <TR, TP> TR visit(IntLiteral v, TP p) {
        cg.push(v.getValue());
        return null;
    }

    /**
     * Value[[charLiteral: Expression -> value]]()=
     *      <PUSHB> value
     */
    @Override
    public <TR, TP> TR visit(CharLiteral v, TP p) {
        cg.push(v.getValue());
        return null;
    }

    /**
     * Value[[doubleLiteral: Expression -> value]]()=
     *      <PUSHF> value
     */
    @Override
    public <TR, TP> TR visit(DoubleLiteral v, TP p) {
        cg.push(v.getValue());
        return null;
    }

}

package codeGenerator;

import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.Cast;
import ast.expression.FieldAcess;
import ast.expression.Variable;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import ast.type.sympleTypes.IntType;

public class AddressCGVisitor extends VisitorCGAbs {

    private CodeGenerator cg;
    private ValueCGVisitor valueVisitor;

    public AddressCGVisitor(CodeGenerator cg,ValueCGVisitor value) {
        this.cg = cg;
        this.valueVisitor = value;
    }

    /**
     * Address[[Variable:Expression -> ID]]()=
     *      if(Expression.def.getScope()==0){
     *          <PUSHA> Expression.type.offset
     *      }else{
     *          <PUSH BP>
     *          <PUSHI> Expression.type.offset
     *          <ADDI> Expression.type.suffixe
     *      }
     */
    @Override
    public <TR, TP> TR visit(Variable v, TP p) {
        if(v.getDefinition().getScope()==0){
            cg.pushA(((VarDefinition)v.getDefinition()).getOffset());
        }else {
            cg.pushBP();
            cg.push(((VarDefinition)v.getDefinition()).getOffset());
            cg.add(IntType.getInstance(v.getColumn(),v.getLine()));
        }
        return null;
    }

    /**
     * address[[ArrayAccess : Expression -> left right]()=
     *      Address[[left]]()
     *      Value[[right]]()
     *      <PUSHI> left.type.getNumberOfBytes()
     *      <MULI>
     *      <ADDI>
     */
    @Override
    public <TR, TP> TR visit(ArrayAccess v, TP p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this.valueVisitor, p);
        cg.push(v.getLeft().getType().getNumberOfBytes());
        cg.mul(IntType.getInstance(v.getColumn(),v.getLine()));
        cg.add(IntType.getInstance(v.getColumn(),v.getLine()));
        return null;
    }

    /**
     * address[[FieldAccess : Expression -> expression ID]]()=
     *      Address[[expression]]()
     *      for (RecordField rf : (Struct)expression.getType.getDefinition)
     *          if (rf.name.equals(ID))
     *              <PUSHI> rf.getOffset
     *              <ADDI>
     */
    @Override
    public <TR, TP> TR visit(FieldAcess v, TP p) {
        v.getExpression().Accept(this,p);
        if(v.getExpression().getType() instanceof  Struct){
            for (RecordField rf: ((Struct)v.getExpression().getType()).getFields() ) {
                if(rf.getNameField().equals(v.getName())){
                    cg.push(rf.getOffset());
                    cg.add(IntType.getInstance(rf.getColumn(), rf.getLine()));
                }
            }
        }
        return null;
    }
}

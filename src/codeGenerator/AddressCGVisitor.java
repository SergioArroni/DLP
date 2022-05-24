package codeGenerator;

import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.Cast;
import ast.expression.FieldAcess;
import ast.expression.Variable;
import ast.type.complexTypes.ArrayType;
import ast.type.complexTypes.ErrorType;
import ast.type.complexTypes.RecordField;
import ast.type.complexTypes.Struct;
import ast.type.sympleTypes.IntType;

public class AddressCGVisitor extends VisitorCGAbs<Void, Void> {

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
     *          <ADD>
     *      }
     */
    @Override
    public Void visit(Variable v, Void p) {
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
     * Address[[VarDefinition:Expression -> ID]]()=
     *      if(VarDefinition.getScope()==0){
     *          <PUSHA> VarDefinition.type.offset
     *      }else{
     *          <PUSH BP>
     *          <PUSHI> VarDefinition.type.offset
     *          <ADD>
     *      }
     */
    @Override
    public Void visit(VarDefinition v, Void p) {
        if(v.getScope()==0){
            cg.pushA(v.getOffset());
        }else {
            cg.pushBP();
            cg.push(v.getOffset());
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
    public Void visit(ArrayAccess v, Void p) {
        v.getLeft().Accept(this, p);
        v.getRight().Accept(this.valueVisitor, p);
        if(v.getLeft().getType() instanceof ArrayType){
            cg.push(((ArrayType)v.getLeft().getType()).getOf().getNumberOfBytes());
            cg.mul(v.getRight().getType());
            cg.add(v.getRight().getType());
        }else {
            new ErrorType(v.getLeft().getColumn(), v.getLeft().getLine(), "Error, v.getLeft().getType() not is ArrayType");
        }

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
    public Void visit(FieldAcess v, Void p) {
        v.getExpression().Accept(this,p);
        if(v.getExpression().getType() instanceof  Struct){
            for (RecordField rf: ((Struct)v.getExpression().getType()).getFields() ) {
                if(rf.getNameField().equals(v.getName())){
                    cg.push(rf.getOffset());
                    cg.add(IntType.getInstance(rf.getColumn(), rf.getLine()));
                }
            }
        }else{
            new ErrorType(v.getExpression().getColumn(), v.getExpression().getLine(), "Error, v.getExpression().getType() not is a struct");
        }
        return null;
    }
}

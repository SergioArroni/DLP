package codeGenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Expression;
import ast.expression.FunctionInvoke;
import ast.statement.*;
import ast.type.Type;
import ast.type.complexTypes.FunctionType;
import ast.type.sympleTypes.VoidType;

public class ExecuteCGVisitor extends VisitorCGAbs {

    private CodeGenerator cg;
    private AddressCGVisitor addrVisitor;
    private ValueCGVisitor valueVisitor;

    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        valueVisitor = new ValueCGVisitor(this.cg);
        addrVisitor = new AddressCGVisitor(this.cg, valueVisitor);
    }

    /**
     * Execute[[Program:program -> Definition*]]()=
     *      For(Definition d:Definition*){
     *          if(d IO varDefinition){
     *              Execute[[d]]()
     *          }
     *      }
     *
     *      <CALL Main>
     *      <HALT></HALT>
     *
     *      For(Definition d:Definition*){
     *              Execute[[d]]()
     *      }
     */
    @Override
    public <TR, TP> TR visit(Program v, TP p) {
        for (Definition d: v.getDefinitions()) {
            if(d instanceof VarDefinition){
                d.Accept(this, p);
            }
        }

        cg.comment("Invocation to the main function");
        cg.callMain();

        for (Definition d: v.getDefinitions()) {
            if(!(d instanceof VarDefinition)) {
                d.Accept(this, p);
            }
        }
        return null;
    }
    /**
     * Execute[[VarDefinition: defVar -> ID type ]]()=
     *          < ' * > "Type: { "+v.getType().toString() + " }, Name: { " + v.getName() + " }, Offset: { "+ v.getOffset()+" }"
     */
    @Override
    public <TR, TP> TR visit(VarDefinition v, TP p) {
        cg.comment("Type: { "+v.getType().toString() + " }, Name: { " + v.getName() + " }, Offset: { "+ v.getOffset()+" }");
        return null;
    }

    /**
     * Execute[[FuncDefinition: defFunc -> ID type statements* ]]()=
     *  {name}:
     *      <Enter> defFunc.type.offset
     *      For(Statetmen s: statements)
     *          Execute[[s]]()
     *      if(type === Void)
     *          <RET> 0, defFunc.localOffsetAux , defFunc.getNumBytes
     */
    @Override
    public <TR, TP> TR visit(FuncDefinition v, TP p) {
        cg.line(v);
        cg.label(v.getName());
        cg.enter(v.getLocalOffsetAux());
        //cg.comment("Parameters");
        //cg.comment("Local variables");
        for (Statement s:v.getStatements()) {
            if(s instanceof Return){
                s.Accept(this,v);
            }else{
                s.Accept(this,p);
            }

        }
        if(((FunctionType)v.getType()).getTypeReturn() instanceof VoidType){
            cg.ret(((FunctionType)v.getType()).getTypeReturn().getNumberOfBytes(),v.getLocalOffsetAux(), v.getType().getNumberOfBytes());
        }
        return null;
    }
    /**
     * Execute[[Assigmment: assig -> left right ]]()=
     *
     *      address[[left]]()
     *      value[[right]]()
     *      left.type.promote(cg, right);
     *      <STORE>left.type.suffix()
     */
    @Override
    public <TR, TP> TR visit(Assigmment v, TP p) {
        cg.line(v);
        cg.comment("Assignment");
        v.getLeft().Accept(this.addrVisitor, p);
        v.getRight().Accept(this.valueVisitor,p);
        v.getLeft().getType().promotesTo(v.getRight().getType(),v);
        cg.store(v.getLeft().getType());
        return null;
    }

    /**
     * Execute[[Write:Statement -> expression]]()=
     *      value[[exp]]()
     *
     *      <OUT> exp.type.suffixe
     */
    @Override
    public <TR, TP> TR visit(Write v, TP p) {
        for (Expression e: v.getExpression()) {
            cg.line(v);
            cg.comment("Write");
            e.Accept(this.valueVisitor,p);
            cg.out(e.getType());
        }
        return null;
    }

    /**
     * Execute[[Read:Statement -> expression]]()=
     *      addr[[exp]]()
     *
     *      <IN> exp.type.suffixe
     *
     *      <STORE> exp.type.suffixe
     */
    @Override
    public <TR, TP> TR visit(Read v, TP p) {
        for (Expression e: v.getExpression()) {
            cg.line(v);
            cg.comment("Read");
            e.Accept(this.addrVisitor,p);
            cg.in(e.getType());
            cg.store(e.getType());
        }
        return null;
    }

    /**
     * Execute[[FunctionInvoke:Statement -> expressions* function]]()=
     *     for(Expressions e: exprfessions){
     *         Value[[e]]()
     *     }
     *
     *      <CALL> function
     *
     *      <POPI>
     *
     */
    @Override
    public <TR, TP> TR visit(FunctionInvoke v, TP p) {
        cg.line(v);
        cg.comment("FunctionInvoke");

        for (Expression e:v.getExpressions()) {
            e.Accept(this.valueVisitor,p);
        }
        cg.call(v.getFunction().getName());

        cg.pop();

        return null;
    }
/**
 * TODO:Return
 */
    /**
     * Execute[[Return:Statement -> expression]](p)=
     *      Value[[expression]]()
     *
     *      <RET> expression.getType.getNumBytes.
     *
     */
    @Override
    public <TR, TP> TR visit(Return v, TP p) {
        cg.line(v);
        cg.comment("Return");

        v.getExpression().Accept(this.valueVisitor,null);

        cg.ret(((FunctionType) ((FuncDefinition) p).getType()).getTypeReturn().getNumberOfBytes(), ((FuncDefinition) p).getLocalOffsetAux(), ((FuncDefinition) p).getType().getNumberOfBytes());
        return null;
    }

}

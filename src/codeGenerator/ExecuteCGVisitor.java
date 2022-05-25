package codeGenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Expression;
import ast.expression.FunctionInvoke;
import ast.statement.*;
import ast.type.complexTypes.ArrayType;
import ast.type.complexTypes.ErrorType;
import ast.type.complexTypes.FunctionType;
import ast.type.sympleTypes.IntType;
import ast.type.sympleTypes.VoidType;

public class ExecuteCGVisitor extends VisitorCGAbs<Void, FuncDefinition> {

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
     *      <HALT>
     *
     *      For(Definition d:Definition*){
     *              Execute[[d]]()
     *      }
     */
    @Override
    public Void visit(Program v, FuncDefinition p) {
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
    public Void visit(VarDefinition v, FuncDefinition p) {
        cg.comment("Type: { "+v.getType().toString() + " }, Name: { " + v.getName() + " }, Offset: { "+ v.getOffset()+" }");
        if (v.getExpr() != null) {

            v.Accept(this.addrVisitor, p);
            v.getExpr().Accept(this.valueVisitor,p);

            cg.store(v.getType());
        }
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
    public Void visit(FuncDefinition v, FuncDefinition p) {
        cg.line(v);
        cg.label(v.getName());
        cg.enter(v.getLocalOffsetAux());
        cg.comment("Parameters");
        for (VarDefinition vd:((FunctionType)v.getType()).getParameters()) {
            cg.comment("Type: { "+vd.getType().toString() + " }, Name: { " + vd.getName() + " }, Offset: { "+ vd.getOffset()+" }");
        }
        cg.comment("Local variables");
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
    public Void visit(Assigmment v, FuncDefinition p) {
        cg.line(v);
        cg.comment("Assignment");
        v.getLeft().Accept(this.addrVisitor, p);
        v.getRight().Accept(this.valueVisitor,p);

        cg.store(v.getLeft().getType());
        return null;
    }

    /**
     * Execute[[Write:Statement -> expression]]()=
     *      value[[exp]]()
     *
     *      if(exp.type==Array){
     *          for(i=0;i<expr.type.size;i++){
     *              value[[exp[i]]]()
     *          }
     *      }
     *      else
     *          <OUT> exp.type.suffixe
     */
    @Override
    public Void visit(Write v, FuncDefinition p) {
        for (Expression e : v.getExpression()) {
            cg.line(v);
            cg.comment("Write");

            if (e.getType() instanceof ArrayType) {
                for (int i = 0;i<((ArrayType)e.getType()).getSize();i++) {

                    e.Accept(this.addrVisitor, p);
                    cg.push(i);
                    cg.push(((ArrayType)e.getType()).getOf().getNumberOfBytes());
                    cg.mul(IntType.getInstance(e.getColumn(),e.getLine()));
                    cg.add(IntType.getInstance(e.getColumn(),e.getLine()));
                    cg.load(((ArrayType)e.getType()).getOf());
                    cg.out(((ArrayType)e.getType()).getOf());
                }
            } else {
                e.Accept(this.valueVisitor, p);
                cg.out(e.getType());
            }

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
    public Void visit(Read v, FuncDefinition p) {
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
     *
     *      Value[[(Expression)Statement]])
     *
     *      if(((Expression)Statement).type == VOID){
     *          <POP>((Expression)Statement).type.suffixe()
     *      }
     *
     */
    @Override
    public Void visit(FunctionInvoke v, FuncDefinition p) {

        v.Accept(this.valueVisitor,p);

        if(!(v.getType() instanceof VoidType)){
            cg.pop(v.getType());
        }


        return null;
    }

    /**
     * Execute[[Iterative:Statement -> condition loopStatement*]]()=
     *      int condition = cg.getLabel();
     *      int end = cg.getLabel();
     *      <Label_>condition<:>
     *      Value[[condition]]()
     *      <JZ Label_> end
     *
     *      for(Statement s: loopStatement){
     *          Execute[[s]]()
     *      }
     *
     *      <JMP Label_> condition
     *
     *      <Label_>end<:>
     *
     */
    @Override
    public Void visit(Iterative v, FuncDefinition p) {
        cg.line(v);
        cg.comment("While");

        int condition = cg.getLabel();
        int end = cg.getLabel();

        cg.label("Label" + condition);

        v.getCondition().Accept(this.valueVisitor, p);
        cg.jz("Label" + end);

        for (Statement s : v.getLoopStatement()) {
            s.Accept(this, p);
        }

        cg.jmp("Label" + condition);

        cg.label("Label" + end);

        return null;
    }

    /**
     * Execute[[Switch:Statement -> condition switchBody* defaults]]()=
     *      int condition = cg.getLabel();
     *      int end = cg.getLabel();
     *      <Label_>condition<:>
     *      Value[[condition]]()
     *      <JZ Label_> end
     *
     *      for(Statement s: loopStatement){
     *          Execute[[s]]()
     *      }
     *
     *      <JMP Label_> condition
     *
     *      <Label_>end<:>
     *
     */
    @Override
    public Void visit(Switch v, FuncDefinition p) {
        cg.line(v);
        cg.comment("Switch");

        int finals = cg.getLabel();

        for (Case s : v.getSwitchBody()) {

            cg.line(s);
            cg.comment("Case");

            v.getCondition().Accept(this.valueVisitor, p);

            int siguiente = cg.getLabel();

            s.getCondition().Accept(this.valueVisitor, p);

            cg.eq(s.getCondition().getType());

            cg.jz("Label" + siguiente);

            s.getCaseBody().Accept(this,p);

            if(s.getTemporal().equals("break")){
                cg.jmp("Label" + finals);
            }

            cg.label("Label" + siguiente);

        }

        cg.line(v.getDefaulta());
        cg.comment("Case - Default");
        v.getDefaulta().getCaseBody().Accept(this,p);
        cg.jmp("Label" + finals);

        cg.label("Label" + finals);

        return null;
    }



    /**
     * Execute[[Condition:Statement -> condition:expression ifStatement:statement* elseStatement:statement*]]()=
     *      int else = cg.getLabel();
     *      int end = cg.getLabel();
     *
     *      Value[[condition]]()
     *      <JZ Label_> else
     *
     *      for(Statement s: ifStatement){
     *          Execute[[s]]()
     *      }
     *      <JMP Label_> end
     *
     *      <Label_>else<:>
     *      for(Statement s: elseStatement){
     *          Execute[[s]]()
     *      }
     *
     *      <JMP Label_> end
     *      <Label_>end<:>
     *
     */
    @Override
    public Void visit(Condition v, FuncDefinition p) {
        cg.line(v);
        cg.comment("If");

        int else_ = cg.getLabel();
        int end = cg.getLabel();

        v.getCondition().Accept(this.valueVisitor, p);

        cg.jz("Label" + else_);

        cg.comment("If Body");
        for (Statement s : v.getIfStatement()) {
            s.Accept(this, p);
        }

        cg.jmp("Label" + end);

        cg.comment("Else");

        cg.label("Label" + else_);
        cg.comment("Else Body");
        for (Statement s : v.getElseStatement()) {
            s.Accept(this, p);
        }

        cg.label("Label" + end);

        return null;
    }

    /**
     * Execute[[Return:Statement -> expression]](p)=
     *      Value[[expression]]()
     *
     *      <RET> p.getType()).getTypeReturn().getNumberOfBytes() , p.getLocalOffsetAux() , p.getType().getNumberOfBytes()
     *
     */
    @Override
    public Void visit(Return v, FuncDefinition p) {
        cg.line(v);
        cg.comment("Return");

        v.getExpression().Accept(this.valueVisitor, null);

        if (p.getType() instanceof FunctionType) {
            cg.ret(((FunctionType) p.getType()).getTypeReturn().getNumberOfBytes(), p.getLocalOffsetAux(), p.getType().getNumberOfBytes());
        }else{
            new ErrorType(p.getType().getColumn(), p.getType().getLine(), "Error, p.getType().getColumn() not is a FuncType");
        }
       return null;
    }

}

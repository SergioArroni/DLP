package codeGenerator;

import ast.AstNode;
import ast.type.Type;
import ast.type.sympleTypes.CharType;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {
    private PrintWriter out;
    private int count;

    public CodeGenerator(String outputFilename, String sourceFilename) {
        count = 0;
        try {
            this.out = new PrintWriter(outputFilename);
        } catch (IOException e) {
            System.err.println("Error opening outputFile" + e);
            System.exit(-1);
        }
        this.source(sourceFilename);
    }

    public void source(String inputFile) {
        out.println("\n#source\t\"" + inputFile + "\"\n");
        out.flush();
    }

    public void line(AstNode node) {
        out.println("\n#line\t" + node.getLine());
        out.flush();
    }

    public void pushBP() {
        out.println("\tPUSH\tBP");
        out.flush();
    }

    public void pushA(int pos) {
        out.println("\tPUSHA\t" + pos);
        out.flush();
    }

    public void load(Type type) {
        out.println("\tLOAD" + type.suffix());
        out.flush();
    }

    public void store(Type type) {
        out.println("\tSTORE" + type.suffix());
        out.flush();
    }

    public void out(Type type) {
        out.println("\tOUT" + type.suffix());
        out.flush();
    }

    public void in(Type type) {
        out.println("\tIN" + type.suffix());
        out.flush();
    }

    public void callMain() {
        out.println("\tCALL main");
        out.println("\tHALT");
        out.flush();
    }

    public void halt() {
        out.println("\tHALT");
        out.flush();
    }

    public void call(String name) {
        out.println("\tCALL\t" + name);
        out.flush();
    }

    public void push(char value) {
        out.println("\tPUSHB\t" + (int) value);
        out.flush();
    }

    public void push(int value) {
        out.println("\tPUSHI\t" + value);
        out.flush();
    }

    public void push(double value) {
        out.println("\tPUSHF\t" + value);
        out.flush();
    }

    public void add(Type type) {
        out.println("\tADD" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tSUB" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        out.println("\tMUL" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("\tDIV" + type.suffix());
        out.flush();
    }

    public void mod() {
        out.println("\tMODI\t");
        out.flush();
    }

    public void and() {
        out.println("\tAND\t");
        out.flush();
    }

    public void or() {
        out.println("\tOR\t");
        out.flush();
    }

    public void not() {
        out.println("\tNOT\t");
        out.flush();
    }

    public void eq(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tEQ" + type.suffix());
            out.flush();
        }
    }

    public void ne(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tNE" + type.suffix());
            out.flush();
        }
    }

    public void le(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tLE" + type.suffix());
            out.flush();
        }
    }

    public void ge(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tGE" + type.suffix());
            out.flush();
        }
    }

    public void lt(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tLT" + type.suffix());
            out.flush();
        }
    }

    public void gt(Type type) {
        if (!type.getClass().equals(CharType.getInstance(type.getColumn(), type.getLine()).getClass())) {
            out.println("\tGT" + type.suffix());
            out.flush();
        }
    }

    public void b2i() {
        out.println("\tb2i\t");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i\t");
        out.flush();
    }

    public void i2b() {
        out.println("\ti2b\t");
        out.flush();
    }

    public void i2f() {
        out.println("\ti2f\t");
        out.flush();
    }

    public void comment(String text) {
        out.println("\t' * " + text);
        out.flush();
    }

    public void label(String name) {
        out.println(name + ":\t");
        out.flush();
    }

    public void enter(int number) {
        out.println("\tENTER\t" + Math.abs(number));
        out.flush();
    }

    public void pop(Type type) {
        out.println("\tPOP" + type.suffix());
        out.flush();
    }

    public void jz(String name) {
        out.println("\tJZ\t" + name);
        out.flush();
    }

    public void jmp(String name) {
        out.println("\tJMP\t" + name);
        out.flush();
    }

    public int getLabel() {

        return count++;
    }

    public void ret(int returns, int locals, int params) {
        out.println("\tRET\t" + Math.abs(returns) + ", " + Math.abs(locals) + ", " + Math.abs(params));
        out.flush();
    }
}

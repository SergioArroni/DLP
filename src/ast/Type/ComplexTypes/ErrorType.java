package ast.Type.ComplexTypes;

import ast.Errors.EH;
import ast.Type.TypeAbs;
import visitor.Visitor;

public class ErrorType extends TypeAbs {

    private String Message;

    public ErrorType(int colum, int line, String message) {
        super(colum, line);
        this.Message = message;
        EH.getEH().AddError(this);
    }

    public String getMessage() {
        return Message;
    }


    @Override
    public String toString() {
        return "ErrorType{" + "\n\tIn Line: " + this.getLine() + "; In Column: " + this.getColumn() +
                "\tMessage='" + getMessage() + '\'' +
                "\n\t\t  }";
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }
}

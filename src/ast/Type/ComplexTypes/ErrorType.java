package ast.Type.ComplexTypes;

import ast.Errors.EH;
import ast.Type.TypeAbs;

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
        return "ErrorType{" +
                "Message='" + getMessage() + '\'' +
                '}';
    }
}

package ast.Errors;

import ast.AstNode;
import ast.Type.ComplexTypes.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EH {

    private static EH instance;
    private List<ErrorType> errors;

    private EH() {
        this.errors = new ArrayList<ErrorType>();

    }

    public static EH getEH() {
        if (instance == null) {
            instance = new EH();
        }
        return instance;
    }

    public boolean AnyErrors() {
        if (errors.isEmpty()) {
            return false;
        }
        return true;
    }

    public void ShowErrors(PrintStream printS) {
        printS.println("Your code have errors: ");
        for (ErrorType er : errors) {
             printS.println(er.toString());
        }
    }

    public void AddError(ErrorType error) {

        errors.add(error);

    }

}

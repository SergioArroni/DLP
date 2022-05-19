package errorhandler;

import ast.type.complexTypes.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance;
    private List<ErrorType> errors;

    private ErrorHandler() {
        this.errors = new ArrayList<>();

    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError() {
        if (errors.isEmpty()) {
            return false;
        }
        return true;
    }

    public void showErrors(PrintStream printS) {
        printS.println("Your code have errors: ");
        for (ErrorType er : errors) {
             printS.println(er.toString());
        }
    }

    public void AddError(ErrorType error) {

        errors.add(error);

    }

}

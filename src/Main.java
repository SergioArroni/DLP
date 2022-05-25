import ast.AstNode;
import codeGenerator.CodeGenerator;
import codeGenerator.ExecuteCGVisitor;
import codeGenerator.OffSetVisitor;
import errorhandler.ErrorHandler;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

public class Main {

    public static void main(String... args) throws Exception {
        if (args.length < 1) {
            System.err.println("Please, pass me the input file.");
            return;
        }

        // create a lexer that feeds off of input CharStream
        CharStream input = CharStreams.fromFileName(args[0]);
        PmmLexer lexer = new PmmLexer(input);

        // create a parser that feeds off the tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PmmParser parser = new PmmParser(tokens);
        Program ast = parser.program().ast;

        ast.Accept(new IdentificationVisitor(), null);
        ast.Accept(new TypeCheckingVisitor(), null);


        // * Check errors
        if (ErrorHandler.getInstance().anyError()) {
            // * Show errors
            ErrorHandler.getInstance().showErrors(System.err);
        } else {
            // * The AST is shown
            ast.Accept(new OffSetVisitor(), null);
            ast.Accept(new ExecuteCGVisitor(new CodeGenerator(args[1], args[0])), null);
            //IntrospectorModel model = new IntrospectorModel("Program", ast);
            //new IntrospectorTree("Introspector", model);
        }
    }
}

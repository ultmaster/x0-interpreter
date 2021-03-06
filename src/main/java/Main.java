import core.Action;
import grammar.X0Lexer;
import grammar.X0Visitor;
import grammar.X0Parser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String args[]) {
        String input;
        if (args.length >= 1) input = args[0];
        else {
            System.err.println("Filename must be supplied.");
            return;
        }
        X0Lexer lexer = null;
        try {
            lexer = new X0Lexer(CharStreams.fromFileName(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            X0Parser parser = new X0Parser(tokens);
            X0Parser.ProgramContext tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                throw new RuntimeException("Parse failed!");
            }
            Action visitor = new Action(parser);
            visitor.visit(tree);
        } catch (IOException e) {
            throw new RuntimeException("File input not found");
        }
    }
}

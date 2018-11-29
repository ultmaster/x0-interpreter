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

    public static final String inputExample = "./examples/example8.x";

    public static void main(String args[]) throws IOException {
        X0Lexer lexer = new X0Lexer(CharStreams.fromFileName(inputExample));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        X0Parser parser = new X0Parser(tokens);
        X0Parser.ProgramContext tree = parser.program();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            throw new RuntimeException("Parse failed!");
        }
        Action visitor = new Action(parser);
        visitor.setDebug(true);
        visitor.visit(tree);
    }
}

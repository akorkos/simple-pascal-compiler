import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main extends Visitor{
    public static void main(String[] args) throws IOException {

        CharStream cs = fromFileName(args[0]);
        SimplePascalLexer lexer = new SimplePascalLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimplePascalParser parser = new SimplePascalParser(tokens);

        ParseTree tree = parser.program();

        List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
        String prettyTree = TreeUtils.toPrettyTree(tree, ruleNamesList);

        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|                           Abstract syntax tree:                                       |");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(prettyTree);

        Visitor v = new Visitor();
        v.visit(tree);

        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|                                Symbol table:                                          |");
        System.out.println("+---------------------------------------------------------------------------------------+");

        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|                       Variables, types and constants:                                 |");
        System.out.println("+---------------------------------------------------------------------------------------+");

        for (Variable name : v.memory.keySet()) {
            String key = name.toString();
            System.out.println(key + "" + v.memory.get(name));
        }

        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|                              Functions and procedures:                                |");
        System.out.println("+---------------------------------------------------------------------------------------+");

        for (Function name : v.fmemory.keySet()) {
            String key = name.toString();
            System.out.println(key + "" + v.fmemory.get(name));
        }
    }
}

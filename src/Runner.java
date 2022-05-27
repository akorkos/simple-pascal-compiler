import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Runner extends Visitor{
    public static void main(String[] args) throws Exception {
        // get input from file input1.f
        CharStream cs = fromFileName("SimplePascaltest1.p");

        // create a lexer that feeds off of input CharStream
        SimplePascalLexer lexer = new SimplePascalLexer(cs);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        SimplePascalParser parser = new SimplePascalParser(tokens);
        // begin parsing at init rule
        ParseTree tree = parser.program();
        // print LISP-style tree
        //System.out.println(tree.toStringTree(parser));

        Visitor v = new Visitor();
        ParseTreeWalker walker = new ParseTreeWalker();

        // traverse the tree
        walker.walk(v, tree);

        /*for (String i : v.int_variables)
            System.out.print("Integer     " + i);

        for (String i : v.real_variables)
            System.out.print("R     " + i);
        for (String i : v.char_variables)
            System.out.print("C     " + i + "\n");*/
        for (Constant i : v.constants)
            System.out.print(i + "\n");
    }
}
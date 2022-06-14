import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main extends Visitor{
    public static void main(String[] args) throws Exception {

        CharStream cs = fromFileName("test1.p");
        SimplePascalLexer lexer = new SimplePascalLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimplePascalParser parser = new SimplePascalParser(tokens);

        ParseTree tree = parser.program();


        Visitor v = new Visitor();
        v.visit(tree);

        /*for (Variable i : v.constants)
            System.out.println(i);

        for (Variable i : v.types)
            System.out.println(i);

        for (Variable i : v.variables)
            System.out.println(i);*/

    }
}

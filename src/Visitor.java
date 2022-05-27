import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Visitor extends SimplePascalBaseListener{
    public String lastDataType;
    public ArrayList<Constant> constants = new ArrayList<>();


    @Override
    public void exitConstant(SimplePascalParser.ConstantContext ctx) {
       //lastDataType = String.valueOf(ctx.getRuleContext());
        //System.out.println(ctx.getRuleContext());
        /*List<ParseTree> values = ctx.children;
        for (ParseTree i : values)
            System.out.println(i);*/


    }

    @Override
    public void exitExpression(SimplePascalParser.ExpressionContext ctx) {
      //  if (ctx.constant() != null)
        //  System.out.println("-" + ctx.constant().BCONST());

        //System.out.println("--" + ctx.parent.getText());
    }

    @Override
    public void exitConstant_defs(SimplePascalParser.Constant_defsContext ctx) {
        String type = null;

        if (ctx.expression() != null){

            if (ctx.expression().constant() != null) {
                if (ctx.expression().constant().BCONST() != null )
                    type = "Bool";
                else if (ctx.expression().constant().ICONST() != null)
                    type = "Integer";
                else if (ctx.expression().constant().RCONST()!= null)
                    type = "Real";
                else if (ctx.expression().constant().CCONST() != null)
                    type = "Char";
            } else {
                List<ParseTree> values = ctx.expression().children;
                for (ParseTree i : values)
                    System.out.println(i.getText());
                ctx.expression().
                System.out.println(ctx.expression().stop);
            }

            Constant constant = new Constant(ctx.ID().getText(), type ,"Local");

            constants.add(constant);
        }

    }


}

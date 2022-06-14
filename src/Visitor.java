import org.antlr.v4.runtime.TokenStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Visitor extends SimplePascalBaseVisitor<Value>{
    private Map<Variable, Value> memory = new HashMap<Variable, Value>();

    @Override
    public Value visitSBoolean(SimplePascalParser.SBooleanContext ctx) {
        return new Value(new DataType("Boolean"));
    }

    @Override
    public Value visitSChar(SimplePascalParser.SCharContext ctx) {
        return new Value(new DataType("Char"));
    }

    @Override
    public Value visitSInteger(SimplePascalParser.SIntegerContext ctx) {
        return new Value(new DataType("Integer"));
    }

    @Override
    public Value visitSReal(SimplePascalParser.SRealContext ctx) {
        return new Value(new DataType("Real"));
    }

    @Override
    public Value visitVariable_defs(SimplePascalParser.Variable_defsContext ctx) {
        String id = ctx.identifiers().ID().getText();
        Value value = this.visit(ctx.typename().standard_type());
        return memory.put(new Variable(id, "Global"), value);
    }

    private Variable findVariable(String ID){
        for(Map.Entry<Variable, Value> entry : memory.entrySet()) {
            Variable key = entry.getKey();
            if (key.getID().equals(ID))
                return key;
        }
        return null;
    }

    @Override
    public Value visitAssignment(SimplePascalParser.AssignmentContext ctx) {
        String id = ctx.variable().ID().getText();
        Variable variable = findVariable(id);
        if (variable != null){
            Value value = this.visit(ctx.expression());
            return memory.put(variable, value);
        }
        return null;
    }

    @Override
    public Value visitVarExpression(SimplePascalParser.VarExpressionContext ctx) {
        String id = ctx.getText();
        Variable variable = findVariable(id);
        if (variable == null) {
            //throw new RuntimeException("No such variable: " + id);
            System.out.println("No such variable: " + id);
            return null;
        }
        else
            return memory.get(variable);
    }

    @Override
    public Value visitBooleanConst(SimplePascalParser.BooleanConstContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitCharConst(SimplePascalParser.CharConstContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "'");
        return new Value(str.charAt(0));
    }

    @Override
    public Value visitIntegerConst(SimplePascalParser.IntegerConstContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitAddSubExpression(SimplePascalParser.AddSubExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));



        return switch (ctx.op.getType()) {
            case SimplePascalParser.ADDOP -> new Value(left.asDouble() + right.asDouble());
            case SimplePascalParser.SUBOP -> new Value(left.asDouble() - right.asDouble());
            default -> null;
        };
    }

    @Override
    public Value visitMuldivExpression(SimplePascalParser.MuldivExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        return switch (ctx.op.getType()){
            case SimplePascalParser.MULOP -> new Value(left.asDouble() * right.asDouble());
            case SimplePascalParser.DIVOP -> new Value(left.asDouble() / right.asDouble());
            case SimplePascalParser.DIV -> new Value(left.asInteger() / right.asInteger());
            case SimplePascalParser.MOD -> new Value(left.asInteger() % right.asInteger());
            case SimplePascalParser.ANDOP -> new Value(left.asBoolean() && right.asBoolean());
            default -> null;
        };
    }

    @Override
    public Value visitNotExpression(SimplePascalParser.NotExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitOrExpression(SimplePascalParser.OrExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitNotationExpression(SimplePascalParser.NotationExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        return switch (ctx.op.getType()){
            case SimplePascalParser.ADDOP -> new Value(value.asDouble());
            case SimplePascalParser.SUBOP ->  new Value(-value.asDouble());
            default -> null;
        };
    }

    @Override
    public Value visitInRElEquExpression(SimplePascalParser.InRElEquExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        return switch (ctx.op.getType()) {
            case SimplePascalParser.LT -> new Value(left.asDouble() < right.asDouble());
            case SimplePascalParser.LTEQ -> new Value(left.asDouble() <= right.asDouble());
            case SimplePascalParser.GT -> new Value(left.asDouble() > right.asDouble());
            case SimplePascalParser.GTEQ -> new Value(left.asDouble() >= right.asDouble());
            case SimplePascalParser.NEQ -> new Value(!Objects.equals(left.asDouble(), right.asDouble()));
            case SimplePascalParser.EQU -> new Value(Objects.equals(left.asDouble(), right.asDouble()));
            default -> null;
        };
    }
}

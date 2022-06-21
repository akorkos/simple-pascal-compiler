import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class Visitor extends SimplePascalBaseVisitor<Value>{
    public Map<Variable, Value> memory = new HashMap<Variable, Value>();
    public Map<Variable, Value> types = new HashMap<Variable, Value>();

    @Override
    public Value visitSBoolean(SimplePascalParser.SBooleanContext ctx) {
        return new Value(new DataType("boolean"));
    }

    @Override
    public Value visitSChar(SimplePascalParser.SCharContext ctx) {
        return new Value(new DataType("char"));
    }

    @Override
    public Value visitSInteger(SimplePascalParser.SIntegerContext ctx) {
        return new Value(new DataType("integer"));
    }

    @Override
    public Value visitSReal(SimplePascalParser.SRealContext ctx) {
        return new Value(new DataType("real"));
    }

    @Override
    public Value visitTStandardType(SimplePascalParser.TStandardTypeContext ctx) {
        return this.visit(ctx.standard_type());
    }



    @Override
    public Value visitLmtId(SimplePascalParser.LmtIdContext ctx) {
        TerminalNode op = ctx.SUBOP();
        String id = ctx.ID().getText();
        Variable variable = findVariable(id);
        if (variable == null)
            return Value.NULL;
        Value value = memory.get(variable);
        if (value.isNUmeric() && op != null){
            Double val = value.asDouble();
            val *= -1.0;
            value.updateValue(new Value(val, value.getDataType()));
        }
        return value;
    }

    @Override
    public Value visitLmtnegConst(SimplePascalParser.LmtnegConstContext ctx) {
        TerminalNode op = ctx.SUBOP();
        Value value = new Value(Double.valueOf(ctx.getText()), new DataType("integer"));
        if (value.isNUmeric() && op != null){
            Double val = value.asDouble();
            val *= -1.0;
            value.updateValue(new Value(val, value.getDataType()));
        }
        return value;
    }

    @Override
    public Value visitLmtConst(SimplePascalParser.LmtConstContext ctx) {
        return this.visit(ctx.constant());
    }

    @Override
    public Value visitTID(SimplePascalParser.TIDContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = findVariable(id);
        if (variable == null)
            return Value.NULL;
        return memory.get(variable);
    }

    @Override
    public Value visitTypeSet(SimplePascalParser.TypeSetContext ctx) {
        return this.visit(ctx.typename());
    }

    @Override
    public Value visitTypeRecord(SimplePascalParser.TypeRecordContext ctx) {
        return super.visitTypeRecord(ctx); //needs implemetation
    }

    @Override
    public Value visitTypeSubSection(SimplePascalParser.TypeSubSectionContext ctx) {
        Value left = this.visit(ctx.limit(0));
        Value right = this.visit(ctx.limit(1));

        return Value.NULL; //needs implemetation
    }

    @Override
    public Value visitType_defs(SimplePascalParser.Type_defsContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        Value value;
        Variable variable;
        String id;
        for (int i = 0; i < ids.size(); i++) {
            id = ids.get(i).getText();
            variable = findVariable(id);
            value = this.visit(ctx.type_def(i));
            if (variable == null)
                memory.put(new Variable(id, "Local"), value);
        }
        return Value.VOID;
    }

    @Override
    public Value visitVariable_defs(SimplePascalParser.Variable_defsContext ctx) {
        List<SimplePascalParser.IdentifiersContext> ids = ctx.identifiers();
        List<SimplePascalParser.TypenameContext> type = ctx.typename();

        for (int i = 0; i < ids.size(); i++){
            for (TerminalNode j : ids.get(i).ID())
                memory.put(new Variable(j.getText(), "Global"), new Value(new DataType(type.get(i).getText())));
        }

        return Value.VOID;
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
    public Value visitVarID(SimplePascalParser.VarIDContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = findVariable(id);
        if (variable == null) {
            //throw new RuntimeException("No such variable: " + id);
            // mpories na allakseis thn domh ths value k otan den exei dhlwthei metavlhth na girnas Value pou tha einai empty?
            System.out.println("No such variable: " + id);
            return Value.NULL;
        }
        else
            return memory.get(variable);
    }

    @Override
    public Value visitConstant_defs(SimplePascalParser.Constant_defsContext ctx) {
        //String id = ctx.ID().getText();
        List<TerminalNode> ids = ctx.ID();
        Value value;
        Variable variable;
        String id;
        for (int i = 0; i < ids.size(); i++) {
            id = ids.get(i).getText();
            variable = findVariable(id);
            value = this.visit(ctx.expression(i));
            if (variable == null)
                memory.put(new Variable(id, "Local"), value);
        }
        return Value.VOID;
    }


    @Override
    public Value visitAssignment(SimplePascalParser.AssignmentContext ctx) {
        String id = ctx.variable().getText();
        Variable variable = findVariable(id);
        if (variable != null){
            Value value = this.visit(ctx.expression());
            DataType dataType = memory.get(variable).getDataType();
            value.setDataType(dataType);
            return memory.put(variable, value);
        }
        return Value.VOID;
    }

    @Override
    public Value visitVarExpression(SimplePascalParser.VarExpressionContext ctx) {
        String id = ctx.getText();
        Variable variable = findVariable(id);
        if (variable == null) {
            //throw new RuntimeException("No such variable: " + id);
            System.out.println("!No such variable: " + id);
            return Value.VOID;
        }
        else
            return memory.get(variable);
    }

    @Override
    public Value visitRealConst(SimplePascalParser.RealConstContext ctx) {
        return new Value(Double.valueOf(ctx.getText()), new DataType("real"));
    }

    @Override
    public Value visitBooleanConst(SimplePascalParser.BooleanConstContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()), new DataType("boolean"));
    }

    @Override
    public Value visitCharConst(SimplePascalParser.CharConstContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "'");
        return new Value(str.charAt(0), new DataType("char"));
    }

    @Override
    public Value visitIntegerConst(SimplePascalParser.IntegerConstContext ctx) {
        return new Value(Double.valueOf(ctx.getText()), new DataType("integer"));
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

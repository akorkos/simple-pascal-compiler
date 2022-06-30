import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigInteger;
import java.util.*;

public class Visitor extends SimplePascalBaseVisitor<Value> {
    public Map<Variable, Value> memory = new HashMap<Variable, Value>();
    public Map<Function, Parameter> fmemory = new HashMap<>();
    private boolean flag = true;
    private String scope = "Global";;

    @Override
    public Value visitComp_statement(SimplePascalParser.Comp_statementContext ctx) {
        flag = false;
        return Value.VOID;
    }

    //--------------------------------FOR TYPES-------------------------------------------------------------------------

    @Override
    public Value visitType_defs(SimplePascalParser.Type_defsContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        Value value;
        Variable variable;
        String id;
        for (int i = 0; i < ids.size(); i++) {
            id = ids.get(i).getText();
            //variable = findVariable(id);
            value = this.visit(ctx.type_def(i));
            //if (variable == null)
            memory.put(new Variable(id, scope), value);
        }
        return Value.VOID;
    }

    @Override
    public Value visitTypeSet(SimplePascalParser.TypeSetContext ctx) {
        DataType dataType = new DataType(ctx.typename().getText().toLowerCase());
        return new Value(dataType, "Set");
    }

    @Override
    public Value visitTypeRecord(SimplePascalParser.TypeRecordContext ctx) {
        return new Value(null, "Record");
    }

    @Override
    public Value visitTypeSubSection(SimplePascalParser.TypeSubSectionContext ctx) {
        return new Value(null, "SubArea");
    }

    @Override
    public Value visitTypeEnum(SimplePascalParser.TypeEnumContext ctx) {
        List<TerminalNode> ids = ctx.identifiers().ID();
        Integer index = 0;

        for (TerminalNode id : ids) {
            //if (findVariable(id.getText()) == null) {
                memory.put(new Variable(id.getText(), scope), new Value(index, new DataType("enum")));
                index++;
            //}
        }

        return new Value(null, "EnumStruct");
    }

    @Override
    public Value visitTypeArray(SimplePascalParser.TypeArrayContext ctx) {
        DataType dataType = new DataType(ctx.typename().getText().toLowerCase());
        return new Value(dataType, "Array");
    }

    //----------------------------------------------ETC.----------------------------------------------------------------

    @Override
    public Value visitSub_header(SimplePascalParser.Sub_headerContext ctx) {
        SubProgrammTypes type = ctx.FUNCTION() != null ? SubProgrammTypes.Function : SubProgrammTypes.Procedure;
        String id = ctx.ID().getText();
        this.scope = "Local";
        String returnType = null;
        if (ctx.standard_type() != null)
            returnType = ctx.standard_type().getText();
        Parameter parameter = new Parameter();
        int tmp = 0;
        if (ctx.formal_parameters() != null && ctx.formal_parameters().parameter_list() != null) {
            List<SimplePascalParser.IdentifiersContext> ids = ctx.formal_parameters().parameter_list().identifiers();
            List<SimplePascalParser.TypenameContext> types = ctx.formal_parameters().parameter_list().typename();
            tmp = ids.size();
            for (int i = 0; i < ids.size(); i++) {
                for (TerminalNode j : ids.get(i).ID()){
                    String t = types.get(i).getText();
                    if (t.equals("integer") || t.equals("boolean") || t.equals("char") || t.equals("real"))
                        parameter.addParameter(new Variable(j.getText(), scope), new Value(t));
                    else
                        throw new RuntimeException("Parameters must be primitive dataTypes.");
                }
            }
        }
        Function function;
        ReturnType ret = ReturnType.Void;
        if (returnType != null) {
            if (returnType.equals("integer"))
                ret = ReturnType.Integer;
            if (returnType.equals("real"))
                ret = ReturnType.Real;
            if (returnType.equals("boolean"))
                ret = ReturnType.Boolean;
            if (returnType.equals("char"))
                ret = ReturnType.Char;
            function = new Function(id, tmp, type, ret);
        } else
            function = new Function(id, tmp, type);
        if (!findFunction(function.hashCode()))
            fmemory.put(function, parameter);
        return Value.VOID;
    }

    @Override
    public Value visitVariable_defs(SimplePascalParser.Variable_defsContext ctx) {
        List<SimplePascalParser.IdentifiersContext> ids = ctx.identifiers();
        List<SimplePascalParser.TypenameContext> type = ctx.typename();

        for (int i = 0; i < ids.size(); i++) {
            for (TerminalNode j : ids.get(i).ID()){
                String t = type.get(i).getText();
                if (t.equals("integer") || t.equals("boolean") || t.equals("char") || t.equals("real"))
                    memory.put(new Variable(j.getText(), scope), new Value(new DataType(t)));
                else if (findVariable(t) != null)
                    memory.put(new Variable(j.getText(), scope), memory.get(findVariable(t)));
                else
                    System.out.println("The variable: " + t + " is not defined.");
            }
        }

        return Value.VOID;
    }

    @Override
    public Value visitVarID(SimplePascalParser.VarIDContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = findVariable(id);
        if (variable == null) {
            System.out.println("No such variable: " + id);
            return Value.NULL;
        } else
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
            //f (variable == null)
                memory.put(new Variable(id, scope), value);
        }
        return Value.VOID;
    }

    //------------------------------------FOR CONSTANTS-----------------------------------------------------------------

    @Override
    public Value visitRealConst(SimplePascalParser.RealConstContext ctx) {
        if (ctx.getText().contains("0H") || ctx.getText().contains("0h"))
            return new Value(hexadecimalToReal(ctx.getText()), new DataType("real"));
        if (ctx.getText().contains("0B") || ctx.getText().contains("0b"))
            return new Value(binaryToReal(ctx.getText()), new DataType("real"));
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
        if (ctx.getText().contains("0H") || ctx.getText().contains("0h"))
            return new Value(Double.valueOf(hexadecimalToDecimal(ctx.getText())), new DataType("integer"));
        if (ctx.getText().contains("0B") || ctx.getText().contains("0b"))
            return new Value((Double.valueOf(binaryToDecimal(ctx.getText()))), new DataType("integer"));
        return new Value(Integer.valueOf(ctx.getText()), new DataType("integer"));
    }

    //---------------------------------------EXPRESSIONS----------------------------------------------------------------

    @Override
    public Value visitVarExpression(SimplePascalParser.VarExpressionContext ctx) {
        String id = ctx.getText();
        if (flag) {
            Variable variable = findVariable(id);
            if (variable == null) {
                System.out.println("No such variable: " + id);
                return Value.VOID;
            } else
                return memory.get(variable);
        }
        return Value.VOID;
    }

    @Override
    public Value visitAddSubExpression(SimplePascalParser.AddSubExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        if (flag) {
            return switch (ctx.op.getType()) {
                case SimplePascalParser.ADDOP -> new Value(left.asDouble() + right.asDouble(), left.getDataType());
                case SimplePascalParser.SUBOP -> new Value(left.asDouble() - right.asDouble(), left.getDataType());
                default -> null;
            };
        }
        return Value.VOID;
    }

    @Override
    public Value visitMuldivExpression(SimplePascalParser.MuldivExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        if (flag){
            if (ctx.op.getType() == SimplePascalParser.MULOP)
                return new Value(left.asDouble() * right.asDouble(), left.getDataType());
            else if (ctx.op.getType() == SimplePascalParser.DIV)
                return new Value(left.asDouble() / right.asDouble(), new DataType("real"));
            else if (ctx.op.getType() == SimplePascalParser.DIVOP){
                if (left.getDataType().getDataType() == PrimativeDataTypes.Integer && right.getDataType().getDataType() == PrimativeDataTypes.Integer)
                    return new Value(left.asInteger() / right.asInteger(), right.getDataType());
                throw new RuntimeException("Values must be Integer.");
            }
            else if (ctx.op.getType() == SimplePascalParser.MOD){
                if (left.getDataType().getDataType() == PrimativeDataTypes.Integer && right.getDataType().getDataType() == PrimativeDataTypes.Integer)
                    return new Value(left.asInteger() % right.asInteger() , left.getDataType());
                throw new RuntimeException("Values must be Integer.");
            } else if (ctx.op.getType() == SimplePascalParser.ANDOP){
                return new Value(left.asBoolean() && right.asBoolean(), left.getDataType());
            }

        }
        return Value.VOID;
    }

    @Override
    public Value visitNotExpression(SimplePascalParser.NotExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        if (flag)
            return new Value(!value.asBoolean(), value.getDataType());
        return Value.VOID;
    }

    @Override
    public Value visitOrExpression(SimplePascalParser.OrExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));
        if (flag)
            return new Value(left.asBoolean() || right.asBoolean(), left.getDataType());
        return Value.VOID;
    }

    @Override
    public Value visitNotationExpression(SimplePascalParser.NotationExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        if (flag){
            return switch (ctx.op.getType()) {
                case SimplePascalParser.ADDOP -> new Value(value.asDouble(), value.getDataType());
                case SimplePascalParser.SUBOP -> new Value(-value.asDouble(), value.getDataType());
                default -> null;
            };
        }
        return Value.VOID;
    }

    @Override
    public Value visitInRElEquExpression(SimplePascalParser.InRElEquExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));
        if (flag) {
            return switch (ctx.op.getType()) {
                case SimplePascalParser.LT -> new Value(left.asDouble() < right.asDouble(), new DataType("boolean"));
                case SimplePascalParser.LTEQ -> new Value(left.asDouble() <= right.asDouble(), new DataType("boolean"));
                case SimplePascalParser.GT -> new Value(left.asDouble() > right.asDouble(), new DataType("boolean"));
                case SimplePascalParser.GTEQ -> new Value(left.asDouble() >= right.asDouble(), new DataType("boolean"));
                case SimplePascalParser.NEQ -> new Value(!Objects.equals(left.asDouble(), right.asDouble()), new DataType("boolean"));
                case SimplePascalParser.EQU -> new Value(Objects.equals(left.asDouble(), right.asDouble()), new DataType("boolean"));
                default -> null;
            };
        }
        return Value.VOID;
    }

    //------------------------------FOR STANDARD TYPES VISIT------------------------------------------------------------

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

    //-----------------------------------TYPENAME VISITNG---------------------------------------------------------------

    @Override
    public Value visitTStandardType(SimplePascalParser.TStandardTypeContext ctx) {
        return this.visit(ctx.standard_type());
    }

    @Override
    public Value visitTID(SimplePascalParser.TIDContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = findVariable(id);
        if (variable == null)
            return Value.NULL;
        return memory.get(variable);
    }

    //-----------------------------------------FUNCTIONS DEFAIND BY ME--------------------------------------------------

    static Integer hexadecimalToDecimal(String hexVal) {
        hexVal = hexVal.substring(2);
        int len = hexVal.length();
        int base = 1;
        int dec_val = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
                dec_val += (hexVal.charAt(i) - 48) * base;
                base = base * 16;
            } else if (hexVal.charAt(i) >= 'A'
                    && hexVal.charAt(i) <= 'F') {
                dec_val += (hexVal.charAt(i) - 55) * base;
                base = base * 16;
            }
        }
        return dec_val;
    }

    static Double hexadecimalToReal(String hexVal) {
        hexVal = hexVal.substring(2);
        int dotPos = hexVal.indexOf('.');
        int len = hexVal.length();

        String[] temp = hexVal.split("[.]");

        int dec1 = hexadecimalToDecimal(temp[0]);
        int dec2 = hexadecimalToDecimal(temp[1]);

        return dec1 + ((dec2 * 1.0) / Math.pow(16, len-dotPos+1));
    }



    static Double binaryToReal(String binVal){
        binVal = binVal.substring(2);
        String withoutPeriod = binVal.replace(".", "");
        double value = new BigInteger(withoutPeriod, 2).doubleValue();
        String binaryDivisor = "1" + binVal.split("\\.")[1].replace("1", "0");
        double divisor = new BigInteger(binaryDivisor, 2).doubleValue();
        return value / divisor;
    }



    static Integer binaryToDecimal(String binVal){
        binVal = binVal.substring(2);
        return Integer.parseInt(binVal, 2);
    }

    private Variable findVariable(String ID) {
        for (Map.Entry<Variable, Value> entry : memory.entrySet()) {
            Variable key = entry.getKey();
            if (key.getID().equals(ID))
                return key;
        }
        return null;
    }

    private Boolean findFunction(int hash){
        for (Function f : fmemory.keySet()){
            if (f.hashCode() == hash)
                return true;
        }
        return false;
    }

}
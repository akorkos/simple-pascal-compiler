// Generated from D:/Desktop/SimplePascal/src\SimplePascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePascalParser}.
 */
public interface SimplePascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplePascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplePascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SimplePascalParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SimplePascalParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SimplePascalParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SimplePascalParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#constdefs}.
	 * @param ctx the parse tree
	 */
	void enterConstdefs(SimplePascalParser.ConstdefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#constdefs}.
	 * @param ctx the parse tree
	 */
	void exitConstdefs(SimplePascalParser.ConstdefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#constant_defs}.
	 * @param ctx the parse tree
	 */
	void enterConstant_defs(SimplePascalParser.Constant_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#constant_defs}.
	 * @param ctx the parse tree
	 */
	void exitConstant_defs(SimplePascalParser.Constant_defsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SimplePascalParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SimplePascalParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notationExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotationExpression(SimplePascalParser.NotationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notationExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotationExpression(SimplePascalParser.NotationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTExpression(SimplePascalParser.TExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTExpression(SimplePascalParser.TExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldivExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMuldivExpression(SimplePascalParser.MuldivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldivExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMuldivExpression(SimplePascalParser.MuldivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inRElEquExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInRElEquExpression(SimplePascalParser.InRElEquExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inRElEquExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInRElEquExpression(SimplePascalParser.InRElEquExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(SimplePascalParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(SimplePascalParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpression(SimplePascalParser.VarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpression(SimplePascalParser.VarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpression(SimplePascalParser.ConstExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpression(SimplePascalParser.ConstExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SimplePascalParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SimplePascalParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seterExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSeterExpression(SimplePascalParser.SeterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seterExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSeterExpression(SimplePascalParser.SeterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(SimplePascalParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(SimplePascalParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SimplePascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SimplePascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SimplePascalParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SimplePascalParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConst(SimplePascalParser.IntegerConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConst(SimplePascalParser.IntegerConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterRealConst(SimplePascalParser.RealConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitRealConst(SimplePascalParser.RealConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConst(SimplePascalParser.BooleanConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConst(SimplePascalParser.BooleanConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterCharConst(SimplePascalParser.CharConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitCharConst(SimplePascalParser.CharConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#setexpression}.
	 * @param ctx the parse tree
	 */
	void enterSetexpression(SimplePascalParser.SetexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#setexpression}.
	 * @param ctx the parse tree
	 */
	void exitSetexpression(SimplePascalParser.SetexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#elexpressions}.
	 * @param ctx the parse tree
	 */
	void enterElexpressions(SimplePascalParser.ElexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#elexpressions}.
	 * @param ctx the parse tree
	 */
	void exitElexpressions(SimplePascalParser.ElexpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#elexpression}.
	 * @param ctx the parse tree
	 */
	void enterElexpression(SimplePascalParser.ElexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#elexpression}.
	 * @param ctx the parse tree
	 */
	void exitElexpression(SimplePascalParser.ElexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#typedefs}.
	 * @param ctx the parse tree
	 */
	void enterTypedefs(SimplePascalParser.TypedefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#typedefs}.
	 * @param ctx the parse tree
	 */
	void exitTypedefs(SimplePascalParser.TypedefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#type_defs}.
	 * @param ctx the parse tree
	 */
	void enterType_defs(SimplePascalParser.Type_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#type_defs}.
	 * @param ctx the parse tree
	 */
	void exitType_defs(SimplePascalParser.Type_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(SimplePascalParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(SimplePascalParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(SimplePascalParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(SimplePascalParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#limits}.
	 * @param ctx the parse tree
	 */
	void enterLimits(SimplePascalParser.LimitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#limits}.
	 * @param ctx the parse tree
	 */
	void exitLimits(SimplePascalParser.LimitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(SimplePascalParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(SimplePascalParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(SimplePascalParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(SimplePascalParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sInteger}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void enterSInteger(SimplePascalParser.SIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sInteger}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void exitSInteger(SimplePascalParser.SIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sReal}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void enterSReal(SimplePascalParser.SRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sReal}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void exitSReal(SimplePascalParser.SRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sBoolean}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void enterSBoolean(SimplePascalParser.SBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sBoolean}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void exitSBoolean(SimplePascalParser.SBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sChar}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void enterSChar(SimplePascalParser.SCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sChar}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void exitSChar(SimplePascalParser.SCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(SimplePascalParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(SimplePascalParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SimplePascalParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SimplePascalParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(SimplePascalParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(SimplePascalParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#vardefs}.
	 * @param ctx the parse tree
	 */
	void enterVardefs(SimplePascalParser.VardefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#vardefs}.
	 * @param ctx the parse tree
	 */
	void exitVardefs(SimplePascalParser.VardefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#variable_defs}.
	 * @param ctx the parse tree
	 */
	void enterVariable_defs(SimplePascalParser.Variable_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#variable_defs}.
	 * @param ctx the parse tree
	 */
	void exitVariable_defs(SimplePascalParser.Variable_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void enterSubprograms(SimplePascalParser.SubprogramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void exitSubprograms(SimplePascalParser.SubprogramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(SimplePascalParser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(SimplePascalParser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#sub_header}.
	 * @param ctx the parse tree
	 */
	void enterSub_header(SimplePascalParser.Sub_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#sub_header}.
	 * @param ctx the parse tree
	 */
	void exitSub_header(SimplePascalParser.Sub_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameters(SimplePascalParser.Formal_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameters(SimplePascalParser.Formal_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SimplePascalParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SimplePascalParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#pass}.
	 * @param ctx the parse tree
	 */
	void enterPass(SimplePascalParser.PassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#pass}.
	 * @param ctx the parse tree
	 */
	void exitPass(SimplePascalParser.PassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#comp_statement}.
	 * @param ctx the parse tree
	 */
	void enterComp_statement(SimplePascalParser.Comp_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#comp_statement}.
	 * @param ctx the parse tree
	 */
	void exitComp_statement(SimplePascalParser.Comp_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SimplePascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SimplePascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimplePascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimplePascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimplePascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimplePascalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SimplePascalParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SimplePascalParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_tail(SimplePascalParser.If_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_tail(SimplePascalParser.If_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SimplePascalParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SimplePascalParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(SimplePascalParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(SimplePascalParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void enterIter_space(SimplePascalParser.Iter_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void exitIter_space(SimplePascalParser.Iter_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_statement(SimplePascalParser.With_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_statement(SimplePascalParser.With_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#subprogram_call}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_call(SimplePascalParser.Subprogram_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#subprogram_call}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_call(SimplePascalParser.Subprogram_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(SimplePascalParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(SimplePascalParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#read_list}.
	 * @param ctx the parse tree
	 */
	void enterRead_list(SimplePascalParser.Read_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#read_list}.
	 * @param ctx the parse tree
	 */
	void exitRead_list(SimplePascalParser.Read_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#read_item}.
	 * @param ctx the parse tree
	 */
	void enterRead_item(SimplePascalParser.Read_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#read_item}.
	 * @param ctx the parse tree
	 */
	void exitRead_item(SimplePascalParser.Read_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#write_list}.
	 * @param ctx the parse tree
	 */
	void enterWrite_list(SimplePascalParser.Write_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#write_list}.
	 * @param ctx the parse tree
	 */
	void exitWrite_list(SimplePascalParser.Write_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#write_item}.
	 * @param ctx the parse tree
	 */
	void enterWrite_item(SimplePascalParser.Write_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#write_item}.
	 * @param ctx the parse tree
	 */
	void exitWrite_item(SimplePascalParser.Write_itemContext ctx);
}
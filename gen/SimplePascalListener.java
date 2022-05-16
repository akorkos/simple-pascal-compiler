// Generated from D:/CSD/4 - Semester/SGP/SimplePascal/src\SimplePascal.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimplePascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimplePascalParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SimplePascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SimplePascalParser.ConstantContext ctx);
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
	 * Enter a parse tree produced by {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void enterStandard_type(SimplePascalParser.Standard_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 */
	void exitStandard_type(SimplePascalParser.Standard_typeContext ctx);
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
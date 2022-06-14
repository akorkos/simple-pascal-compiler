// Generated from D:/Desktop/SimplePascal/src\SimplePascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplePascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplePascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimplePascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SimplePascalParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SimplePascalParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#constdefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdefs(SimplePascalParser.ConstdefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#constant_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_defs(SimplePascalParser.Constant_defsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SimplePascalParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notationExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotationExpression(SimplePascalParser.NotationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTExpression(SimplePascalParser.TExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivExpression(SimplePascalParser.MuldivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inRElEquExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInRElEquExpression(SimplePascalParser.InRElEquExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(SimplePascalParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpression(SimplePascalParser.VarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpression(SimplePascalParser.ConstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SimplePascalParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seterExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeterExpression(SimplePascalParser.SeterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link SimplePascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(SimplePascalParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SimplePascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SimplePascalParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(SimplePascalParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConst(SimplePascalParser.RealConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConst(SimplePascalParser.BooleanConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charConst}
	 * labeled alternative in {@link SimplePascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharConst(SimplePascalParser.CharConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#setexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetexpression(SimplePascalParser.SetexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#elexpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElexpressions(SimplePascalParser.ElexpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#elexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElexpression(SimplePascalParser.ElexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#typedefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefs(SimplePascalParser.TypedefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#type_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_defs(SimplePascalParser.Type_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(SimplePascalParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(SimplePascalParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#limits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimits(SimplePascalParser.LimitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(SimplePascalParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(SimplePascalParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sInteger}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSInteger(SimplePascalParser.SIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sReal}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSReal(SimplePascalParser.SRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sBoolean}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSBoolean(SimplePascalParser.SBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sChar}
	 * labeled alternative in {@link SimplePascalParser#standard_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSChar(SimplePascalParser.SCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(SimplePascalParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SimplePascalParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(SimplePascalParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#vardefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardefs(SimplePascalParser.VardefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#variable_defs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_defs(SimplePascalParser.Variable_defsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#subprograms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprograms(SimplePascalParser.SubprogramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(SimplePascalParser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#sub_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_header(SimplePascalParser.Sub_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#formal_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameters(SimplePascalParser.Formal_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(SimplePascalParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass(SimplePascalParser.PassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#comp_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_statement(SimplePascalParser.Comp_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SimplePascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimplePascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimplePascalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SimplePascalParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#if_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tail(SimplePascalParser.If_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(SimplePascalParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(SimplePascalParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#iter_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_space(SimplePascalParser.Iter_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#with_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_statement(SimplePascalParser.With_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#subprogram_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_call(SimplePascalParser.Subprogram_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_statement(SimplePascalParser.Io_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#read_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_list(SimplePascalParser.Read_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#read_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_item(SimplePascalParser.Read_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#write_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_list(SimplePascalParser.Write_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#write_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_item(SimplePascalParser.Write_itemContext ctx);
}
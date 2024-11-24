// Generated from C:/Users/DELL/IdeaProjects/Angular/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AngularParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(AngularParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(AngularParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(AngularParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(AngularParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttribute(AngularParser.JsxAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttribute(AngularParser.JsxAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void enterJsxClass(AngularParser.JsxClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#jsxClass}.
	 * @param ctx the parse tree
	 */
	void exitJsxClass(AngularParser.JsxClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(AngularParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(AngularParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(AngularParser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AngularParser.PrintStatementContext ctx);
}
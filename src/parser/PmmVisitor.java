// Generated from C:/Users/Sergio Arroni/IdeaProjects/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.definition.*;
import ast.expression.*;
import ast.expression.literal.*;
import ast.expression.operator.*;
import ast.statement.*;
import ast.type.*;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.*;
import ast.*;
import java.util.*;
import symboltable.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDef(PmmParser.ListDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(PmmParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defVaribales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVaribales(PmmParser.DefVaribalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PmmParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(PmmParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(PmmParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(PmmParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#functionTypeParametersAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParametersAux(PmmParser.FunctionTypeParametersAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#tipoSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoSimple(PmmParser.TipoSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#inBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBody(PmmParser.InBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statementbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementbody(PmmParser.StatementbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(PmmParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
}
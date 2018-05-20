// Generated from src/main/java/me/at15/yayaml/YAML.g4 by ANTLR 4.7.1
package me.at15.yayaml;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YAMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YAMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YAMLParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(YAMLParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link YAMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(YAMLParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link YAMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(YAMLParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValDouble}
	 * labeled alternative in {@link YAMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDouble(YAMLParser.ValDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link YAMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(YAMLParser.ValStringContext ctx);
}
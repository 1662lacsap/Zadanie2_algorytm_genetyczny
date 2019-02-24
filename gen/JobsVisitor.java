// Generated from /Users/anulka/Downloads/zadanie2czasy/src/main/java/Jobs.g4 by ANTLR 4.7.2

import java.util.LinkedList;
import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JobsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JobsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JobsParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(JobsParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(JobsParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(JobsParser.IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(JobsParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#forEachValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachValues(JobsParser.ForEachValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#getINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetINT(JobsParser.GetINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobsParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(JobsParser.EndContext ctx);
}
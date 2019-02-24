// Generated from /Users/anulka/Downloads/zadanie2czasy/src/main/java/Jobs.g4 by ANTLR 4.7.2

import java.util.LinkedList;
import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobsParser}.
 */
public interface JobsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobsParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(JobsParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(JobsParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(JobsParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(JobsParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(JobsParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(JobsParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(JobsParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(JobsParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#forEachValues}.
	 * @param ctx the parse tree
	 */
	void enterForEachValues(JobsParser.ForEachValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#forEachValues}.
	 * @param ctx the parse tree
	 */
	void exitForEachValues(JobsParser.ForEachValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#getINT}.
	 * @param ctx the parse tree
	 */
	void enterGetINT(JobsParser.GetINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#getINT}.
	 * @param ctx the parse tree
	 */
	void exitGetINT(JobsParser.GetINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobsParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(JobsParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobsParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(JobsParser.EndContext ctx);
}
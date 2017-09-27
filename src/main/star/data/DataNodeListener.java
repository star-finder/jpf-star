// Generated from DataNode.g4 by ANTLR 4.7

package star.data;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataNodeParser}.
 */
public interface DataNodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataNodeParser#datas}.
	 * @param ctx the parse tree
	 */
	void enterDatas(DataNodeParser.DatasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataNodeParser#datas}.
	 * @param ctx the parse tree
	 */
	void exitDatas(DataNodeParser.DatasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataNodeParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(DataNodeParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataNodeParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(DataNodeParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataNodeParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(DataNodeParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataNodeParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(DataNodeParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataNodeParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(DataNodeParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataNodeParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(DataNodeParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataNodeParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DataNodeParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataNodeParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DataNodeParser.FieldContext ctx);
}
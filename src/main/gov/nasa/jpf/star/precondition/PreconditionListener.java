// Generated from Precondition.g4 by ANTLR 4.7

package gov.nasa.jpf.star.precondition;

import gov.nasa.jpf.star.formula.*;
import gov.nasa.jpf.star.formula.heap.*;
import gov.nasa.jpf.star.formula.pure.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PreconditionParser}.
 */
public interface PreconditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#pres}.
	 * @param ctx the parse tree
	 */
	void enterPres(PreconditionParser.PresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#pres}.
	 * @param ctx the parse tree
	 */
	void exitPres(PreconditionParser.PresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(PreconditionParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(PreconditionParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#pre}.
	 * @param ctx the parse tree
	 */
	void enterPre(PreconditionParser.PreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#pre}.
	 * @param ctx the parse tree
	 */
	void exitPre(PreconditionParser.PreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PreconditionParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PreconditionParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PreconditionParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PreconditionParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(PreconditionParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(PreconditionParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#heapTerms}.
	 * @param ctx the parse tree
	 */
	void enterHeapTerms(PreconditionParser.HeapTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#heapTerms}.
	 * @param ctx the parse tree
	 */
	void exitHeapTerms(PreconditionParser.HeapTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#heapTerm}.
	 * @param ctx the parse tree
	 */
	void enterHeapTerm(PreconditionParser.HeapTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#heapTerm}.
	 * @param ctx the parse tree
	 */
	void exitHeapTerm(PreconditionParser.HeapTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#pointToTerm}.
	 * @param ctx the parse tree
	 */
	void enterPointToTerm(PreconditionParser.PointToTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#pointToTerm}.
	 * @param ctx the parse tree
	 */
	void exitPointToTerm(PreconditionParser.PointToTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#inductiveTerm}.
	 * @param ctx the parse tree
	 */
	void enterInductiveTerm(PreconditionParser.InductiveTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#inductiveTerm}.
	 * @param ctx the parse tree
	 */
	void exitInductiveTerm(PreconditionParser.InductiveTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#pureTerms}.
	 * @param ctx the parse tree
	 */
	void enterPureTerms(PreconditionParser.PureTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#pureTerms}.
	 * @param ctx the parse tree
	 */
	void exitPureTerms(PreconditionParser.PureTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#pureTerm}.
	 * @param ctx the parse tree
	 */
	void enterPureTerm(PreconditionParser.PureTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#pureTerm}.
	 * @param ctx the parse tree
	 */
	void exitPureTerm(PreconditionParser.PureTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#eqNullTerm}.
	 * @param ctx the parse tree
	 */
	void enterEqNullTerm(PreconditionParser.EqNullTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#eqNullTerm}.
	 * @param ctx the parse tree
	 */
	void exitEqNullTerm(PreconditionParser.EqNullTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#neNullTerm}.
	 * @param ctx the parse tree
	 */
	void enterNeNullTerm(PreconditionParser.NeNullTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#neNullTerm}.
	 * @param ctx the parse tree
	 */
	void exitNeNullTerm(PreconditionParser.NeNullTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#eqTerm}.
	 * @param ctx the parse tree
	 */
	void enterEqTerm(PreconditionParser.EqTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#eqTerm}.
	 * @param ctx the parse tree
	 */
	void exitEqTerm(PreconditionParser.EqTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreconditionParser#neTerm}.
	 * @param ctx the parse tree
	 */
	void enterNeTerm(PreconditionParser.NeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreconditionParser#neTerm}.
	 * @param ctx the parse tree
	 */
	void exitNeTerm(PreconditionParser.NeTermContext ctx);
}
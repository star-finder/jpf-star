package gov.nasa.jpf.star.inductive;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;

public class InductivePred {
	
	// e.g. sll
	private String predName;
	
	// inductive predicate definition has form of multiple formulas
	// example: root::sll() === root = null \/ root -> Node(next) * next::sll()
	// this predicate has two formulas
	// first one: heap part = empty, pure part = EqNullTerm(root)
	// second one: heap part = [PointToTerm(root, next, Node),
	// InductiveTerm(next, [], sll)], pure part = True
	private Formula[] formulas;
	
	// parameters of predicate, e.g. root
	private Variable[] params;
	
	public Formula[] getFormulas() {
		return formulas;
	}
	
	public Variable[] getParams() {
		return params;
	}

}

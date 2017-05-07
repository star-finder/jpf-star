package gov.nasa.jpf.inductive;

import gov.nasa.jpf.formula.Formula;

public class InductivePred {
	
	// inductive predicate definition has form of multiple formulas
	// example: root::sll() === root = null \/ root -> Node(next) * next::sll()
	// this predicate has two formulas
	// first one: heap part = empty, pure part = EqNullTerm(root)
	// second one: heap part = [PointToTerm(root, next, Node),
	// InductiveTerm(next, [], sll)], pure part = True
	private Formula[] formulas;
	
	// e.g. sll
	private String predName;
	
	public Formula[] getFormulas() {
		return formulas;
	}

}

package gov.nasa.jpf.formula.heap;

import gov.nasa.jpf.formula.Variable;

// x::sll(), ... term

public class InductiveTerm extends HeapTerm {
	
	// root node
	private Variable root;
	
	// other parameters of predicate
	private Variable[] vars;
	
	// name of predicate: sll
	public String predName;

}

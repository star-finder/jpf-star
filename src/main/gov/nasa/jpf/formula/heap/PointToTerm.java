package gov.nasa.jpf.formula.heap;

import gov.nasa.jpf.formula.Variable;

// x -> Node(...) term

public class PointToTerm extends HeapTerm {
	
	// root node
	private Variable root;
	
	// fields of pointed node
	private Variable[] vars;
	
	// type of pointed node, e.g. Node
	private String type;

}

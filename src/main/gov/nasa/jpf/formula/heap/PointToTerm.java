package gov.nasa.jpf.formula.heap;

import java.util.Map;

import gov.nasa.jpf.formula.Variable;

// x -> Node(...) term

public class PointToTerm extends HeapTerm {
	
	// variables of current PointToTerm,
	// first var is the root node
	// other var is the fields of pointed node
	private Variable[] vars;
	
	// type of pointed node, e.g. Node
	private String type;

	public PointToTerm(Variable[] vars, String type) {
		this.vars = vars;
		this.type = type;
	}
	
	@Override
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return this;
	}
	
}

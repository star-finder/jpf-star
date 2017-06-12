package gov.nasa.jpf.star.formula.heap;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public abstract class HeapTerm {
	
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}
	
	public HeapTerm copy() {
		return this;
	}
	
	public String toS2SATString() {
		return "";
	}

}

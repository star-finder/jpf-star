package gov.nasa.jpf.formula.heap;

import java.util.Map;

import gov.nasa.jpf.formula.Variable;

public abstract class HeapTerm {
	
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}

}

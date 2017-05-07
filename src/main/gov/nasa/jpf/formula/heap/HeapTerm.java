package gov.nasa.jpf.formula.heap;

import java.util.Map;

import gov.nasa.jpf.formula.Variable;

public abstract class HeapTerm {
	
	public HeapTerm substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		return null;
	}

}

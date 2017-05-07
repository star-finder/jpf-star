package gov.nasa.jpf.formula.heap;

import java.util.Map;

import gov.nasa.jpf.formula.Variable;

public class Empty extends HeapTerm {
	
	@Override
	public HeapTerm substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		return new Empty();
	}

}

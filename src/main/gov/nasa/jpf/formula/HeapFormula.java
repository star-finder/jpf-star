package gov.nasa.jpf.formula;

import java.util.Map;

import gov.nasa.jpf.formula.heap.HeapTerm;

// a heap formula includes multiple heap terms

public class HeapFormula {
	
	private HeapTerm[] heapTerms;
	
	public HeapFormula substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		return this;
	}

}

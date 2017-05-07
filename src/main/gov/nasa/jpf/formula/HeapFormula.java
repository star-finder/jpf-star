package gov.nasa.jpf.formula;

import java.util.Map;

import gov.nasa.jpf.formula.heap.HeapTerm;

// a heap formula includes multiple heap terms

public class HeapFormula {
	
	private HeapTerm[] heapTerms;
	
	public HeapFormula(HeapTerm[] heapTerms) {
		this.heapTerms = heapTerms;
	}
	
	public HeapFormula substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		int length = heapTerms.length;
		HeapTerm[] newHeapTerms = new HeapTerm[length];
		
		for (int i = 0; i < length; i++) {
			newHeapTerms[i] = heapTerms[i].substitute(params, vars, existVarSubMap);
		}
		
		HeapFormula newHeapFormula = new HeapFormula(newHeapTerms);
		
		return this;
	}

}

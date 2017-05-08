package gov.nasa.jpf.star.formula;

import java.util.Map;

import gov.nasa.jpf.star.formula.heap.HeapTerm;

// a heap formula includes multiple heap terms

public class HeapFormula {
	
	// contains array of heap term, empty mean the heap is empty
	private HeapTerm[] heapTerms;
	
	public HeapFormula(HeapTerm[] heapTerms) {
		this.heapTerms = heapTerms;
	}
	
	public HeapFormula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = heapTerms.length;
		HeapTerm[] newHeapTerms = new HeapTerm[length];
		
		for (int i = 0; i < length; i++) {
			newHeapTerms[i] = heapTerms[i].substitute(fromVars, toVars, existVarSubMap);
		}
		
		HeapFormula newHeapFormula = new HeapFormula(newHeapTerms);
		
		return newHeapFormula;
	}

}

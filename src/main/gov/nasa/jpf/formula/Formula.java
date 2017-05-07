package gov.nasa.jpf.formula;

// a formula includes heap part and pure part

public class Formula {
	
	private HeapFormula heapFormula;
	
	private PureFormula pureFormula;
	
	// substitute parameters with 
	public Formula substitute(Variable[] params, Variable[] vars) {
		// currently not do anything
		return this;
	}

}

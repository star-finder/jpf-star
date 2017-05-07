package gov.nasa.jpf.formula;

import java.util.HashMap;
import java.util.Map;

// a formula includes heap part and pure part

public class Formula {
	
	private HeapFormula heapFormula;
	
	private PureFormula pureFormula;
	
	public Formula(HeapFormula heapFormula, PureFormula pureFormula) {
		this.heapFormula = heapFormula;
		this.pureFormula = pureFormula;
	}
	
	// substitute parameters with new vars
	public Formula substitute(Variable[] params, Variable[] vars) {
		// currently not do anything
		
		// besides parameters, formula may contain other existential variables
		// must guarantee all existential variables substitue to fresh variables
		// the same old variable should be substituted to the same new variables
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapFormula newHeapFormula = heapFormula.substitute(params, vars, existVarSubMap);
		PureFormula newPureFormula = pureFormula.substitute(params, vars, existVarSubMap);
		
		Formula newFormula = new Formula(newHeapFormula, newPureFormula);
		
		return newFormula;
	}

}

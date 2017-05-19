package gov.nasa.jpf.star.formula;

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
	public Formula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		HeapFormula newHeapFormula = heapFormula.substitute(fromVars, toVars, existVarSubMap);
		PureFormula newPureFormula = pureFormula.substitute(fromVars, toVars, existVarSubMap);
		
		Formula newFormula = new Formula(newHeapFormula, newPureFormula);
		
		return newFormula;
	}
	
	@Override
	public String toString() {
		String heapString = heapFormula.toString();
		String pureString = pureFormula.toString();
		
		if (heapString.equals("emp"))
			return pureString;
		else if (pureString.equals("true"))
			return heapString;
		else
			return heapString + " & " + pureString;
	}

}

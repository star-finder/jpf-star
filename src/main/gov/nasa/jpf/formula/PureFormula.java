package gov.nasa.jpf.formula;

import java.util.Map;

import gov.nasa.jpf.formula.pure.PureTerm;

// a pure formula includes multiple pure terms

public class PureFormula {
	
	private PureTerm[] pureTerms;
	
	public PureFormula(PureTerm[] pureTerms) {
		this.pureTerms = pureTerms;
	}
	
	public PureFormula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = pureTerms.length;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			newPureTerms[i] = pureTerms[i].substitute(fromVars, toVars, existVarSubMap);
		}
		
		PureFormula newPureFormula = new PureFormula(newPureTerms);
		
		return newPureFormula;
	}

}

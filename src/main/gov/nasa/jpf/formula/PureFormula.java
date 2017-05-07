package gov.nasa.jpf.formula;

import java.util.Map;

import gov.nasa.jpf.formula.pure.PureTerm;

// a pure formula includes multiple pure terms

public class PureFormula {
	
	private PureTerm[] pureTerms;
	
	public PureFormula substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		return this;
	}

}

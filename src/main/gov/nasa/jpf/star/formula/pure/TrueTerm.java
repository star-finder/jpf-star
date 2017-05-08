package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public class TrueTerm extends PureTerm {
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return new TrueTerm();
	}
	
	@Override
	public String toString() {
		return "true";
	}

}

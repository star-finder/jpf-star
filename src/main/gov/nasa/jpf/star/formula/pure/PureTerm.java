package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public abstract class PureTerm {
	
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}
	
	public PureTerm copy() {
		return this;
	}

}

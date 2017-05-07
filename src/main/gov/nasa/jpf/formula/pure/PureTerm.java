package gov.nasa.jpf.formula.pure;

import java.util.Map;

import gov.nasa.jpf.formula.Variable;

public abstract class PureTerm {
	
	public PureTerm substitute(Variable[] params, Variable[] vars,
			Map<String,String> existVarSubMap) {
		return null;
	}

}

package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

// x = null term

public class EqNullTerm extends PureTerm {
	
	private Variable var;
	
	public EqNullTerm(Variable var) {
		this.var = var;
	}
	
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Variable oldVar = var;
		
		int index = Utility.contains(fromVars, oldVar);
		
		if (index != -1) {
			return new EqNullTerm(new Variable(toVars[index]));
		} else {
			Variable freshVar = Utility.freshVar(oldVar);
			existVarSubMap.put(oldVar.getName(), freshVar.getName());
			return new EqNullTerm(freshVar);
		}
	}

}

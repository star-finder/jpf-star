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
		
		Variable newVar = null;
		
		if (index != -1) {
			newVar = new Variable(toVars[index]);
		} else {
			Variable freshVar = Utility.freshVar(oldVar);
			existVarSubMap.put(oldVar.getName(), freshVar.getName());
			newVar = freshVar;
		}
		
		EqNullTerm newEqNullTerm = new EqNullTerm(newVar);
		return newEqNullTerm;
	}

}

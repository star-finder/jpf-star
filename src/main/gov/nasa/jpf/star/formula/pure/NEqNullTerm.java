package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

// x != null term

public class NEqNullTerm extends PureTerm {
	
	private Variable var;
	
	public NEqNullTerm(Variable var) {
		this.var = var;
	}
	
	@Override
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
		
		NEqNullTerm newNEqNullTerm = new NEqNullTerm(newVar);
		return newNEqNullTerm;
	}
	
	@Override
	public String toString() {
		return var.toString() + " != null";
	}

}

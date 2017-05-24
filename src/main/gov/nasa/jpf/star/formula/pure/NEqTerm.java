package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

// x != y term

public class NEqTerm extends PureTerm {
	
	private Variable var1;
	
	private Variable var2;
	
	public NEqTerm(Variable var1, Variable var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Variable oldVar1 = var1;
		Variable oldVar2 = var2;
		
		int index1 = Utility.contains(fromVars, oldVar1);
		int index2 = Utility.contains(fromVars, oldVar2);
		
		Variable newVar1 = null;
		Variable newVar2 = null;
		
		if (index1 != -1) {
			newVar1 = new Variable(toVars[index1]);
		} else if (existVarSubMap.containsKey(oldVar1.getName())) {
			newVar1 = new Variable(existVarSubMap.get(oldVar1.getName()), oldVar1.getType());
		} else {
			Variable freshVar = Utility.freshVar(oldVar1);
			existVarSubMap.put(oldVar1.getName(), freshVar.getName());
			newVar1 = freshVar;
		}
		
		if (index2 != -1) {
			newVar2 = new Variable(toVars[index2]);
		} else if (existVarSubMap.containsKey(oldVar2.getName())) {
			newVar2 = new Variable(existVarSubMap.get(oldVar2.getName()), oldVar2.getType());
		} else {
			Variable freshVar = Utility.freshVar(oldVar2);
			existVarSubMap.put(oldVar2.getName(), freshVar.getName());
			newVar2 = freshVar;
		}
		
		NEqTerm newNEqTerm = new NEqTerm(newVar1, newVar2);
		return newNEqTerm;
	}
	
//	@Override
//	public PureTerm copy() {
//		return new NEqTerm(var1, var2);
//	}
	
	@Override
	public String toString() {
		return var1.toString() + " != " + var2.toString();
	}

}

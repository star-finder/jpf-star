package gov.nasa.jpf.star.formula.expression;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

public class IntegerVariable extends IntegerExpression {
	
	private Variable var;
	
	public IntegerVariable(Variable var) {
		this.var = var;
	}
	
	@Override
	public IntegerExpression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Variable oldVar = var;
		
		int index = Utility.find(fromVars, oldVar);
		
		Variable newVar = null;
		
		if (index != -1) {
			newVar = new Variable(toVars[index]);
		} else if (existVarSubMap.containsKey(oldVar.getName())) {
			newVar = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
		} else {
			Variable freshVar = Utility.freshVar(oldVar);
			existVarSubMap.put(oldVar.getName(), freshVar.getName());
			newVar = freshVar;
		}
		
		IntegerVariable newExpr = new IntegerVariable(newVar);
		return newExpr;
	}

	@Override
	public String toString() {
		return var.toString();
	}
	
}

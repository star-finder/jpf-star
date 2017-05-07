package gov.nasa.jpf.star.formula.heap;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

// x -> Node(...) term

public class PointToTerm extends HeapTerm {
	
	// variables of current PointToTerm,
	// first var is the root node
	// other var is the fields of pointed node
	private Variable[] vars;
	
	// type of pointed node, e.g. Node
	private String type;

	public PointToTerm(Variable[] vars, String type) {
		this.vars = vars;
		this.type = type;
	}
	
	@Override
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = vars.length;
		
		Variable[] newVars = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			Variable oldVar = vars[i];
			
			int index = Utility.contains(fromVars, oldVar);
			
			if (index != -1) {
				newVars[i] = new Variable(toVars[index]);
			} else if (existVarSubMap.containsKey(oldVar.getName())) {
				newVars[i] = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
			} else {
				Variable freshVar = Utility.freshVar(oldVar);
				existVarSubMap.put(oldVar.getName(), freshVar.getName());
				newVars[i] = new Variable(freshVar);
			}
		}
		
		PointToTerm newPointToTerm = new PointToTerm(newVars, type);
		
		return newPointToTerm;
	}
	
}

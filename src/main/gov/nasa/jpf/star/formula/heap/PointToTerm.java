package gov.nasa.jpf.star.formula.heap;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;

// x -> Node(...) term

public class PointToTerm extends HeapTerm {
	
	// type of pointed node, e.g. Node
	private String type;
	
	// variables of current PointToTerm,
	// first var is the root node
	// other var is the fields of pointed node
	private Variable[] vars;
	
	public PointToTerm(String type, Variable... vars) {
		this.type = type;
		this.vars = vars;
	}
	
	public String getType() {
		return type;
	}
	
	public Variable getRoot() {
		return vars[0];
	}
	
	public Variable[] getVars() {
		return vars;
	}
	
	@Override
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = vars.length;
		
		Variable[] newVars = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			Variable oldVar = vars[i];
			
			int index = Utility.find(fromVars, oldVar);
			
			if (index != -1) {
				newVars[i] = new Variable(toVars[index]);
			} else if (existVarSubMap == null) {
				newVars[i] = oldVar;
			} else {
				if (existVarSubMap.containsKey(oldVar.getName())) {
					newVars[i] = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
				} else {
					Variable freshVar = Utility.freshVar(oldVar);
					existVarSubMap.put(oldVar.getName(), freshVar.getName());
					newVars[i] = new Variable(freshVar);
				}
			}
		}
		
		PointToTerm newPointToTerm = new PointToTerm(type, newVars);
		
		return newPointToTerm;
	}
	
//	@Override
//	public HeapTerm copy() {
//		return new PointToTerm(type, vars);
//	}
	
	@Override
	public String toString() {
		assert vars.length > 0;
		
		Variable root = vars[0];
		
		String params = "";
		for (int i = 1; i < vars.length; i++) {
			params += vars[i] + ",";
		}
		
		if (params.length() > 0)
			params = params.substring(0, params.length() - 1);
		
		String ret = root + "->" + type + "(" + params + ")";
		return ret;
	}
	
	public String toS2SATString() {
		assert vars.length > 0;
		
		Variable root = vars[0];
		
		String params = "";
		for (int i = 1; i < vars.length; i++) {
			params += vars[i] + ",";
		}
		
		if (params.length() > 0)
			params = params.substring(0, params.length() - 1);
		
		String ret = root + "::" + type + "<" + params + ">";
		return ret;
	}
	
}

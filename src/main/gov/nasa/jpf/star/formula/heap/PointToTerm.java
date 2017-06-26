package gov.nasa.jpf.star.formula.heap;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.formula.Utilities;
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
	
	@Override
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
			
			int index = Utilities.find(fromVars, oldVar);
			
			if (index != -1) {
				newVars[i] = new Variable(toVars[index]);
			} else if (existVarSubMap == null) {
				newVars[i] = oldVar;
			} else {
				if (existVarSubMap.containsKey(oldVar.getName())) {
					newVars[i] = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
				} else {
					Variable freshVar = Utilities.freshVar(oldVar);
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
	public void updateType(List<Variable> knownTypeVars) {
		DataNode dn = DataNodeMap.find(type);
		Variable[] field = dn.getFields();
		
		for (int i = 0; i < vars.length; i++) {
			if (i == 0) {
				vars[i].setType(type);
			} else {
				vars[i].setType(field[i - 1].getType());
			}
			
			if (!knownTypeVars.contains(vars[i]))
				knownTypeVars.add(vars[i]);
		}
	}
	
	public void genTest(List<Variable> initVars, StringBuffer test) {
		if (!initVars.contains(vars[0])) {
			initVars.add(vars[0]);
			test.append("\t\t" + vars[0].getType() + " " + vars[0].getName() + " = new " + type + "();\n");
		}
	}
	
	public void setFields(StringBuffer test) {
		int length = vars.length;
		DataNode dn = DataNodeMap.find(type);
		
		Variable[] fields = dn.getFields();
		
		for (int i = 1; i < length; i++) {
			test.append("\t\t" + vars[0].getName() + "." + fields[i - 1].getName() + " = " + vars[i] + ";\n");
		}
	}
	
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

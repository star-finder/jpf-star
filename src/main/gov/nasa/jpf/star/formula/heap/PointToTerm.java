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
		Variable[] fields = dn.getFields();
		
		for (int i = 0; i < vars.length; i++) {
			if (i == 0) {
				vars[i].setType(type);
			} else {
				vars[i].setType(fields[i - 1].getType());
			}
			
			if (!knownTypeVars.contains(vars[i]))
				knownTypeVars.add(vars[i]);
		}
	}
	
	@Override
	public void genTest(List<Variable> initVars, StringBuffer test, String objName, String clsName) {
		if (!initVars.contains(vars[0])) {
			initVars.add(vars[0]);
			
			String name = vars[0].getName();
			String type = vars[0].getType();
			
			if (name.startsWith("this_"))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = new " + type + "();\n");
			else if (name.startsWith(clsName + "_"))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = new " + type + "();\n");
			else
				test.append("\t\t" + type + " " + name + " = new " + type + "();\n");
		}
	}
	
	@Override
	public void setFields(StringBuffer test, String objName, String clsName) {
		int length = vars.length;
		DataNode dn = DataNodeMap.find(type);
		
		Variable[] fields = dn.getFields();
		
		for (int i = 1; i < length; i++) {
			String name0 = vars[0].getName();
			String nameI = vars[i].getName();
			
			if (name0.startsWith("this_"))
				name0 = name0.replace("this_", objName + ".");
			else if (name0.startsWith(clsName + "_"))
				name0 = name0.replace(clsName + "_", clsName + ".");
			
			if (nameI.startsWith("this_"))
				nameI = nameI.replace("this_", objName + ".");
			else if (nameI.startsWith(clsName + "_"))
				nameI = nameI.replace(clsName + "_", clsName + ".");
			
			test.append("\t\t" + name0 + "." + fields[i - 1].getName() + " = " + nameI + ";\n");
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

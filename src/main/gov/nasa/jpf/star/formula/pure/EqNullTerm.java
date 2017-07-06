package gov.nasa.jpf.star.formula.pure;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.vm.FieldInfo;

// x = null term

public class EqNullTerm extends PureTerm {
	
	private Variable var;
	
	public EqNullTerm(Variable var) {
		this.var = var;
	}
	
	public Variable getVar() {
		return var;
	}
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Variable oldVar = var;
		
		int index = Utilities.find(fromVars, oldVar);
		
		Variable newVar = null;
		
		if (index != -1) {
			newVar = new Variable(toVars[index]);
		} else if (existVarSubMap == null) {
			newVar = oldVar;
		} else {
			if (existVarSubMap.containsKey(oldVar.getName())) {
				newVar = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
			} else {
				Variable freshVar = Utilities.freshVar(oldVar);
				existVarSubMap.put(oldVar.getName(), freshVar.getName());
				newVar = new Variable(freshVar);
			}
		}
		
		EqNullTerm newEqNullTerm = new EqNullTerm(newVar);
		return newEqNullTerm;
	}
	
//	@Override
//	public PureTerm copy() {
//		return new EqNullTerm(var);
//	}
	
	@Override
	public void updateType(List<Variable> knownTypeVars) {
		for (Variable v : knownTypeVars) {
			if (v.equals(var)) {
				var.setType(v.getType());
			}
		}
	}
	
	@Override
	public void genConcreteVars(List<Variable> initVars, StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		if (!initVars.contains(var)) {
			initVars.add(var);
			
			String name = var.getName();
			String type = var.getType();
			
			if (var.isInstance(insFields))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = null;\n");
			else if (var.isStatic(clsName, staFields))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = null;\n");
			else
				test.append("\t\t" + type + " " + name + " = null;\n");
		}
	}
	
	@Override
	public String toString() {
		return var.toString() + " = null";
	}

}

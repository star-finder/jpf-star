package gov.nasa.jpf.star.formula.pure;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.vm.FieldInfo;

// x != y term

public class NEqTerm extends PureTerm {
	
	private Variable var1;
	
	private Variable var2;
	
	public NEqTerm(Variable var1, Variable var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public Variable getVar1() {
		return var1;
	}
	
	public Variable getVar2() {
		return var2;
	}
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Variable oldVar1 = var1;
		Variable oldVar2 = var2;
		
		int index1 = Utilities.find(fromVars, oldVar1);
		int index2 = Utilities.find(fromVars, oldVar2);
		
		Variable newVar1 = null;
		Variable newVar2 = null;
		
		if (index1 != -1) {
			newVar1 = new Variable(toVars[index1]);
		} else if (existVarSubMap == null) {
			newVar1 = oldVar1;
		} else {
			if (existVarSubMap.containsKey(oldVar1.getName())) {
				newVar1 = new Variable(existVarSubMap.get(oldVar1.getName()), oldVar1.getType());
			} else {
				Variable freshVar = Utilities.freshVar(oldVar1);
				existVarSubMap.put(oldVar1.getName(), freshVar.getName());
				newVar1 = new Variable(freshVar);
			}
		}
		
		if (index2 != -1) {
			newVar2 = new Variable(toVars[index2]);
		} else if (existVarSubMap == null) {
			newVar2 = oldVar2;
		} else {
			if (existVarSubMap.containsKey(oldVar2.getName())) {
				newVar2 = new Variable(existVarSubMap.get(oldVar2.getName()), oldVar2.getType());
			} else {
				Variable freshVar = Utilities.freshVar(oldVar2);
				existVarSubMap.put(oldVar2.getName(), freshVar.getName());
				newVar2 = new Variable(freshVar);
			}
		}
		
		NEqTerm newNEqTerm = new NEqTerm(newVar1, newVar2);
		return newNEqTerm;
	}
	
//	@Override
//	public PureTerm copy() {
//		return new NEqTerm(var1, var2);
//	}
	
	@Override
	public void updateType(List<Variable> knownTypeVars) {
		boolean hasUpdate = false;
		
		for (Variable v : knownTypeVars) {
			if (v.equals(var1) || v.equals(var2)) {
				var1.setType(v.getType());
				var2.setType(v.getType());
				
				hasUpdate = true; 
				
				break;
			}
		}
		
		if (hasUpdate && !knownTypeVars.contains(var1))
			knownTypeVars.add(var1);
		
		if (hasUpdate && !knownTypeVars.contains(var2))
			knownTypeVars.add(var2);
	}
	
	@Override
	public void genNoConcreteVars(List<Variable> initVars, StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		if (!initVars.contains(var1)) {
			initVars.add(var1);
			
			String name = var1.getName();
			String type = var1.getType();
			
			if (var1.isInstance(insFields))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = new " + type + "();\n");
			else if (var1.isStatic(clsName, staFields))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = new " + type + "();\n");
			else
				test.append("\t\t" + type + " " + name + " = new " + type + "();\n");
		}
		
		if (!initVars.contains(var2)) {
			initVars.add(var2);
			
			String name = var2.getName();
			String type = var2.getType();
			
			if (var2.isInstance(insFields))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = new " + type + "();\n");
			else if (var2.isStatic(clsName, staFields))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = new " + type + "();\n");
			else
				test.append("\t\t" + type + " " + name + " = new " + type + "();\n");
		}
	}
	
	@Override
	public String toString() {
		return var1.toString() + " != " + var2.toString();
	}

}

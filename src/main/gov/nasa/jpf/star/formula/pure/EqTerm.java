package gov.nasa.jpf.star.formula.pure;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.vm.FieldInfo;

// x = y term

public class EqTerm extends PureTerm {
	
	private Variable var1;
	
	private Variable var2;
	
	public EqTerm(Variable var1, Variable var2) {
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
		
		EqTerm newEqTerm = new EqTerm(newVar1, newVar2);
		return newEqTerm;
	}
	
//	@Override
//	public PureTerm copy() {
//		return new EqTerm(var1, var2);
//	}
	
	@Override
	public void updateType(List<Variable> knownTypeVars) {
		for (Variable v : knownTypeVars) {
			if (v.equals(var1) || v.equals(var2)) {
				var1.setType(v.getType());
				var2.setType(v.getType());
			}
		}
	}
	
	@Override
	public void genConcreteVars(List<Variable> initVars, StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		if (initVars.contains(var2) && !initVars.contains(var1)) {
			initVars.add(var1);
			
			String name1 = standarizeName(var1, objName, clsName, insFields, staFields);
			String name2 = standarizeName(var2, objName, clsName, insFields, staFields);
			
			String type = var1.getType();
			
			if (var1.isInstance(insFields) || var1.isStatic(clsName, staFields))
				test.append("\t\t" + name1 + " = " + name2 + ";\n");
			else
				test.append("\t\t" + type + " " + name1 + " = " + name2 + ";\n");
		}
		
		if (initVars.contains(var1) && !initVars.contains(var2)) {
			initVars.add(var2);
			
			String name1 = standarizeName(var1, objName, clsName, insFields, staFields);
			String name2 = standarizeName(var2, objName, clsName, insFields, staFields);
			
			String type = var2.getType();
			
			if (var2.isInstance(insFields) || var2.isStatic(clsName, staFields))
				test.append("\t\t" + name2 + " = " + name1 + ";\n");
			else
				test.append("\t\t" + type + " " + name2 + " = " + name1 + ";\n");
		}
	}
	
	@Override
	public void genNoConcreteVars(List<Variable> initVars, StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		if (initVars.contains(var2) && !initVars.contains(var1)) {
			initVars.add(var1);
			
			String name1 = standarizeName(var1, objName, clsName, insFields, staFields);
			String name2 = standarizeName(var2, objName, clsName, insFields, staFields);
			
			String type = var1.getType();
			
			if (var1.isInstance(insFields) || var1.isStatic(clsName, staFields))
				test.append("\t\t" + name1 + " = " + name2 + ";\n");
			else
				test.append("\t\t" + type + " " + name1 + " = " + name2 + ";\n");
		}
		
		if (initVars.contains(var1) && !initVars.contains(var2)) {
			initVars.add(var2);
			
			String name1 = standarizeName(var1, objName, clsName, insFields, staFields);
			String name2 = standarizeName(var2, objName, clsName, insFields, staFields);
			
			String type = var2.getType();
			
			if (var2.isInstance(insFields) || var2.isStatic(clsName, staFields))
				test.append("\t\t" + name2 + " = " + name1 + ";\n");
			else
				test.append("\t\t" + type + " " + name2 + " = " + name1 + ";\n");
		}
		
		if (!initVars.contains(var1) && !initVars.contains(var2)) {
			initVars.add(var1);
			initVars.add(var2);
			
			String name1 = var1.getName();
			String type1 = var1.getType();
			
			if (var1.isInstance(insFields))
				test.append("\t\t" + name1.replace("this_", objName + ".") + " = new " + type1 + "();\n");
			else if (var1.isStatic(clsName, staFields))
				test.append("\t\t" + name1.replace(clsName + "_", clsName + ".") + " = new " + type1 + "();\n");
			else
				test.append("\t\t" + type1 + " " + name1 + " = new " + type1 + "();\n");
			
			name1 = standarizeName(var1, objName, clsName, insFields, staFields);
			
			String name2 = standarizeName(var2, objName, clsName, insFields, staFields);
			String type2 = var2.getType();
			
			if (var2.isInstance(insFields) || var2.isStatic(clsName, staFields))
				test.append("\t\t" + name2 + " = " + name1 + ";\n");
			else
				test.append("\t\t" + type2 + " " + name2 + " = " + name1 + ";\n");
		}
	}
	
	private String standarizeName(Variable var, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		String name = var.getName();
		
		if (var.isInstance(insFields))
			name = name.replace("this_", objName + ".");
		else if (var.isStatic(clsName, staFields))
			name = name.replace(clsName + "_", clsName + ".");
		
		return name;
	}
	
	@Override
	public String toString() {
		return var1.toString() + " = " + var2.toString();
	}

}

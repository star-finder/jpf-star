package gov.nasa.jpf.star.formula.pure;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;

public class ComparisonTerm extends PureTerm {
	
	private Comparator comp;
	
	private Expression exp1;
	
	private Expression exp2;
	
	public ComparisonTerm(Comparator comp, Expression exp1, Expression exp2) {
		this.comp = comp;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Expression newExp1 = exp1.substitute(fromVars, toVars, existVarSubMap);
		Expression newExp2 = exp2.substitute(fromVars, toVars, existVarSubMap);
		
		ComparisonTerm newTerm = new ComparisonTerm(comp, newExp1, newExp2);
		
		return newTerm;
	}
	
	@Override
	public void updateType(List<Variable> knownTypeVars) {
		exp1.updateType(knownTypeVars);
		exp2.updateType(knownTypeVars);
	}
	
	@Override
	public void genTest(List<Variable> initVars, StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		List<Variable> vars1 = exp1.getVars();
		List<Variable> vars2 = exp2.getVars();
		
		if (comp == Comparator.EQ && exp1 instanceof VariableExpression && 
				!initVars.containsAll(vars1) && (vars2.isEmpty() || initVars.containsAll(vars2))) {
			Variable var = ((VariableExpression) exp1).getVar();
			initVars.add(var);
			
			String name = var.getName();
			String type = var.getType();
			
			if (var.isInstance(insFields))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = " + exp2.toString() + ";\n");
			else if (var.isStatic(clsName, staFields))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = " + exp2.toString() + ";\n");
			else
				test.append("\t\t" + type + " " + name + " = " + exp2.toString() + ";\n");
		}
		
		if (comp == Comparator.EQ && exp2 instanceof VariableExpression && 
				!initVars.containsAll(vars2) && (vars1.isEmpty() || initVars.containsAll(vars1))) {
			Variable var = ((VariableExpression) exp2).getVar();
			initVars.add(var);
			
			String name = var.getName();
			String type = var.getType();
			
			if (var.isInstance(insFields))
				test.append("\t\t" + name.replace("this_", objName + ".") + " = " + exp1.toString() + ";\n");
			else if (var.isStatic(clsName, staFields))
				test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = " + exp1.toString() + ";\n");
			else
				test.append("\t\t" + type + " " + name + " = " + exp1.toString() + ";\n");
		}
	}
	
	@Override
	public String toString() {
		return exp1.toString() + comp.toString() + exp2.toString();
	}

}

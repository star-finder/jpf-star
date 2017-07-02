package gov.nasa.jpf.star.formula;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.formula.pure.ComparisonTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.EqTerm;
import gov.nasa.jpf.star.formula.pure.NEqNullTerm;
import gov.nasa.jpf.star.formula.pure.NEqTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;
import gov.nasa.jpf.symbc.numeric.Comparator;

// a formula includes heap part and pure part

public class Formula {
	
	private HeapFormula heapFormula;
	
	private PureFormula pureFormula;
	
	public Formula(HeapFormula heapFormula, PureFormula pureFormula) {
		this.heapFormula = heapFormula;
		this.pureFormula = pureFormula;
	}
	
	public Formula() {
		this.heapFormula = new HeapFormula();
		this.pureFormula = new PureFormula();
	}
	
	public HeapFormula getHeapFormula() {
		return heapFormula;
	}
	
	public PureFormula getPureFormula() {
		return pureFormula;
	}
	
	public List<List<Variable>> getAlias() {
		return pureFormula.getAlias();
	}
	
	public List<Variable> getAlias(String name) {
		Variable temp = new Variable(name, "");
		
		for (List<Variable> vars : getAlias()) {
			if (vars.contains(temp)) {
				return vars;
			}
		}
		
		return null;
	}
	
	// substitute parameters with new vars
	public Formula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		HeapFormula newHeapFormula = heapFormula.substitute(fromVars, toVars, existVarSubMap);
		PureFormula newPureFormula = pureFormula.substitute(fromVars, toVars, existVarSubMap);
		
		Formula newFormula = new Formula(newHeapFormula, newPureFormula);
		
		return newFormula;
	}
	
	public Formula copy() {
		HeapFormula newHeapFormula = heapFormula.copy();
		PureFormula newPureFormula = pureFormula.copy();
		
		Formula newFormula = new Formula(newHeapFormula, newPureFormula);
		return newFormula;
	}
	
	public void unfold(InductiveTerm it, int index) {
		Formula[] unfoldedFormulas = it.getUnfoldedFormulas();
		Formula f = unfoldedFormulas[index];
		
		int heapSize = f.heapFormula.getHeapTerms().length + heapFormula.getHeapTerms().length - 1;
		int pureSize = f.pureFormula.getPureTerms().length + pureFormula.getPureTerms().length;
		
		HeapTerm[] newHeapTerms = new HeapTerm[heapSize];
		PureTerm[] newPureTerms = new PureTerm[pureSize];
		
		int curr = 0;
		for (int i = 0; i < heapFormula.getHeapTerms().length; i++) {
			if (!heapFormula.getHeapTerms()[i].equals(it)) {
				newHeapTerms[curr] = heapFormula.getHeapTerms()[i];
				curr++;
			}
		}
		
		System.arraycopy(f.heapFormula.getHeapTerms(), 0,
				newHeapTerms, heapFormula.getHeapTerms().length - 1, f.heapFormula.getHeapTerms().length);
		
		System.arraycopy(pureFormula.getPureTerms(), 0,
				newPureTerms, 0, pureFormula.getPureTerms().length);
		System.arraycopy(f.pureFormula.getPureTerms(), 0,
				newPureTerms, pureFormula.getPureTerms().length, f.pureFormula.getPureTerms().length);
		
		heapFormula = new HeapFormula(newHeapTerms);
		pureFormula = new PureFormula(newPureTerms);
	}
	
	public void addPointToTerm(Variable var, String type) {
		DataNode dn = DataNodeMap.find(type);
		Variable[] fields = dn.getFields();
		
		Variable[] vars = new Variable[fields.length + 1];
		
		for (int i = 0; i < vars.length; i++) {
			if (i == 0) vars[i] = new Variable(var.getName(), "");
			else vars[i] = Utilities.freshVar(fields[i - 1]);
		}
		
		HeapTerm ht = new PointToTerm(type, vars);
		heapFormula.addTerm(ht);
	}
	
	public void addEqNullTerm(Variable var) {
		PureTerm term = new EqNullTerm(var);
		pureFormula.addTerm(term);
	}
	
	public void addNEqNullTerm(Variable var) {
		PureTerm term = new NEqNullTerm(var);
		pureFormula.addTerm(term);
	}
	
	public void addEqTerm(Variable var1, Variable var2) {
		PureTerm term = new EqTerm(var1, var2);
		pureFormula.addTerm(term);
	}
	
	public void addNEqTerm(Variable var1, Variable var2) {
		PureTerm term = new NEqTerm(var1, var2);
		pureFormula.addTerm(term);
	}
	
	public void addComparisonTerm(Comparator comp, Expression exp1, Expression exp2) {
		PureTerm term = new ComparisonTerm(comp, exp1, exp2);
		pureFormula.addTerm(term);
	}
	
	public void updateType(List<Variable> knownTypeVars) {
		heapFormula.updateType(knownTypeVars);
		pureFormula.updateType(knownTypeVars);
	}
	
	public void removePrimTerm() {
		pureFormula.removePrimTerm();
	}
	
	public void genTest(List<Variable> knownTypeVars, List<Variable> initVars,
			StringBuffer test, String objName, String clsName) {
		heapFormula.genTest(initVars, test, objName, clsName);
		pureFormula.genTest(initVars, test, objName, clsName);
		
		genExistVars(knownTypeVars, initVars, test, objName, clsName);
		heapFormula.setFields(test, objName, clsName);
	}
	
	private void genExistVars(List<Variable> knownTypeVars, List<Variable> initVars,
			StringBuffer test, String objName, String clsName) {
		if (knownTypeVars.size() == initVars.size())
			return;
		else {
			for (Variable var : knownTypeVars) {
				String name = var.getName();
				String type = var.getType();
				
				if (!initVars.contains(var) && !name.equals("this")) {
					if (var.isPrim()) {
						if (name.startsWith("this_"))
							test.append("\t\t" + name.replace("this_", objName + ".") + " = 0;\n");
						else if (name.startsWith(clsName + "_"))
							test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = 0;\n");
						else
							test.append("\t\t" + type + " " + name + " = 0;\n");
					} else {
						if (name.startsWith("this_"))
							test.append("\t\t" + name.replace("this_", objName + ".") + " = null;\n");
						else if (name.startsWith(clsName + "_"))
							test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = null;\n");
						else
							test.append("\t\t" + type + " " + name + " = null;\n");
					}
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String heapString = heapFormula.toString();
		String pureString = pureFormula.toString();
		
		if (heapString.equals("emp"))
			return pureString;
		else if (pureString.equals("true"))
			return heapString;
		else
			return heapString + " & " + pureString;
	}
	
	public String toS2SATString() {
		String heapString = heapFormula.toS2SATString();
		String pureString = pureFormula.toS2SATString(); 
		
		if (heapString.equals("emp"))
			return pureString;
		else if (pureString.equals("true"))
			return heapString;
		else
			return heapString + " & " + pureString;
	}

}

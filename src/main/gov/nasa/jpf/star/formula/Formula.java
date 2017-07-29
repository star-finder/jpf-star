package gov.nasa.jpf.star.formula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
import gov.nasa.jpf.vm.FieldInfo;

// a formula includes heap part and pure part

public class Formula {
	
	private HeapFormula heapFormula;
	
	private PureFormula pureFormula;
	
	private Map<String, List<Variable>> typeMap;
	
	private Map<String, Integer> addressMap;
	
	private int depth;
	
	public Formula(HeapFormula heapFormula, PureFormula pureFormula,
			Map<String, List<Variable>> typeMap, Map<String, Integer> addressMap, int depth) {
		this.heapFormula = heapFormula;
		this.pureFormula = pureFormula;
		this.typeMap = typeMap;
		this.addressMap = addressMap;
		this.depth = depth;
	}
	
	public Formula(HeapFormula heapFormula, PureFormula pureFormula,
			Map<String, List<Variable>> typeMap, Map<String, Integer> addressMap) {
		this.heapFormula = heapFormula;
		this.pureFormula = pureFormula;
		this.typeMap = typeMap;
		this.addressMap = addressMap;
		this.depth = 0;
	}
	
	public Formula(HeapFormula heapFormula, PureFormula pureFormula) {
		this.heapFormula = heapFormula;
		this.pureFormula = pureFormula;
		this.typeMap = new HashMap<String, List<Variable>>();
		this.addressMap = new HashMap<String, Integer>();
		this.depth = 0;
	}
	
	public Formula() {
		this.heapFormula = new HeapFormula();
		this.pureFormula = new PureFormula();
		this.typeMap = new HashMap<String, List<Variable>>();
		this.addressMap = new HashMap<String, Integer>();
		this.depth = 0;
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
	
	public void setDepth(int d) {
		this.depth = d;
	}
	
	public int getDepth() {
		return depth;
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
		
		Map<String, List<Variable>> newTypeMap = new HashMap<String, List<Variable>>();
		for (Entry<String, List<Variable>> entry : typeMap.entrySet()) {
			String type = entry.getKey();
			List<Variable> vars = entry.getValue();
			
			newTypeMap.put(type, new ArrayList<Variable>(vars));
		}
		
		
		Map<String, Integer> newAddressMap = new HashMap<String, Integer>(addressMap);
		
		Formula newFormula = new Formula(newHeapFormula, newPureFormula, newTypeMap, newAddressMap, depth);
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
		depth++;
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
	
	public void putType(String type, Variable var) {
		List<Variable> vars = findType(type);
		if (vars.size() == 0) {
			vars.add(var);
			typeMap.put(type, vars);
		} else {
			vars.add(var);
		}
	}
	
	public void putAddress(String name, int address) {
		addressMap.put(name, address);
	}
	
	public List<Variable> findType(String type) {
		List<Variable> vars = typeMap.get(type);
		
		if (vars == null) vars = new ArrayList<Variable>();
		
		return vars;
	}
	
	public int findAddress(String name) {
		Integer address = addressMap.get(name);
		
		if (address == null) return -1;
		
		return address;
	}
	
	public int findAddress(List<Variable> vars) {
		if (vars == null)
			return -1;
		
		for (Variable var : vars) {
			String name = var.getName();
			int address = findAddress(name);
			if (address != -1) return address;
		}
		
		return -1;
	}
	
	public void updateType(List<Variable> knownTypeVars) {
		heapFormula.updateType(knownTypeVars);
		pureFormula.updateType(knownTypeVars);
	}
	
	public void removeTerm() {
		pureFormula.removeTerm();
	}
	
	public void genTest(List<Variable> knownTypeVars, List<Variable> initVars,
			StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		heapFormula.genConcreteVars(initVars, test, objName, clsName, insFields, staFields);
		pureFormula.genConcreteVars(initVars, test, objName, clsName, insFields, staFields);
		
		pureFormula.genNoConcreteVars(initVars, test, objName, clsName, insFields, staFields);
		
		genDefaultVars(knownTypeVars, initVars, test, objName, clsName, insFields, staFields);
		
		heapFormula.setFields(test, objName, clsName, insFields, staFields);
	}
	
	private void genDefaultVars(List<Variable> knownTypeVars, List<Variable> initVars,
			StringBuffer test, String objName, String clsName,
			FieldInfo[] insFields, FieldInfo[] staFields) {
		if (knownTypeVars.size() == initVars.size())
			return;
		
		for (Variable var : knownTypeVars) {
			String name = var.getName();
			String type = var.getType();
				
			if (!initVars.contains(var)) {
				if (var.isPrim()) {
					String val = type.equals("boolean") ? "false" : "0";
					
					if (var.isInstance(insFields))
						test.append("\t\t" + name.replace("this_", objName + ".") + " = " + val + ";\n");
					else if (var.isStatic(clsName, staFields))
						test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = " + val + ";\n");
					else
						test.append("\t\t" + type + " " + name + " = " + val + ";\n");
				} else {
					if (var.isInstance(insFields))
						test.append("\t\t" + name.replace("this_", objName + ".") + " = null;\n");
					else if (var.isStatic(clsName, staFields))
						test.append("\t\t" + name.replace(clsName + "_", clsName + ".") + " = null;\n");
					else
						test.append("\t\t" + type + " " + name + " = null;\n");
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

package gov.nasa.jpf.star.formula;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.pure.ComparisonTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.EqTerm;
import gov.nasa.jpf.star.formula.pure.NEqNullTerm;
import gov.nasa.jpf.star.formula.pure.NEqTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;

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
	
	public void addComparisonTerm(Comparator comp, IntegerExpression exp1, IntegerExpression exp2) {
		PureTerm term = new ComparisonTerm(comp, exp1, exp2);
		pureFormula.addTerm(term);
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

}

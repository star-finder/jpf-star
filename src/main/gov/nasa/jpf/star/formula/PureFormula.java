package gov.nasa.jpf.star.formula;

import java.util.Map;

import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.NEqNullTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;

// a pure formula includes multiple pure terms

public class PureFormula {
	
	// contains array of pure terms, empty means true
	private PureTerm[] pureTerms;
	
	public PureFormula(PureTerm... pureTerms) {
		this.pureTerms = pureTerms;
	}
	
	public PureTerm[] getPureTerms() {
		return pureTerms;
	}
	
	public PureFormula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = pureTerms.length;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			newPureTerms[i] = pureTerms[i].substitute(fromVars, toVars, existVarSubMap);
		}
		
		PureFormula newPureFormula = new PureFormula(newPureTerms);
		
		return newPureFormula;
	}
	
	public PureFormula copy() {
		int length = pureTerms.length;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			newPureTerms[i] = pureTerms[i].copy();
		}
		
		PureFormula newPureFormula = new PureFormula(newPureTerms);
		return newPureFormula;
	}
	
	public void addEqNullTerm(Variable var) {
		EqNullTerm term = new EqNullTerm(var);
		
		int length = pureTerms.length + 1;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length - 1; i++) {
			newPureTerms[i] = pureTerms[i];
		}
		
		newPureTerms[length - 1] = term;
		pureTerms = newPureTerms;
	}
	
	public void addNEqNullTerm(Variable var) {
		NEqNullTerm term = new NEqNullTerm(var);
		
		int length = pureTerms.length + 1;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length - 1; i++) {
			newPureTerms[i] = pureTerms[i];
		}
		
		newPureTerms[length - 1] = term;
		pureTerms = newPureTerms;
	}

	@Override
	public String toString() {
		if (pureTerms.length == 0)
			return "true";
		else {
			int length = pureTerms.length;
			String ret = "";
			
			for (int i = 0; i < length; i++) {
				ret += pureTerms[i] + " & ";
			}
			
			ret = ret.substring(0, ret.length() - 3);
			
			return ret;
		}
	}
	
}

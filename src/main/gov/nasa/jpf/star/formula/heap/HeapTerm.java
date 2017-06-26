package gov.nasa.jpf.star.formula.heap;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public abstract class HeapTerm {
	
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}
	
	public Variable[] getVars() {
		return null;
	}
	
	public HeapTerm copy() {
		return this;
	}
	
	public void updateType(List<Variable> knownTypeVars) {
		return;
	}
	
	public void genTest(List<Variable> initVars, StringBuffer test) {
		return;
	}
	
	public void setFields(StringBuffer test) {
		return;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	public String toS2SATString() {
		return "";
	}

}

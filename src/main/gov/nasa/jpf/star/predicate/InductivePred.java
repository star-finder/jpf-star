package gov.nasa.jpf.star.predicate;

import java.util.HashMap;
import java.util.Map;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;

public class InductivePred {
	
	// e.g. sll
	private String predName;
	
	// parameters of predicate, e.g. root
	private Variable[] params;
	
	// inductive predicate definition has form of multiple formulas
	// example: root::sll() === root = null \/ root -> Node(next) * next::sll()
	// this predicate has two formulas
	// first one: heap part = empty, pure part = EqNullTerm(root)
	// second one: heap part = [PointToTerm(root, next, Node),
	// InductiveTerm(next, [], sll)], pure part = True
	private Formula[] formulas;
	
	public InductivePred(String predName, Variable[] params, Formula[] formulas) {
		this.predName = predName;
		this.params = params;
		this.formulas = formulas;
	}
	
	public String getPredName() {
		return predName;
	}
	
	public Formula[] getFormulas() {
		return formulas;
	}
	
	public Variable[] getParams() {
		return params;
	}
	
	@Override
	public String toString() {
		String ret = "pred " + predName + "(";
		
		String ps = "";
		for (int i = 0; i < params.length; i++) {
			ps += params[i] + ",";
		}
		
		if (ps.length() > 0) ps = ps.substring(0, ps.length() - 1);
		ret += ps + ") == ";
		
		String fs = "";
		for (int i = 0; i < formulas.length; i++) {
			fs += formulas[i] + " || ";
		}
		
		if (fs.length() > 0) fs = fs.substring(0, fs.length() - 4);
		ret += fs;
		
		return ret;
	}
	
	public String toS2SATString() {
		String ret = "pred " + predName + "<";
		
		Variable root = params[0];
		Variable self = new Variable("self", root.getType());
		
		Variable[] fromVars = {root};
		Variable[] toVars = {self};
		
		String ps = "";
		for (int i = 1; i < params.length; i++) {
			ps += params[i] + ",";
		}
		
		if (ps.length() > 0)
			ps = ps.substring(0, ps.length() - 1);
		ret += ps + "> == ";
		
		String fs = "";
		for (int i = 0; i < formulas.length; i++) {
			fs += formulas[i].substitute(fromVars, toVars, null).toS2SATString() + " or ";
		}
		
		if (fs.length() > 0)
			fs = fs.substring(0, fs.length() - 4);
		ret += fs + ".";
		
		return ret;
	}

}

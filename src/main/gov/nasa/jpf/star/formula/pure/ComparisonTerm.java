package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.star.formula.expression.Expression;

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
	public String toString() {
		return exp1.toString() + comp.toString() + exp2.toString();
	}

}

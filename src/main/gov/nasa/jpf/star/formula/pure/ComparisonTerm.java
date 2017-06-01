package gov.nasa.jpf.star.formula.pure;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.star.formula.expression.IntegerExpression;

public class ComparisonTerm extends PureTerm {
	
	private Comparator comp;
	
	private IntegerExpression exp1;
	
	private IntegerExpression exp2;
	
	public ComparisonTerm(Comparator comp, IntegerExpression exp1, IntegerExpression exp2) {
		this.comp = comp;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public PureTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		IntegerExpression newExp1 = exp1.substitute(fromVars, toVars, existVarSubMap);
		IntegerExpression newExp2 = exp2.substitute(fromVars, toVars, existVarSubMap);
		
		ComparisonTerm newTerm = new ComparisonTerm(comp, newExp1, newExp2);
		
		return newTerm;
	}
	
	@Override
	public String toString() {
		return exp1.toString() + comp.toString() + exp2.toString();
	}

}

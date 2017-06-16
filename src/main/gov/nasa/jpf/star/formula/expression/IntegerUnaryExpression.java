package gov.nasa.jpf.star.formula.expression;

import java.util.Map;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Operator;

public class IntegerUnaryExpression extends IntegerExpression {
	
	private Operator op;
	
	private IntegerExpression exp;
	
	public IntegerUnaryExpression(Operator op, IntegerExpression exp) {
		this.op = op;
		this.exp = exp;
	}
	
	@Override
	public IntegerExpression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		IntegerExpression newExp = exp.substitute(fromVars, toVars, existVarSubMap);
		IntegerUnaryExpression newUnaryExp = new IntegerUnaryExpression(op, newExp);
		
		return newUnaryExp;
	}
	
	@Override
	public String toString() {
		return "(" + op.toString() + exp.toString() + ")";
	}

}

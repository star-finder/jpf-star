package gov.nasa.jpf.star.formula.expression;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Operator;

public class IntegerBinaryExpression extends IntegerExpression {

	private Operator op;
	
	private IntegerExpression exp1;
	
	private IntegerExpression exp2;
	
	public IntegerBinaryExpression(Operator op, IntegerExpression exp1, IntegerExpression exp2) {
		this.op = op;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public IntegerExpression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		IntegerExpression newExp1 = exp1.substitute(fromVars, toVars, existVarSubMap);
		IntegerExpression newExp2 = exp2.substitute(fromVars, toVars, existVarSubMap);
		IntegerBinaryExpression newBinaryExp = new IntegerBinaryExpression(op, newExp1, newExp2);
		
		return newBinaryExp;
	}
	
	@Override
	public String toString() {
		return "(" + exp1.toString() + op.toString() + exp2.toString() + ")";
	}
	
}

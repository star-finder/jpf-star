package gov.nasa.jpf.star.formula.expression;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.Operator;

public class BinaryExpression extends Expression {

	private Operator op;
	
	private Expression exp1;
	
	private Expression exp2;
	
	public BinaryExpression(Operator op, Expression exp1, Expression exp2) {
		this.op = op;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public Expression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Expression newExp1 = exp1.substitute(fromVars, toVars, existVarSubMap);
		Expression newExp2 = exp2.substitute(fromVars, toVars, existVarSubMap);
		BinaryExpression newBinaryExp = new BinaryExpression(op, newExp1, newExp2);
		
		return newBinaryExp;
	}
	
	@Override
	public String toString() {
		return "(" + exp1.toString() + op.toString() + exp2.toString() + ")";
	}
	
}

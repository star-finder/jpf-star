package star.formula.expression;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.symbc.numeric.Operator;
import star.formula.Variable;

public class UnaryExpression extends Expression {
	
	private Operator op;
	
	private Expression exp;
	
	public UnaryExpression(Operator op, Expression exp) {
		this.op = op;
		this.exp = exp;
	}
	
	public List<Variable> getVars() {
		return exp.getVars();
	}
	
	@Override
	public Expression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		Expression newExp = exp.substitute(fromVars, toVars, existVarSubMap);
		UnaryExpression newUnaryExp = new UnaryExpression(op, newExp);
		
		return newUnaryExp;
	}
	
	@Override
	public void updateType(List<Variable> knownTypeVars) {
		exp.updateType(knownTypeVars);
	}
	
	@Override
	public String toString() {
		return "(" + op.toString() + exp.toString() + ")";
	}

}

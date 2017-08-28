package star.formula.expression;

import java.util.List;
import java.util.Map;

import gov.nasa.jpf.symbc.numeric.Operator;
import star.formula.Variable;

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
	public List<Variable> getVars() {
		List<Variable> vars1 = exp1.getVars();
		List<Variable> vars2 = exp2.getVars();
		
		for (Variable var : vars2) {
			if (!vars1.contains(var)) vars1.add(var);
		}
		
		return vars1;
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
	public void updateType(List<Variable> knownTypeVars) {
		exp1.updateType(knownTypeVars);
		exp2.updateType(knownTypeVars);
	}
	
	@Override
	public String toString() {
		return "(" + exp1.toString() + op.toString() + exp2.toString() + ")";
	}
	
}

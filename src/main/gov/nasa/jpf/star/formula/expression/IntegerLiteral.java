package gov.nasa.jpf.star.formula.expression;

import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public class IntegerLiteral extends IntegerExpression {
	
	private int value;
	
	public IntegerLiteral(int value) {
		this.value = value;
	}
	
	@Override
	public IntegerExpression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return new IntegerLiteral(value);
	}
	
	@Override
	public String toString() {
		return value + "";
	}

}

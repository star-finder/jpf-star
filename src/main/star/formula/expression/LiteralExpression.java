package star.formula.expression;

import java.util.Map;

import star.formula.Variable;

public class LiteralExpression extends Expression {
	
	private String value;
	
	public LiteralExpression(long value) {
		this.value = value + "";
	}
	
	public LiteralExpression(double value) {
		this.value = value + "";
	}
	
	public LiteralExpression(String value) {
		this.value = value;
	}
	
	@Override
	public Expression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return new LiteralExpression(value);
	}
	
	@Override
	public String toString() {
		return value;
	}

}

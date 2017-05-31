package gov.nasa.jpf.star.precondition;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;

public class Precondition {

	// method name
	private String methodName;

	// formula to capture the precondition
	private Formula formula;
	
	public Precondition(String methodName, Formula formula) {
		this.methodName = methodName;
		this.formula = formula;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public Formula getFormula() {
		return formula;
	}

}

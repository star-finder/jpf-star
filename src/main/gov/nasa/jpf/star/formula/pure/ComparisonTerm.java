package gov.nasa.jpf.star.formula.pure;

import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;

public class ComparisonTerm extends PureTerm {
	
	private Comparator comp;
	
	private IntegerExpression exp1;
	
	private IntegerExpression exp2;
	
	public ComparisonTerm(Comparator comp, IntegerExpression exp1, IntegerExpression exp2) {
		this.comp = comp;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

}

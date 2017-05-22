package gov.nasa.jpf.star;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.vm.choice.IntIntervalGenerator;

public class StarChoiceGenerator extends IntIntervalGenerator {

	private Formula[] starPathConditions;
	
	public StarChoiceGenerator(int size) {
		super(0, size - 1);
		starPathConditions = new Formula[size];
	}

}

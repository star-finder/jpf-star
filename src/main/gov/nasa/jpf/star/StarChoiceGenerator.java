package gov.nasa.jpf.star;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.symbc.heap.HeapChoiceGenerator;

public class StarChoiceGenerator extends HeapChoiceGenerator {

	private Formula[] starPathConditions;
	
	public StarChoiceGenerator(int size) {
		super(size);
	}

}

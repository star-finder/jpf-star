package gov.nasa.jpf.formula.heap;

import gov.nasa.jpf.formula.Formula;
import gov.nasa.jpf.formula.Variable;
import gov.nasa.jpf.inductive.InductivePred;
import gov.nasa.jpf.inductive.InductivePredMap;

// x::sll(), ... term

public class InductiveTerm extends HeapTerm {
	
	// root node
	private Variable root;
	
	// other parameters of predicate
	private Variable[] vars;
	
	// name of predicate: sll
	public String predName;
	
	// very imporant function
	// if we have x::sll()
	// and predicate root::sll() === root = null \/ root->Node(next) * next::sll()
	// unfold should returns x = null \/ x->Node(next) * next::sll()
	public Formula[] unfold() {
		InductivePred pred = InductivePredMap.find(predName);
		Formula[] formulas = pred.getFormulas();
		
		// should substitute the variables inside formulas
		return formulas;
	}

}

package gov.nasa.jpf.star.formula.heap;

import java.util.Map;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.inductive.InductivePred;
import gov.nasa.jpf.star.inductive.InductivePredMap;

// x::sll(), ... term

public class InductiveTerm extends HeapTerm {
	
	// variables of current term, first variable is the root
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
		Variable[] params = pred.getParams();
		
		int length = formulas.length;
		Formula[] newFormulas = new Formula[length];
		
		for (int i = 0; i < length; i++) {
			// substitute the parameters inside the predicate with current vars
			newFormulas[i] = formulas[i].substitute(params, vars);
		}
		
		// should substitute the variables inside formulas
		return newFormulas;
	}
	
	@Override
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = vars.length;
		
		Variable[] newVars = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			Variable oldVar = vars[i];
			
			if (Utility.contains(fromVars, oldVar)) {
				newVars[i] = new Variable(toVars[i]);
			} else if (existVarSubMap.containsKey(oldVar.getName())) {
				newVars[i] = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
			} else {
				Variable freshVar = Utility.freshVar(oldVar);
				existVarSubMap.put(oldVar.getName(), freshVar.getName());
				newVars[i] = new Variable(freshVar);
			}
		}
		
		PointToTerm newPointToTerm = new PointToTerm(newVars, predName);
		
		return newPointToTerm;
	}

}

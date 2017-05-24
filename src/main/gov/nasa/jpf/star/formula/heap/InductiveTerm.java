package gov.nasa.jpf.star.formula.heap;

import java.util.HashMap;
import java.util.Map;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.inductive.InductivePred;
import gov.nasa.jpf.star.inductive.InductivePredMap;

// x::sll(), ... term

public class InductiveTerm extends HeapTerm {
	
	// name of predicate: sll
	private String predName;
	
	// variables of current term, first variable is the root
	private Variable[] vars;
	
	// contains unfolded formulas for this term
	private Formula[] unfoldedFormulas;
	
	public InductiveTerm(String predName, Variable... vars) {
		this.predName = predName;
		this.vars = vars;
	}
	
	public String getPredName() {
		return predName;
	}
	
	public Variable getRoot() {
		return vars[0];
	}
	
	public Formula[] getUnfoldedFormulas() {
		return unfoldedFormulas;
	}
	
	// very imporant function
	// if we have x::sll()
	// and predicate root::sll() === root = null \/ root->Node(next) * next::sll()
	// unfold should returns x = null \/ x->Node(next) * next::sll()
	public Formula[] unfold() {
		if (unfoldedFormulas == null) {
			InductivePred pred = InductivePredMap.find(predName);
			
			Formula[] formulas = pred.getFormulas();
			Variable[] params = pred.getParams();
			
			int length = formulas.length;
			Formula[] newFormulas = new Formula[length];
			
			// besides parameters, formula may contain other existential variables
			// must guarantee all existential variables substitue to fresh variables
			// the same old variable should be substituted to the same new variables
			// should this map be here or in Formula???
			Map<String,String> existVarSubMap = new HashMap<String,String>();
			
			for (int i = 0; i < length; i++) {
				// substitute the parameters inside the predicate with current vars
				newFormulas[i] = formulas[i].substitute(params, vars, existVarSubMap);
			}
			
			unfoldedFormulas = newFormulas;
		}
		
		return unfoldedFormulas;
	}
	
	@Override
	public HeapTerm substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = vars.length;
		
		Variable[] newVars = new Variable[length];
		
		for (int i = 0; i < length; i++) {
			Variable oldVar = vars[i];
			
			int index = Utility.contains(fromVars, oldVar);
			
			if (index != -1) {
				newVars[i] = new Variable(toVars[index]);
			} else if (existVarSubMap.containsKey(oldVar.getName())) {
				newVars[i] = new Variable(existVarSubMap.get(oldVar.getName()), oldVar.getType());
			} else {
				Variable freshVar = Utility.freshVar(oldVar);
				existVarSubMap.put(oldVar.getName(), freshVar.getName());
				newVars[i] = new Variable(freshVar);
			}
		}
		
		InductiveTerm newInductiveTerm = new InductiveTerm(predName, newVars);
		
		return newInductiveTerm;
	}
	
//	@Override
//	public HeapTerm copy() {
//		return new InductiveTerm(predName, vars);
//	}
	
	@Override
	public String toString() {
		assert vars.length > 0;
		
		String params = "";
		for (int i = 0; i < vars.length; i++) {
			params += vars[i] + ",";
		}
		
		if (params.length() > 0)
			params = params.substring(0, params.length() - 1);
		
		String ret = predName + "(" + params + ")";
		return ret;
	}
	
}

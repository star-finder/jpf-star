package gov.nasa.jpf.star.formula;

import java.util.List;

import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;

public class Utilities {
	
	private static int count = 1;
	
	public static int find(Variable[] vars, Variable var) {
		int length = vars.length;
		
		for (int i = 0; i < length; i++) {
			if (vars[i].equals(var)) {
				return i;
			}
		}
		
		return -1;
	}
//	
//	public static boolean contains(List<Variable> vars, Variable var) {
//		int length = vars.size();
//		
//		for (int i = 0; i < length; i++) {
//			if (vars.get(i).getName().equals(var.getName()) &&
//					vars.get(i).getType().equals(var.getType()))
//				return true;
//		}
//		
//		return false;
//	}
	
	// may have problem, but may be it is enough with Java name convention
	public static Variable freshVar(Variable oldVar) {
		String oldName = oldVar.getName();
		
		if (oldName.matches(".*_\\d+")) {
			oldName = oldName.substring(0, oldName.lastIndexOf('_'));
		}
		
		String freshName = freshName(oldName);
		
		return new Variable(freshName, oldVar.getType());
	}
	
	private static String freshName(String oldName) {
		return oldName + "_" + count++;
	}
	
	public static void reset() {
		count = 1;
	}
	
	public static boolean isNull(Formula pc, String varName) {
		PureFormula pf = pc.getPureFormula();
		List<List<Variable>> alias = pc.getAlias();

		for (PureTerm term : pf.getPureTerms()) {
			if (term instanceof EqNullTerm) {
				EqNullTerm eqNullTerm = (EqNullTerm) term;
				Variable root = eqNullTerm.getVar();
				String rootName = root.getName();

				if (rootName.equals(varName)) {
					return true;
				} else {
					for (List<Variable> vars : alias) {
						if (vars.contains(root)) {
							for (Variable var : vars) {
								if (var.getName().equals(varName)) {
									return true;
								}
							}
						}
					}
				}
			}
		}

		return false;
	}

	public static boolean canUnfold(InductiveTerm it, List<List<Variable>> alias, String varName) {
		if (it.getRoot().getName().equals(varName))
			return true;
		else {
			for (List<Variable> vars : alias) {
				if (vars.contains(it.getRoot())) {
					for (Variable var : vars) {
						if (var.getName().equals(varName)) {
							return true;
						}
					}
				}
			}

			return false;
		}
	}
	
	public static PointToTerm findPointToTerm(Formula pc, String varName) {
		HeapFormula hf = pc.getHeapFormula();
		List<List<Variable>> alias = pc.getAlias();

		for (HeapTerm term : hf.getHeapTerms()) {
			if (term instanceof PointToTerm) {
				PointToTerm ptTerm = (PointToTerm) term;
				Variable root = ptTerm.getRoot();
				String rootName = root.getName();

				if (rootName.equals(varName)) {
					return ptTerm;
				} else {
					for (List<Variable> vars : alias) {
						if (vars.contains(root)) {
							for (Variable var : vars) {
								if (var.getName().equals(varName)) {
									return ptTerm;
								}
							}
						}
					}
				}
			}
		}

		return null;
	}

}

package gov.nasa.jpf.star.formula;

import java.util.List;

import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;
import gov.nasa.jpf.symbc.heap.HeapNode;
import gov.nasa.jpf.symbc.heap.Helper;
import gov.nasa.jpf.symbc.heap.SymbolicInputHeap;
import gov.nasa.jpf.symbc.numeric.PathCondition;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.ThreadInfo;

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
	
	public static HeapTerm findHeapTerm(Formula pc, String varName) {
		HeapFormula hf = pc.getHeapFormula();
		List<List<Variable>> alias = pc.getAlias();

		for (HeapTerm term : hf.getHeapTerms()) {
			Variable root = null;
			
			if (term instanceof PointToTerm) {
				PointToTerm ptTerm = (PointToTerm) term;
				root = ptTerm.getRoot();
			} else if (term instanceof InductiveTerm) {
				InductiveTerm itTerm = (InductiveTerm) term;
				root = itTerm.getRoot();
			}
			
			String rootName = root.getName();

			if (rootName.equals(varName)) {
				return term;
			} else {
				for (List<Variable> vars : alias) {
					if (vars.contains(root)) {
						for (Variable var : vars) {
							if (var.getName().equals(varName)) {
								return term;
							}
						}
					}
				}
			}
		}

		return null;
	}
	
	public static int addNewHeapNode(ThreadInfo ti, ElementInfo ei, ClassInfo typeClassInfo,
			Object attr, Formula pc) {
		int daIndex = 0;
		
		PathCondition symPC = new PathCondition();
		SymbolicInputHeap symInputHeap = new SymbolicInputHeap();

		HeapNode[] prevSymRefs = symInputHeap.getNodesOfType(typeClassInfo);
		int numSymRefs = prevSymRefs.length;

		boolean shared = (ei == null ? false : ei.isShared());
		
		SymbolicInteger sym = new SymbolicInteger(attr.toString());
		
		daIndex = Helper.addNewHeapNode(typeClassInfo, ti, sym, symPC, 
				symInputHeap, numSymRefs, prevSymRefs, shared);
		
		PointToTerm pt = (PointToTerm) Utilities.findHeapTerm(pc, attr.toString());
		Variable[] vars = pt.getVars();
		
		// change attribute of new node according to unfold result
		ElementInfo newEi = ti.getModifiableElementInfo(daIndex);
		int numberOfFields = newEi.getNumberOfFields();
		
		for (int i = 0; i < numberOfFields; i++) {
			FieldInfo newFi = newEi.getFieldInfo(i);
			// do we need to check type of the fields and add more precise symbolic value
			Expression exp = new VariableExpression(new Variable(vars[i + 1].getName(), newFi.getType()));
			newEi.setFieldAttr(newFi, exp);
		}
		
		return daIndex;
	}

}

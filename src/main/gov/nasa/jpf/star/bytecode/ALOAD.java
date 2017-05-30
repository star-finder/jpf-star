package gov.nasa.jpf.star.bytecode;

import java.util.List;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.PureFormula;
import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;
import gov.nasa.jpf.symbc.arrays.ArrayExpression;
import gov.nasa.jpf.symbc.heap.HeapNode;
import gov.nasa.jpf.symbc.heap.Helper;
import gov.nasa.jpf.symbc.heap.SymbolicInputHeap;
import gov.nasa.jpf.symbc.numeric.PathCondition;
import gov.nasa.jpf.symbc.string.StringExpression;
import gov.nasa.jpf.symbc.string.SymbolicStringBuilder;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class ALOAD extends gov.nasa.jpf.jvm.bytecode.ALOAD {

	public ALOAD(int index) {
		super(index);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		int objRef = sf.peek();
		ElementInfo ei = ti.getElementInfo(objRef);
		Object sym_v = sf.getLocalAttr(index);
		
		String typeOfLocalVar = super.getLocalVariableType();

		if(sym_v == null || typeOfLocalVar.equals("?") || sym_v instanceof SymbolicStringBuilder
				|| sym_v instanceof StringExpression || sym_v instanceof ArrayExpression) {
			return super.execute(ti);
		}

		ClassInfo typeClassInfo = ClassLoaderInfo.getCurrentResolvedClassInfo(typeOfLocalVar);

		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;

		// in the first round we check if we can unfold the formula
		// if it is we create a choice generator with the number of choices
		// is the length of unfolded formulas
		// then in subsequent rounds we add each unfolded formula to the pc
		if (!ti.isFirstStepInsn()) {
			prevCG = ti.getVM().getSystemState().getChoiceGenerator();
			if (prevCG instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
				HeapFormula hf = pc.getHeapFormula();
				List<List<Variable>> alias = pc.getAlias();

				HeapTerm[] hts = hf.getHeapTerms();
				for (int i = 0; i < hts.length; i++) {
					if (hts[i] instanceof InductiveTerm) {
						InductiveTerm it = (InductiveTerm) hts[i];
						if (canUnfold(it, alias, sym_v.toString())) {
							Formula[] fs = it.unfold();

							cg = new StarChoiceGenerator(fs.length);
							ti.getVM().getSystemState().setNextChoiceGenerator(cg);
							return this;
						}
					}
				}
			}

			return super.execute(ti);
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			HeapFormula hf = pc.getHeapFormula();
			List<List<Variable>> alias = pc.getAlias();

			HeapTerm[] hts = hf.getHeapTerms();
			for (int i = 0; i < hts.length; i++) {
				if (hts[i] instanceof InductiveTerm) {
					InductiveTerm it = (InductiveTerm) hts[i];
					if (canUnfold(it, alias, sym_v.toString())) {
						pc.unfold(it, (Integer) cg.getNextChoice());
						break;
					}
				}
			}

			((StarChoiceGenerator) cg).setCurrentPCStar(pc);

			PathCondition symPC = new PathCondition();
			SymbolicInputHeap symInputHeap = new SymbolicInputHeap();

			HeapNode[] prevSymRefs = symInputHeap.getNodesOfType(typeClassInfo);
			int numSymRefs = prevSymRefs.length;

			boolean shared = (ei == null ? false : ei.isShared());

			// add new object according to pc
			int daIndex = 0; // index into JPF's dynamic area

			if (isNull(pc, sym_v.toString())) {
				daIndex = MJIEnv.NULL;
			} else {
				daIndex = Helper.addNewHeapNode(typeClassInfo, ti, sym_v, symPC, 
						symInputHeap, numSymRefs, prevSymRefs, shared);
			}

			sf.setLocalVariable(index, daIndex, true);
//			sf.setLocalAttr(index, null);
//			sf.push(daIndex, true);

//			return getNext(ti); 
			return super.execute(ti);
		}
	}

	private boolean isNull(Formula pc, String varName) {
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
						if (Utility.contains(vars, root)) {
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

	private boolean canUnfold(InductiveTerm it, List<List<Variable>> alias, String varName) {
		if (it.getRoot().getName().equals(varName))
			return true;
		else {
			for (List<Variable> vars : alias) {
				if (Utility.contains(vars, it.getRoot())) {
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

}

package gov.nasa.jpf.star.bytecode;

import java.util.List;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.symbc.arrays.ArrayExpression;
import gov.nasa.jpf.symbc.heap.HeapNode;
import gov.nasa.jpf.symbc.heap.Helper;
import gov.nasa.jpf.symbc.heap.SymbolicInputHeap;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;
import gov.nasa.jpf.symbc.numeric.PathCondition;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.string.StringExpression;
import gov.nasa.jpf.symbc.string.SymbolicStringBuilder;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
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
		Config conf = ti.getVM().getConfig();
		StackFrame sf = ti.getModifiableTopFrame();
		
		int objRef = sf.peek();
		ElementInfo ei = ti.getElementInfo(objRef);
		Object attr = sf.getLocalAttr(index);
		
		String typeOfLocalVar = super.getLocalVariableType();

		if(attr == null || typeOfLocalVar.equals("?") || attr instanceof SymbolicStringBuilder
				|| attr instanceof StringExpression || attr instanceof ArrayExpression) {
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
				
				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area
				
				if (Utilities.isNull(pc, attr.toString())) {
					daIndex = MJIEnv.NULL;
					
					sf.setLocalVariable(index, daIndex, true);
					sf.setLocalAttr(index, null);
					sf.push(daIndex, true);
					
					return getNext(ti);
				} else {
					HeapTerm ht = Utilities.findHeapTerm(pc, attr.toString());
					
					if (ht instanceof PointToTerm) {
						daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, attr, pc);
						
						sf.setLocalVariable(index, daIndex, true);
						sf.setLocalAttr(index, null);
						sf.push(daIndex, true);
						
						return getNext(ti);
					} else if (ht instanceof InductiveTerm) {
						InductiveTerm it = (InductiveTerm) ht;
						Formula[] fs = it.unfold();

						cg = new StarChoiceGenerator(fs.length);
						ti.getVM().getSystemState().setNextChoiceGenerator(cg);
						
						return this;
					}
				}
			}

			return super.execute(ti);
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			HeapTerm ht = Utilities.findHeapTerm(pc, attr.toString());
			
			// in this case ht is inductive term;
			InductiveTerm it = (InductiveTerm) ht;
			pc.unfold(it, (Integer) cg.getNextChoice());
			
			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
	
				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area
	
				if (Utilities.isNull(pc, attr.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, attr, pc);
				}
				
				sf.setLocalVariable(index, daIndex, true);
				sf.setLocalAttr(index, null);
				sf.push(daIndex, true);
				
				return getNext(ti);
			} else {
				ti.getVM().getSystemState().setIgnored(true);
				return getNext(ti);
			}
		}
	}
	
	// note: to handle this instruction and GETFIELD conrrectly, we have to update
	// the stack frame according to alias in the path condition.
	// However, it seems that updating all values and attributes according to alias
	// is too complex, so we let it be.
	// Because of this, condition involve comparison of two reference variables
	// is handled symbolic instead of concrete

}

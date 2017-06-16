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
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class GETFIELD extends gov.nasa.jpf.jvm.bytecode.GETFIELD {

	public GETFIELD(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		StackFrame sf = ti.getModifiableTopFrame();

		int objRef = sf.peek(); // don't pop yet, we might re-enter
		lastThis = objRef;

		// --- check for obvious exceptions
		if (objRef == MJIEnv.NULL) {
			return ti.createAndThrowException("java.lang.NullPointerException",
					"referencing field111 '" + fname + "' on null object");
		}

		ElementInfo ei = ti.getModifiableElementInfo(objRef);
		FieldInfo fi = getFieldInfo();
		if (fi == null) {
			return ti.createAndThrowException("java.lang.NoSuchFieldError",
					"referencing field '" + fname + "' in " + ei);
		}
		
		Object attr = ei.getFieldAttr(fi);

		if (!(fi.isReference() && attr != null)) {
			return super.execute(ti);
		}

		if (attr instanceof StringExpression || attr instanceof SymbolicStringBuilder
				|| attr instanceof ArrayExpression) {
			return super.execute(ti);
		}
		
		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;
		
		ClassInfo typeClassInfo = fi.getTypeClassInfo();
		
		if (attr.toString().contains(".")) {
			int index = attr.toString().indexOf('.') + 1;
			int length = attr.toString().length();
			attr = new SymbolicInteger("this_" + attr.toString().substring(index, length));
		}

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
						if (Utilities.canUnfold(it, alias, attr.toString())) {
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
			sf.pop(); // Ok, now we can remove the object ref from the stack
			
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			HeapFormula hf = pc.getHeapFormula();
			List<List<Variable>> alias = pc.getAlias();

			HeapTerm[] hts = hf.getHeapTerms();
			for (int i = 0; i < hts.length; i++) {
				if (hts[i] instanceof InductiveTerm) {
					InductiveTerm it = (InductiveTerm) hts[i];
					if (Utilities.canUnfold(it, alias, attr.toString())) {
						pc.unfold(it, (Integer) cg.getNextChoice());
						break;
					}
				}
			}

			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);

				PathCondition symPC = new PathCondition();
				SymbolicInputHeap symInputHeap = new SymbolicInputHeap();
	
				HeapNode[] prevSymRefs = symInputHeap.getNodesOfType(typeClassInfo);
				int numSymRefs = prevSymRefs.length;
	
				boolean shared = (ei == null ? false : ei.isShared());
	
				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area
	
				if (Utilities.isNull(pc, attr.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					daIndex = Helper.addNewHeapNode(typeClassInfo, ti, attr, symPC, 
							symInputHeap, numSymRefs, prevSymRefs, shared);
					
					PointToTerm pt = Utilities.findPointToTerm(pc, attr.toString());
					Variable[] vars = pt.getVars();
					
					// change attribute of new node according to unfold result
					ElementInfo newEi = ti.getModifiableElementInfo(daIndex);
					int numberOfFields = newEi.getNumberOfFields();
					
					for (int i = 0; i < numberOfFields; i++) {
						FieldInfo newFi = newEi.getFieldInfo(i);
						IntegerExpression newAttr = new SymbolicInteger(vars[i + 1].getName());
						newEi.setFieldAttr(newFi, newAttr);
					}
				}
	
				ei.setReferenceField(fi, daIndex);
				ei.setFieldAttr(fi, null);

				sf.pushRef(daIndex);
				
				return getNext(ti);
			} else {
				ti.getVM().getSystemState().setIgnored(true);
				return getNext(ti);
			}
		}
	}

}

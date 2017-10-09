package star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.symbc.arrays.ArrayExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
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
import star.StarChoiceGenerator;
import star.solver.Solver;
import starlib.formula.Formula;
import starlib.formula.Utilities;
import starlib.formula.Variable;
import starlib.formula.expression.Expression;
import starlib.formula.expression.VariableExpression;
import starlib.formula.heap.HeapTerm;
import starlib.formula.heap.InductiveTerm;
import starlib.formula.heap.PointToTerm;

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
		Object sym_v = sf.getLocalAttr(index);
		
		String typeOfLocalVar = super.getLocalVariableType();

		if (sym_v == null || typeOfLocalVar.equals("?") || sym_v instanceof SymbolicStringBuilder
				|| sym_v instanceof StringExpression || sym_v instanceof ArrayExpression) {
			return super.execute(ti);
		}
		
		if (sym_v instanceof SymbolicInteger) {
			Expression exp = new VariableExpression(new Variable(sym_v.toString(), ""));
			sf.setLocalAttr(index, exp);
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
				
				if (Utilities.isNull(pc, sym_v.toString())) {
					daIndex = MJIEnv.NULL;
					
					sf.setLocalVariable(index, daIndex, true);
					sf.pushLocal(index);
					
					return getNext(ti);
				} else {
					HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());
					
					if (ht instanceof PointToTerm) {
						String name = sym_v.toString();
						
						int address = pc.findAddress(name);
						if (address == -1) {
							address = pc.findAddress(pc.getAlias(name));
							if (address == -1) {
								daIndex = StarBytecodeUtils.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
							} else {
								daIndex = address;
							}
							
							pc.putAddress(name, daIndex);
						} else {
							daIndex = address;
						}
						
						sf.setLocalVariable(index, daIndex, true);
						sf.pushLocal(index);
						
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
			HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());
			
			// in this case ht is inductive term;
			InductiveTerm it = (InductiveTerm) ht;
			pc.unfold(it, (Integer) cg.getNextChoice());
			
			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
	
				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area
	
				if (Utilities.isNull(pc, sym_v.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					String name = sym_v.toString();
					
					int address = pc.findAddress(name);
					if (address == -1) {
						address = pc.findAddress(pc.getAlias(name));
						if (address == -1) {
							daIndex = StarBytecodeUtils.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
						} else {
							daIndex = address;
						}
						
						pc.putAddress(name, daIndex);
					} else {
						daIndex = address;
					}
				}
				
				sf.setLocalVariable(index, daIndex, true);
				sf.pushLocal(index);
				
				return getNext(ti);
			} else {
				ti.getVM().getSystemState().setIgnored(true);
				return getNext(ti);
			}
		}
	}

}

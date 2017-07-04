package gov.nasa.jpf.star.bytecode.lazy;

import java.util.List;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.solver.Solver;
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
			
			sym_v = exp;
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
						daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
						
						sf.setLocalVariable(index, daIndex, true);
						sf.pushLocal(index);
						
						return getNext(ti);
					} else {
						String type = ei.getType();
						type = type.substring(type.lastIndexOf('/') + 1, type.length() - 1);
						
						List<Variable> vars = HeapMemoryMap.find(type);
						
						int size = vars.size() + 2; // null and old nodes and new node
						
						cg = new StarChoiceGenerator(size);
						ti.getVM().getSystemState().setNextChoiceGenerator(cg);
						
						return this;
					}
				}
			}

			return super.execute(ti);
		} else {
			String type = ei.getType();
			type = type.substring(type.lastIndexOf('/') + 1, type.length() - 1);
			
			List<Variable> vars = HeapMemoryMap.find(type);
			
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			int currentChoice = (Integer) cg.getNextChoice();
			
			if (currentChoice < vars.size()) {
				Variable var = vars.get(currentChoice);
				pc.addEqTerm(new Variable(sym_v.toString(), ""), var);
			} else if (currentChoice == vars.size()) {
				pc.addEqNullTerm(new Variable(sym_v.toString(), ""));
			} else {
				Variable newVar = new Variable(sym_v.toString(), "");
				pc.addPointToTerm(newVar, type);
				HeapMemoryMap.put(type, newVar);
			}
			
			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
	
				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area
	
				if (Utilities.isNull(pc, sym_v.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
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
	
	// note: to handle this instruction and GETFIELD conrrectly, we have to update
	// the stack frame according to alias in the path condition.
	// However, it seems that updating all values and attributes according to alias
	// is too complex, so we let it be.
	// Because of this, condition involve comparison of two reference variables
	// is handled symbolic instead of concrete

}

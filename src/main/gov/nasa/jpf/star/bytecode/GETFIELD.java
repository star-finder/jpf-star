package gov.nasa.jpf.star.bytecode;

import java.util.List;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class GETFIELD extends gov.nasa.jpf.jvm.bytecode.GETFIELD {

	public GETFIELD(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getOperandAttr();
		
		if (sym_v == null) {
			return super.execute(ti);
		} else {
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
				
				return super.execute(ti);
			}
		}
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

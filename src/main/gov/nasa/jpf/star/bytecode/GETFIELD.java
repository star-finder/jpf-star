package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
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

			if (!ti.isFirstStepInsn()) {
				prevCG = ti.getVM().getSystemState().getChoiceGenerator();
				if (prevCG instanceof StarChoiceGenerator) {
					Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
					HeapFormula hf = pc.getHeapFormula();
					
					HeapTerm[] hts = hf.getHeapTerms();
					for (int i = 0; i < hts.length; i++) {
						if (hts[i] instanceof InductiveTerm) {
							InductiveTerm it = (InductiveTerm) hts[i];
							if (it.getRoot().getName().equals(sym_v.toString())) {
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
				
				HeapTerm[] hts = hf.getHeapTerms();
				for (int i = 0; i < hts.length; i++) {
					if (hts[i] instanceof InductiveTerm) {
						InductiveTerm it = (InductiveTerm) hts[i];
						if (it.getRoot().getName().equals(sym_v.toString())) {
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

}

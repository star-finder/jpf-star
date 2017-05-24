package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class IF_ACMPEQ extends gov.nasa.jpf.jvm.bytecode.IF_ACMPEQ {

	public IF_ACMPEQ(int targetPc) {
		super(targetPc);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v1 = sf.getOperandAttr(1);
		Object sym_v2 = sf.getOperandAttr(0);
		
		if(sym_v1 == null && sym_v2 == null) {
			return super.execute(ti);
		} else {
			ChoiceGenerator<?> cg;
			ChoiceGenerator<?> prevCG;

			if (!ti.isFirstStepInsn()) {
				cg = new StarChoiceGenerator(2);
				ti.getVM().getSystemState().setNextChoiceGenerator(cg);
				
				return this;
			} else {
				cg = ti.getVM().getSystemState().getChoiceGenerator();
				conditionValue = (Integer) cg.getNextChoice() == 1 ? true: false;
			}

			sf.pop();
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null)
				pc = new Formula();
			else
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			
			if (conditionValue) {
				pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				return getTarget();
			} else {
				pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				return getNext(ti);
			}
		}
	}

}

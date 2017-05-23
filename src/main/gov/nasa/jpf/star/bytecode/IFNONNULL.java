package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class IFNONNULL extends gov.nasa.jpf.symbc.bytecode.IFNONNULL {

	public IFNONNULL(int targetPc) {
		super(targetPc);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		IntegerExpression sym_v = (IntegerExpression) sf.getOperandAttr();
		
		if(sym_v == null) {
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
				pc.addNEqNullTerm(new Variable(sym_v.toString(), ""));
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				return getTarget();
			} else {
				pc.addEqNullTerm(new Variable(sym_v.toString(), ""));
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				return getNext(ti);
			}
		}
	}
}

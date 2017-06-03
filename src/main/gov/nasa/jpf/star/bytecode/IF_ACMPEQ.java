package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.solver.Solver;
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

			int	v2 = sf.pop();
			int	v1 = sf.pop();
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null)
				pc = new Formula();
			else
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			
			if (conditionValue) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
					} else {
						pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable(v2 + "", ""));
					}
				} else {
					pc.addEqTerm(new Variable(v1 + "", ""), new Variable(sym_v2.toString(), ""));
				}
				
				if (Solver.solve(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
				return getTarget();
			} else {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
					} else {
						pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable(v2 + "", ""));
					}
				} else {
					pc.addNEqTerm(new Variable(v1 + "", ""), new Variable(sym_v2.toString(), ""));
				}

				if (Solver.solve(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
				return getNext(ti);
			}
		}
	}

}

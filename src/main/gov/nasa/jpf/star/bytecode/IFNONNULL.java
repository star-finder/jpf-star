package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class IFNONNULL extends gov.nasa.jpf.jvm.bytecode.IFNONNULL {

	public IFNONNULL(int targetPc) {
		super(targetPc);
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

					if (Utilities.isNull(pc, sym_v.toString())) {
						sf.pop();
						return getNext(ti);
					} else {
						HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());

						if (ht instanceof PointToTerm) {
							sf.pop();
							return getTarget();
						} else {
							cg = new StarChoiceGenerator(2);
							ti.getVM().getSystemState().setNextChoiceGenerator(cg);

							return this;
						}
					}

				}

				return super.execute(ti);
			} else {
				cg = ti.getVM().getSystemState().getChoiceGenerator();
				conditionValue = (Integer) cg.getNextChoice() == 1 ? true : false;

				sf.pop();

				prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
				Formula pc = null;

				if (prevCG == null)
					pc = new Formula();
				else
					pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();

				if (conditionValue) {
					pc.addNEqNullTerm(new Variable(sym_v.toString(), ""));
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					return getTarget();
				} else {
					pc.addEqNullTerm(new Variable(sym_v.toString(), ""));
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					return getNext(ti);
				}
			}
		}
	}
}

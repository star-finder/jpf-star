package star.bytecode;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import starlib.formula.Formula;
import starlib.formula.Utilities;
import starlib.formula.Variable;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.NullExpression;
import starlib.formula.heap.HeapTerm;
import starlib.formula.heap.PointToTerm;
import starlib.solver.Solver;

public class IFNONNULL extends gov.nasa.jpf.jvm.bytecode.IFNONNULL {

	public IFNONNULL(int targetPc) {
		super(targetPc);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getOperandAttr();

		if(sym_v == null) {
			return super.execute(ti);
		} else if (sym_v.toString().contains("newNode_")) {
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
					pc.addComparisonTerm(Comparator.NE, new Variable(sym_v.toString()), NullExpression.getInstance());
					if (Solver.checkSat(pc))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					return getTarget();
				} else {
					pc.addComparisonTerm(Comparator.EQ, new Variable(sym_v.toString()), NullExpression.getInstance());
					if (Solver.checkSat(pc))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					return getNext(ti);
				}
			}
		}
	}
}

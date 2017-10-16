package star.bytecode;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import starlib.formula.Formula;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.solver.Solver;

public class LOOKUPSWITCH extends gov.nasa.jpf.jvm.bytecode.LOOKUPSWITCH
		implements gov.nasa.jpf.vm.bytecode.LookupSwitchInstruction {

	public LOOKUPSWITCH(int defaultTarget, int numberOfTargets) {
		super(defaultTarget, numberOfTargets);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Expression sym_v = (Expression) sf.getOperandAttr();

		if (sym_v == null) { // the condition is concrete
			return super.execute(ti);
		} else { // the condition is symbolic
			ChoiceGenerator<?> cg;
			ChoiceGenerator<?> prevCG;

			if (!ti.isFirstStepInsn()) { // first time around
				prevCG = ti.getVM().getSystemState().getChoiceGenerator();

				if (prevCG instanceof StarChoiceGenerator) {
					cg = new StarChoiceGenerator(matches.length + 1);
					ti.getVM().getSystemState().setNextChoiceGenerator(cg);

					return this;
				}

				return super.execute(ti);
			} else { // this is what really returns results
				sf.pop();

				cg = ti.getVM().getSystemState().getChoiceGenerator();
				prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

				Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();

				int idx = (Integer) cg.getNextChoice();

				if (idx == matches.length) { // default branch
					lastIdx = DEFAULT;

					for (int i = 0; i < matches.length; i++)
						pc.addComparisonTerm(Comparator.NE, sym_v, new LiteralExpression(matches[i]));

					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);

					return mi.getInstructionAt(target);

				} else {
					lastIdx = idx;

					pc.addComparisonTerm(Comparator.EQ, sym_v, new LiteralExpression(matches[idx]));

					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);

					return mi.getInstructionAt(targets[idx]);
				}
			}
		}
	}

}

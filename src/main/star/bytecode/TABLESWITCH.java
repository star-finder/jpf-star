package star.bytecode;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import starlib.solver.Solver;
import starlib.formula.Formula;
import starlib.formula.expression.BinaryExpression;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.formula.expression.Operator;

public class TABLESWITCH extends gov.nasa.jpf.jvm.bytecode.TABLESWITCH
		implements gov.nasa.jpf.vm.bytecode.TableSwitchInstruction {

	public TABLESWITCH(int defaultTarget, int min, int max) {
		super(defaultTarget, min, max);
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
					cg = new StarChoiceGenerator(targets.length + 1);
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
				
				if (idx == targets.length) { // default branch
					lastIdx = -1;
					
					for (int i = 0; i < targets.length; i++) {
						pc.addComparisonTerm(Comparator.NE,
								new BinaryExpression(Operator.MINUS, sym_v, new LiteralExpression(getMin())),
								new LiteralExpression(i));
					}
					
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					
					return mi.getInstructionAt(target);
					
				} else {
					lastIdx = idx;

					pc.addComparisonTerm(Comparator.EQ,
							new BinaryExpression(Operator.MINUS, sym_v, new LiteralExpression(getMin())),
							new LiteralExpression(idx));
					
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

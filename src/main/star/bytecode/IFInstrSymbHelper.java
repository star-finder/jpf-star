package star.bytecode;

import gov.nasa.jpf.jvm.bytecode.IfInstruction;
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

public class IFInstrSymbHelper {

	public static Instruction getNextInstructionAndSetPCChoice(ThreadInfo ti, IfInstruction instr,
			Expression sym_v1, Expression sym_v2, Comparator trueComparator, Comparator falseComparator) {
		StackFrame sf = ti.getModifiableTopFrame();
		
		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;
		
		boolean conditionValue = false;
		
		if (!ti.isFirstStepInsn()) {
			cg = new StarChoiceGenerator(2);
			ti.getVM().getSystemState().setNextChoiceGenerator(cg);
			
			return instr;
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			conditionValue = (Integer) cg.getNextChoice() == 1 ? true: false;
		
			int v1 = 0, v2 = 0;
			
			if (instr instanceof IFEQ || instr instanceof IFGE || instr instanceof IFGT ||
					instr instanceof IFLE || instr instanceof IFLT || instr instanceof IFNE) {
				v1 = sf.pop();
			} else {
				v2 = sf.pop();
				v1 = sf.pop();
			}
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null)
				pc = new Formula();
			else
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			
			if (conditionValue) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(trueComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(trueComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(trueComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
				return instr.getTarget();
			} else {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(falseComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(falseComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(falseComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
				return instr.getNext(ti);
			}
		}
	}

}

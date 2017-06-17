package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerLiteral;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class LCMP extends gov.nasa.jpf.jvm.bytecode.LCMP {
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		
		IntegerExpression sym_v1 = (IntegerExpression) sf.getOperandAttr(3);
		IntegerExpression sym_v2 = (IntegerExpression) sf.getOperandAttr(1);
		
		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else {
			ChoiceGenerator<?> cg;
			ChoiceGenerator<?> prevCG;
			
			int conditionValue = 0;
			
			if (!ti.isFirstStepInsn()) {
				cg = new StarChoiceGenerator(3);
				ti.getVM().getSystemState().setNextChoiceGenerator(cg);
				
				return this;
			} else {
				cg = ti.getVM().getSystemState().getChoiceGenerator();
				conditionValue = (Integer) cg.getNextChoice() - 1;
					
				long v2 = sf.popLong();
				long v1 = sf.popLong();
				
				prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
				Formula pc = null;
				
				if (prevCG == null)
					pc = new Formula();
				else
					pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
				
				if (conditionValue == -1) {
					if (sym_v1 != null) {
						if (sym_v2 != null) {
							pc.addComparisonTerm(Comparator.LT, sym_v1, sym_v2);
						} else {
							pc.addComparisonTerm(Comparator.LT, sym_v1, new IntegerLiteral(v2));
						}
					} else {
						pc.addComparisonTerm(Comparator.LT, new IntegerLiteral(v1), sym_v2);
					}
					
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
				} else if (conditionValue == 0) {
					if (sym_v1 != null) {
						if (sym_v2 != null) {
							pc.addComparisonTerm(Comparator.EQ, sym_v1, sym_v2);
						} else {
							pc.addComparisonTerm(Comparator.EQ, sym_v1, new IntegerLiteral(v2));
						}
					} else {
						pc.addComparisonTerm(Comparator.EQ, new IntegerLiteral(v1), sym_v2);
					}
					
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
				} else {
					if (sym_v1 != null) {
						if (sym_v2 != null) {
							pc.addComparisonTerm(Comparator.GT, sym_v1, sym_v2);
						} else {
							pc.addComparisonTerm(Comparator.GT, sym_v1, new IntegerLiteral(v2));
						}
					} else {
						pc.addComparisonTerm(Comparator.GT, new IntegerLiteral(v1), sym_v2);
					}
					
					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
				}
				
				sf.push(conditionValue);
				
				return getNext(ti);
			}
		}
	}

}

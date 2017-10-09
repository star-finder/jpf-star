package star.bytecode;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import star.solver.Solver;
import starlib.formula.Formula;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;

public class CMPInstrSymbHelper {
	
	public static Instruction getNextInstructionAndSetPCChoiceLong(ThreadInfo ti,
			Instruction instr, Expression sym_v1, Expression sym_v2,
			Comparator fstComparator, Comparator sndComparator, Comparator trdComparator) {
		StackFrame sf = ti.getModifiableTopFrame();
	
		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;
		
		int conditionValue = 0;
		
		if (!ti.isFirstStepInsn()) {
			cg = new StarChoiceGenerator(3);
			ti.getVM().getSystemState().setNextChoiceGenerator(cg);
			
			return instr;
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
						pc.addComparisonTerm(fstComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(fstComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(fstComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else if (conditionValue == 0) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(sndComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(sndComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(sndComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(trdComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(trdComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(trdComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			}
			
			sf.push(conditionValue);
			
			return instr.getNext(ti);
		}
	}
	
	public static Instruction getNextInstructionAndSetPCChoiceFloat(ThreadInfo ti,
			Instruction instr, Expression sym_v1, Expression sym_v2,
			Comparator fstComparator, Comparator sndComparator, Comparator trdComparator) {
		StackFrame sf = ti.getModifiableTopFrame();
	
		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;
		
		int conditionValue = 0;
		
		if (!ti.isFirstStepInsn()) {
			cg = new StarChoiceGenerator(3);
			ti.getVM().getSystemState().setNextChoiceGenerator(cg);
			
			return instr;
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			conditionValue = (Integer) cg.getNextChoice() - 1;
				
			float v2 = sf.popFloat();
			float v1 = sf.popFloat();
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null)
				pc = new Formula();
			else
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			
			if (conditionValue == -1) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(fstComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(fstComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(fstComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else if (conditionValue == 0) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(sndComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(sndComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(sndComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(trdComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(trdComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(trdComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			}
			
			sf.push(conditionValue);
			
			return instr.getNext(ti);
		}
	}
	
	public static Instruction getNextInstructionAndSetPCChoiceDouble(ThreadInfo ti,
			Instruction instr, Expression sym_v1, Expression sym_v2,
			Comparator fstComparator, Comparator sndComparator, Comparator trdComparator) {
		StackFrame sf = ti.getModifiableTopFrame();
	
		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;
		
		int conditionValue = 0;
		
		if (!ti.isFirstStepInsn()) {
			cg = new StarChoiceGenerator(3);
			ti.getVM().getSystemState().setNextChoiceGenerator(cg);
			
			return instr;
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			conditionValue = (Integer) cg.getNextChoice() - 1;
				
			double v2 = sf.popDouble();
			double v1 = sf.popDouble();
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null)
				pc = new Formula();
			else
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			
			if (conditionValue == -1) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(fstComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(fstComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(fstComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else if (conditionValue == 0) {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(sndComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(sndComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(sndComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			} else {
				if (sym_v1 != null) {
					if (sym_v2 != null) {
						pc.addComparisonTerm(trdComparator, sym_v1, sym_v2);
					} else {
						pc.addComparisonTerm(trdComparator, sym_v1, new LiteralExpression(v2));
					}
				} else {
					pc.addComparisonTerm(trdComparator, new LiteralExpression(v1), sym_v2);
				}
				
				if (Solver.checkSat(pc, ti.getVM().getConfig()))
					((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				else
					ti.getVM().getSystemState().setIgnored(true);
			}
			
			sf.push(conditionValue);
			
			return instr.getNext(ti);
		}
	}

}

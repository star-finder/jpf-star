package star.bytecode;

import java.util.List;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import star.formula.Formula;
import star.formula.Variable;
import star.solver.Solver;

public class IF_ACMPNE extends gov.nasa.jpf.jvm.bytecode.IF_ACMPNE {
	
	public IF_ACMPNE(int targetPc) {
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
				prevCG = ti.getVM().getSystemState().getChoiceGenerator();
				if (prevCG instanceof StarChoiceGenerator) {
					Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
					
					List<Variable> alias1 = null;
					List<Variable> alias2 = null;
					
					if (sym_v1 != null) alias1 = pc.getAlias(sym_v1.toString());
					if (sym_v2 != null) alias2 = pc.getAlias(sym_v2.toString());
					
					if (alias1 == null || alias2 == null) {
						cg = new StarChoiceGenerator(2);
						ti.getVM().getSystemState().setNextChoiceGenerator(cg);
						
						return this;
					} else if (alias1 != alias2) {
						// is it correct if two alias are different that means two vars
						// are not equal
						sf.pop();
						sf.pop();
						
						return getTarget();
					} else {
						sf.pop();
						sf.pop();
						
						return getNext(ti);
					}
				}

				return super.execute(ti);
			} else {
				cg = ti.getVM().getSystemState().getChoiceGenerator();
				conditionValue = (Integer) cg.getNextChoice() == 1 ? true: false;
				
				int v2 = sf.pop();
				int v1 = sf.pop();
				
				prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
				Formula pc = null;
				
				if (prevCG == null)
					pc = new Formula();
				else
					pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
				
				if (conditionValue) {
					if (sym_v1 != null) {
						if (sym_v2 != null) {
							pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
						} else if (v2 == 0) {
							pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable("null", ""));
						} else {
							pc.addNEqTerm(new Variable(sym_v1.toString(), ""), new Variable(v2 + "", ""));
						}
					} else if (v1 == 0) {
						pc.addNEqTerm(new Variable(sym_v2.toString(), ""), new Variable("null", ""));
					} else {
						pc.addNEqTerm(new Variable(sym_v2.toString(), ""), new Variable(v1 + "", ""));
					}

					if (Solver.checkSat(pc, ti.getVM().getConfig()))
						((StarChoiceGenerator) cg).setCurrentPCStar(pc);
					else
						ti.getVM().getSystemState().setIgnored(true);
					return getTarget();
				} else {
					if (sym_v1 != null) {
						if (sym_v2 != null) {
							pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable(sym_v2.toString(), ""));
						} else if (v2 == 0) {
							pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable("null", ""));
						} else {
							pc.addEqTerm(new Variable(sym_v1.toString(), ""), new Variable(v2 + "", ""));
						}
					} else if (v1 == 0) {
						pc.addEqTerm(new Variable(sym_v2.toString(), ""), new Variable("null", ""));
					} else {
						pc.addEqTerm(new Variable(sym_v2.toString(), ""), new Variable(v1 + "", ""));
					}
					
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

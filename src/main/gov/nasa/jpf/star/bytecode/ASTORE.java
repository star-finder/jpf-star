package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class ASTORE extends gov.nasa.jpf.jvm.bytecode.ASTORE {

	public ASTORE(int index) {
		super(index);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v1 = sf.getOperandAttr(1);
		Object sym_v2 = sf.getOperandAttr(0);
		
		if (sym_v1 != null || sym_v2 != null) {
			ChoiceGenerator<?> cg = ti.getVM().getSystemState().getChoiceGenerator();
			
			int	v2 = sf.peek();
			int	v1 = sf.peek(1);
			
			Formula pc = ((StarChoiceGenerator) cg).getCurrentPCStar().copy();
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					pc.addEqTerm(new Variable(sym_v1.toString(), ""),  new Variable(sym_v2.toString(), ""));
				} else {
					pc.addEqTerm(new Variable(sym_v1.toString(), ""),  new Variable(v2 + "", ""));
				}
			} else {
				pc.addEqTerm(new Variable(v1 + "", ""),  new Variable(sym_v2.toString(), ""));
			}
			
			((StarChoiceGenerator) cg).setCurrentPCStar(pc);
		}
		
		
		return super.execute(ti);
	}

}

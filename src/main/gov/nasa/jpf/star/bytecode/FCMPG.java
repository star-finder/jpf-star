package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class FCMPG extends gov.nasa.jpf.jvm.bytecode.FCMPG {
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		
		Expression sym_v1 = (Expression) sf.getOperandAttr(1);
		Expression sym_v2 = (Expression) sf.getOperandAttr(0);
		
		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else
			return CMPInstrSymbHelper.getNextInstructionAndSetPCChoiceFloat(ti, this, sym_v1, sym_v2,
					Comparator.LT, Comparator.EQ, Comparator.GT);
	}

}

package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class IF_ICMPGT extends gov.nasa.jpf.jvm.bytecode.IF_ICMPGT {

	public IF_ICMPGT(int targetPc) {
		super(targetPc);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr(1);
		Expression sym_v2 = (Expression) sf.getOperandAttr(0);

		if (sym_v1 == null && sym_v2 == null) { // both conditions are concrete
			return super.execute(ti);
		} else { // at least one condition is symbolic
			Instruction nxtInstr = IFInstrSymbHelper.getNextInstructionAndSetPCChoice(ti, this, sym_v1, sym_v2,
					Comparator.GT, Comparator.LE);
			if (nxtInstr == getTarget())
				conditionValue = true;
			else
				conditionValue = false;
			return nxtInstr;
		}
	}

}

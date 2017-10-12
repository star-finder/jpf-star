package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;

public class IFLE extends gov.nasa.jpf.jvm.bytecode.IFLE {

	public IFLE(int targetPc) {
		super(targetPc);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr();

		if (sym_v1 == null) { // both conditions are concrete
			return super.execute(ti);
		} else { // at least one condition is symbolic
			Expression sym_v2 = new LiteralExpression(0);
			Instruction nxtInstr = IFInstrSymbHelper.getNextInstructionAndSetPCChoice(ti, this, sym_v1, sym_v2,
					Comparator.LE, Comparator.GT);
			if (nxtInstr == getTarget())
				conditionValue = true;
			else
				conditionValue = false;
			return nxtInstr;
		}
	}

}

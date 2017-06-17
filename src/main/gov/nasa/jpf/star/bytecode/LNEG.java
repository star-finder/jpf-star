package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerUnaryExpression;
import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class LNEG extends gov.nasa.jpf.jvm.bytecode.LNEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		IntegerExpression sym_v1 = (IntegerExpression) sf.getOperandAttr();
		long v1 = sf.popLong();

		if (sym_v1 == null)
			sf.pushLong(-v1);
		else
			sf.pushLong(0);

		IntegerExpression result = null;
		if (sym_v1 != null) {
			result = new IntegerUnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setLongOperandAttr(result);

		return getNext(ti);
	}

}

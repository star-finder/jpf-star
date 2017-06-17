package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerUnaryExpression;
import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class INEG extends gov.nasa.jpf.jvm.bytecode.INEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		IntegerExpression sym_v1 = (IntegerExpression) sf.getOperandAttr();
		int v1 = sf.pop();

		if (sym_v1 == null)
			sf.push(-v1, false);
		else
			sf.push(0, false);

		IntegerExpression result = null;
		if (sym_v1 != null) {
			result = new IntegerUnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setOperandAttr(result);

		return getNext(ti);
	}

}

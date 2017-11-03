package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.Expression;
import starlib.formula.expression.Operator;
import starlib.formula.expression.UnaryExpression;

public class LNEG extends gov.nasa.jpf.jvm.bytecode.LNEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getLongOperandAttr();
		long v1 = sf.popLong();

		sf.pushLong(-v1);
		
		Expression result = null;
		if (sym_v1 != null) {
			result = new UnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setLongOperandAttr(result);

		return getNext(ti);
	}

}

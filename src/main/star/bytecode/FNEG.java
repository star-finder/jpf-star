package star.bytecode;

import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.formula.expression.Expression;
import star.formula.expression.UnaryExpression;

public class FNEG extends gov.nasa.jpf.jvm.bytecode.FNEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr();
		float v1 = sf.popFloat();

		if (sym_v1 == null)
			sf.pushFloat(-v1);
		else
			sf.pushFloat(0);

		Expression result = null;
		if (sym_v1 != null) {
			result = new UnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setOperandAttr(result);

		return getNext(ti);
	}

}

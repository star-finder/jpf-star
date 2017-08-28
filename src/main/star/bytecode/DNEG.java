package star.bytecode;

import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.formula.expression.Expression;
import star.formula.expression.UnaryExpression;

public class DNEG extends gov.nasa.jpf.jvm.bytecode.DNEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getLongOperandAttr();
		double v1 = sf.popDouble();

		if (sym_v1 == null)
			sf.pushDouble(-v1);
		else
			sf.pushDouble(0);

		Expression result = null;
		if (sym_v1 != null) {
			result = new UnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setLongOperandAttr(result);

		return getNext(ti);
	}

}

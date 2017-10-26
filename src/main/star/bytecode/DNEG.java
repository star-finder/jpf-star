package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.Expression;
import starlib.formula.expression.Operator;
import starlib.formula.expression.UnaryExpression;

public class DNEG extends gov.nasa.jpf.jvm.bytecode.DNEG {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getLongOperandAttr();
		double v1 = sf.popDouble();

		sf.pushDouble(-v1);
		
		Expression result = null;
		if (sym_v1 != null) {
			result = new UnaryExpression(Operator.MINUS, sym_v1);
		}
		
		sf.setLongOperandAttr(result);

		return getNext(ti);
	}

}

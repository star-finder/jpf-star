package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.IntegerBinaryExpression;
import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerLiteral;
import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class LAND extends gov.nasa.jpf.jvm.bytecode.LAND {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		IntegerExpression sym_v1 = (IntegerExpression) sf.getOperandAttr(3);
		IntegerExpression sym_v2 = (IntegerExpression) sf.getOperandAttr(1);

		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else {
			long v2 = sf.popLong();
			long v1 = sf.popLong();
			sf.pushLong(0); // for symbolic expressions, the concrete value does not matter
			
			IntegerExpression result = null;
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					result = new IntegerBinaryExpression(Operator.AND, sym_v1, sym_v2);
				} else {
					result = new IntegerBinaryExpression(Operator.AND, sym_v1, new IntegerLiteral(v2));
				}
			} else {
				result = new IntegerBinaryExpression(Operator.AND, new IntegerLiteral(v1), sym_v2);
			}
			
			sf.setLongOperandAttr(result);

			return getNext(ti);
		}
	}

}

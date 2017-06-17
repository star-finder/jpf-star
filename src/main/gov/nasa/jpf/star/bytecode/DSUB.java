package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.BinaryExpression;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.LiteralExpression;
import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class DSUB extends gov.nasa.jpf.jvm.bytecode.DSUB {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr(3);
		Expression sym_v2 = (Expression) sf.getOperandAttr(1);

		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else {
			double v2 = sf.popDouble();
			double v1 = sf.popDouble();
			sf.pushDouble(0); // for symbolic expressions, the concrete value does not matter
			
			Expression result = null;
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					result = new BinaryExpression(Operator.MINUS, sym_v1, sym_v2);
				} else {
					result = new BinaryExpression(Operator.MINUS, sym_v1, new LiteralExpression(v2));
				}
			} else {
				result = new BinaryExpression(Operator.MINUS, new LiteralExpression(v1), sym_v2);
			}
			
			sf.setLongOperandAttr(result);

			return getNext(ti);
		}
	}

}

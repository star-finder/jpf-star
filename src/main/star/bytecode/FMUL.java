package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.BinaryExpression;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.formula.expression.Operator;

public class FMUL extends gov.nasa.jpf.jvm.bytecode.FMUL {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v1 = (Expression) sf.getOperandAttr(1);
		Expression sym_v2 = (Expression) sf.getOperandAttr(0);
		
		if (sym_v1 == null && sym_v2 == null) {
			return super.execute(ti); // we'll still do the concrete execution
		}
		else {
			float v2 = sf.popFloat();
			float v1 = sf.popFloat();
			sf.pushFloat(v2 * v1); // support concolic
			
			Expression result = null;
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					result = new BinaryExpression(Operator.MUL, sym_v1, sym_v2);
				} else {
					result = new BinaryExpression(Operator.MUL, sym_v1, new LiteralExpression(v2));
				}
			} else {
				result = new BinaryExpression(Operator.MUL, new LiteralExpression(v1), sym_v2);
			}
			
			sf.setOperandAttr(result);
		
			return getNext(ti);
		}
	}

}

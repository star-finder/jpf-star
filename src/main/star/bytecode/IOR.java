package star.bytecode;

import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.formula.expression.BinaryExpression;
import star.formula.expression.Expression;
import star.formula.expression.LiteralExpression;

public class IOR extends gov.nasa.jpf.jvm.bytecode.IOR {
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Expression sym_v1 = (Expression) sf.getOperandAttr(1);
		Expression sym_v2 = (Expression) sf.getOperandAttr(0);
		
		if (sym_v1 == null && sym_v2 == null) {
			return super.execute(ti); // we'll still do the concrete execution
		} else {
			int v2 = sf.pop();
			int v1 = sf.pop();
			sf.push(0); // for symbolic expressions, the concrete value does not matter
		
			Expression result = null;
			
			if (sym_v1 != null) {
				if (sym_v2 != null) {
					result = new BinaryExpression(Operator.OR, sym_v1, sym_v2);
				} else {
					result = new BinaryExpression(Operator.OR, sym_v1, new LiteralExpression(v2));
				}
			} else {
				result = new BinaryExpression(Operator.OR, new LiteralExpression(v1), sym_v2);
			}
			
			sf.setOperandAttr(result);
		
			return getNext(ti);
		}
	}

}

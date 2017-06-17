package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.BinaryExpression;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.LiteralExpression;
import gov.nasa.jpf.symbc.numeric.Operator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class IINC extends gov.nasa.jpf.jvm.bytecode.IINC {

	public IINC(int localVarIndex, int increment) {
		super(localVarIndex, increment);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {

		StackFrame sf = ti.getModifiableTopFrame();

		Expression sym_v = (Expression) sf.getLocalAttr(index);
		if (sym_v == null) {
			return super.execute(ti);
		} else {
			Expression result = new BinaryExpression(Operator.PLUS, sym_v, 
					new LiteralExpression(increment));
			
			sf.setLocalVariable(index, 0, false);
			sf.setLocalAttr(index, result);
		}
		
		return getNext(ti);
	}

}

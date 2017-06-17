package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.expression.IntegerBinaryExpression;
import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerLiteral;
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

		IntegerExpression sym_v = (IntegerExpression) sf.getLocalAttr(index);
		if (sym_v == null) {
			return super.execute(ti);
		} else {
			IntegerExpression result = new IntegerBinaryExpression(Operator.PLUS, sym_v, 
					new IntegerLiteral(increment));
			
			sf.setLocalVariable(index, 0, false);
			sf.setLocalAttr(index, result);
		}
		
		return getNext(ti);
	}

}

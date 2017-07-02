package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.numeric.SymbolicReal;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class DLOAD extends gov.nasa.jpf.jvm.bytecode.DLOAD {

	public DLOAD(int localVarIndex) {
		super(localVarIndex);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getLongLocalAttr(index);
		
		if (sym_v != null &&
				(sym_v instanceof SymbolicInteger || sym_v instanceof SymbolicReal)) {
			Expression exp = new VariableExpression(new Variable(sym_v.toString(), "double"));
			sf.setLongLocalAttr(index, exp);
		}
		
		return super.execute(ti);
	}

}

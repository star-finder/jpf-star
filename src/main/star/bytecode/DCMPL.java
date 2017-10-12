package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;

public class DCMPL extends gov.nasa.jpf.jvm.bytecode.DCMPL {
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		
		Expression sym_v1 = (Expression) sf.getOperandAttr(3);
		Expression sym_v2 = (Expression) sf.getOperandAttr(1);
		
		if (sym_v1 == null && sym_v2 == null)
			return super.execute(ti);// we'll still do the concrete execution
		else
			return CMPInstrSymbHelper.getNextInstructionAndSetPCChoiceDouble(ti, this, sym_v1, sym_v2,
					Comparator.LT, Comparator.EQ, Comparator.GT);
	}

}

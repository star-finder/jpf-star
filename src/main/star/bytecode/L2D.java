package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class L2D extends gov.nasa.jpf.jvm.bytecode.L2D {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getLongOperandAttr();

		if (sym_v == null) {
			return super.execute(ti);
		} else { // symbolic
			Instruction result = super.execute(ti);
			sf.setLongOperandAttr(sym_v);
			return result;
		}
	}

}

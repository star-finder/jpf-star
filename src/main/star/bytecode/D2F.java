package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class D2F extends gov.nasa.jpf.jvm.bytecode.D2F {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getLongOperandAttr();

		if (sym_v == null) {
			return super.execute(ti);
		} else { // symbolic
			Instruction result = super.execute(ti);
			sf.setOperandAttr(sym_v);
			return result;
		}
	}

}

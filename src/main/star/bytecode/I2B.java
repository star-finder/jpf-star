package star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class I2B extends gov.nasa.jpf.jvm.bytecode.I2B {

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getOperandAttr();

		if (sym_v == null) {
			return super.execute(ti);
		} else { // symbolic
			Instruction result = super.execute(ti);
			sf.setOperandAttr(sym_v);
			return result;
		}
	}

}

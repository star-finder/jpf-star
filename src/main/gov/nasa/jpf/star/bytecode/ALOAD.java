package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class ALOAD extends gov.nasa.jpf.symbc.bytecode.ALOAD {

	public ALOAD(int index) {
		super(index);
	}

	@Override
	// ALOAD should perform normally
	public Instruction execute(ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		frame.pushLocal(index);

		return getNext(ti);
	}

}

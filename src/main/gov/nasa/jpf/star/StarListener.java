package gov.nasa.jpf.star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.symbc.heap.HeapSymbolicListener;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

public class StarListener extends HeapSymbolicListener {

	public StarListener(Config conf, JPF jpf) {
		super(conf, jpf);
	}

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction, Instruction executedInstruction) {
		super.instructionExecuted(vm, currentThread, nextInstruction, executedInstruction);
	}
}

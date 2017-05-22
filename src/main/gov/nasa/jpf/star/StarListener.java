package gov.nasa.jpf.star;

import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.report.PublisherExtension;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

public class StarListener extends PropertyListenerAdapter implements PublisherExtension {

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction, Instruction executedInstruction) {
		super.instructionExecuted(vm, currentThread, nextInstruction, executedInstruction);
	}
}

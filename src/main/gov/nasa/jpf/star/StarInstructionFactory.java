package gov.nasa.jpf.star;

import gov.nasa.jpf.star.bytecode.IFNONNULL;
import gov.nasa.jpf.star.bytecode.IFNULL;
import gov.nasa.jpf.star.bytecode.ALOAD;
import gov.nasa.jpf.vm.Instruction;

public class StarInstructionFactory extends gov.nasa.jpf.jvm.bytecode.InstructionFactory {

	@Override
	public Instruction aload(int localVarIndex) {
		return new ALOAD(localVarIndex);
	}

	@Override
	public Instruction ifnonnull(int targetPc) {
		return new IFNONNULL(targetPc);
	}

	@Override
	public Instruction ifnull(int targetPc) {
		return new IFNULL(targetPc);
	}

}

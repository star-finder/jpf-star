package gov.nasa.jpf.star;

import gov.nasa.jpf.vm.Instruction;

public class StarInstructionFactory extends gov.nasa.jpf.jvm.bytecode.InstructionFactory {
	
	@Override
	public Instruction aload(int localVarIndex) {
		System.out.println("aload");
		
	    return super.aload(localVarIndex);
	  }

}

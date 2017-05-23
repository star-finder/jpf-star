package gov.nasa.jpf.star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.jvm.bytecode.JVMInvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.JVMReturnInstruction;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.symbc.SymbolicListener;
import gov.nasa.jpf.symbc.bytecode.BytecodeUtils;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

public class StarListener extends SymbolicListener {

	public StarListener(Config conf, JPF jpf) {
		super(conf, jpf);
	}

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction,
			Instruction executedInstruction) {

		if (!vm.getSystemState().isIgnored()) {
			Instruction insn = executedInstruction;
			// SystemState ss = vm.getSystemState();
			ThreadInfo ti = currentThread;
			Config conf = vm.getConfig();

			if (insn instanceof JVMInvokeInstruction) {
				
			} else if (insn instanceof JVMReturnInstruction) {
				MethodInfo mi = insn.getMethodInfo();
				ClassInfo ci = mi.getClassInfo();
				if (null != ci) {
					String className = ci.getName();
					String methodName = mi.getName();
					String longName = mi.getLongName();
					int numberOfArgs = mi.getNumberOfArguments();

					if (((BytecodeUtils.isClassSymbolic(conf, className, mi, methodName))
							|| BytecodeUtils.isMethodSymbolic(conf, mi.getFullName(), numberOfArgs, null))) {

						ChoiceGenerator<?> cg = vm.getChoiceGenerator();
						if (!(cg instanceof StarChoiceGenerator)) {
							ChoiceGenerator<?> prevCG = cg.getPreviousChoiceGenerator();
							while (!((prevCG == null) || (prevCG instanceof StarChoiceGenerator))) {
								prevCG = prevCG.getPreviousChoiceGenerator();
							}
							cg = prevCG;
						}
						
						if (cg != null && cg instanceof StarChoiceGenerator && ((StarChoiceGenerator) cg).getCurrentPC() != null) {
							Formula f = ((StarChoiceGenerator) cg).getCurrentPCStar();
							System.out.println(f);
						}
					}	
				}
			}
		}
	}
}

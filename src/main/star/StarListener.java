package star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.jvm.bytecode.JVMReturnInstruction;
import gov.nasa.jpf.report.Publisher;
import gov.nasa.jpf.symbc.SymbolicListener;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import star.bytecode.BytecodeUtils;
import star.solver.Solver;
import star.testgeneration.TestGenerator;

public class StarListener extends SymbolicListener {

	private boolean first = true;
	
	public StarListener(Config conf, JPF jpf) {
		super(conf, jpf);
	}

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction,
			Instruction executedInstruction) {
		if (!vm.getSystemState().isIgnored()) {
			Config conf = vm.getConfig();
			if (executedInstruction.isFirstInstruction() && first) {
				// Sang: lifted from INVOKEInstrSymbHelper
				MethodInfo mi = executedInstruction.getMethodInfo();
				ClassInfo ci = mi.getClassInfo();
				if (ci != null) {
					String className = ci.getName();
					String methodName = mi.getName();
					int numberOfArgs = mi.getNumberOfArguments();

					boolean isClassSymbolic = BytecodeUtils.isClassSymbolic(conf, className, mi, methodName);
					boolean isMethodSymbolic = BytecodeUtils.isMethodSymbolic(conf, mi.getFullName(), numberOfArgs, null);
					if (isClassSymbolic || isMethodSymbolic) {
						TestGenerator.setClassAndMethodInfo(ci, mi, conf);
						first = false;
					}
				}
			} else if (executedInstruction instanceof JVMReturnInstruction) {
				MethodInfo mi = executedInstruction.getMethodInfo();
				ClassInfo ci = mi.getClassInfo();
				if (ci != null) {
					String className = ci.getName();
					String methodName = mi.getName();
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

						if (cg != null && cg instanceof StarChoiceGenerator
								&& ((StarChoiceGenerator) cg).getCurrentPCStar() != null) {
							System.out.println(((StarChoiceGenerator) cg).getCurrentPCStar());
							String model = Solver.getModel();
							System.out.println(model);

							TestGenerator.addModel(model);
						}
					}
				}
			}
		}
	}

	// -------- the publisher interface
	@Override
	public void publishFinished(Publisher publisher) {
		TestGenerator.generateTests();
		System.out.println("finished");
	}

}

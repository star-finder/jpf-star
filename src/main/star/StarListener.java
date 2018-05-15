package star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.JVMReturnInstruction;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import star.bytecode.BytecodeUtils;
import starlib.GlobalVariables;
import starlib.jpf.PathFinderUtils;
import starlib.jpf.testsuites.TestGenerator;
import starlib.solver.Solver;

public class StarListener extends PropertyListenerAdapter {

	private boolean first = true;
	private boolean DEBUG = false;
	
	public StarListener(Config conf, JPF jpf) {
		jpf.getReporter().getPublishers().clear();
		System.out.println();
		conf.setProperty("search.multiple_errors","true");
		String s = conf.getProperty("star.max_time");
		if (s != null) {
			GlobalVariables.MAX_TIME = Integer.parseInt(s);
		}
		s = conf.getProperty("star.max_depth");
		if (s != null) {
			GlobalVariables.MAX_DEPTH = Integer.parseInt(s);
		}
		DEBUG = conf.getProperty("star.debug","false").equals("true");
	}

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction,
			Instruction executedInstruction) {
		if (!vm.getSystemState().isIgnored()) {
			Config conf = vm.getConfig();
			if (first) {
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
							String model = Solver.getModel();
							TestGenerator.addModel(model);
							if(DEBUG) {
								System.out.println("\n\n===========================================");
								printPathConditionAndModel(cg, model);
							}
						}
					}
				}
			}
		}
	}
	
	private void printPathConditionAndModel(ChoiceGenerator<?> cg, String model) {
		System.out.println("Path condition: " + ((StarChoiceGenerator) cg).getCurrentPCStar());
		System.out.println();
		System.out.println("Model: " + model);
		System.out.println("-------------------------------------------");
	}
	
	@Override
	public void propertyViolated(Search search) {

		VM vm = search.getVM();

		ChoiceGenerator<?> cg = vm.getChoiceGenerator();
		if (!(cg instanceof StarChoiceGenerator)) {
			ChoiceGenerator<?> prev_cg = cg.getPreviousChoiceGenerator();
			while (!((prev_cg == null) || (prev_cg instanceof StarChoiceGenerator))) {
				prev_cg = prev_cg.getPreviousChoiceGenerator();
			}
			cg = prev_cg;
		}
		if ((cg instanceof StarChoiceGenerator) && ((StarChoiceGenerator) cg).getCurrentPC() != null) {
			String model = Solver.getModel();
			TestGenerator.addModel(model);
			if(DEBUG) {
				System.out.println("\n\n===========================================");
				PathFinderUtils.printErrorDetails(search);
				printPathConditionAndModel(cg, model);
			} else {
				PathFinderUtils.printErrorDetails(search);
			}
		}
	}
	
	@Override
	public void searchFinished(Search search) {
		TestGenerator.generateTests();
		System.out.println("\nTest generation completed.");
		System.out.println("Call = " + Solver.getCount());
	}
}

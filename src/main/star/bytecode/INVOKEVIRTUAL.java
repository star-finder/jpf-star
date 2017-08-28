package star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import star.formula.Formula;
import star.solver.Solver;
import star.testgeneration.TestGenerator;

public class INVOKEVIRTUAL extends gov.nasa.jpf.jvm.bytecode.INVOKEVIRTUAL {

	public INVOKEVIRTUAL(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		int objRef = ti.getCalleeThis(getArgSize());

		if (objRef == MJIEnv.NULL) {
			ChoiceGenerator<?> errorCG = ti.getVM().getSystemState().getChoiceGenerator();
			
			if (errorCG instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) errorCG).getCurrentPCStar();
				
				if (Solver.checkSat(pc, conf)) {
					System.out.println("java.lang.NullPointerException: Calling '" + mname + "' on null object");
					System.out.println(pc);
					
					String model = Solver.getModel();
					System.out.println(model);
					
					TestGenerator.addModel(model);
				}
			}
			
			lastObj = -1;
			
			ti.getVM().getSystemState().setIgnored(true);
			return getNext(ti);
		}

		MethodInfo mi = getInvokedMethod(ti, objRef);

		if (mi == null) {
			ClassInfo ci = ti.getClassInfo(objRef);
			String clsName = (ci != null) ? ci.getName() : "?UNKNOWN?";
			return ti.createAndThrowException("java.lang.NoSuchMethodError", clsName + '.' + mname);
		}

		// only set up precondition once
		if (conf.getProperty("star.init") == null) {
			int isSymbolic = INVOKEInstrSymbHelper.configPreCondition(ti, this);

			// -1 means not symbolic
			if (isSymbolic == -1)
				return super.execute(ti);
			// 0 means symbolic and this is the first time we execute this instruction
			// we need to execute it again to get precondition
			else if (isSymbolic == 0)
				return this;
			else {
				// set up symbolic values
				BytecodeUtils.InstructionOrSuper nextInstr = BytecodeUtils.execute(this, ti);
				
				if (nextInstr.callSuper) {
		            return super.execute(ti);
		        } else {
		            return nextInstr.inst;
		        }
			}
		} else {
			return super.execute(ti);
		}
	}

}

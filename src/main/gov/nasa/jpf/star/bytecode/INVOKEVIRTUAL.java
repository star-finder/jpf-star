package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.star.testgeneration.TestGenerator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKEVIRTUAL extends gov.nasa.jpf.symbc.bytecode.INVOKEVIRTUAL {

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

		boolean isFirst = INVOKEInstrSymbHelper.configPreCondition(ti, this);

		if (isFirst)
			return this;
		else
			return super.execute(ti);
	}

}

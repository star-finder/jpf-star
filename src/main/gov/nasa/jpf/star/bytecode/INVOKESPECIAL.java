package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKESPECIAL extends gov.nasa.jpf.jvm.bytecode.INVOKESPECIAL {
	public INVOKESPECIAL(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		MethodInfo mi = getInvokedMethod(ti);

		if (mi == null) {
			return ti.createAndThrowException("java.lang.NoSuchMethodException!*", "Calling " + cname + '.' + mname);
		}

		// only set up precondition once
		if (conf.getProperty("star.init") == null) {
			int isSymbolic = INVOKEInstrSymbHelper.configPreCondition(ti, this);

			// -1 means not symbolic
			if (isSymbolic == -1)
				return super.execute(ti);
			// 0 means symbolic and this is the first time we execute this
			// instruction
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

package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKESPECIAL extends gov.nasa.jpf.symbc.bytecode.INVOKESPECIAL {
	public INVOKESPECIAL(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		MethodInfo mi = getInvokedMethod(ti);

		if (mi == null) {
			return ti.createAndThrowException("java.lang.NoSuchMethodException!*", "Calling " + cname + '.' + mname);
		}

		boolean isFirst = INVOKEInstrSymbHelper.configPreCondition(ti, this);

		if (isFirst)
			return this;
		else
			return super.execute(ti);
	}

}

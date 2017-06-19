package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKESTATIC extends gov.nasa.jpf.symbc.bytecode.INVOKESTATIC {

	public INVOKESTATIC(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		ClassInfo clsInfo = getClassInfo();
		if (clsInfo == null) {
			return ti.createAndThrowException("java.lang.NoClassDefFoundError", cname);
		}

		MethodInfo callee = getInvokedMethod(ti);
		if (callee == null) {
			return ti.createAndThrowException("java.lang.NoSuchMethodException!!", cname + '.' + mname);
		}

		boolean isFirst = INVOKEInstrSymbHelper.configPreCondition(ti, this);

		if (isFirst)
			return this;
		else
			return super.execute(ti);
	}

}

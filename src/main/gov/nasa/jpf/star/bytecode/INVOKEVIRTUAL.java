package gov.nasa.jpf.star.bytecode;

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
		int objRef = ti.getCalleeThis(getArgSize());

		if (objRef == MJIEnv.NULL) {
			lastObj = -1;
			return ti.createAndThrowException("java.lang.NullPointerException",
					"Calling '" + mname + "' on null object");
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

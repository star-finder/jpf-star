package star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.NativeMethodInfo;
import star.bytecode.ATHROW;
import star.bytecode.D2F;
import star.bytecode.D2I;
import star.bytecode.D2L;
import star.bytecode.DADD;
import star.bytecode.DCMPG;
import star.bytecode.DCMPL;
import star.bytecode.DDIV;
import star.bytecode.DLOAD;
import star.bytecode.DMUL;
import star.bytecode.DNEG;
import star.bytecode.DREM;
import star.bytecode.DSUB;
import star.bytecode.EXECUTENATIVE;
import star.bytecode.F2D;
import star.bytecode.F2I;
import star.bytecode.F2L;
import star.bytecode.FADD;
import star.bytecode.FCMPG;
import star.bytecode.FCMPL;
import star.bytecode.FDIV;
import star.bytecode.FLOAD;
import star.bytecode.FMUL;
import star.bytecode.FNEG;
import star.bytecode.FREM;
import star.bytecode.FSUB;
import star.bytecode.I2B;
import star.bytecode.I2C;
import star.bytecode.I2D;
import star.bytecode.I2F;
import star.bytecode.I2L;
import star.bytecode.I2S;
import star.bytecode.IADD;
import star.bytecode.IAND;
import star.bytecode.IDIV;
import star.bytecode.IFEQ;
import star.bytecode.IFGE;
import star.bytecode.IFGT;
import star.bytecode.IFLE;
import star.bytecode.IFLT;
import star.bytecode.IFNE;
import star.bytecode.IFNONNULL;
import star.bytecode.IFNULL;
import star.bytecode.IF_ACMPEQ;
import star.bytecode.IF_ACMPNE;
import star.bytecode.IF_ICMPEQ;
import star.bytecode.IF_ICMPGE;
import star.bytecode.IF_ICMPGT;
import star.bytecode.IF_ICMPLE;
import star.bytecode.IF_ICMPLT;
import star.bytecode.IF_ICMPNE;
import star.bytecode.IINC;
import star.bytecode.ILOAD;
import star.bytecode.IMUL;
import star.bytecode.INEG;
import star.bytecode.INVOKESPECIAL;
import star.bytecode.INVOKESTATIC;
import star.bytecode.INVOKEVIRTUAL;
import star.bytecode.IOR;
import star.bytecode.IREM;
import star.bytecode.ISHL;
import star.bytecode.ISHR;
import star.bytecode.ISUB;
import star.bytecode.IUSHR;
import star.bytecode.IXOR;
import star.bytecode.L2D;
import star.bytecode.L2F;
import star.bytecode.L2I;
import star.bytecode.LADD;
import star.bytecode.LAND;
import star.bytecode.LCMP;
import star.bytecode.LDIV;
import star.bytecode.LLOAD;
import star.bytecode.LMUL;
import star.bytecode.LNEG;
import star.bytecode.LOOKUPSWITCH;
import star.bytecode.LOR;
import star.bytecode.LREM;
import star.bytecode.LSHL;
import star.bytecode.LSHR;
import star.bytecode.LSUB;
import star.bytecode.LUSHR;
import star.bytecode.LXOR;
import star.bytecode.TABLESWITCH;

// to perform symbolic execution, StarInstructionFactory should extend SymbolicInstructionFactory
// because some instructions from SymbolicInstructionFactory perform initial set up for
// symbolic execution
public class StarInstructionFactory extends gov.nasa.jpf.symbc.SymbolicInstructionFactory {

	private boolean lazy = false;

	public StarInstructionFactory(Config conf) {
		super(conf);

		String isLazy = conf.getProperty("star.lazy");
		if (isLazy != null && isLazy.equals("true"))
			lazy = true;
	}

	@Override
	public Instruction aload(int localVarIndex) {
		if (lazy)
			return new star.bytecode.lazy.ALOAD(localVarIndex);
		else
			return new star.bytecode.ALOAD(localVarIndex);
	}

	@Override
	public Instruction ifnonnull(int targetPc) {
		return new IFNONNULL(targetPc);
	}

	@Override
	public Instruction ifnull(int targetPc) {
		return new IFNULL(targetPc);
	}

	@Override
	public Instruction if_acmpeq(int targetPc) {
		return new IF_ACMPEQ(targetPc);
	}

	@Override
	public Instruction if_acmpne(int targetPc) {
		return new IF_ACMPNE(targetPc);
	}

	@Override
	public Instruction if_icmpeq(int targetPc) {
		return new IF_ICMPEQ(targetPc);
	}

	@Override
	public Instruction if_icmpne(int targetPc) {
		return new IF_ICMPNE(targetPc);
	}

	@Override
	public Instruction if_icmpge(int targetPc) {
		return new IF_ICMPGE(targetPc);
	}

	@Override
	public Instruction if_icmplt(int targetPc) {
		return new IF_ICMPLT(targetPc);
	}

	@Override
	public Instruction if_icmpgt(int targetPc) {
		return new IF_ICMPGT(targetPc);
	}

	@Override
	public Instruction if_icmple(int targetPc) {
		return new IF_ICMPLE(targetPc);
	}

	@Override
	public Instruction ifeq(int targetPc) {
		return new IFEQ(targetPc);
	}

	@Override
	public Instruction ifne(int targetPc) {
		return new IFNE(targetPc);
	}

	@Override
	public Instruction ifgt(int targetPc) {
		return new IFGT(targetPc);
	}

	@Override
	public Instruction ifge(int targetPc) {
		return new IFGE(targetPc);
	}

	@Override
	public Instruction iflt(int targetPc) {
		return new IFLT(targetPc);
	}

	@Override
	public Instruction ifle(int targetPc) {
		return new IFLE(targetPc);
	}

	@Override
	public Instruction iload(int localVarIndex) {
		return new ILOAD(localVarIndex);
	}

	@Override
	public Instruction iadd() {
		return new IADD();
	}

	@Override
	public Instruction iand() {
		return new IAND();
	}

	@Override
	public Instruction idiv() {
		return new IDIV();
	}

	@Override
	public Instruction iinc(int localVarIndex, int incConstant) {
		return new IINC(localVarIndex, incConstant);
	}

	@Override
	public Instruction imul() {
		return new IMUL();
	}

	@Override
	public Instruction ineg() {
		return new INEG();
	}

	@Override
	public Instruction ior() {
		return new IOR();
	}

	@Override
	public Instruction irem() {
		return new IREM();
	}

	@Override
	public Instruction ishl() {
		return new ISHL();
	}

	@Override
	public Instruction ishr() {
		return new ISHR();
	}

	@Override
	public Instruction isub() {
		return new ISUB();
	}

	@Override
	public Instruction iushr() {
		return new IUSHR();
	}

	@Override
	public Instruction ixor() {
		return new IXOR();
	}

	@Override
	public Instruction lload(int localVarIndex) {
		return new LLOAD(localVarIndex);
	}

	@Override
	public Instruction ladd() {
		return new LADD();
	}

	@Override
	public Instruction land() {
		return new LAND();
	}

	@Override
	public Instruction ldiv() {
		return new LDIV();
	}

	@Override
	public Instruction lmul() {
		return new LMUL();
	}

	@Override
	public Instruction lneg() {
		return new LNEG();
	}

	@Override
	public Instruction lor() {
		return new LOR();
	}

	@Override
	public Instruction lrem() {
		return new LREM();
	}

	@Override
	public Instruction lshl() {
		return new LSHL();
	}

	@Override
	public Instruction lshr() {
		return new LSHR();
	}

	@Override
	public Instruction lsub() {
		return new LSUB();
	}

	@Override
	public Instruction lushr() {
		return new LUSHR();
	}

	@Override
	public Instruction lxor() {
		return new LXOR();
	}

	@Override
	public Instruction lcmp() {
		return new LCMP();
	}

	@Override
	public Instruction fload(int localVarIndex) {
		return new FLOAD(localVarIndex);
	}

	@Override
	public Instruction fadd() {
		return new FADD();
	}

	@Override
	public Instruction fdiv() {
		return new FDIV();
	}

	@Override
	public Instruction fmul() {
		return new FMUL();
	}

	@Override
	public Instruction fneg() {
		return new FNEG();
	}

	@Override
	public Instruction frem() {
		return new FREM();
	}

	@Override
	public Instruction fsub() {
		return new FSUB();
	}

	@Override
	public Instruction fcmpg() {
		return new FCMPG();
	}

	@Override
	public Instruction fcmpl() {
		return new FCMPL();
	}

	@Override
	public Instruction dload(int localVarIndex) {
		return new DLOAD(localVarIndex);
	}

	@Override
	public Instruction dadd() {
		return new DADD();
	}

	@Override
	public Instruction ddiv() {
		return new DDIV();
	}

	@Override
	public Instruction dmul() {
		return new DMUL();
	}

	@Override
	public Instruction dneg() {
		return new DNEG();
	}

	@Override
	public Instruction drem() {
		return new DREM();
	}

	@Override
	public Instruction dsub() {
		return new DSUB();
	}

	@Override
	public Instruction dcmpg() {
		return new DCMPG();
	}

	@Override
	public Instruction dcmpl() {
		return new DCMPL();
	}

	@Override
	public Instruction i2b() {
		return new I2B();
	}

	@Override
	public Instruction i2c() {
		return new I2C();
	}

	@Override
	public Instruction i2d() {
		return new I2D();
	}

	@Override
	public Instruction i2f() {
		return new I2F();
	}

	@Override
	public Instruction i2l() {
		return new I2L();
	}

	@Override
	public Instruction i2s() {
		return new I2S();
	}

	@Override
	public Instruction l2d() {
		return new L2D();
	}

	@Override
	public Instruction l2f() {
		return new L2F();
	}

	@Override
	public Instruction l2i() {
		return new L2I();
	}

	@Override
	public Instruction f2d() {
		return new F2D();
	}

	@Override
	public Instruction f2i() {
		return new F2I();
	}

	@Override
	public Instruction f2l() {
		return new F2L();
	}

	@Override
	public Instruction d2f() {
		return new D2F();
	}

	@Override
	public Instruction d2i() {
		return new D2I();
	}

	@Override
	public Instruction d2l() {
		return new D2L();
	}

	@Override
	public Instruction invokevirtual(String clsName, String methodName, String methodSignature) {
		return new INVOKEVIRTUAL(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction invokestatic(String clsName, String methodName, String methodSignature) {
		return new INVOKESTATIC(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction invokespecial(String clsName, String methodName, String methodSignature) {
		return new INVOKESPECIAL(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction getfield(String fieldName, String clsName, String fieldDescriptor) {
		if (lazy)
			return new star.bytecode.lazy.GETFIELD(fieldName, clsName, fieldDescriptor);
		else
			return new star.bytecode.GETFIELD(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction getstatic(String fieldName, String clsName, String fieldDescriptor) {
		if (lazy)
			return new star.bytecode.lazy.GETSTATIC(fieldName, clsName, fieldDescriptor);
		else
			return new star.bytecode.GETSTATIC(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction lookupswitch(int defaultTargetPc, int nEntries) {
		return new LOOKUPSWITCH(defaultTargetPc, nEntries);
	}

	@Override
	public Instruction tableswitch(int defaultTargetPc, int low, int high) {
		return new TABLESWITCH(defaultTargetPc, low, high);
	}

	@Override
	public Instruction athrow() {
		return new ATHROW();
	}

	@Override
	public Instruction new_(String clsName) {
		if (lazy)
			return new gov.nasa.jpf.jvm.bytecode.NEW(clsName);
		else
			return new star.bytecode.NEW(clsName);
	}
	
	@Override
	public Instruction executenative(NativeMethodInfo mi) {
		return new EXECUTENATIVE(mi);
	}

}

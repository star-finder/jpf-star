package gov.nasa.jpf.star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.bytecode.IINC;
import gov.nasa.jpf.star.bytecode.INEG;
import gov.nasa.jpf.star.bytecode.IOR;
import gov.nasa.jpf.star.bytecode.IREM;
import gov.nasa.jpf.star.bytecode.ISHL;
import gov.nasa.jpf.star.bytecode.ISHR;
import gov.nasa.jpf.star.bytecode.IXOR;
import gov.nasa.jpf.star.bytecode.ALOAD;
import gov.nasa.jpf.star.bytecode.GETFIELD;
import gov.nasa.jpf.star.bytecode.IADD;
import gov.nasa.jpf.star.bytecode.IAND;
import gov.nasa.jpf.star.bytecode.IDIV;
import gov.nasa.jpf.star.bytecode.IFEQ;
import gov.nasa.jpf.star.bytecode.IFGE;
import gov.nasa.jpf.star.bytecode.IFGT;
import gov.nasa.jpf.star.bytecode.IFLE;
import gov.nasa.jpf.star.bytecode.IFLT;
import gov.nasa.jpf.star.bytecode.IFNE;
import gov.nasa.jpf.star.bytecode.IFNONNULL;
import gov.nasa.jpf.star.bytecode.IFNULL;
import gov.nasa.jpf.star.bytecode.IF_ACMPEQ;
import gov.nasa.jpf.star.bytecode.IF_ACMPNE;
import gov.nasa.jpf.star.bytecode.IF_ICMPEQ;
import gov.nasa.jpf.star.bytecode.IF_ICMPGE;
import gov.nasa.jpf.star.bytecode.IF_ICMPGT;
import gov.nasa.jpf.star.bytecode.IF_ICMPLE;
import gov.nasa.jpf.star.bytecode.IF_ICMPLT;
import gov.nasa.jpf.star.bytecode.IF_ICMPNE;
import gov.nasa.jpf.star.bytecode.ILOAD;
import gov.nasa.jpf.star.bytecode.IMUL;
import gov.nasa.jpf.star.bytecode.INVOKEVIRTUAL;
import gov.nasa.jpf.star.bytecode.ISUB;
import gov.nasa.jpf.star.bytecode.IUSHR;
import gov.nasa.jpf.vm.Instruction;

// to perform symbolic execution, StarInstructionFactory should extend SymbolicInstructionFactory
// because some instructions from SymbolicInstructionFactory perform initial set up for
// symbolic execution
public class StarInstructionFactory extends gov.nasa.jpf.symbc.SymbolicInstructionFactory {

	public StarInstructionFactory(Config conf) {
		super(conf);
	}

	@Override
	public Instruction aload(int localVarIndex) {
		return new ALOAD(localVarIndex);
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
	public Instruction invokevirtual(String clsName, String methodName, String methodSignature) {
		return new INVOKEVIRTUAL(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction getfield(String fieldName, String clsName, String fieldDescriptor) {
		return new GETFIELD(fieldName, clsName, fieldDescriptor);
	}

}

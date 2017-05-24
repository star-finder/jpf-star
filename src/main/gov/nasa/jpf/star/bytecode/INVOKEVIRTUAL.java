package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.PureFormula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKEVIRTUAL extends gov.nasa.jpf.symbc.bytecode.INVOKEVIRTUAL {

	public INVOKEVIRTUAL(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		// need a way to get method with preconditions
		if (mname.toString().equals("myMethod(LNode;LNode;)LNode;")) {
			ChoiceGenerator<?> cg = null;
			ChoiceGenerator<?> prevCG = null;
			
			if (!ti.isFirstStepInsn()) {
				cg = new StarChoiceGenerator(1);
				ti.getVM().getSystemState().setNextChoiceGenerator(cg);

				return this;
			} else {
				cg = ti.getVM().getSystemState().getChoiceGenerator();
			}
			
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			Formula pc = null;
			
			if (prevCG == null) {
				HeapTerm[] hts = new HeapTerm[1];
				hts[0] = new InductiveTerm("sll", new Variable("x", ""));
				HeapFormula hf = new HeapFormula(hts);
				
				pc = new Formula(hf, new PureFormula());
			}
			else {
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
			}
			
			((StarChoiceGenerator) cg).setCurrentPCStar(pc);
		}
		
		return super.execute(ti);
	}

}

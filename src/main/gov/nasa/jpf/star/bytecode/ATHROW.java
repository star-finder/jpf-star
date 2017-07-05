package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.star.testgeneration.TestGenerator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class ATHROW extends gov.nasa.jpf.jvm.bytecode.ATHROW {

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		
		ChoiceGenerator<?> errorCG = ti.getVM().getSystemState().getChoiceGenerator();
		
		if (errorCG instanceof StarChoiceGenerator) {
			Formula pc = ((StarChoiceGenerator) errorCG).getCurrentPCStar();
			
			if (Solver.checkSat(pc, conf)) {
				System.out.println("Throw Exception");
				System.out.println(pc);
				
				String model = Solver.getModel();
				System.out.println(model);
				
				TestGenerator.addModel(model);
			}
		}
		
		ti.getVM().getSystemState().setIgnored(true);
		return getNext(ti);
	}

}

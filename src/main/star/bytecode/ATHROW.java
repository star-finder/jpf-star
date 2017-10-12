package star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import starlib.solver.Solver;
import star.testgeneration.TestGenerator;
import starlib.formula.Formula;

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

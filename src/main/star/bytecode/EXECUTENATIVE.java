package star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.NativeMethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import star.StarChoiceGenerator;
import starlib.formula.Formula;
import starlib.jpf.NoErrorProperty;
import starlib.solver.Solver;

public class EXECUTENATIVE extends gov.nasa.jpf.jvm.bytecode.EXECUTENATIVE {

	public EXECUTENATIVE(NativeMethodInfo mi) {
		super(mi);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		if(mi.getClassName().equals("java.lang.Math")) {
			Config conf = ti.getVM().getConfig();
			
			ChoiceGenerator<?> errorCG = ti.getVM().getSystemState().getChoiceGenerator();
			
			if (errorCG instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) errorCG).getCurrentPCStar();
				
				if (Solver.checkSat(pc)) {
					VM vm = ti.getVM();
					vm.getSearch().error(new NoErrorProperty("Skip native method"), vm.getClonedPath(), vm.getThreadList());
				}
			}
			
			ti.getVM().getSystemState().setIgnored(true);
			return getNext(ti);
		} else {
			return super.execute(ti);
		}
	}

}

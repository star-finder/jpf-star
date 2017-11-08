package star.bytecode;

import java.util.Vector;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.jvm.bytecode.JVMInvokeInstruction;
import gov.nasa.jpf.symbc.bytecode.BytecodeUtils;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import starlib.formula.Formula;
import starlib.formula.Variable;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.precondition.Precondition;
import starlib.precondition.PreconditionMap;
import starlib.solver.Solver;

public class INVOKEInstrSymbHelper {
	
	public static int configPreCondition(ThreadInfo ti, JVMInvokeInstruction instr) {
		Config conf = ti.getVM().getConfig();
		
		String mname = instr.getInvokedMethodName();
		String cname = instr.getInvokedMethodClassName();
		
		MethodInfo mi = instr.getInvokedMethod(ti);
		String fname = mi.getFullName();
		
		ClassInfo ci = mi.getClassInfo();
		
		String[] argTypes = mi.getArgumentTypeNames();
		LocalVarInfo[] argInfo = mi.getArgumentLocalVars();
		
		int argSize = argTypes.length;
		
		boolean isClassSymbolic = BytecodeUtils.isClassSymbolic(conf, cname, mi, mname);
		boolean isMethodSymbolic = BytecodeUtils.isMethodSymbolic(conf, fname, argSize, new Vector<String>());
		
		if (isClassSymbolic || isMethodSymbolic) {
			ChoiceGenerator<?> cg;
			ChoiceGenerator<?> prevCG;
			
			if (!ti.isFirstStepInsn()) {
				cg = new StarChoiceGenerator(1);
				ti.getVM().getSystemState().setNextChoiceGenerator(cg);
				
				// Sang: move the below statement to StarListener
				// TestGenerator.setClassAndMethodInfo(ci, mi, conf);
				
				return 0;
			} else {
				conf.setProperty("star.init", "true");
				
				cg = ti.getVM().getSystemState().getChoiceGenerator();
				prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);
			
				Formula pc = null;
			
				if (prevCG == null) {
					String methodName = mi.getName();
					Precondition pre = null;
					
					pre = PreconditionMap.find(methodName);
					
					if (pre != null) {
						pc = pre.getFormula();
						if (!Solver.checkSat(pc, conf)) {
							System.out.println(">>>>> PC is " + pc.toString());
							System.out.println("Precondition is not satisfiable");
							ti.getVM().getSystemState().setIgnored(true);
							
							return -1;
						}
					}
					else
						pc = new Formula();
					
					for (int i = 0; i < argSize; i++) {
						if (argTypes[i].equals("int")) {
							String name =  argInfo[i + 1].getName();
							
							Expression exp1 = new Variable(name);
							Expression exp2 = new Variable(name);
							
							Expression lit1 = new LiteralExpression(Solver.getMinInt(conf));
							Expression lit2 = new LiteralExpression(Solver.getMaxInt(conf));
							
							pc.addComparisonTerm(Comparator.GE, exp1, lit1);
							pc.addComparisonTerm(Comparator.LE, exp2, lit2);
						} else if (argTypes[i].equals("long")) {
							String name =  argInfo[i + 1].getName();
							
							Expression exp1 = new Variable(name);
							Expression exp2 = new Variable(name);
							
							Expression lit1 = new LiteralExpression(Solver.getMinLong(conf));
							Expression lit2 = new LiteralExpression(Solver.getMaxLong(conf));
							
							pc.addComparisonTerm(Comparator.GE, exp1, lit1);
							pc.addComparisonTerm(Comparator.LE, exp2, lit2);
						}
					}
					
				} else {
					pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
				}
				
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);
				
				return 1;
			}
		}
		
		return -1;
	}

}

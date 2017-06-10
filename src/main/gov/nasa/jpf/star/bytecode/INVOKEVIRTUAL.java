package gov.nasa.jpf.star.bytecode;

import java.util.Vector;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.IntegerExpression;
import gov.nasa.jpf.star.formula.expression.IntegerLiteral;
import gov.nasa.jpf.star.formula.expression.IntegerVariable;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionMap;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.symbc.bytecode.BytecodeUtils;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class INVOKEVIRTUAL extends gov.nasa.jpf.symbc.bytecode.INVOKEVIRTUAL {

	public INVOKEVIRTUAL(String clsName, String methodName, String methodSignature) {
		super(clsName, methodName, methodSignature);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		
		String mname = getInvokedMethodName();
		String cname = getInvokedMethodClassName();
		
		MethodInfo mi = getInvokedMethod(ti);
		String fname = mi.getFullName();
		
		String[] argTypes = mi.getArgumentTypeNames();
		LocalVarInfo[] argInfo = mi.getArgumentLocalVars();
		
		int argSize = argTypes.length;
		
		boolean isClassSymbolic = BytecodeUtils.isClassSymbolic(conf, cname, mi, mname);
		boolean isMethodSymbolic = BytecodeUtils.isMethodSymbolic(conf, fname, argSize, new Vector<String>());
		
		// need a way to get method with preconditions
		if (isClassSymbolic || isMethodSymbolic) {
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
				String methodName = mi.getName();
				Precondition pre = PreconditionMap.find(methodName);
				if (pre != null)
					pc = pre.getFormula();
				else
					pc = new Formula();
				
				for (int i = 0; i < argSize; i++) {
					if (argTypes[i].equals("int")) {
						String name =  argInfo[i + 1].getName();
						
						IntegerExpression exp1 = new IntegerVariable(new Variable(name, ""));
						IntegerExpression exp2 = new IntegerVariable(new Variable(name, ""));
						
						IntegerExpression lit1 = new IntegerLiteral(Solver.getMinInt(conf));
						IntegerExpression lit2 = new IntegerLiteral(Solver.getMaxInt(conf));
						
						pc.addComparisonTerm(Comparator.GE, exp1, lit1);
						pc.addComparisonTerm(Comparator.LE, exp2, lit2);
					}
				}
				
			} else {
				pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
			}
			
			((StarChoiceGenerator) cg).setCurrentPCStar(pc);
		}
		
		return super.execute(ti);
	}

}

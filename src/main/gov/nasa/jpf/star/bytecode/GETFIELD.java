package gov.nasa.jpf.star.bytecode;

import java.util.List;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.Utility;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.symbc.bytecode.BytecodeUtils.VarType;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class GETFIELD extends gov.nasa.jpf.jvm.bytecode.GETFIELD {

	public GETFIELD(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getOperandAttr();

		if (sym_v == null) {
			return super.execute(ti);
		} else {
			ChoiceGenerator<?> cg = ti.getVM().getSystemState().getChoiceGenerator();
			if (cg instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) cg).getCurrentPCStar();
				PointToTerm pt = findPointToTerm(pc, sym_v.toString());
				
				if (pt == null) {
					if (Solver.checkSat(pc, ti.getVM().getConfig())) {
						System.out.println("Error: NullPointerException");
						System.out.println(Solver.getModel());
					}
					
					ti.getVM().getSystemState().setIgnored(true);
					return getNext(ti);
				} else {
					int objRef = sf.peek();
					ElementInfo eiFieldOwner = ti.getModifiableElementInfo(objRef);
				    FieldInfo fieldInfo = getFieldInfo();
				    
				    Variable[] vars = pt.getVars();
					Variable newVar = vars[fieldInfo.getFieldIndex() + 1];
				    
				    IntegerExpression newAttr = new SymbolicInteger(newVar.getName());
				    eiFieldOwner.setFieldAttr(fieldInfo, newAttr);
				}
			}

			return super.execute(ti);
		}
	}

	private PointToTerm findPointToTerm(Formula pc, String varName) {
		HeapFormula hf = pc.getHeapFormula();
		List<List<Variable>> alias = pc.getAlias();

		for (HeapTerm term : hf.getHeapTerms()) {
			if (term instanceof PointToTerm) {
				PointToTerm ptTerm = (PointToTerm) term;
				Variable root = ptTerm.getRoot();
				String rootName = root.getName();

				if (rootName.equals(varName)) {
					return ptTerm;
				} else {
					for (List<Variable> vars : alias) {
						if (vars.contains(root)) {
							for (Variable var : vars) {
								if (var.getName().equals(varName)) {
									return ptTerm;
								}
							}
						}
					}
				}
			}
		}

		return null;
	}

}

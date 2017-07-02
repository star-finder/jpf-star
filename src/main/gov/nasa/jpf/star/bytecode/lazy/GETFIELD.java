package gov.nasa.jpf.star.bytecode.lazy;

import java.util.List;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.solver.Solver;
import gov.nasa.jpf.star.testgeneration.TestGenerator;
import gov.nasa.jpf.symbc.arrays.ArrayExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.string.StringExpression;
import gov.nasa.jpf.symbc.string.SymbolicStringBuilder;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class GETFIELD extends gov.nasa.jpf.jvm.bytecode.GETFIELD {

	public GETFIELD(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		StackFrame sf = ti.getModifiableTopFrame();

		int objRef = sf.peek(); // don't pop yet, we might re-enter
		lastThis = objRef;

		// --- check for obvious exceptions
		if (objRef == MJIEnv.NULL) {
			ChoiceGenerator<?> errorCG = ti.getVM().getSystemState().getChoiceGenerator();
			
			if (errorCG instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) errorCG).getCurrentPCStar();
				
				if (Solver.checkSat(pc, conf)) {
					System.out.println("java.lang.NullPointerException: referencing field '" + fname + "' on null object");
					System.out.println(pc);
					
					String model = Solver.getModel();
					System.out.println(model);
					
					TestGenerator.addModel(model);
				}
			}
			
			ti.getVM().getSystemState().setIgnored(true);
			return getNext(ti);
		}

		ElementInfo ei = ti.getModifiableElementInfo(objRef);
		FieldInfo fi = getFieldInfo();
		if (fi == null) {
			return ti.createAndThrowException("java.lang.NoSuchFieldError",
					"referencing field '" + fname + "' in " + ei);
		}

		Object sym_v = ei.getFieldAttr(fi);

		if (!(fi.isReference() && sym_v != null)) {
			return super.execute(ti);
		}

		if (sym_v instanceof StringExpression || sym_v instanceof SymbolicStringBuilder
				|| sym_v instanceof ArrayExpression) {
			return super.execute(ti);
		}
		
		if (sym_v instanceof SymbolicInteger) {
			if (sym_v.toString().contains(".")) {
				int index = sym_v.toString().indexOf('.') + 1;
				int length = sym_v.toString().length();
				sym_v = new SymbolicInteger("this_" + sym_v.toString().substring(index, length));
			}
			
			Expression exp = new VariableExpression(new Variable(sym_v.toString(), fi.getType()));
			ei.setFieldAttr(fi, exp);
		}

		ChoiceGenerator<?> cg;
		ChoiceGenerator<?> prevCG;

		ClassInfo typeClassInfo = fi.getTypeClassInfo();

		// in the first round we check if we can unfold the formula
		// if it is we create a choice generator with the number of choices
		// is the length of unfolded formulas
		// then in subsequent rounds we add each unfolded formula to the pc
		if (!ti.isFirstStepInsn()) {
			prevCG = ti.getVM().getSystemState().getChoiceGenerator();
			if (prevCG instanceof StarChoiceGenerator) {
				Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();

				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area

				if (Utilities.isNull(pc, sym_v.toString())) {
					sf.pop();
					
					daIndex = MJIEnv.NULL;
					ei.setReferenceField(fi, daIndex);
					
					sf.pushRef(daIndex);
					sf.setOperandAttr(sym_v);

					return getNext(ti);
				} else {
					HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());

					if (ht instanceof PointToTerm) {
						sf.pop();

						daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
						ei.setReferenceField(fi, daIndex);

						sf.pushRef(daIndex);
						sf.setOperandAttr(sym_v);

						return getNext(ti);
					} else {
						String type = fi.getType();
						type = type.substring(type.lastIndexOf('.') + 1, type.length());
						
						List<Variable> vars = HeapMemoryMap.find(type);
						
						int size = vars.size() + 2; // null and old nodes and new node
						
						cg = new StarChoiceGenerator(size);
						ti.getVM().getSystemState().setNextChoiceGenerator(cg);
						
						return this;
					}
				}
			}

			return super.execute(ti);
		} else {
			sf.pop();
			
			String type = fi.getType();
			type = type.substring(type.lastIndexOf('.') + 1, type.length());
			
			List<Variable> vars = HeapMemoryMap.find(type);

			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			int currentChoice = (Integer) cg.getNextChoice();
			
			if (currentChoice < vars.size()) {
				Variable var = vars.get(currentChoice);
				pc.addEqTerm(new Variable(sym_v.toString(), ""), var);
			} else if (currentChoice == vars.size()) {
				pc.addEqNullTerm(new Variable(sym_v.toString(), ""));
			} else {
				Variable newVar = new Variable(sym_v.toString(), "");
				pc.addPointToTerm(newVar, type);
				HeapMemoryMap.put(type, newVar);
			}

			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);

				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area

				if (Utilities.isNull(pc, sym_v.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
				}

				ei.setReferenceField(fi, daIndex);

				sf.pushRef(daIndex);
				sf.setOperandAttr(sym_v);

				return getNext(ti);
			} else {
				ti.getVM().getSystemState().setIgnored(true);
				return getNext(ti);
			}
		}
	}

}

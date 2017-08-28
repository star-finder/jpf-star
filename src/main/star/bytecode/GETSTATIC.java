package star.bytecode;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.symbc.arrays.ArrayExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.numeric.SymbolicReal;
import gov.nasa.jpf.symbc.string.StringExpression;
import gov.nasa.jpf.symbc.string.SymbolicStringBuilder;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.StarChoiceGenerator;
import star.formula.Formula;
import star.formula.Utilities;
import star.formula.Variable;
import star.formula.expression.Expression;
import star.formula.expression.VariableExpression;
import star.formula.heap.HeapTerm;
import star.formula.heap.InductiveTerm;
import star.formula.heap.PointToTerm;
import star.solver.Solver;

public class GETSTATIC extends gov.nasa.jpf.jvm.bytecode.GETSTATIC {

	public GETSTATIC(String fieldName, String clsDescriptor, String fieldDescriptor) {
		super(fieldName, clsDescriptor, fieldDescriptor);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Config conf = ti.getVM().getConfig();
		StackFrame sf = ti.getModifiableTopFrame();

		FieldInfo fi;

		try {
			fi = getFieldInfo();
		} catch (LoadOnJPFRequired lre) {
			return ti.getPC();
		}

		if (fi == null) {
			return ti.createAndThrowException("java.lang.NoSuchFieldError",
					(className + '.' + fname));
		}

		ClassInfo ci = fi.getClassInfo();

		if (!mi.isClinit(ci) && ci.initializeClass(ti)) {
			return ti.getPC();
		}

		ElementInfo ei = ci.getModifiableStaticElementInfo();

		if (ei == null) {
			throw new JPFException("attempt to access field: " +
					fname + " of uninitialized class: " + ci.getName());
		}

		Object sym_v = ei.getFieldAttr(fi);

		if (sym_v == null || sym_v instanceof StringExpression || sym_v instanceof SymbolicStringBuilder
				|| sym_v instanceof ArrayExpression)
			return super.execute(ti); // Strings are handled specially

		if (sym_v instanceof SymbolicInteger || sym_v instanceof SymbolicReal) {
			String name = sym_v.toString();
			
			if (sym_v.toString().contains(".")) {
				String[] tmp = name.split("\\.");
				int last = tmp.length - 1;
				
				name = tmp[last - 1] + "_" + tmp[last];
			}
			
			Expression exp = new VariableExpression(new Variable(name, ""));
			
			sym_v = exp;
			ei.setFieldAttr(fi, exp);
		}
		
		if (!fi.isReference()) {
			return super.execute(ti);
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
					daIndex = MJIEnv.NULL;
					
					ei.setReferenceField(fi, daIndex);
					
					sf.pushRef(daIndex);
					sf.setOperandAttr(sym_v);

					return getNext(ti);
				} else {
					HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());

					if (ht instanceof PointToTerm) {
						String name = sym_v.toString();
						
						int address = pc.findAddress(name);
						if (address == -1) {
							address = pc.findAddress(pc.getAlias(name));
							if (address == -1) {
								daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
							} else {
								daIndex = address;
							}
							
							pc.putAddress(name, daIndex);
						} else {
							daIndex = address;
						}
						
						ei.setReferenceField(fi, daIndex);
						
						sf.pushRef(daIndex);
						sf.setOperandAttr(sym_v);

						return getNext(ti);
					} else if (ht instanceof InductiveTerm) {
						InductiveTerm it = (InductiveTerm) ht;
						Formula[] fs = it.unfold();

						cg = new StarChoiceGenerator(fs.length);
						ti.getVM().getSystemState().setNextChoiceGenerator(cg);

						return this;
					}
				}
			}

			return super.execute(ti);
		} else {
			cg = ti.getVM().getSystemState().getChoiceGenerator();
			prevCG = cg.getPreviousChoiceGeneratorOfType(StarChoiceGenerator.class);

			Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar().copy();
			HeapTerm ht = Utilities.findHeapTerm(pc, sym_v.toString());

			// in this case ht is inductive term;
			InductiveTerm it = (InductiveTerm) ht;
			pc.unfold(it, (Integer) cg.getNextChoice());

			if (Solver.checkSat(pc, conf)) {
				((StarChoiceGenerator) cg).setCurrentPCStar(pc);

				// add new object according to pc
				int daIndex = 0; // index into JPF's dynamic area

				if (Utilities.isNull(pc, sym_v.toString())) {
					daIndex = MJIEnv.NULL;
				} else {
					String name = sym_v.toString();
					
					int address = pc.findAddress(name);
					if (address == -1) {
						address = pc.findAddress(pc.getAlias(name));
						if (address == -1) {
							daIndex = Utilities.addNewHeapNode(ti, ei, typeClassInfo, sym_v, pc);
						} else {
							daIndex = address;
						}
						
						pc.putAddress(name, daIndex);
					} else {
						daIndex = address;
					}
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

package gov.nasa.jpf.star.bytecode;

import gov.nasa.jpf.star.StarChoiceGenerator;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class NEW extends gov.nasa.jpf.jvm.bytecode.NEW {

	public NEW(String clsDescriptor) {
		super(clsDescriptor);
	}

	@Override
	public Instruction execute(ThreadInfo ti) {
		Heap heap = ti.getHeap();
	    ClassInfo ci;

	    // resolve the referenced class
	    try {
	      ci = ti.resolveReferencedClass(cname);
	    } catch(LoadOnJPFRequired lre) {
	      return ti.getPC();
	    }

	    if (ci.initializeClass(ti)){
	      // continue with the topframe and re-exec this insn once the clinits are done
	      return ti.getPC();
	    }

	    if (heap.isOutOfMemory()) { // simulate OutOfMemoryError
	      return ti.createAndThrowException("java.lang.OutOfMemoryError",
	                                        "trying to allocate new " + cname);
	    }

	    ChoiceGenerator<?> prevCG = ti.getVM().getSystemState().getChoiceGenerator();
	    
	    if (prevCG instanceof StarChoiceGenerator) {
		    Formula pc = ((StarChoiceGenerator) prevCG).getCurrentPCStar();
		    Variable newNode = Utilities.freshVar(new Variable("newNode", ""));
		    
		    Expression sym_v = new VariableExpression(newNode);
		    
		    ElementInfo ei = heap.newObject(ci, ti);
		    ei.setObjectAttr(sym_v);
		    
		    int objRef = ei.getObjectRef();
		    newObjRef = objRef;
	
		    // pushes the return value onto the stack
		    StackFrame sf = ti.getModifiableTopFrame();
		    sf.pushRef(objRef);
		    sf.setOperandAttr(sym_v);
	
		    return getNext(ti);
	    }
	    
	    return super.execute(ti);
	}

}

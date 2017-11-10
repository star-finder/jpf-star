package star.bytecode;

import gov.nasa.jpf.symbc.heap.HeapNode;
import gov.nasa.jpf.symbc.heap.Helper;
import gov.nasa.jpf.symbc.heap.SymbolicInputHeap;
import gov.nasa.jpf.symbc.numeric.PathCondition;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.Formula;
import starlib.formula.Utilities;
import starlib.formula.Variable;
import starlib.formula.expression.Expression;
import starlib.formula.heap.PointToTerm;

public class StarBytecodeUtils {

	public static int addNewHeapNode(ThreadInfo ti, ElementInfo ei, ClassInfo typeClassInfo,
			Object attr, Formula pc) {
		int daIndex = 0;
		
		PathCondition symPC = new PathCondition();
		SymbolicInputHeap symInputHeap = new SymbolicInputHeap();

		HeapNode[] prevSymRefs = symInputHeap.getNodesOfType(typeClassInfo);
		int numSymRefs = prevSymRefs.length;

		boolean shared = (ei == null ? false : ei.isShared());
		
		SymbolicInteger sym = new SymbolicInteger(attr.toString());
		
		daIndex = Helper.addNewHeapNode(typeClassInfo, ti, sym, symPC, 
				symInputHeap, numSymRefs, prevSymRefs, shared);
		
		PointToTerm pt = (PointToTerm) Utilities.findHeapTerm(pc, attr.toString());
		Variable[] vars = pt.getVars();
		
		// change attribute of new node according to unfold result
		ElementInfo newEi = ti.getModifiableElementInfo(daIndex);
		int numberOfFields = newEi.getNumberOfFields();
		
		for (int i = 0; i < numberOfFields; i++) {
			FieldInfo newFi = newEi.getFieldInfo(i);
			// do we need to check type of the fields and add more precise symbolic value
			Expression exp = new Variable(vars[i + 1].getName(), "");
			newEi.setFieldAttr(newFi, exp);
		}
		
		return daIndex;
	}
}

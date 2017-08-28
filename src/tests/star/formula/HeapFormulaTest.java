package star.formula;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import star.formula.HeapFormula;
import star.formula.Utilities;
import star.formula.Variable;
import star.formula.heap.HeapTerm;
import star.formula.heap.InductiveTerm;
import star.formula.heap.PointToTerm;

public class HeapFormulaTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString1() {
		HeapFormula heapFormula = new HeapFormula();
		
		assertTrue(heapFormula.toString().equals("emp"));
	}
	
	@Test
	public void testToString2() {
		Variable x = new Variable("x", "");
		Variable next = new Variable("next", "");
		
		HeapTerm pt = new PointToTerm("Node", x, next);
		HeapTerm ind = new InductiveTerm("sll", next);
		
		HeapFormula heapFormula = new HeapFormula(pt, ind);
		
		assertTrue(heapFormula.toString().equals("x->Node(next) * sll(next)"));
	}
	
	@Test
	public void testSubstitute() {
		Variable x = new Variable("x", "");
		Variable next = new Variable("next", "");
		
		HeapTerm pt = new PointToTerm("Node", x, next);
		HeapTerm ind = new InductiveTerm("sll", next);
		
		HeapFormula heapFormula1 = new HeapFormula(pt, ind);
		
		Variable[] fromVars = {new Variable("x", "")};
		Variable[] toVars = {new Variable("y", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapFormula heapFormula2 = heapFormula1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(heapFormula1.toString().equals("x->Node(next) * sll(next)"));
		assertTrue(heapFormula2.toString().equals("y->Node(next_1) * sll(next_1)"));
	}

}

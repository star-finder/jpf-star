package gov.nasa.jpf.star.formula;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.formula.heap.HeapTerm;
import gov.nasa.jpf.star.formula.heap.InductiveTerm;
import gov.nasa.jpf.star.formula.heap.PointToTerm;
import gov.nasa.jpf.star.formula.pure.EqNullTerm;
import gov.nasa.jpf.star.formula.pure.NEqTerm;
import gov.nasa.jpf.star.formula.pure.PureTerm;

public class FormulaTest {
	
	@Before
	public void init() {
		Utility.reset();
	}

	@Test
	public void testToString1() {
		HeapFormula heapFormula = new HeapFormula();
		PureFormula pureFormula = new PureFormula();
		
		Formula formula = new Formula(heapFormula, pureFormula);
		
		assertTrue(formula.toString().equals("true"));
	}
	
	@Test
	public void testToString2() {
		Variable x = new Variable("x", "");
		Variable next = new Variable("next", "");
		Variable y = new Variable("y", "");
		
		HeapTerm pt = new PointToTerm("Node", x, next);
		HeapTerm ind = new InductiveTerm("sll", next);
		
		
		PureTerm eqNull = new EqNullTerm(x);
		PureTerm neq = new NEqTerm(x, y);
		
		HeapFormula heapFormula = new HeapFormula(pt, ind);
		PureFormula pureFormula = new PureFormula(eqNull, neq);
		
		Formula formula = new Formula(heapFormula, pureFormula);
		
		assertTrue(formula.toString().equals("x->Node(next) * next::sll() & x = null & x != y"));
	}
	
	@Test
	public void testSubstitute() {
		Variable x = new Variable("x", "");
		Variable next = new Variable("next", "");
		Variable y = new Variable("y", "");
		
		HeapTerm pt = new PointToTerm("Node", x, next);
		HeapTerm ind = new InductiveTerm("sll", next);
		
		
		PureTerm eqNull = new EqNullTerm(x);
		PureTerm neq = new NEqTerm(x, y);
		
		HeapFormula heapFormula = new HeapFormula(pt, ind);
		PureFormula pureFormula = new PureFormula(eqNull, neq);
		
		Formula formula1 = new Formula(heapFormula, pureFormula);
		
		Variable[] fromVars = {new Variable("x", "")};
		Variable[] toVars = {new Variable("z", "")};
		
		Formula formula2 = formula1.substitute(fromVars, toVars);
		
		assertTrue(formula1.toString().equals("x->Node(next) * next::sll() & x = null & x != y"));
		assertTrue(formula2.toString().equals("z->Node(next_1) * next_1::sll() & z = null & z != y_2"));
	}

}

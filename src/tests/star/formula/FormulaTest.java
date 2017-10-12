package star.formula;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import starlib.formula.Formula;
import starlib.formula.HeapFormula;
import starlib.formula.PureFormula;
import starlib.formula.Utilities;
import starlib.formula.Variable;
import starlib.formula.heap.HeapTerm;
import starlib.formula.heap.InductiveTerm;
import starlib.formula.heap.PointToTerm;
import starlib.formula.pure.EqNullTerm;
import starlib.formula.pure.NEqTerm;
import starlib.formula.pure.PureTerm;

public class FormulaTest {
	
	@Before
	public void init() {
		Utilities.reset();
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
		
		assertTrue(formula.toString().equals("x->Node(next) * sll(next) & x = null & x != y"));
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
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		Formula formula2 = formula1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(formula1.toString().equals("x->Node(next) * sll(next) & x = null & x != y"));
		assertTrue(formula2.toString().equals("z->Node(next_1) * sll(next_1) & z = null & z != y_2"));
	}

}

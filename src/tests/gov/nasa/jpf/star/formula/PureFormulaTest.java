package gov.nasa.jpf.star.formula;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import star.formula.PureFormula;
import star.formula.Utilities;
import star.formula.Variable;
import star.formula.pure.EqNullTerm;
import star.formula.pure.EqTerm;
import star.formula.pure.NEqNullTerm;
import star.formula.pure.NEqTerm;
import star.formula.pure.PureTerm;

public class PureFormulaTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString1() {
		PureFormula pureFormula = new PureFormula();
		
		assertTrue(pureFormula.toString().equals("true"));
	}
	
	@Test
	public void testToString2() {
		Variable x = new Variable("x", "");
		Variable y = new Variable("y", "");
		
		PureTerm eqNull = new EqNullTerm(x);
		PureTerm neq = new NEqTerm(x, y);
		
		PureFormula pureFormula = new PureFormula(eqNull, neq);
		
		assertTrue(pureFormula.toString().equals("x = null & x != y"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable x = new Variable("x", "");
		Variable y = new Variable("y", "");
		
		PureTerm neqNull = new NEqNullTerm(x);
		PureTerm eq = new EqTerm(x, y);
		
		PureFormula pureFormula1 = new PureFormula(neqNull, eq);
		
		Variable[] fromVars = {new Variable("x", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureFormula pureFormula2 = pureFormula1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(pureFormula1.toString().equals("x != null & x = y"));
		assertTrue(pureFormula2.toString().equals("z != null & z = y_1"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable x = new Variable("x", "");
		Variable y = new Variable("y", "");
		
		PureTerm neqNull = new NEqNullTerm(x);
		PureTerm eq = new EqTerm(x, y);
		
		PureFormula pureFormula1 = new PureFormula(neqNull, eq);
		
		Variable[] fromVars = {new Variable("y", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureFormula pureFormula2 = pureFormula1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(pureFormula1.toString().equals("x != null & x = y"));
		assertTrue(pureFormula2.toString().equals("x_1 != null & x_1 = z"));
	}

}

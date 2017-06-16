package gov.nasa.jpf.star.formula.pure;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;

public class EqNullTermTest {

	@Before
	public void init() {
		Utilities.reset();
	}
	
	@Test
	public void testToString() {
		Variable var = new Variable("x", "");
		PureTerm eqNull = new EqNullTerm(var);
		
		assertTrue(eqNull.toString().equals("x = null"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable var = new Variable("x", "");
		PureTerm eqNull1 = new EqNullTerm(var);
		
		Variable[] fromVars = {new Variable("x", "")};
		Variable[] toVars = {new Variable("y", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm eqNull2 = eqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(eqNull1.toString().equals("x = null"));
		assertTrue(eqNull2.toString().equals("y = null"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable var = new Variable("x", "");
		PureTerm eqNull1 = new EqNullTerm(var);
		
		Variable[] fromVars = {new Variable("y", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm eqNull2 = eqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(eqNull1.toString().equals("x = null"));
		assertTrue(eqNull2.toString().equals("x_1 = null"));
	}
	
	@Test
	public void testSubstitute3() {
		Variable var = new Variable("x", "");
		PureTerm eqNull1 = new EqNullTerm(var);
		
		Variable[] fromVars = {new Variable("y", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		existVarSubMap.put("x", "a");
		
		PureTerm eqNull2 = eqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(eqNull1.toString().equals("x = null"));
		assertTrue(eqNull2.toString().equals("a = null"));
	}

}

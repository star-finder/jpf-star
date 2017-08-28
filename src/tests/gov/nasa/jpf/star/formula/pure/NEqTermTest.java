package gov.nasa.jpf.star.formula.pure;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import star.formula.Utilities;
import star.formula.Variable;
import star.formula.pure.NEqTerm;
import star.formula.pure.PureTerm;

public class NEqTermTest {

	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq = new NEqTerm(var1, var2);
		
		assertTrue(neq.toString().equals("x != y"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("x", ""), new Variable("y", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("a != b"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("t", ""), new Variable("u", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("x_1 != y_2"));
	}
	
	@Test
	public void testSubstitute3() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("x", ""), new Variable("u", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("a != y_1"));
	}
	
	@Test
	public void testSubstitute4() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("t", ""), new Variable("y", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("x_1 != b"));
	}
	
	@Test
	public void testSubstitute5() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("t", ""), new Variable("u", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		existVarSubMap.put("x", "v");
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("v != y_1"));
	}
	
	@Test
	public void testSubstitute6() {
		Variable var1 = new Variable("x", "");
		Variable var2 = new Variable("y", "");
		
		PureTerm neq1 = new NEqTerm(var1, var2);
		
		Variable[] fromVars = {new Variable("t", ""), new Variable("u", "")};
		Variable[] toVars = {new Variable("a", ""), new Variable("b", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		existVarSubMap.put("x", "v");
		existVarSubMap.put("y", "w");
		
		PureTerm neq2 = neq1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neq1.toString().equals("x != y"));
		assertTrue(neq2.toString().equals("v != w"));
	}

}

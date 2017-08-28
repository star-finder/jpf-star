package gov.nasa.jpf.star.formula.pure;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import star.formula.Utilities;
import star.formula.Variable;
import star.formula.pure.NEqNullTerm;
import star.formula.pure.PureTerm;

public class NEqNullTermTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString() {
		Variable var = new Variable("x", "");
		PureTerm neqNull = new NEqNullTerm(var);
		
		assertTrue(neqNull.toString().equals("x != null"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable var = new Variable("x", "");
		PureTerm neqNull1 = new NEqNullTerm(var);
		
		Variable[] fromVars = {new Variable("x", "")};
		Variable[] toVars = {new Variable("y", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neqNull2 = neqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neqNull1.toString().equals("x != null"));
		assertTrue(neqNull2.toString().equals("y != null"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable var = new Variable("x", "");
		PureTerm neqNull1 = new NEqNullTerm(var);
		
		Variable[] fromVars = {new Variable("y", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		PureTerm neqNull2 = neqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neqNull1.toString().equals("x != null"));
		assertTrue(neqNull2.toString().equals("x_1 != null"));
	}
	
	@Test
	public void testSubstitute3() {
		Variable var = new Variable("x", "");
		PureTerm neqNull1 = new NEqNullTerm(var);
		
		Variable[] fromVars = {new Variable("y", "")};
		Variable[] toVars = {new Variable("z", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		existVarSubMap.put("x", "a");
		
		PureTerm neqNull2 = neqNull1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(neqNull1.toString().equals("x != null"));
		assertTrue(neqNull2.toString().equals("a != null"));
	}

}

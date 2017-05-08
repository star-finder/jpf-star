package gov.nasa.jpf.star.formula.pure;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import gov.nasa.jpf.star.formula.Variable;

public class TrueTermTest {

	@Test
	public void testToString() {
		PureTerm t = new TrueTerm();
		assertTrue(t.toString().equals("true"));
	}
	
	@Test
	public void testSubstitute() {
		PureTerm t1 = new TrueTerm();
		PureTerm t2 = t1.substitute(new Variable[0], new Variable[0], new HashMap<String,String>());
		
		assertTrue(t2.toString().equals("true"));
	}

}

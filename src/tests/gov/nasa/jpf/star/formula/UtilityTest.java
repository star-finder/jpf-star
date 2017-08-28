package gov.nasa.jpf.star.formula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import star.formula.Utilities;
import star.formula.Variable;

public class UtilityTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testFreshVar1() {
		Variable var = new Variable("x", "");
		Variable newVar = Utilities.freshVar(var);
		
		assertTrue(newVar.toString().equals("x_1"));
	}
	
	@Test
	public void testFreshVar2() {
		Variable var = new Variable("xyz", "");
		Variable newVar1 = Utilities.freshVar(var);
		Variable newVar2 = Utilities.freshVar(var);
		
		assertTrue(newVar1.toString().equals("xyz_1"));
		assertTrue(newVar2.toString().equals("xyz_2"));
	}
	
	@Test
	public void testFreshVar3() {
		Variable var = new Variable("abc", "");
		Variable newVar1 = Utilities.freshVar(var);
		Variable newVar2 = Utilities.freshVar(newVar1);
		
		assertTrue(newVar1.toString().equals("abc_1"));
		assertTrue(newVar2.toString().equals("abc_2"));
	}
	
	@Test
	public void testFreshVar4() {
		Variable var = new Variable("myVar", "");
		Variable newVar1 = Utilities.freshVar(var);
		Variable newVar2 = Utilities.freshVar(newVar1);
		
		assertTrue(newVar1.toString().equals("myVar_1"));
		assertTrue(newVar2.toString().equals("myVar_2"));
		
		Variable var2 = new Variable("myVar2", "");
		Variable newVar3 = Utilities.freshVar(var2);
		Variable newVar4 = Utilities.freshVar(newVar3);
		
		assertTrue(newVar3.toString().equals("myVar2_3"));
		assertTrue(newVar4.toString().equals("myVar2_4"));
	}
	
	@Test
	public void testContains1() {
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar", "");
		
		assertTrue(Utilities.find(vars, var) == 0);
	}
	
	@Test
	public void testContains2() {
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar1", "");
		
		assertTrue(Utilities.find(vars, var) == 1);
	}
	
	@Test
	public void testContains3() {
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar2", "");
		
		assertTrue(Utilities.find(vars, var) == -1);
	}

}

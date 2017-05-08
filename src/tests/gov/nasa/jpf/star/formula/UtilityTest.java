package gov.nasa.jpf.star.formula;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilityTest {

	@Test
	public void testFreshVar1() {
		Utility.reset();
		
		Variable var = new Variable("x", "");
		Variable newVar = Utility.freshVar(var);
		
		assertTrue(newVar.toString().equals("x_1"));
	}
	
	@Test
	public void testFreshVar2() {
		Utility.reset();
		
		Variable var = new Variable("xyz", "");
		Variable newVar1 = Utility.freshVar(var);
		Variable newVar2 = Utility.freshVar(var);
		
		assertTrue(newVar1.toString().equals("xyz_1"));
		assertTrue(newVar2.toString().equals("xyz_2"));
	}
	
	@Test
	public void testFreshVar3() {
		Utility.reset();
		
		Variable var = new Variable("abc", "");
		Variable newVar1 = Utility.freshVar(var);
		Variable newVar2 = Utility.freshVar(newVar1);
		
		assertTrue(newVar1.toString().equals("abc_1"));
		assertTrue(newVar2.toString().equals("abc_2"));
	}
	
	@Test
	public void testFreshVar4() {
		Utility.reset();
		
		Variable var = new Variable("myVar", "");
		Variable newVar1 = Utility.freshVar(var);
		Variable newVar2 = Utility.freshVar(newVar1);
		
		assertTrue(newVar1.toString().equals("myVar_1"));
		assertTrue(newVar2.toString().equals("myVar_2"));
		
		Variable var2 = new Variable("myVar2", "");
		Variable newVar3 = Utility.freshVar(var2);
		Variable newVar4 = Utility.freshVar(newVar3);
		
		assertTrue(newVar3.toString().equals("myVar2_3"));
		assertTrue(newVar4.toString().equals("myVar2_4"));
	}
	
	@Test
	public void testContains1() {
		Utility.reset();
		
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar", "");
		
		assertTrue(Utility.contains(vars, var) == 0);
	}
	
	@Test
	public void testContains2() {
		Utility.reset();
		
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar1", "");
		
		assertTrue(Utility.contains(vars, var) == 1);
	}
	
	@Test
	public void testContains3() {
		Utility.reset();
		
		Variable[] vars = {new Variable("myVar", ""), new Variable("myVar1", "")};
		Variable var = new Variable("myVar2", "");
		
		assertTrue(Utility.contains(vars, var) == -1);
	}

}

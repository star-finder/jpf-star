package gov.nasa.jpf.star.formula.heap;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.formula.Utilities;
import gov.nasa.jpf.star.formula.Variable;

public class PointToTermTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString1() {
		Variable root = new Variable("root", "");
		HeapTerm pt = new PointToTerm("Node", root);
		
		assertTrue(pt.toString().equals("root->Node()"));
	}
	
	@Test
	public void testToString2() {
		Variable root = new Variable("root", "");
		Variable next = new Variable("next", "");
		HeapTerm pt = new PointToTerm("Node", root, next);
		
		assertTrue(pt.toString().equals("root->Node(next)"));
	}
	
	@Test
	public void testToString3() {
		Variable root = new Variable("x", "");
		Variable y = new Variable("y", "");
		Variable z = new Variable("z", "");
		HeapTerm pt = new PointToTerm("Node", root, y, z);
		
		assertTrue(pt.toString().equals("x->Node(y,z)"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable root = new Variable("root", "");
		Variable var = new Variable("next", "");
		
		HeapTerm pt1 = new PointToTerm("Node", root, var);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm pt2 = pt1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(pt1.toString().equals("root->Node(next)"));
		assertTrue(pt2.toString().equals("next->Node(next1)"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable root = new Variable("root", "");
		Variable var1 = new Variable("next", "");
		Variable var2 = new Variable("prev", "");
		
		HeapTerm pt1 = new PointToTerm("Node2", root, var1, var2);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", ""), new Variable("prev", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", ""), new Variable("root", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm pt2 = pt1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(pt1.toString().equals("root->Node2(next,prev)"));
		assertTrue(pt2.toString().equals("next->Node2(next1,root)"));
	}
	
	@Test
	public void testSubstitute3() {
		Variable root = new Variable("root", "");
		Variable var1 = new Variable("next", "");
		Variable var2 = new Variable("k", "");
		
		HeapTerm pt1 = new PointToTerm("Node", root, var1, var2);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm pt2 = pt1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(pt1.toString().equals("root->Node(next,k)"));
		assertTrue(pt2.toString().equals("next->Node(next1,k_1)"));
	}

}

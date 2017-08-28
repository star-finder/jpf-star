package star.formula.heap;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import star.formula.Formula;
import star.formula.Utilities;
import star.formula.Variable;
import star.formula.heap.HeapTerm;
import star.formula.heap.InductiveTerm;
import star.predicate.InductivePred;
import star.predicate.InductivePredLexer;
import star.predicate.InductivePredMap;
import star.predicate.InductivePredParser;

public class InductiveTermTest {
	
	@Before
	public void init() {
		Utilities.reset();
	}

	@Test
	public void testToString1() {
		Variable root = new Variable("root", "");
		HeapTerm it = new InductiveTerm("sll", root);
		
		assertTrue(it.toString().equals("sll(root)"));
	}
	
	@Test
	public void testToString2() {
		Variable root = new Variable("root", "");
		Variable next = new Variable("next", "");
		HeapTerm it = new InductiveTerm("sll", root, next);
		
		assertTrue(it.toString().equals("sll(root,next)"));
	}
	
	@Test
	public void testToString3() {
		Variable root = new Variable("x", "");
		Variable y = new Variable("y", "");
		Variable z = new Variable("z", "");
		HeapTerm it = new InductiveTerm("dll", root, y, z);
		
		assertTrue(it.toString().equals("dll(x,y,z)"));
	}
	
	@Test
	public void testSubstitute1() {
		Variable root = new Variable("root", "");
		Variable var = new Variable("next", "");
		
		HeapTerm it1 = new InductiveTerm("sll", root, var);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm it2 = it1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(it1.toString().equals("sll(root,next)"));
		assertTrue(it2.toString().equals("sll(next,next1)"));
	}
	
	@Test
	public void testSubstitute2() {
		Variable root = new Variable("root", "");
		Variable var1 = new Variable("next", "");
		Variable var2 = new Variable("prev", "");
		
		HeapTerm it1 = new InductiveTerm("dll", root, var1, var2);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", ""), new Variable("prev", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", ""), new Variable("root", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm it2 = it1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(it1.toString().equals("dll(root,next,prev)"));
		assertTrue(it2.toString().equals("dll(next,next1,root)"));
	}
	
	@Test
	public void testSubstitute3() {
		Variable root = new Variable("root", "");
		Variable var1 = new Variable("next", "");
		Variable var2 = new Variable("k", "");
		
		HeapTerm it1 = new InductiveTerm("sll", root, var1, var2);
		
		Variable[] fromVars = {new Variable("root", ""), new Variable("next", "")};
		Variable[] toVars = {new Variable("next", ""), new Variable("next1", "")};
		Map<String,String> existVarSubMap = new HashMap<String,String>();
		
		HeapTerm it2 = it1.substitute(fromVars, toVars, existVarSubMap);
		
		assertTrue(it1.toString().equals("sll(root,next,k)"));
		assertTrue(it2.toString().equals("sll(next,next1,k_1)"));
	}
	
	@Test
	public void testUnfold() {
		String preds = "pred sll(root) == root = null || root->Node(next) * sll(next)";
		
		ANTLRInputStream in = new ANTLRInputStream(preds);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
        
        Variable root = new Variable("x", "");
		
		HeapTerm it = new InductiveTerm("sll", root);
		Formula[] formulas = ((InductiveTerm) it).unfold();
		
		assertTrue(formulas[0].toString().equals("x = null"));
		assertTrue(formulas[1].toString().equals("x->Node(next_1) * sll(next_1)"));
	}

}

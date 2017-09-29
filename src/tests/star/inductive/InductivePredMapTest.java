package star.inductive;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import star.predicate.InductivePred;
import star.predicate.InductivePredLexer;
import star.predicate.InductivePredMap;
import star.predicate.InductivePredParser;

public class InductivePredMapTest {

	@Test
	public void testFind() {
		String pred1 = "pred sll(root) == root = null || root->Node(next) * sll(next)";
		String pred2 = "pred dll(root,prev) == root = null || root->Node2(prev,next) * dll(next,root)";
		String preds = pred1 + ";" + pred2;
		
		ANTLRInputStream in = new ANTLRInputStream(preds);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
        
        InductivePred sll = InductivePredMap.find("sll");
        InductivePred dll = InductivePredMap.find("dll");
        
        assertTrue(sll.toString().equals(pred1));
        assertTrue(dll.toString().equals(pred2));
	}

}

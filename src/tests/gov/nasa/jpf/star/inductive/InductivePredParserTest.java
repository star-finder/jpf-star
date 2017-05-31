package gov.nasa.jpf.star.inductive;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredLexer;
import gov.nasa.jpf.star.predicate.InductivePredParser;

@SuppressWarnings("deprecation")
public class InductivePredParserTest {

	@Test
	public void test1() {
		String pred = "pred sll(x) == x = null || x->Node(next) * sll(next)";
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        assertTrue(ips[0].toString().equals(pred));
	}
	
	@Test
	public void test2() {
		String pred0 = "pred sll(root) == root = null || root->Node(next) * sll(next)";
		String pred1 = "pred dll(root,prev) == root = null || root->Node2(prev,next) * dll(next,root)";
		String preds = pred0 + ";" + pred1;
		
		ANTLRInputStream in = new ANTLRInputStream(preds);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        assertTrue(ips[0].toString().equals(pred0));
        assertTrue(ips[1].toString().equals(pred1));
	}

}

package gov.nasa.jpf.star.inductive;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class InductivePredParserTest {

	@Test
	public void test1() {
		String str = "pred sll(x) == x = null || x->Node(next) * sll(next)";
		String[] preds = str.split(";");
		
		ANTLRInputStream in = new ANTLRInputStream(str);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        
        for (int i = 0; i < ips.length; i++) {
        	assertTrue(ips[i].toString().equals(preds[i]));
        }  
	}
	
	@Test
	public void test2() {
		String str = "pred sll(x) == x = null || x->Node(next) * sll(next)";
		str += ";" + str;
		String[] preds = str.split(";");
		
		ANTLRInputStream in = new ANTLRInputStream(str);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        
        for (int i = 0; i < ips.length; i++) {
        	assertTrue(ips[i].toString().equals(preds[i]));
        }  
	}
	
	@Test
	public void test3() {
		String str = "pred sll(x) == x = null || x->Node(next) * sll(next)";
		str += ";" + str + ";" + str;
		String[] preds = str.split(";");
		
		ANTLRInputStream in = new ANTLRInputStream(str);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        
        for (int i = 0; i < ips.length; i++) {
        	assertTrue(ips[i].toString().equals(preds[i]));
        }  
	}

}

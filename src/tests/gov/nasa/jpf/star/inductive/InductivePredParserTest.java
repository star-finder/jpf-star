package gov.nasa.jpf.star.inductive;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class InductivePredParserTest {

	@Test
	public void test() {
		String pred = "pred sll(x) == x = null || x->Node(next) * sll(next)";
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
        InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred ip = parser.pred().ip;
        assertTrue(ip.toString().equals(pred));
	}

}

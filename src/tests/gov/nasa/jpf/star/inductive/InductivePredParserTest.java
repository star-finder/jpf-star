package gov.nasa.jpf.star.inductive;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
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
        
        ParseTree tree = parser.pred();
        System.out.println(tree.toStringTree(parser));
	}

}

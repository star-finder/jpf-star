import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.inductive.InductivePred;
import gov.nasa.jpf.star.inductive.InductivePredLexer;
import gov.nasa.jpf.star.inductive.InductivePredMap;
import gov.nasa.jpf.star.inductive.InductivePredParser;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("deprecation")
public class MyClassTest extends TestJPF {
	
	@Before
	public void init() {
		String pred = "pred sll(root) == root = null || root->Node(next) * sll(next)";
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.heap.HeapSymbolicListener",
				"+listener=.star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod(sym#sym)",
				"+symbolic.lazy=true",
				"+report.console.property_violation=error,trace")) {
			MyClass.main(null);
		}
	}

}

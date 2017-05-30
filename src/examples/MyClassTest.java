import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.PreconditionMap;
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
        
        String prec = "pred myMethod1(x) == sll(x)";
        
        in = new ANTLRInputStream(prec);
        lexer = new InductivePredLexer(in);
        tokens = new CommonTokenStream(lexer);
        parser = new InductivePredParser(tokens);
        
        ips = parser.preds().ips;
        PreconditionMap.put(ips);
	}
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=.star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod(sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}
	
	@Test
	public void testMain1() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=.star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod1(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}

}

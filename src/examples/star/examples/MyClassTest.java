package star.examples;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import star.data.DataNode;
import star.data.DataNodeLexer;
import star.data.DataNodeMap;
import star.data.DataNodeParser;
import star.precondition.Precondition;
import star.precondition.PreconditionLexer;
import star.precondition.PreconditionMap;
import star.precondition.PreconditionParser;
import star.predicate.InductivePred;
import star.predicate.InductivePredLexer;
import star.predicate.InductivePredMap;
import star.predicate.InductivePredParser;

@SuppressWarnings("deprecation")
public class MyClassTest extends TestJPF {
	
	private void initDataNode() {
		String data = "data Node {Node next}";
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
		String pred = "pred sll(root) == root = null || root::Node<next> * sll(next)";
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre myMethod == sll(x)";
//		String pre = "pre myMethod1 == sll(x) & x=y";
//		String pre = "pre myMethod2 == i < 100";
		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.put(ps);
	}
	
	@Before
	public void init() {
		initDataNode();
		initPredicate();
		initPrecondition();
	}
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
//				"+star.max_len_pc=6",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=build/tmp",
//				"+star.test_package",
//				"+star.test_imports",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = star.examples.MyClass.myMethod(sym)",
//				"+symbolic.fields = instance,static",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}
	
	@Test
	public void testMain1() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod1(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}
	
	@Test
	public void testMain2() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=build/tmp",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod2(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}

}

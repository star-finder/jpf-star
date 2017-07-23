package gov.nasa.jpf.star.examples.avl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeLexer;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.data.DataNodeParser;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionMap;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredLexer;
import gov.nasa.jpf.star.predicate.InductivePredMap;
import gov.nasa.jpf.star.predicate.InductivePredParser;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("deprecation")
public class Avl_findMinTest extends TestJPF {
	
	private void initDataNode() {
		String data = "data AvlNode {int element; AvlNode left; AvlNode right; int height}";
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
		String pred1 = "pred avl(root) == root = null || " + 
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL=heightR & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL=heightR+1 & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL+1=heightR & height=heightR+1";
		
		String pred2 = "pred avlE(root,minE,maxE,height) == root=null & height=0-1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL=heightR & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL=heightR+1 & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL+1=heightR & height=heightR+1";
		
		String pred = pred1 + ";" + pred2;
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre findMin == avl(this_root)";
		
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
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=.star.StarListener",
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/gov/nasa/jpf/star/examples/avl",
				"+star.test_package=gov.nasa.jpf.star.examples.avl",
				"+star.test_imports=gov.nasa.jpf.star.examples.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=gov.nasa.jpf.star.examples.avl.AvlTree.findMin()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AvlTree tree = new AvlTree();
			tree.findMin();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}

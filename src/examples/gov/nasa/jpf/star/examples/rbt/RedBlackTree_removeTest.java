package gov.nasa.jpf.star.examples.rbt;
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
public class RedBlackTree_removeTest extends TestJPF {
	
	private void initDataNode() {
		String data = "data Entry {int key; Object value; Entry left; Entry right; Entry parent; boolean color}";
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
		String pred1 = "pred rbt(root,size) == root=null & size=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & parent=null & color=1 & size=sizeL+sizeR+1 & bhL=bhR";
		
		String pred2 = "pred rbtE(root,pa,minE,maxE,size,bh) == root=null & size=0 & bh=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=1 & size=sizeL+sizeR+1 & bhL=bhR & bh=1+bhL || " +
			"root::Entry<key,value,left,right,parent,color> * rbtB(left,root,minE,key,sizeL,bhL) * rbtB(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=0 & size=sizeL+sizeR+1 & bhL=bhR & bh=bhL";
		
		String pred3 = "pred rbtB(root,pa,minE,maxE,size,bh) == root=null & size=0 & bh=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=1 & size=sizeL+sizeR+1 & bhL=bhR & bh=1+bhL";
		
		String pred = pred1 + ";" + pred2 + ";" + pred3;
				
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre remove == rbt(this_root,this_size)";
		
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
				"+star.max_depth=9",
				"+star.max_time=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/gov/nasa/jpf/star/examples/rbt",
				"+star.test_package=gov.nasa.jpf.star.examples.rbt",
				"+star.test_imports=gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;gov.nasa.jpf.star.examples.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=gov.nasa.jpf.star.examples.rbt.TreeMap.remove(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			TreeMap tree = new TreeMap();
			tree.remove(0);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}

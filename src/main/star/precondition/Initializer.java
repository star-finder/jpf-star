package star.precondition;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import star.data.DataNode;
import star.data.DataNodeLexer;
import star.data.DataNodeMap;
import star.data.DataNodeParser;
import star.predicate.InductivePred;
import star.predicate.InductivePredLexer;
import star.predicate.InductivePredMap;
import star.predicate.InductivePredParser;

public class Initializer {

	public static void initDataNode(String data) {
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataNodeParser parser = new DataNodeParser(tokens);

		DataNode[] dns = parser.datas().dns;
		DataNodeMap.reset();
		DataNodeMap.put(dns);
	}

	public static void initPredicate(String pred) {
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		InductivePredParser parser = new InductivePredParser(tokens);

		InductivePred[] ips = parser.preds().ips;
		InductivePredMap.reset();
		InductivePredMap.put(ips);
	}
	
	public static void initPrecondition(String pre) {		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.reset();
        PreconditionMap.put(ps);
	}
}

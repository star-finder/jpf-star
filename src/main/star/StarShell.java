package star;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFShell;
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

public class StarShell implements JPFShell {

	private Config conf;

	public StarShell(Config config) {
		this.conf = config;
		initDataNode();
		initPredicate();
		initPrecondition();
	}

	private void initDataNode() {
		String data = conf.getProperty("star.data");
		assert data != null;

		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataNodeParser parser = new DataNodeParser(tokens);

		DataNode[] dns = parser.datas().dns;
		DataNodeMap.put(dns);
	}

	private void initPredicate() {
		String pred = conf.getProperty("star.predicate");
		assert pred != null;

		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		InductivePredParser parser = new InductivePredParser(tokens);

		InductivePred[] ips = parser.preds().ips;
		InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = conf.getProperty("star.precondition");
		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.put(ps);
	}

	@Override
	public void start(String[] args) {
		try {
			JPF jpf = new JPF(conf);
			jpf.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

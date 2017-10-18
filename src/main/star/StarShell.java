package star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFShell;
import starlib.precondition.Initializer;
import starlib.solver.Solver;

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
		Initializer.initDataNode(data);
	}

	private void initPredicate() {
		String pred = conf.getProperty("star.predicate");
		if(pred == null) {
			// TODO: for predicate that is longer than one line,
			// allow users to put it in a file
			pred = conf.getProperty("star.predicate.file");
			assert pred != null;
		}
		Initializer.initPredicate(pred);
	}
	
	private void initPrecondition() {
		String pre = conf.getProperty("star.precondition");
		Initializer.initPrecondition(pre);
	}

	@Override
	public void start(String[] args) {
		try {
			JPF jpf = new JPF(conf);
			jpf.run();
			Solver.terminate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

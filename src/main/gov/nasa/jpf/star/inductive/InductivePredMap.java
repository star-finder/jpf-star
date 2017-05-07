package gov.nasa.jpf.star.inductive;

import java.util.HashMap;
import java.util.Map;

public class InductivePredMap {
	
	// contains all inductive predicate definitions
	private static Map<String,InductivePred> inductivePredMap = new HashMap<String,InductivePred>();

	public static InductivePred find(String predName) {
		InductivePred pred = inductivePredMap.get(predName);
		return pred;
	}
	
}

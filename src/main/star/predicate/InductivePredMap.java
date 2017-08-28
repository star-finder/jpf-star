package star.predicate;

import java.util.HashMap;
import java.util.Map;

public class InductivePredMap {
	
	// contains all inductive predicate definitions
	private static Map<String,InductivePred> inductivePredMap = new HashMap<String,InductivePred>();
	
	public static void put(InductivePred ip) {
		String predName = ip.getPredName();
		assert !inductivePredMap.containsKey(predName);
		inductivePredMap.put(predName, ip);
	}
	
	public static void put(InductivePred[] ips) {
		for (int i = 0; i < ips.length; i++) {
			put(ips[i]);
		}
	}

	public static InductivePred find(String predName) {
		InductivePred pred = inductivePredMap.get(predName);
		assert pred != null;
		return pred;
	}
	
	public static InductivePred[] getAll() {
		InductivePred[] ret = {};
		return ((InductivePred[]) inductivePredMap.values().toArray(ret));
	}
	
}

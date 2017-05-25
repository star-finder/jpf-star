package gov.nasa.jpf.star;

import java.util.HashMap;
import java.util.Map;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.inductive.InductivePred;

public class PreconditionMap {
	
	private static Map<String,Formula> precMap = new HashMap<String,Formula>();
	
	public static void put(String methodName, Formula formula) {
		assert !precMap.containsKey(methodName);
		precMap.put(methodName, formula);
	}
	
	public static void put(InductivePred ip) {
		String methodName = ip.getPredName();
		Formula formula = ip.getFormulas()[0];
		put(methodName, formula);
	}
	
	public static void put(InductivePred[] ips) {
		for (int i = 0; i < ips.length; i++) {
			put(ips[i]);
		}
	}
	
	public static Formula find(String methodName) {
		Formula formula = precMap.get(methodName);
		assert formula != null;
		return formula;
	}

}

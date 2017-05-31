package gov.nasa.jpf.star.precondition;

import java.util.HashMap;
import java.util.Map;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.predicate.InductivePred;

public class PreconditionMap {
	
	private static Map<String,Precondition> preMap = new HashMap<String,Precondition>();
	
	public static void put(Precondition pre) {
		String methodName = pre.getMethodName();
		assert !preMap.containsKey(methodName);
		preMap.put(methodName, pre);
	}
	
	public static void put(Precondition[] ips) {
		for (int i = 0; i < ips.length; i++) {
			put(ips[i]);
		}
	}
	
	public static Precondition find(String methodName) {
		Precondition pre = preMap.get(methodName);
		assert pre != null;
		return pre;
	}

}

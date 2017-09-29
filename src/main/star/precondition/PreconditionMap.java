package star.precondition;

import java.util.HashMap;
import java.util.Map;

public class PreconditionMap {
	
	private static Map<String,Precondition> preMap = null;
	
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

	public static void reset() {
		preMap = new HashMap<String,Precondition>();
	}
}

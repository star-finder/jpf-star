package star.data;

import java.util.HashMap;
import java.util.Map;

public class DataNodeMap {
	
	// contains all data definitions
	private static Map<String, DataNode> dataNodeMap = new HashMap<String, DataNode>();

	public static void put(DataNode dn) {
		String type = dn.getType();
		assert !dataNodeMap.containsKey(type);
		dataNodeMap.put(type, dn);
	}

	public static void put(DataNode[] dns) {
		for (int i = 0; i < dns.length; i++) {
			put(dns[i]);
		}
	}

	public static DataNode find(String type) {
		DataNode dn = dataNodeMap.get(type);
		return dn;
	}
	
	public static DataNode[] getAll() {
		DataNode[] ret = {};
		return ((DataNode[]) dataNodeMap.values().toArray(ret));
	}

	public static void reset() {
		dataNodeMap = new HashMap<String, DataNode>();
	}
	
}

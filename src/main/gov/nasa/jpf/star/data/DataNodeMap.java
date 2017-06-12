package gov.nasa.jpf.star.data;

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
		assert dn != null;
		return dn;
	}

	public static void parse(String str) {
		String[] dns = str.split("\\.");
		
		for (int i = 0; i < dns.length; i++) {
			String dn = dns[i];
			String type = dn.substring(0, dn.indexOf('{'));
			String[] paramTypes = dn.substring(dn.indexOf('{') + 1, dn.indexOf('}')).split(";");
			
			put(new DataNode(type, paramTypes));
		}
	}
	
	public static DataNode[] getAll() {
		DataNode[] ret = {};
		return ((DataNode[]) dataNodeMap.values().toArray(ret));
	}

}

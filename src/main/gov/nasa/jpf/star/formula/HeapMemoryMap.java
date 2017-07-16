package gov.nasa.jpf.star.formula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeapMemoryMap {
	
	private static Map<String, List<Variable>> typeMap = new HashMap<String, List<Variable>>();
	
	private static Map<String, Integer> addressMap = new HashMap<String, Integer>();

	public static void putType(String type, Variable var) {
		List<Variable> vars = findType(type);
		if (vars.size() == 0) {
			vars.add(var);
			typeMap.put(type, vars);
		} else {
			vars.add(var);
		}
	}
	
	public static void putAddress(String name, int address) {
		addressMap.put(name, address);
	}
	
	public static List<Variable> findType(String type) {
		List<Variable> vars = typeMap.get(type);
		
		if (vars == null) vars = new ArrayList<Variable>();
		
		return vars;
	}
	
	public static int findAddress(String name) {
		Integer address = addressMap.get(name);
		
		if (address == null) return -1;
		
		return address;
	}
	
	public static int findAddress(List<Variable> vars) {
		if (vars == null)
			return -1;
		
		for (Variable var : vars) {
			String name = var.getName();
			int address = findAddress(name);
			if (address != -1) return address;
		}
		
		return -1;
	}
	
}

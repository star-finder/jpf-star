package gov.nasa.jpf.star.bytecode.lazy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gov.nasa.jpf.star.formula.Variable;

public class HeapMemoryMap {
	
	private static Map<String, List<Variable>> memoryMap = new HashMap<String, List<Variable>>();

	public static void put(String type, Variable var) {
		List<Variable> vars = find(type);
		if (vars.size() == 0) {
			vars = new ArrayList<Variable>();
			vars.add(var);
			memoryMap.put(type, vars);
		} else {
			vars.add(var);
		}
	}
	
	public static List<Variable> find(String type) {
		List<Variable> vars = memoryMap.get(type);
		
		if (vars == null) vars = new ArrayList<Variable>();
		
		return vars;
	}
	
}

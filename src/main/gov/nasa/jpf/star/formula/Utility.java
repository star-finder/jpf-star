package gov.nasa.jpf.star.formula;

import java.util.List;

public class Utility {
	
	private static int count = 1;
	
	public static int find(Variable[] vars, Variable var) {
		int length = vars.length;
		
		for (int i = 0; i < length; i++) {
			if (vars[i].equals(var)) {
				return i;
			}
		}
		
		return -1;
	}
//	
//	public static boolean contains(List<Variable> vars, Variable var) {
//		int length = vars.size();
//		
//		for (int i = 0; i < length; i++) {
//			if (vars.get(i).getName().equals(var.getName()) &&
//					vars.get(i).getType().equals(var.getType()))
//				return true;
//		}
//		
//		return false;
//	}
	
	// may have problem, but may be it is enough with Java name convention
	public static Variable freshVar(Variable oldVar) {
		String oldName = oldVar.getName();
		
		if (oldName.matches(".*_\\d+")) {
			oldName = oldName.substring(0, oldName.lastIndexOf('_'));
		}
		
		String freshName = freshName(oldName);
		
		return new Variable(freshName, oldVar.getType());
	}
	
	private static String freshName(String oldName) {
		return oldName + "_" + count++;
	}
	
	public static void reset() {
		count = 1;
	}

}

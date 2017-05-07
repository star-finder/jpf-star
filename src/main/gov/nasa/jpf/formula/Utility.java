package gov.nasa.jpf.formula;

public class Utility {
	
	private static int count = 1;
	
	public static boolean contains(Variable[] vars, Variable var) {
		int length = vars.length;
		
		for (int i = 0; i < length; i++) {
			if (vars[i].getName().equals(var.getName()))
				return true;
		}
		
		return false;
	}
	
	public static Variable freshVar(Variable oldVar) {
		String freshName = freshName(oldVar.getName());
		
		return new Variable(freshName, oldVar.getType());
	}
	
	private static String freshName(String oldName) {
		return oldName + "_" + count++;
	}

}

package star.data;

import star.formula.Variable;

public class DataNode {
	
	private String type;
	
	private Variable[] fields;
	
	public DataNode(String type, Variable[] fields) {
		this.type = type;
		this.fields = fields;
	}
	
	public String getType() {
		return type;
	}
	
	public Variable[] getFields() {
		return fields;
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret += "data " + type + "{\n";
		
		for (int i = 0; i < fields.length; i++) {
			String fType = fields[i].getType();
			String fName = fields[i].getName();
			
			ret += fType + " " + fName + ";\n";
		}
		
		ret += "}.";
		
		return ret;
	}
	
	public String toS2SATString() {
		// it seems s2sat has object already
		if (type.equals("Object"))
			return "";
		else {
			String ret = "";
			ret += "data " + type + "{\n";
			
			for (int i = 0; i < fields.length; i++) {
				String fType = fields[i].getType();
				String fName = fields[i].getName();
				
				if (fType.equals("boolean"))
					fType = "int";
				
				ret += fType + " " + fName + ";\n";
			}
			
			ret += "}.";
			
			return ret;
		}
	}

}
